/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eticaretotomasyonu;

/**
 *
 * @author Metin
 */
public class DijitalUrun extends Urun {

    public DijitalUrun(String urunAdi , double temelFiyat) {
        super(urunAdi, temelFiyat);
    }
    
    @Override
    public double FiyatHesapla(){
        return this.getTemelFiyat();    
    }
    
    @Override
    public void BilgileriGoster(){
        System.out.println("Urun adi: " + this.getUrunAdi() + " urun fiyati: " + this.FiyatHesapla()+ "₺");
    }
    
    
}
