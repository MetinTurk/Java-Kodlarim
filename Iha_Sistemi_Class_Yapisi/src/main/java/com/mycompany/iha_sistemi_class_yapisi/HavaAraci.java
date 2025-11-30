/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iha_sistemi_class_yapisi;

/**
 *
 * @author metin
 */
public  abstract class HavaAraci {

    /**
     * @param pilSeviyesi the pilSeviyesi to set
     */
    public void setPilSeviyesi(double pilSeviyesi) {
        if(pilSeviyesi > 100 ){
            this.pilSeviyesi = pilSeviyesi - 100; 
        }
        else if(pilSeviyesi < 0){
            this.pilSeviyesi = 0;
        }
        else{
            this.pilSeviyesi = pilSeviyesi;
        }
    }

    /**
     * @return the seriNo
     */
    public String getSeriNo() {
        return seriNo;
    }

    /**
     * @return the pilSeviyesi
     */
    public double getPilSeviyesi() {
        return pilSeviyesi;
    }

    /**
     * @return the maxYukseklik
     */
    public int getMaxYukseklik() {
        return maxYukseklik;
    }

    public HavaAraci(String seriNo, double pilSeviyesi, int maxYukseklik) {
        this.seriNo = seriNo;
        this.pilSeviyesi = pilSeviyesi;
        this.maxYukseklik = maxYukseklik;
    }
    private String seriNo;
    private double pilSeviyesi;
    private int maxYukseklik;
    
    public abstract void yakitTuket(int mesafe);
    
    public void pilDurumuGoster(){
        System.out.println("Pil Durumu: " + this.pilSeviyesi);
    }
}
