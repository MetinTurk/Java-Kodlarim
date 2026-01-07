/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP;

// Dosya: Urun.java

import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Exception.StokYetersizException;

// Dosya: Urun.java
public abstract class Urun implements ISatilabilir {
    // Encapsulation: Alanlar private
    private int id;
    private String ad;
    private double fiyat;
    private int stok;

    // Constructor Overloading (Gereksinim 1.2)
    public Urun(String ad, double fiyat, int stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    public Urun(int id, String ad, double fiyat, int stok) {
        this(ad, fiyat, stok); // Diğer constructor'ı çağırma
        this.id = id;
    }

    // Abstract method: Alt sınıflar doldurmak zorunda
    public abstract String getKategoriAdi();

    // Getter ve Setterlar
    public int getId() { return id; }
    public String getAd() { return ad; }
    public double getFiyat() { return fiyat; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    // Stok azaltma metodu (Exception fırlatır)
    public void stokDus(int adet) throws StokYetersizException {
        if (stok < adet) {
            throw new StokYetersizException("Hata: " + ad + " için yeterli stok yok! Mevcut: " + stok);
        }
        this.stok -= adet;
    }
}