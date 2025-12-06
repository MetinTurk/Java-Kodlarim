/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


/**
 *
 * @author metin
 */

import model.Ogrenci;
import util.DbConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OgrenciDAO {

    
    public List<Ogrenci> findAll() {
        List<Ogrenci> list = new ArrayList<>();
        String sql = "SELECT * FROM Ogrenci";

        try (Connection con = DbConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Ogrenci o = new Ogrenci(
                    rs.getInt("id"),
                    rs.getString("ad"),
                    rs.getString("soyad"),
                    rs.getString("bolum"),
                    rs.getDouble("ortalama")
                );
                list.add(o);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    
    public void insert(Ogrenci o) {
        String sql = "INSERT INTO Ogrenci (id, ad, soyad, bolum, ortalama) VALUES(?, ?, ?, ?, ?)";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, o.getId());
            ps.setString(2, o.getAd());
            ps.setString(3, o.getSoyad());
            ps.setString(4, o.getBolum());
            ps.setDouble(5, o.getOrtalama());
            
            ps.executeUpdate();
            System.out.println("Öğrenci eklendi: " + o.getAd());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void update(Ogrenci o) {
        String sql = "UPDATE Ogrenci SET bolum = ?, ortalama = ? WHERE id = ?";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setString(1, o.getBolum());
            ps.setDouble(2, o.getOrtalama());
            ps.setInt(3, o.getId());
            
            ps.executeUpdate();
            System.out.println("Öğrenci güncellendi ID: " + o.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     
    public void deleteById(int id) {
        String sql = "DELETE FROM Ogrenci WHERE id = ?";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Öğrenci silindi ID: " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
