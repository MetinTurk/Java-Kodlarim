/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eticaretotomasyonu;

/**
 *
 * @author Metin
 */
public class ElektronikUrun extends Urun {
    private double otvOrani;

    public ElektronikUrun(String urunAdi, double temelFiyat , double  otvOrani) {
        super(urunAdi, temelFiyat);
        this.otvOrani = otvOrani;
    }
    
    @Override
    public double FiyatHesapla(){
        return ((this.getTemelFiyat()*this.otvOrani)/100)+this.getTemelFiyat();
    }
    
    @Override
    public void BilgileriGoster(){
        System.out.println("Urun adi: " + this.getUrunAdi() + " urun fiyati: " + this.FiyatHesapla()+ "₺");
    }
}
