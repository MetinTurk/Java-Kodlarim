/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasityonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class TasitYonetimSistemiClassYapisi {

    public static void main(String[] args) {
        Tasit[] tasitler = new Tasit[3];
        tasitler[0] = new KaraTasiti("MAN", 4, 8);
        tasitler[1] = new Otomobil("BMW", 2, 4, 500);
        tasitler[2] = new Otomobil("Merco", 4, 4, 300);
        
        for(int i = 0; i< tasitler.length ; i++){
            System.out.println(i+1 + ". aracin vergisi: " + tasitler[i].getVergiMiktari());
        }
        
        Otomobil otomobil1 = (Otomobil) tasitler[1];
        otomobil1.lastikDegistir();
        
        System.out.println("Toplam tasit sayisi: " + Tasit.getToplamTasitSayisi());
    }
}
