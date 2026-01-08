/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP;



import com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.Exception.StokYetersizException;


public abstract class Urun implements ISatilabilir {
    
    private int id;
    private String ad;
    private double fiyat;
    private int stok;

    
    public Urun(String ad, double fiyat, int stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    public Urun(int id, String ad, double fiyat, int stok) {
        this(ad, fiyat, stok); 
        this.id = id;
    }

    
    public abstract String getKategoriAdi();

    
    public int getId() { return id; }
    public String getAd() { return ad; }
    public double getFiyat() { return fiyat; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    
    public void stokDus(int adet) throws StokYetersizException {
        if (stok < adet) {
            throw new StokYetersizException("Hata: " + ad + " için yeterli stok yok! Mevcut: " + stok);
        }
        this.stok -= adet;
    }
}