/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personelyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class PersonelYonetimSistemiClassYapisi {

    public static void main(String[] args) {
        Personel[] personeller = new Personel[3];
        personeller[0] = new Yonetici("Sila", "Türk", "1",2000, 10000);
        personeller[1] = new Yonetici("Metin" , "Türk" , "2" , 5000, 2000);
        personeller[2] = new Memur("Ata" , "Türk" , "3" , 1000);
        
        for(int i = 0; i < personeller.length ; i++){
            System.out.println(i+1 + ". Personelin maasi: " + personeller[i].maasHesapla());   
        }
        System.out.println("Toplam memur sayisi: " + Memur.getToplamMemurSayisi());
        Yonetici yonetici1 = (Yonetici) personeller[0];
        System.out.println("Ikramiye: " + yonetici1.getIkramiye());
    }
}
