/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generic_collection_thread_kodlari;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Metin23
 */
public class Generic_Collection_Thread_Kodlari {

    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        Kutu<String> MetinKutusu = new Kutu<>();
        MetinKutusu.Ekle("Deneme");
        System.out.println(MetinKutusu.Getir());
        Kutu<Integer> SayiKutusu = new Kutu<>();
        SayiKutusu.Ekle(65);
        System.out.println(SayiKutusu.Getir());
        */
        /*
        HashMap<String,Integer> Ogrenci = new HashMap<>();
        Ogrenci.put("Ahmet", 50);
        Ogrenci.put("Metin", 100);
        Ogrenci.put("Sıla", 100);
        System.out.println(Ogrenci.get("Sıla"));
        for (String isim : Ogrenci.keySet()) {
            int notu = Ogrenci.get(isim);
            System.out.println("Öğrenci: " + isim + "- Notu: "+ notu);
        }
        */
        /*
        GeriSayim gorev1 = new GeriSayim("Bomba Sayacı", 5);
        GeriSayim gorev2 = new GeriSayim("Yemek Sayacı", 3);
        
        Thread isci1 = new Thread(gorev1);
        Thread isci2 = new Thread(gorev2);
        
        isci1.start();
        isci2.start();
        */
        
        BasvuruSistemi sistem = new BasvuruSistemi();
        
        Proje<String> proje1 = new Proje<>(1, "Akıllı Tarım" , "Sensör verileri");
        sistem.kategoriyeGoreEkle("Tarım Teknolojileri", proje1);

        System.out.println("\n--- OYLAMA BAŞLIYOR ---");

        // 4. Jürileri (Threadleri) Hazırla
        // Üç jüri de AYNI PROJE nesnesine puan verecek
        Thread juri1 = new Thread(new Degerlendirme(proje1, 10));
        Thread juri2 = new Thread(new Degerlendirme(proje1, 20));
        Thread juri3 = new Thread(new Degerlendirme(proje1, 15));

        // 5. Jürileri Aynı Anda Başlat
        juri1.start();
        juri2.start();
        juri3.start();



        // 7. Sonucu Yazdır
        System.out.println("\n--- SONUÇ ---");
        System.out.println("Projenin Final Puanı: " + proje1.getToplamPuan());
        
        
        IleriSayma _30SaniyeSayac = new IleriSayma(30);
        Thread deneme = new Thread(_30SaniyeSayac);
        deneme.start();
                
    }
    
    
}
