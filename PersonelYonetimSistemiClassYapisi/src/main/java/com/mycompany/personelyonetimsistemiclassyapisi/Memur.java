/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personelyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class Memur extends Personel {

    /**
     * @return the toplamMemurSayisi
     */
    public static int getToplamMemurSayisi() {
        return toplamMemurSayisi;
    }
    private static int toplamMemurSayisi;
    private double ekGorevUcreti;
    
    public Memur(String ad, String soyad, String sicilNo, double ekGorevUcreti) {
        super(ad, soyad, sicilNo);
        toplamMemurSayisi++;
        this.ekGorevUcreti = ekGorevUcreti;
    }
    
    
    @Override
    public double maasHesapla() {
        return getTabanMaas()+this.ekGorevUcreti;
    }
    
    protected double getIkramiye(){
        return 1000.0;
    }
    
    
    
    
}
