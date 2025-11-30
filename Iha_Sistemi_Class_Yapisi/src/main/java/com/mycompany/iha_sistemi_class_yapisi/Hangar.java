/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iha_sistemi_class_yapisi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author metin
 */
public class Hangar<T extends HavaAraci> {
    List<T> hangar = new ArrayList<T>();
    public void AracEkle(T arac){
        hangar.add(arac);
    }
    public void TopluBakimYap(){
        for(T arac : hangar){
            System.out.println(arac.getSeriNo()+" nolu tasitin pil seviyesi: " + arac.getPilSeviyesi());
        }
    }
    
    public void hangarDurumu(){
        int count = 0;
        for (T arac : hangar) {
            System.out.println(arac.getClass().getName());
            count++;
        }
        System.out.println("Toplam taşıt sayısı: " + count);
    }
}
