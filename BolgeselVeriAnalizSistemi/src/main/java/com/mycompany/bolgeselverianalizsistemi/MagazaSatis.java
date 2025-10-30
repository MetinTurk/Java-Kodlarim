/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolgeselverianalizsistemi;

/**
 *
 * @author Metin
 */
public class MagazaSatis extends RaporlanabilirBirim implements IZLENEBILIR{

    public MagazaSatis(String birimAdi, String bolgeKodu, String veriGirisTarihi) {
        super(birimAdi, bolgeKodu, veriGirisTarihi);
    }
    
    private double ekstraMasraf;

    @Override
    public double analizYap() {
        double netGelir = this.tumYilToplaminiGetir() - this.ekstraMasraf -(this.tumYilToplaminiGetir() * IZLENEBILIR.STANDART_VERGI_ORANI);
        return netGelir;
    }

    @Override
    public boolean veriDogrulandiMi() {
        if(this.ekstraMasraf > 2000){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void enventerKontroluYap(String kontrolKodu) {
        System.out.println("Magaza envanter kontrolu yapildi. Kontrol kodu: " + kontrolKodu);
    }
    
}
