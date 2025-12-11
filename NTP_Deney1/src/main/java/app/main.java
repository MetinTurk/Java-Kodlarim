/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author metin
 */

import dao.OgrenciDAO;
import model.LisansOgrenci;
import model.Ogrenci;
import model.YuksekLisansOgrenci;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        

        System.out.println("1. Bölüm");

        List<Ogrenci> okulListesi = new ArrayList<>();

        Ogrenci ogr1 = new Ogrenci(101, "Ahmet", "Can", "Bilgisayar", 58.0);
        
        Ogrenci ogr2 = new LisansOgrenci(102, "Selin", "Yurt", "Endüstri", 55.0, 2, 4);
        
        Ogrenci ogr3 = new YuksekLisansOgrenci(103, "Veli", "Er", "Yazılım", 65.0, "Yapay Zeka");

        okulListesi.add(ogr1);
        okulListesi.add(ogr2);
        okulListesi.add(ogr3);

        for (Ogrenci o : okulListesi) {
            System.out.println(o.toString());
            System.out.println("Geçti mi? : " + (o.gectiMi() ? "EVET" : "HAYIR"));
            System.out.println("-----------------------------");
        }

        System.out.println("2. Bölüm");
        OgrenciDAO dao = new OgrenciDAO();
 
        System.out.println("Veritabanındaki Öğrenciler:");
        listele(dao);

        System.out.println("\nYeni öğrenci ekleniyor..");
        Ogrenci yeniOgr = new Ogrenci(50, "Ceren", "Yıldız", "Mimarlık", 90.0);
        dao.insert(yeniOgr);
        listele(dao);
        
        System.out.println("3. Bölüm");

        System.out.println("\n ID 50 güncelleniyor...");
        yeniOgr.setBolum("İç Mimarlık");
        yeniOgr.setOrtalama(95.0);
        dao.update(yeniOgr);
        listele(dao);
        
        System.out.println("4. Bölüm");

        System.out.println("\n>> ID 50 siliniyor...");
        //dao.deleteById(50);
        //listele(dao);
    }

    
    private static void listele(OgrenciDAO dao) {
        List<Ogrenci> liste = dao.findAll();
        for (Ogrenci o : liste) {
            System.out.println(o);
        }
    }
}
