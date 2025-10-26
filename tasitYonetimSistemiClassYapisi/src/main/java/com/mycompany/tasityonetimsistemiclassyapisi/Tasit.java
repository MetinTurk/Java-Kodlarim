/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasityonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public abstract class Tasit {

    /**
     * @return the toplamTasitSayisi
     */
    public static int getToplamTasitSayisi() {
        return toplamTasitSayisi;
    }
    protected String marka;
    protected int yolcuKapasitesi;
    
    private static int toplamTasitSayisi = 0;
    
    public Tasit(String marka , int yolcuKapasitesi){
        this.marka = marka;
        this.yolcuKapasitesi = yolcuKapasitesi;
        toplamTasitSayisi++;
    }
    
    public abstract double getVergiMiktari();
    
    public void bilgiGoster(){
        System.out.println("Markası: " + this.marka + " yolcu kapasitesi: " + this.yolcuKapasitesi + " toplam tasit sayisi: " + this.getToplamTasitSayisi());
    }
    
}
