/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Metin23
 */
public class VeritabaniBaglantisi {
    private static final String URL = "jdbc:mysql://localhost:3306/eticaret_db";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Metinsila23."; 

    public static Connection baglan() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
