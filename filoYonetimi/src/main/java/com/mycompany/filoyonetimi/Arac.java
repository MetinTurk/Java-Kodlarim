/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filoyonetimi;

/**
 *
 * @author Metin
 */
public abstract class Arac {
//soyut sınıf , doğrudan kullanılmaz.
    
    private String marka;
    private int modelYili;
    private double kilometre;
    
    public Arac(String marka , int modelYili , double kilometre){
        this.marka = marka;
        this.modelYili = modelYili;
        this.kilometre = kilometre;
    }
    
    public abstract void yakitTuketimi(double mesafe);
    
    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the modelYili
     */
    public int getModelYili() {
        return modelYili;
    }

    /**
     * @param modelYili the modelYili to set
     */
    public void setModelYili(int modelYili) {
        this.modelYili = modelYili;
    }

    /**
     * @return the kilometre
     */
    public double getKilometre() {
        return kilometre;
    }

    /**
     * @param kilometre the kilometre to set
     */
    public void setKilometre(double kilometre) {
        this.kilometre = kilometre;
    }
    
    
    
    
}
