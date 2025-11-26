/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personelyonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public abstract class Personel {
    private String ad;
    private String soyad;
    private String sicilNo;
    private double tabanMaas;
    public Personel(String ad,String soyad,String sicilNo)
    {
        this.ad = ad;
        this.soyad = soyad;
        this.sicilNo = sicilNo;
        this.tabanMaas = 30000;
    }
    public abstract double maasHesapla();
    
    public void bilgiGoster(){
        System.out.println("Merhaba " + this.ad + " " + this.soyad + " sicil No: " + this.sicilNo + " taban maas: " + this.tabanMaas);
    }
    
    public String getAd() {
        return ad;
    }


    public String getSoyad() {
        return soyad;
    }


    public String getSicilNo() {
        return sicilNo;
    }

    public double getTabanMaas() {
        return tabanMaas;
    }
 
}
