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
        int girisSaati = this.getGirisZamani().getHour();//17
        int girisDakika = this.getGirisZamani().getMinute();//05
        int cikisSaati = cikisZamani.getHour();//20
        int cikisDakika = cikisZamani.getMinute();//15
        int kalinanSaat = 0;
        if(girisDakika > cikisDakika){
            kalinanSaat = cikisSaati - girisSaati - 1;
        }
        else{
            kalinanSaat = cikisSaati - girisSaati;
        }
        double toplamFatura = (Tarife.OTOMOBIL_KATSAYISI*kalinanSaat*Tarife.SAATLIK_UCRET)+Tarife.GIRIS_UCRETI;
        return toplamFatura;
    }
    
    @Override
    public void bilgiGoster(){
        System.out.println("Arac plakasi: " + this.getPlaka() + " giris saati: " + this.getGirisZamani().getHour() + ":" + this.getGirisZamani().getMinute());
    }

    
    
}
