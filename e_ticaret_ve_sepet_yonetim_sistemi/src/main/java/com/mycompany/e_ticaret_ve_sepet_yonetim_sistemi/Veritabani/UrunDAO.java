/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Veritabani;

/**
 *
 * @author Metin23
 */
// Dosya: UrunDAO.java
import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UrunDAO {

    // READ (Listeleme)
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

    // CREATE (Ekleme)
    public void urunEkle(String ad, double fiyat, int stok, String tur, String detay) {
        String sql = "INSERT INTO urunler (ad, fiyat, stok, tur, detay) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ad);
            pstmt.setDouble(2, fiyat);
            pstmt.setInt(3, stok);
            pstmt.setString(4, tur);
            pstmt.setString(5, detay);
            pstmt.executeUpdate();
            System.out.println("Ürün veritabanına eklendi.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE (Stok Güncelleme)
    public void stokGuncelle(int urunId, int yeniStok) {
        String sql = "UPDATE urunler SET stok = ? WHERE id = ?";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, yeniStok);
            pstmt.setInt(2, urunId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // DELETE (Silme)
    public void urunSil(int id) {
        String sql = "DELETE FROM urunler WHERE id = ?";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Ürün silindi.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
