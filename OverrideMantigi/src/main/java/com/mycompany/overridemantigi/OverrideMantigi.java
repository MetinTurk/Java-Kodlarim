/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overridemantigi;

/**
 *
 * @author Metin
 */
public class OverrideMantigi {

    public static void main(String[] args) {
        Kredi kredi1 = new Kredi();
        Kredi ogretmen = new Ogretmen();
        Kredi ogrenci = new Ogrenci();
        Kredi ogretmenCocugu = new OgretmenCocugu();
        
        double sayi = kredi1.OdemeHesapla();
        System.out.println(sayi);
        sayi = ogretmen.OdemeHesapla();
        System.out.println(sayi);
        sayi = ogrenci.OdemeHesapla();
        System.out.println(sayi);
        sayi = ogretmenCocugu.OdemeHesapla();
        System.out.println(sayi);
        Ogretmen ogretmen2 = (Ogretmen) ogretmen;
        
    }
}
