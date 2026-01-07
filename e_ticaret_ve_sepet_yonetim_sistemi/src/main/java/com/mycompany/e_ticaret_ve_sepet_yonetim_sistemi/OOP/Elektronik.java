/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP;

public class Elektronik extends Urun {
    private String marka;

    public Elektronik(int id, String ad, double fiyat, int stok, String marka) {
        super(id, ad, fiyat, stok);
        this.marka = marka;
    }

    @Override
    public double kdvHesapla() {
        return getFiyat() * 0.20; // Elektronikte %20 KDV
    }

    @Override
    public String getKategoriAdi() {
        return "Elektronik";
    }

    @Override
    public String urunBilgisiGetir() {
        return "ID: " + getId() + " | " + getAd() + " (" + marka + ") - " + getFiyat() + " TL";
    }
}