/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeriTabani;

import Exception.GecersizPuanException;
import OOP.Dizi;
import OOP.Film;
import OOP.IOneriSistemi;
import OOP.Medya;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.PreparedStatement;

public class MedyaManager implements IOneriSistemi {

    // CRUD: Listeleme (Read)
    public List<Medya> tumMedyaGetir() {
        List<Medya> liste = new ArrayList<>();
        String sql = "SELECT * FROM medya";

        try (Connection conn = VeritabaniBaglantisi.baglan();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String baslik = rs.getString("baslik");
                String tur = rs.getString("tur");
                int yil = rs.getInt("yapim_yili");
                double puan = rs.getDouble("puan");
                String tip = rs.getString("tip");
                int ekstra = rs.getInt("sure_veya_sezon");

                if (tip.equalsIgnoreCase("Film")) {
                    liste.add(new Film(id, baslik, tur, yil, puan, ekstra));
                } else {
                    liste.add(new Dizi(id, baslik, tur, yil, puan, ekstra));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }

    // CRUD: Ekleme (Create) - Exception Fırlatır
    public void medyaEkle(String baslik, String tur, int yil, double puan, String tip, int ekstra) 
            throws SQLException, GecersizPuanException {
        
        // Custom Exception Kontrolü
        if (puan < 0 || puan > 10) {
            throw new GecersizPuanException("Puan 0 ile 10 arasında olmalıdır!");
        }

        String sql = "INSERT INTO medya (baslik, tur, yapim_yili, puan, tip, sure_veya_sezon) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, baslik);
            pstmt.setString(2, tur);
            pstmt.setInt(3, yil);
            pstmt.setDouble(4, puan);
            pstmt.setString(5, tip);
            pstmt.setInt(6, ekstra);
            pstmt.executeUpdate();
        }
    }

    // İzleme Geçmişine Ekle
    public void izlediOlarakIsaretle(String kullaniciAdi, int medyaId) throws SQLException {
        String sql = "INSERT INTO izleme_gecmisi (kullanici_adi, medya_id) VALUES (?, ?)";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, kullaniciAdi);
            pstmt.setInt(2, medyaId);
            pstmt.executeUpdate();
        }
    }

    // CRUD: Silme (Delete)
    public void medyaSil(int id) throws SQLException {
        String sql = "DELETE FROM medya WHERE id = ?";
        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    // INTERFACE METODU: Öneri Algoritması
    @Override
    public String oneriYap(String kullaniciAdi) {
        String onerilen = "Henüz yeterli veri yok.";
        
        // 1. Adım: Kullanıcının en çok izlediği türü bul
        String sqlEnCokIzlenenTur = 
            "SELECT m.tur, COUNT(*) as sayi " +
            "FROM izleme_gecmisi i " +
            "JOIN medya m ON i.medya_id = m.id " +
            "WHERE i.kullanici_adi = ? " +
            "GROUP BY m.tur " +
            "ORDER BY sayi DESC LIMIT 1";

        try (Connection conn = VeritabaniBaglantisi.baglan();
             PreparedStatement pstmt = conn.prepareStatement(sqlEnCokIzlenenTur)) {
            
            pstmt.setString(1, kullaniciAdi);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                String favoriTur = rs.getString("tur");
                
                // 2. Adım: O türde olup henüz izlemediği en yüksek puanlı filmi/diziyi bul
                String sqlOneri = 
                    "SELECT baslik, puan FROM medya " +
                    "WHERE tur = ? " +
                    "AND id NOT IN (SELECT medya_id FROM izleme_gecmisi WHERE kullanici_adi = ?) " +
                    "ORDER BY puan DESC LIMIT 1";
                
                PreparedStatement pstmt2 = conn.prepareStatement(sqlOneri);
                pstmt2.setString(1, favoriTur);
                pstmt2.setString(2, kullaniciAdi);
                ResultSet rs2 = pstmt2.executeQuery();
                
                if (rs2.next()) {
                    onerilen = "Sizin için önerimiz (" + favoriTur + "): " + rs2.getString("baslik") + " (Puan: " + rs2.getDouble("puan") + ")";
                } else {
                    onerilen = "Favori türünüzdeki (" + favoriTur + ") her şeyi izlemişsiniz!";
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return "Öneri hatası: " + e.getMessage();
        }
        
        return onerilen;
    }
}
