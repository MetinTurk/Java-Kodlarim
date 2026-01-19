/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teknofestprojeyonetimi;

/**
 *
 * @author Metin23
 */
public class Proje<T> {

    /**
     * @return the ProjeId
     */
    public int getProjeId() {
        return ProjeId;
    }

    /**
     * @return the ProjeAdi
     */
    public String getProjeAdi() {
        return ProjeAdi;
    }

    /**
     * @return the ProjeIcerik
     */
    public T getProjeIcerik() {
        return ProjeIcerik;
    }
    public Proje(int projeId, String ProjeAdi , T ProjeIcerik){
        this.ProjeId = projeId;
        this.ProjeAdi = ProjeAdi;
        this.ProjeIcerik = this.ProjeIcerik;
        this.toplamPuan = 0;
    }
    
    private int ProjeId;
    private String ProjeAdi;
    private T ProjeIcerik;
    private int toplamPuan;
    
    public void PuanEkle(int puan){
        this.toplamPuan += puan;
        System.out.println(Thread.currentThread().getName() + " puan verdi. Toplam: " + this.getToplamPuan());
    }

    /**
     * @return the toplamPuan
     */
    public int getToplamPuan() {
        return toplamPuan;
    }
    
}
