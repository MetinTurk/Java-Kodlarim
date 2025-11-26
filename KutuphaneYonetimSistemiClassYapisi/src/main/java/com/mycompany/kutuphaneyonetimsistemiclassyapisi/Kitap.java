/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kutuphaneyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class Kitap extends Yayin{
    
    private int sayfaSayisi;
            

    public Kitap(String baslik, int yayinYili, int sayfaSayisi) {
        super(baslik, yayinYili);
        this.sayfaSayisi = sayfaSayisi;
    }

    
    @Override
    public void detaylariYazdir() {
        System.out.println("Kitabın başlığı: " + this.baslik + " yayın yili: " + this.yayinYili + " sayfa sayisi: " + this.sayfaSayisi);
    }

    @Override
    public boolean kullanimaUygunMu() {
        if(this.sayfaSayisi < 500){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double kullanimMaliyetiHesapla() {
        return IKullanilabilir.KULLANIM_UCRETİ*2;
    }
    
}
