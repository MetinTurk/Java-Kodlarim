/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakonutekrari;

import java.util.*;

/**
 *
 * @author Metin
 */
public class Kutuphane {
    
    ArrayList<Kitap> kitapListesi = new ArrayList<Kitap>();
    
    public void KitapEkle(Kitap yeniKitap){
        kitapListesi.add(yeniKitap);
    }
    
    public void KitapSil(String isbn){
        Kitap k1;
        int sayac = 0;
        for(Kitap item : kitapListesi){
        if(item.getIsbn() == isbn){
            break;
        }}
        kitapListesi.remove(sayac);
    
    }
    
    public void KitapAra(String arananKelime){
        for(Kitap item : kitapListesi){
            if(item.getKitapAdi() == arananKelime){
                System.out.println("Aradığınız Kitabın Adı: " + item.getKitapAdi() + " Kitap Yazarı: " + item.getYazar() 
                        + " Kategorisi: " + item.getKategori() + " Sayfa Sayısı: " + item.getSayfaSayisi());
            }
        }
    }
    
    public void tumKitaplariListele(){
        if(kitapListesi == null){
            System.out.println("Liste boş");
        }
        else{
            int sayac = 0;
            for(Kitap item : kitapListesi ){
                sayac++;
                System.out.println(sayac + " Kitabın Adı: " + item.getKitapAdi() + " Kitap Yazarı: " + item.getYazar() 
                            + " Kategorisi: " + item.getKategori() + " Sayfa Sayısı: " + item.getSayfaSayisi());
            }
        }
    }
    
    
}
