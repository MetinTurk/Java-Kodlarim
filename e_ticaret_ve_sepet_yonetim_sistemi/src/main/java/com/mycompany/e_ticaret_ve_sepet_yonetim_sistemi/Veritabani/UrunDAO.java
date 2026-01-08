package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Veritabani;

import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Elektronik;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Giyim;
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.Urun;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UrunDAO {

    
    public List<Urun> tumUrunleriGetir() {
        List<Urun> liste = new ArrayList<>();
        String sql = "SELECT * FROM urunler";

        
        try (Connection conn = VeritabaniBaglantisi.baglan();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                double fiyat = rs.getDouble("fiyat");
                int stok = rs.getInt("stok");
                String tur = rs.getString("tur");
                String detay = rs.getString("detay");

                if (tur.equalsIgnoreCase("Elektronik")) {
                    liste.add(new Elektronik(id, ad, fiyat, stok, detay));
                } else {
                    liste.add(new Giyim(id, ad, fiyat, stok, detay));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return liste;
    }

    
    public void urunEkle(String ad, double fiyat, int stok, String tur, String detay) throws SQLException {
        String sql = "INSERT INTO urunler (ad, fiyat, stok, tur, detay) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ad);
            pstmt.setDouble(2, fiyat);
            pstmt.setInt(3, stok);
            pstmt.setString(4, tur);
            pstmt.setString(5, detay);
            pstmt.executeUpdate();
        }
    }

    public void stokGuncelle(int urunId, int yeniStok) throws SQLException {
        String sql = "UPDATE urunler SET stok = ? WHERE id = ?";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, yeniStok);
            pstmt.setInt(2, urunId);
            pstmt.executeUpdate();
        }
    }
    
    public void urunSil(int id) throws SQLException {
        String sql = "DELETE FROM urunler WHERE id = ?";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}