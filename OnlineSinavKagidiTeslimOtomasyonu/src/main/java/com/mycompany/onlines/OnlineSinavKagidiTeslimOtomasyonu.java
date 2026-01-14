/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlines;

/**
 *
 * @author Metin23
 */
public class OnlineSinavKagidiTeslimOtomasyonu {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        SinavKagidi<String> kagit = new SinavKagidi<>(23 , "BM-101" , "ABCDE");
        OgrenciIsleri ogrenciIsleri = new OgrenciIsleri();
        
        Asistan asistan1 = new Asistan(10, kagit);
        Asistan asistan2 = new Asistan(20, kagit);
        Asistan asistan3 = new Asistan(50, kagit);
        
        Thread asistan11 = new Thread(asistan1);
        Thread asistan22 = new Thread(asistan2);
        Thread asistan33 = new Thread(asistan3);
        asistan11.start();
        asistan22.start();
        asistan33.start();
        
        try {
            Thread.sleep(3000);
            System.out.println("Toplam Puan:" + kagit.getNotOrtalamasi());

        } catch (Exception e) {
        }
            
        


        
    }
}
