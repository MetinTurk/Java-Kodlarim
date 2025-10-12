/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eticaretotomasyonu;

/**
 *
 * @author Metin
 */
public class ETicaretOtomasyonu {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ElektronikUrun telefon = new ElektronikUrun("telefon", 10000, 25);
        GiyimUrunu kazak = new GiyimUrunu("kazak", 500, 10);
        DijitalUrun televizyon = new DijitalUrun("Televizyon", 50000);
        Sepet sepetim = new Sepet();
        sepetim.urunEkle(telefon);
        sepetim.urunEkle(kazak);
        sepetim.urunEkle(televizyon);
        sepetim.urunleriGoster();
        System.out.println("Toplam sepetiniz: " + sepetim.toplamTutariHesapla() + "₺");
    }
}
