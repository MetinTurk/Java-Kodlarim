/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlines;

/**
 *
 * @author Metin23
 */
public class SinavKagidi<T> {

    /**
     * @return the ogrenciNo
     */
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    /**
     * @return the dersKodu
     */
    public String getDersKodu() {
        return dersKodu;
    }

    /**
     * @return the cevapIcerigi
     */
    public T getCevapIcerigi() {
        return cevapIcerigi;
    }

    /**
     * @return the notOrtalamasi
     */
    public double getNotOrtalamasi() {
        return notOrtalamasi;
    }
    private int ogrenciNo;
    private String dersKodu;
    private T cevapIcerigi;
    private double notOrtalamasi;
    
    public SinavKagidi(int ogrenciNo , String dersKodu , T cevapIcerigi){
        this.ogrenciNo = ogrenciNo;
        this.dersKodu = dersKodu;
        this.cevapIcerigi = cevapIcerigi;
        this.notOrtalamasi = 0;
    }
    
    public  void puanEkle(int puan){
        this.notOrtalamasi += puan;
        System.out.println(Thread.currentThread().getName() + " puan verdi. Toplam: " + this.getNotOrtalamasi());
    }
    
    
}
