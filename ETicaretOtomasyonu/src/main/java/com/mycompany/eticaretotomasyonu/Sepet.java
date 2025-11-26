/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eticaretotomasyonu;

import java.util.*;

/**
 *
 * @author Metin
 */
public class Sepet {
    public List<Urun> urunListesi = new ArrayList<Urun>();
    
    public Sepet(){
        
    }
    public void urunEkle(Urun urun){
        urunListesi.add(urun);
        System.out.println("Sepete eklendi.");
    }
    
    public void urunleriGoster(){
        for(Urun urun : urunListesi){
            urun.BilgileriGoster();
        }
    }
    
    public double toplamTutariHesapla(){
        double toplam = 0;
        for(Urun urun : urunListesi){
            toplam += urun.FiyatHesapla();
        }
        return toplam;
    }
    
}
