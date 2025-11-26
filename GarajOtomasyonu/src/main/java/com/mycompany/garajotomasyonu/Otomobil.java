/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garajotomasyonu;

/**
 *
 * @author Metin
 */
public class Otomobil extends Tasit {

    /**
     * @return the kapiSayisi
     */
    public int getKapiSayisi() {
        return kapiSayisi;
    }
    public Otomobil(String marka, String model , int yil , int kapiSayisi){
        super(marka,model,yil);
        this.kapiSayisi = kapiSayisi;
    }
    private int kapiSayisi;
    
    @Override
    public void BilgileriGoster(){
        System.out.println("Arabanızın markası: " + this.getMarka() + " modeli: " + this.getModel() + " yili: " + this.getYil() +" hızı: " + this.Hizlan(120.0) + " kapi sayisi: " + this.kapiSayisi);
    }
    
    public void klimayiAc(){
        System.out.println("Klima açıldı.");
    }
    
    
}
