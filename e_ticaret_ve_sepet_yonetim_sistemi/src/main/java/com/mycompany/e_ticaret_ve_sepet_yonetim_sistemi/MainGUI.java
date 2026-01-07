package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi;

// Gerekli Importlar (Dosya yapına göre düzenlendi)
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Exception.StokYetersizException;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Elektronik;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Sepet;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Urun;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Veritabani.UrunDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List; // Bu import kapalıydı, açıldı.

/**
 * @author Metin23
 */
// DÜZELTME: JPanel yerine JFrame extend edildi.
public class MainGUI extends JFrame {

    private UrunDAO urunDAO = new UrunDAO();
    private Sepet sepet = new Sepet();
    
    // Arayüz Elemanları
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtAd, txtFiyat, txtStok, txtTur, txtDetay;

    public MainGUI() {
        // JFrame Ayarları
        setTitle("E-Ticaret ve Stok Yönetim Sistemi");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // --- 1. ÜST PANEL (Ürün Ekleme Formu) ---
        JPanel panelEkleme = new JPanel(new GridLayout(2, 6, 5, 5));
        panelEkleme.setBorder(BorderFactory.createTitledBorder("Yeni Ürün Ekle (Admin)"));

        txtAd = new JTextField();
        txtFiyat = new JTextField();
        txtStok = new JTextField();
        txtTur = new JTextField(); // "Elektronik" veya "Giyim"
        txtDetay = new JTextField(); // Marka veya Beden
        JButton btnEkle = new JButton("Ürün Ekle");

        panelEkleme.add(new JLabel("Ürün Adı:"));
        panelEkleme.add(new JLabel("Fiyat:"));
        panelEkleme.add(new JLabel("Stok:"));
        panelEkleme.add(new JLabel("Tür (Elektronik/Giyim):"));
        panelEkleme.add(new JLabel("Detay (Marka/Beden):"));
        panelEkleme.add(new JLabel("")); // Boşluk

        panelEkleme.add(txtAd);
        panelEkleme.add(txtFiyat);
        panelEkleme.add(txtStok);
        panelEkleme.add(txtTur);
        panelEkleme.add(txtDetay);
        panelEkleme.add(btnEkle);

        add(panelEkleme, BorderLayout.NORTH);

        // --- 2. ORTA PANEL (Tablo) ---
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Ad", "Fiyat", "Stok", "Tür", "Detay (Marka/Beden)"});
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Verileri Yükle
        listeyiYenile();

        // --- 3. ALT PANEL (Butonlar) ---
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

        // --- EVENT LISTENER'LAR (Olaylar) ---

        // Buton: Ürün Ekle
        btnEkle.addActionListener(e -> {
            try {
                String ad = txtAd.getText();
                double fiyat = Double.parseDouble(txtFiyat.getText());
                int stok = Integer.parseInt(txtStok.getText());
                String tur = txtTur.getText();
                String detay = txtDetay.getText();

                urunDAO.urunEkle(ad, fiyat, stok, tur, detay);
                listeyiYenile();
                JOptionPane.showMessageDialog(this, "Ürün Eklendi!");
                
                // Alanları temizle
                txtAd.setText(""); txtFiyat.setText(""); txtStok.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Hata: Bilgileri kontrol ediniz.\n" + ex.getMessage());
            }
        });

        // Buton: Sepete Ekle
        btnSepeteEkle.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                int id = (int) tableModel.getValueAt(selectedRow, 0);
                
                // Veritabanından nesneyi bul
                List<Urun> tumUrunler = urunDAO.tumUrunleriGetir();
                for (Urun u : tumUrunler) {
                    if (u.getId() == id) {
                        sepet.sepeteEkle(u);
                        JOptionPane.showMessageDialog(this, u.getAd() + " sepete eklendi.");
                        return;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen tablodan bir ürün seçin.");
            }
        });

        // Buton: Sepeti Göster ve Satın Al
        btnSepetiGoster.addActionListener(e -> {
            String sepetBilgi = sepet.sepetOzeti();
            int secim = JOptionPane.showConfirmDialog(this, sepetBilgi + "\n\nSatın almayı onayla?", "Sepet", JOptionPane.YES_NO_OPTION);
            
            if (secim == JOptionPane.YES_OPTION) {
                try {
                    boolean hataVarMi = false;
                    for (Urun u : sepet.getUrunler()) {
                        try {
                            // Backend: Stok düşürme ve Exception fırlatma yeri
                            u.stokDus(1);
                            urunDAO.stokGuncelle(u.getId(), u.getStok());
                        } catch (StokYetersizException ex) {
                            JOptionPane.showMessageDialog(this, ex.getMessage(), "Stok Hatası", JOptionPane.ERROR_MESSAGE);
                            hataVarMi = true;
                        }
                    }
                    if (!hataVarMi) {
                        sepet.sepetiBosalt();
                        listeyiYenile();
                        JOptionPane.showMessageDialog(this, "Satın alma başarılı!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Buton: Sil
        btnSil.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                int id = (int) tableModel.getValueAt(selectedRow, 0);
                urunDAO.urunSil(id);
                listeyiYenile();
                JOptionPane.showMessageDialog(this, "Ürün silindi.");
            } else {
                JOptionPane.showMessageDialog(this, "Silinecek ürünü seçin.");
            }
        });

        // Buton: Yenile
        btnYenile.addActionListener(e -> listeyiYenile());
    }

    // Tabloyu veritabanından çekilen verilerle doldurur
    private void listeyiYenile() {
        tableModel.setRowCount(0); // Tabloyu temizle
        List<Urun> urunler = urunDAO.tumUrunleriGetir();
        
        for (Urun u : urunler) {
            String detayBilgisi = "";
            // Polimorfizm kullanımı, nesne tipine göre detay çekme
            // (DAO zaten nesneleri doğru tipte oluşturduğu için burada direkt kullanabiliriz)
             detayBilgisi = u.urunBilgisiGetir(); 
            
            tableModel.addRow(new Object[]{
                u.getId(), 
                u.getAd(), 
                u.getFiyat(), 
                u.getStok(), 
                u.getKategoriAdi(),
                u.urunBilgisiGetir() 
            });
        }
    }

    public static void main(String[] args) {
        // Swing arayüzünü başlat
        SwingUtilities.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }
}