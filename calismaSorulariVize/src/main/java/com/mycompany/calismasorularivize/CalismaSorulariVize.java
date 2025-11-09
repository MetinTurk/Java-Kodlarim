/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calismasorularivize;

/**
 *
 * @author Metin
 */
public class CalismaSorulariVize {

    public static void main(String[] args) {
        
        Musteri obj = new Test();
        obj.musteriBilgisiGetir();
        
        NetStatus.NetStatusDetail obj2 = new NetStatus(). new NetStatusDetail();
        obj2.printStatus();
        
        
        
        
        IOtoBilgi[] liste = new IOtoBilgi[3];
        liste[0] = new DusukOtomobil("Fiat", "123fiat", 200000);
        liste[1] = new OrtaOtomobil("Ford", "456Ford", 200000);
        liste[2] = new YuksekOtomobil("BMW" , "789BMW" , 200000);
        
        for (int i = 0; i < liste.length; i++) {
            Otomobil otoDusurme = (Otomobil) liste[i];
            if(otoDusurme.fiyat >= 250000){
                System.out.println("Adi: " + otoDusurme.ad);
                System.out.println("Kodu: " + otoDusurme.kod);
                System.out.println("Fiyat: " + otoDusurme.fiyat);
            }
        }
        
        
    }
}
