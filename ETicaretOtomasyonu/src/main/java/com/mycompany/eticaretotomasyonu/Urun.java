/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eticaretotomasyonu;

/**
 *
 * @author Metin
 */
public class Urun {

    /**
     * @return the urunAdi
     */
    public String getUrunAdi() {
        return urunAdi;
    }

    /**
     * @return the temelFiyat
     */
    public double getTemelFiyat() {
        return temelFiyat;
    }
    private String urunAdi;
    private double temelFiyat;
    
    public Urun(String urunAdi , double temelFiyat){
        this.urunAdi = urunAdi;
        this.temelFiyat = temelFiyat;
    }
    
    public double FiyatHesapla(){
        return this.temelFiyat;
    }
    
    public void BilgileriGoster(){
        System.out.println("Urun adi: " + this.getUrunAdi() + " urun fiyati: " + this.getTemelFiyat() + "₺");
    }
}
