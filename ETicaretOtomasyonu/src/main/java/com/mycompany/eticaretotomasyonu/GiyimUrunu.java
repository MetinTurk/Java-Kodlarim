/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eticaretotomasyonu;

/**
 *
 * @author Metin
 */
public class GiyimUrunu extends Urun{
    private double kdvOrani;

    public GiyimUrunu(String urunAdi, double temelFiyat , double kdvOrani) {
        super(urunAdi, temelFiyat);
        this.kdvOrani = kdvOrani;
    }
    
    @Override
    public double FiyatHesapla(){
        return ((this.getTemelFiyat()*this.kdvOrani)/100)+this.getTemelFiyat();
    }
    
    @Override
    public void BilgileriGoster(){
        System.out.println("Urun adi: " + this.getUrunAdi() + " urun fiyati: " + this.FiyatHesapla()+ "₺");
    }
    
}
