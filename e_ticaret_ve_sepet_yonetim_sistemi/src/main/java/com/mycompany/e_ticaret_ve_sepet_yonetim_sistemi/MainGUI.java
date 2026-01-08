package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi;

import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Exception.StokYetersizException;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Sepet;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Urun;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Veritabani.UrunDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException; 
import java.util.List;

/**
 * @author Metin23
 */
public class MainGUI extends JFrame {

    private UrunDAO urunDAO = new UrunDAO();
    private Sepet sepet = new Sepet();
    
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtAd, txtFiyat, txtStok, txtTur, txtDetay;

    public MainGUI() {
        setTitle("E-Ticaret ve Stok Yönetim Sistemi");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel panelEkleme = new JPanel(new GridLayout(2, 6, 5, 5));
        panelEkleme.setBorder(BorderFactory.createTitledBorder("Yeni Ürün Ekle (Admin)"));

        txtAd = new JTextField();
        txtFiyat = new JTextField();
        txtStok = new JTextField();
        txtTur = new JTextField();
        txtDetay = new JTextField();
        JButton btnEkle = new JButton("Ürün Ekle");

        panelEkleme.add(new JLabel("Ürün Adı:"));
        panelEkleme.add(new JLabel("Fiyat:"));
        panelEkleme.add(new JLabel("Stok:"));
        panelEkleme.add(new JLabel("Tür (Elektronik/Giyim):"));
        panelEkleme.add(new JLabel("Detay (Marka/Beden):"));
        panelEkleme.add(new JLabel(""));

        panelEkleme.add(txtAd);
        panelEkleme.add(txtFiyat);
        panelEkleme.add(txtStok);
        panelEkleme.add(txtTur);
        panelEkleme.add(txtDetay);
        panelEkleme.add(btnEkle);

        add(panelEkleme, BorderLayout.NORTH);

       
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Ad", "Fiyat", "Stok", "Tür", "Detay"});
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

       
        listeyiYenile();

        
        JPanel panelButonlar = new JPanel();
        JButton btnSepeteEkle = new JButton("Seçileni Sepete Ekle");
        JButton btnSepetiGoster = new JButton("Sepeti Göster & Satın Al");
        JButton btnSil = new JButton("Seçili Ürünü Sil");
        JButton btnYenile = new JButton("Listeyi Yenile");

        panelButonlar.add(btnSepeteEkle);
        panelButonlar.add(btnSepetiGoster);
        panelButonlar.add(btnSil);
        panelButonlar.add(btnYenile);

        add(panelButonlar, BorderLayout.SOUTH);


        btnEkle.addActionListener(e -> {
            try {
                String ad = txtAd.getText();
                double fiyat = Double.parseDouble(txtFiyat.getText());
                int stok = Integer.parseInt(txtStok.getText());
                String tur = txtTur.getText();
                String detay = txtDetay.getText();

                
                urunDAO.urunEkle(ad, fiyat, stok, tur, detay);
                
                listeyiYenile();
                JOptionPane.showMessageDialog(this, "Ürün Başarıyla Eklendi!");
                
                txtAd.setText(""); txtFiyat.setText(""); txtStok.setText("");
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(this, "Veritabanı Hatası: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Lütfen sayısal değerleri doğru girin!", "Format Hatası", JOptionPane.WARNING_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Genel Hata: " + ex.getMessage());
            }
        });


        btnSepeteEkle.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                int id = (int) tableModel.getValueAt(selectedRow, 0);
                
                
                try {
                    List<Urun> tumUrunler = urunDAO.tumUrunleriGetir();
                    for (Urun u : tumUrunler) {
                        if (u.getId() == id) {
                            sepet.sepeteEkle(u);
                            JOptionPane.showMessageDialog(this, u.getAd() + " sepete eklendi.");
                            return;
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace(); 
                }
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen tablodan bir ürün seçin.");
            }
        });

        
        btnSepetiGoster.addActionListener(e -> {
            String sepetBilgi = sepet.sepetOzeti();
            int secim = JOptionPane.showConfirmDialog(this, sepetBilgi + "\n\nSatın almayı onayla?", "Sepet", JOptionPane.YES_NO_OPTION);
            
            if (secim == JOptionPane.YES_OPTION) {
                boolean hataVarMi = false;
                
                for (Urun u : sepet.getUrunler()) {
                    try {
                        u.stokDus(1); 
                        urunDAO.stokGuncelle(u.getId(), u.getStok()); 
                    } catch (StokYetersizException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Stok Yetersiz", JOptionPane.WARNING_MESSAGE);
                        hataVarMi = true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Veritabanı Hatası: " + ex.getMessage(), "DB Hatası", JOptionPane.ERROR_MESSAGE);
                        hataVarMi = true;
                    }
                }
                if (!hataVarMi) {
                    sepet.sepetiBosalt();
                    listeyiYenile();
                    JOptionPane.showMessageDialog(this, "Satın alma başarılı!");
                }
            }
        });

        
        btnSil.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                int id = (int) tableModel.getValueAt(selectedRow, 0);
                try {
                    
                    urunDAO.urunSil(id);
                    listeyiYenile();
                    JOptionPane.showMessageDialog(this, "Ürün silindi.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Silme Hatası: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Silinecek ürünü seçin.");
            }
        });

        
        btnYenile.addActionListener(e -> listeyiYenile());
    }

    private void listeyiYenile() {
        tableModel.setRowCount(0);
        
        try {
            List<Urun> urunler = urunDAO.tumUrunleriGetir();
            for (Urun u : urunler) {
                tableModel.addRow(new Object[]{
                    u.getId(), 
                    u.getAd(), 
                    u.getFiyat(), 
                    u.getStok(), 
                    u.getKategoriAdi(),
                    u.urunBilgisiGetir() 
                });
            }
        } catch (Exception e) {
             
             System.out.println("Listeleme hatası: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }
}