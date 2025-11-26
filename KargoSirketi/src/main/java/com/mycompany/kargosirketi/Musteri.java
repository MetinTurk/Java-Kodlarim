/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kargosirketi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Metin
 */
public class Musteri {
    private String adi;
    private String soyadi;
    private String telNo;
    private String adres;
    
    List<Kargo> kargolar = new ArrayList<Kargo>();
    
    public Musteri(String ad , String soyad , String telefon  , String adres){
        this.adi = ad;
        this.soyadi = soyad;
        this.telNo = telefon;
        this.adres = adres;
    }
    
    public double FaturaGoster(Kargo kargo1 ){
        return kargo1.getFatura();
    }
    
    public void SiparisVer(double agirlik , double uzaklik , String kargoTipi){
        Kargo k1 = new Kargo(agirlik , uzaklik, kargoTipi);
        kargolar.add(k1);
    }
    
}
