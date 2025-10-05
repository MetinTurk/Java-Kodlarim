/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakonutekrari;

/**
 *
 * @author Metin
 */
public class Yazar {

    
    private String ad;
    private String soyad;
    private int dogumYili;
    
    public Yazar(String _ad , String _soyad , int _dogumYili){
        ad = _ad;
        soyad = _soyad;
        dogumYili = _dogumYili;   
    }
    
    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the dogumYili
     */
    public int getDogumYili() {
        return dogumYili;
    }

    /**
     * @param dogumYili the dogumYili to set
     */
    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }
    
    public void getAdSoyad(){
        System.out.println("Adı: "+ getAd()+ " Soyadı: " + getSoyad());
    }
}
