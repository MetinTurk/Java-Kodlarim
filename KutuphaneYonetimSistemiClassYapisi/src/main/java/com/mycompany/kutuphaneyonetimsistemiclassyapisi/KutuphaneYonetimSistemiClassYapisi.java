/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kutuphaneyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class KutuphaneYonetimSistemiClassYapisi {

    public static void main(String[] args) {
        Yayin[] yayinlar = new Yayin[4];
        yayinlar[0] = new Kitap("Suç ve Ceza", 2000, 600);
        yayinlar[1] = new Kitap("Nutuk", 1915, 300);
        yayinlar[2] = new Dergi("Yapay Zeka", 2025, "132456798");
        yayinlar[3] = new Dergi("SQL", 2018, "987654321");
        
        for(int i = 0;i<yayinlar.length;i++){
            System.out.print(i+1 + ". kitabın detayı: ");
            yayinlar[i].detaylariYazdir();
        }
        
        int toplamMaliyet = 0;
        for(int i = 0; i < yayinlar.length; i++){
            //IKullanilabilir IK1 = (IKullanilabilir) yayinlar[i];
            if(yayinlar[i].kullanimaUygunMu()){
                toplamMaliyet += yayinlar[i].kullanimMaliyetiHesapla();
            }
        }
        System.out.println("Toplam maliyet: " + toplamMaliyet);

    }
}
