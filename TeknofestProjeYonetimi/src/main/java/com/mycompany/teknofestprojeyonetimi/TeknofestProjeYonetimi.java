/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teknofestprojeyonetimi;

/**
 *
 * @author Metin23
 */
public class TeknofestProjeYonetimi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        BasvuruSistemi Teknofest = new BasvuruSistemi();
        
        Proje<String> proje1 = new Proje<>(1 , "Akıllı telefon" , "Teknoloji");
        Teknofest.kategoriyeGoreEkle("Yazılım", proje1);
        Thread juri1 = new Thread(new Degerlendirme(proje1, 10));
        Thread juri2 = new Thread(new Degerlendirme(proje1, 20));
        Thread juri3 = new Thread(new Degerlendirme(proje1, 50));
        
        juri1.start();
        juri2.start();
        juri3.start();
        
        System.out.println("Projenin destek sorusu"+ proje1.getToplamPuan());

    }
}
