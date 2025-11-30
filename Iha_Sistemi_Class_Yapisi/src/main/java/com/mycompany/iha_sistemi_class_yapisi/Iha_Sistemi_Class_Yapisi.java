/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iha_sistemi_class_yapisi;

/**
 *
 * @author metin
 */
public class Iha_Sistemi_Class_Yapisi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        KargoDronu kargoDron1 = new KargoDronu("KGD2005", 100, 150);
        KesifDronu kesifDron1 = new KesifDronu("KSD1001", 85, 450, "Yüksek");
        kargoDron1.YukAl("Posta", 5);
        kargoDron1.UcusYap(1000);
        kesifDron1.CevreTaramasiYap();
        
        Hangar<KargoDronu> kargoHangari = new Hangar<>();
        Hangar<KesifDronu> kesifHangari = new Hangar<>();
        kesifHangari.AracEkle(kesifDron1);
        kargoHangari.AracEkle(kargoDron1);
        kargoHangari.TopluBakimYap();
        kesifHangari.TopluBakimYap();
        
    }
}
