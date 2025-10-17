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
public abstract class Arac {

    /**
     * @return the girisZamani
     */
    public LocalDateTime getGirisZamani() {
        return girisZamani;
    }

    /**
     * @param girisZamani the girisZamani to set
     */
    public void setGirisZamani(LocalDateTime girisZamani) {
        this.girisZamani = girisZamani;
    }

    /**
     * @return the plaka
     */
    public String getPlaka() {
        return plaka;
    }
    private String plaka;
    private LocalDateTime girisZamani;
    
    public Arac(String plaka)
    {
        this.plaka = plaka;
    }
    
    public abstract double ucretHesapla(LocalDateTime cikisZamani);
    
    public void bilgiGoster(){
        System.out.println("Arac plakası: " + this.plaka + " giris saati: " + this.girisZamani.getHour() + ":" + this.girisZamani.getMinute());
    }
    
    
}
