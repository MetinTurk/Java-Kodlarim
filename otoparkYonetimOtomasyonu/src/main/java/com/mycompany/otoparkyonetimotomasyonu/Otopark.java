/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otoparkyonetimotomasyonu;

import java.util.*;

/**
 *
 * @author Metin
 */
public class Otopark {
    private final int kapasite = 100;
    List<Arac> parkEtmisAraclar = new ArrayList<Arac>();
    
    
    public void aracGirisYap(Arac yeni_arac){
        parkEtmisAraclar.add(yeni_arac);
    }
    public void aracCikisYap(Arac cikis_arac){
        parkEtmisAraclar.remove(cikis_arac);
    }
    public void araclariListele(){
        for (Arac arac : parkEtmisAraclar) {
            arac.bilgiGoster();
        }
    }
}
