/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calismasorularivize;

/**
 *
 * @author Metin
 */
public class DusukOtomobil extends Otomobil implements IOtoBilgi{
    
    public DusukOtomobil(String ad, String kod, double fiyat) {
        super(ad, kod, fiyat);
    }

    @Override
    public void KodaGoreArama() {
        System.out.println("Koda Gore Arandi");
    }

    @Override
    public void IsimeGoreArama() {
        System.out.println("Isime gore arandi");
    }

    @Override
    public void FiyataGoreArama() {
        System.out.println("Isime gore arandi");
    }

    @Override
    public void YeniOtomobilEkle() {
        System.out.println("Isime gore arandi");
    }
    
}
