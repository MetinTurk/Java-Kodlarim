/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolgeselverianalizsistemi;

/**
 *
 * @author Metin
 */
public class OnlineSatis extends RaporlanabilirBirim implements IZLENEBILIR{

    private double komisyonOrani;

    public OnlineSatis(String birimAdi, String bolgeKodu, String veriGirisTarihi) {
        super(birimAdi, bolgeKodu, veriGirisTarihi);
    }
    
    
    
    @Override
    public double analizYap(){
        double netGelir = this.tumYilToplaminiGetir() * (1-this.komisyonOrani) * (1 - IZLENEBILIR.STANDART_VERGI_ORANI);
        return netGelir;
    }
    
    @Override
    public boolean veriDogrulandiMi() {
        if(this.komisyonOrani < 0.05){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void enventerKontroluYap(String kontrolKodu) {
        System.out.println("Online envanter kontrolu yapildi, kontrol kodu: " + kontrolKodu);
    }
    
}
