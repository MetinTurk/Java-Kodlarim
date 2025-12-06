/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author metin
 */



public class DbConnection {


    private static final String SERVER = "127.0.0.1"; 

    private static final String DB_NAME = "NTP";
    private static final String URL = "jdbc:sqlserver://" + SERVER + ":1433;databaseName=" + DB_NAME + ";integratedSecurity=true;trustServerCertificate=true;encrypt=false";

    
    public static Connection getConnection() throws SQLException {
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // DİKKAT: Kullanıcı adı ve şifre parametresi YOK. Sadece URL.
            return DriverManager.getConnection(URL);
            
        } catch (ClassNotFoundException e) {
            System.out.println("!!! JDBC Sürücüsü Bulunamadı !!!");
            throw new SQLException(e);
        } catch (UnsatisfiedLinkError e) {
            // DLL eksikse bu hatayı verir
            System.out.println("!!! HATA: mssql-jdbc_auth.dll dosyası bulunamadı !!!");
            System.out.println("Lütfen DLL dosyasını proje klasörüne veya System32'ye attığından emin ol.");
            throw new SQLException("DLL Eksik: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("!!! Bağlantı Hatası: " + e.getMessage());
            throw e;
        }
    }

    // Test Metodu
    public static void main(String[] args) {
        try (Connection con = getConnection()) {
            System.out.println("BAŞARILI: Windows Auth ile bağlantı sağlandı!");
        } catch (SQLException e) {
            System.out.println("BAŞARISIZ. Hata detaylarına bakınız.");
        }
    }
}
