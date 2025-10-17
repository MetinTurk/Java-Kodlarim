/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otoparkyonetimotomasyonu;

import java.time.LocalDateTime;

/**
 *
 * @author Metin
 */
public class Otomobil extends Arac {
    public Otomobil(String plaka)
    {
        super(plaka);
        this.setGirisZamani(LocalDateTime.now());
    }

    @Override
    public double ucretHesapla(LocalDateTime cikisZamani) {
        
    }
    
    @Override
    public void bilgiGoster(){
        System.out.println("Arac plakası: " + this.getPlaka() + " giris saati: " + this.getGirisZamani().getHour() + ":" + this.getGirisZamani().getMinute());
    }

    
    
}
