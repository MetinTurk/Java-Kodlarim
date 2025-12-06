/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ntp_deney1.model;

/**
 *
 * @author metin
 */

public class YuksekLisansOgrenci extends Ogrenci {

    
    private String tezBasligi;

    public YuksekLisansOgrenci(int id, String ad, String soyad, String bolum, double ortalama, String tezBasligi) {
        super(id, ad, soyad, bolum, ortalama);
        this.tezBasligi = tezBasligi;
    }

    
    
    @Override
    public boolean gectiMi() {
        return getOrtalama() >= 70.0;
    }

    @Override
    public String toString() {
        return super.toString() + " (YL -> Tez: " + getTezBasligi() + ")";
    }
    
    /**
     * @return the tezBasligi
     */
    public String getTezBasligi() {
        return tezBasligi;
    }

    /**
     * @param tezBasligi the tezBasligi to set
     */
    public void setTezBasligi(String tezBasligi) {
        this.tezBasligi = tezBasligi;
    }
}
