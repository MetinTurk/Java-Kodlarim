/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filmkutuphanesi;



import Exception.GecersizPuanException;
import OOP.Film;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

import javax.swing.SwingUtilities;

import OOP.Medya;



import OOP.Medya;
import VeriTabani.MedyaManager;

import java.util.List;

import javax.swing.SwingUtilities;

public class MainSwing extends JFrame {

    private MedyaManager manager = new MedyaManager();
    private JTable table;
    private DefaultTableModel tableModel;
    
    // Form elemanları
    private JTextField txtBaslik, txtTur, txtYil, txtPuan, txtEkstra, txtKullaniciAdi;
    private JComboBox<String> cmbTip;
    private JLabel lblOneriSonuc;

    public MainSwing() {
        setTitle("Film & Dizi Kütüphanesi ve Öneri Sistemi");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // --- SEKME YAPISI ---
        JTabbedPane tabbedPane = new JTabbedPane();

        // 1. SEKME: LİSTELEME VE İZLEME
        JPanel panelListe = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Başlık", "Tür", "Yıl", "Puan", "Tip", "Detay"});
        table = new JTable(tableModel);
        panelListe.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panelAlt = new JPanel();
        txtKullaniciAdi = new JTextField("kullanici1", 10);
        JButton btnIzledim = new JButton("Seçili Olanı İzledim");
        JButton btnSil = new JButton("Seçili Olanı Sil");
        JButton btnYenile = new JButton("Listeyi Yenile");
        
        panelAlt.add(new JLabel("Aktif Kullanıcı:"));
        panelAlt.add(txtKullaniciAdi);
        panelAlt.add(btnIzledim);
        panelAlt.add(btnSil);
        panelAlt.add(btnYenile);
        panelListe.add(panelAlt, BorderLayout.SOUTH);

        // 2. SEKME: YENİ MEDYA EKLEME
        JPanel panelEkle = new JPanel(new GridLayout(7, 2, 10, 10));
        txtBaslik = new JTextField();
        txtTur = new JTextField();
        txtYil = new JTextField();
        txtPuan = new JTextField();
        txtEkstra = new JTextField();
        cmbTip = new JComboBox<>(new String[]{"Film", "Dizi"});
        JButton btnKaydet = new JButton("Kaydet");

        panelEkle.add(new JLabel("Başlık:")); panelEkle.add(txtBaslik);
        panelEkle.add(new JLabel("Tür (Örn: Aksiyon):")); panelEkle.add(txtTur);
        panelEkle.add(new JLabel("Yapım Yılı:")); panelEkle.add(txtYil);
        panelEkle.add(new JLabel("Puan (0-10):")); panelEkle.add(txtPuan);
        panelEkle.add(new JLabel("Tip:")); panelEkle.add(cmbTip);
        panelEkle.add(new JLabel("Süre(dk) veya Sezon Sayısı:")); panelEkle.add(txtEkstra);
        panelEkle.add(new JLabel("")); panelEkle.add(btnKaydet);
        
        JPanel panelEkleWrapper = new JPanel(new BorderLayout());
        panelEkleWrapper.add(panelEkle, BorderLayout.NORTH);

        // 3. SEKME: ÖNERİ AL
        JPanel panelOneri = new JPanel(new FlowLayout());
        JButton btnOneriAl = new JButton("Bana Film/Dizi Öner");
        lblOneriSonuc = new JLabel("Öneri için butona basın...");
        lblOneriSonuc.setFont(new Font("Arial", Font.BOLD, 14));
        lblOneriSonuc.setForeground(Color.BLUE);
        
        panelOneri.add(btnOneriAl);
        panelOneri.add(lblOneriSonuc);

        // Sekmeleri Ekle
        tabbedPane.addTab("Kütüphane", panelListe);
        tabbedPane.addTab("Yeni Ekle", panelEkleWrapper);
        tabbedPane.addTab("Öneri Sistemi", panelOneri);

        add(tabbedPane, BorderLayout.CENTER);

        // --- İŞLEVLER (Listeners) ---
        listeyiDoldur();

        btnKaydet.addActionListener(e -> {
            try {
                String baslik = txtBaslik.getText();
                String tur = txtTur.getText();
                int yil = Integer.parseInt(txtYil.getText());
                double puan = Double.parseDouble(txtPuan.getText());
                String tip = (String) cmbTip.getSelectedItem();
                int ekstra = Integer.parseInt(txtEkstra.getText());

                // MANAGER ÇAĞRISI (Exception fırlatabilir)
                manager.medyaEkle(baslik, tur, yil, puan, tip, ekstra);
                
                JOptionPane.showMessageDialog(this, "Eklendi!");
                listeyiDoldur();
                txtBaslik.setText(""); txtTur.setText(""); txtPuan.setText("");
            } catch (GecersizPuanException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Hata", JOptionPane.WARNING_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Lütfen sayısal değerleri doğru girin.", "Format Hatası", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Veritabanı hatası: " + ex.getMessage());
            }
        });

        btnIzledim.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                int id = (int) tableModel.getValueAt(row, 0);
                String kulAdi = txtKullaniciAdi.getText();
                try {
                    manager.izlediOlarakIsaretle(kulAdi, id);
                    JOptionPane.showMessageDialog(this, "İzleme geçmişine eklendi. Algoritma bunu dikkate alacak.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Hata: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen listeden bir film/dizi seçin.");
            }
        });

        btnSil.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row != -1) {
                int id = (int) tableModel.getValueAt(row, 0);
                try {
                    manager.medyaSil(id);
                    listeyiDoldur();
                    JOptionPane.showMessageDialog(this, "Silindi.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Hata: " + ex.getMessage());
                }
            }
        });

        btnYenile.addActionListener(e -> listeyiDoldur());

        btnOneriAl.addActionListener(e -> {
            String kulAdi = txtKullaniciAdi.getText();
            String oneri = manager.oneriYap(kulAdi);
            lblOneriSonuc.setText(oneri);
        });
    }

    private void listeyiDoldur() {
        tableModel.setRowCount(0);
        List<Medya> liste = manager.tumMedyaGetir();
        for (Medya m : liste) {
            tableModel.addRow(new Object[]{
                m.getId(), m.getBaslik(), m.getTur(), m.getYapimYili(),
                m.getPuan(), (m instanceof Film ? "Film" : "Dizi"), m.getDetayBilgisi()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainSwing().setVisible(true));
    }
}
