/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personelyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class Yonetici extends Memur{
    
    public Yonetici(String ad, String soyad, String sicilNo, double ekGorevUcreti, double projeBonusu) {
        super(ad, soyad, sicilNo, ekGorevUcreti);
        this.projeBonusu = projeBonusu;
    }
    
    private double projeBonusu;

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.projeBonusu;
    }
    
    
    
}
