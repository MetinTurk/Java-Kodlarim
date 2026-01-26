/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_collection_thread_kodlari;

/**
 *
 * @author Metin23
 */
public class Proje<T> {

    /**
     * @return the toplamPuan
     */
    public int getToplamPuan() {
        return toplamPuan;
    }

    /**
     * @return the projeID
     */
    public int getProjeID() {
        return projeID;
    }


    public String getProjeAdi() {
        return projeAdi;
    }

    public T getProjeIcerik() {
        return projeIcerik;
    }
    private int projeID;
    private String projeAdi;
    private T projeIcerik;
    private int toplamPuan;
    
    public Proje(int projeId, String projeAdi, T projeIcerik) {
        this.projeID = projeId;
        this.projeAdi = projeAdi;
        this.projeIcerik = projeIcerik;
        this.toplamPuan = 0;
    }
    
    public synchronized void puanEkle(int puan) {
        this.toplamPuan += puan;
        System.out.println(Thread.currentThread().getName() + " puan verdi. Toplam: " + this.getToplamPuan());
    }
}
