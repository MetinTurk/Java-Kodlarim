/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kutuphaneyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class Dergi extends Yayin{
    
    private String issnNumarasi;

    public Dergi(String baslik, int yayinYili, String issnNumarasi) {
        super(baslik, yayinYili);
        this.issnNumarasi = issnNumarasi;
    }

    @Override
    public void detaylariYazdir() {
        System.out.println("Kitabın başlığı: " + this.baslik + " yayın yili: " + this.yayinYili + " ISSN numarasi: " + this.issnNumarasi);
    }

    @Override
    public boolean kullanimaUygunMu() {
        return true;
    }

    @Override
    public double kullanimMaliyetiHesapla() {
        return IKullanilabilir.KULLANIM_UCRETİ/2;
    }
    
}
