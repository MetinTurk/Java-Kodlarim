/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javakonutekrari;

/**
 *
 * @author Metin
 */
public class JavaKonuTekrari {

    public static void main(String[] args) {
        Yazar y1 = new Yazar("Sila" , "Aydin" , 2003);
        Kitap k1 = new Kitap("Atatürk" , y1 , "136465132" , "Tarih" , 300 , false);
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.KitapEkle(k1);
        kutuphane.tumKitaplariListele();
        kutuphane.KitapSil("136465132");
        kutuphane.tumKitaplariListele();

        
        
    }
}
