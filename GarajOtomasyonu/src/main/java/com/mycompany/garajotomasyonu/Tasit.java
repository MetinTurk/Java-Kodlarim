/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garajotomasyonu;

import java.util.List;

/**
 *
 * @author Metin
 */
public class Tasit {

    
    private String marka;
    private String model;
    private int yil;
    private double hiz;
    
    public Tasit(String marka, String model , int yil){
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    
    public double Hizlan(double artis){
        this.hiz += artis;
        //System.out.println("Hız" + artis + "arttırıldı, anlık hız: " + this.hiz);
        return this.hiz;
    }
    
    public void Yavasla(double azalis){
        if(this.hiz <=0 && this.hiz-azalis < 0 ){
            System.out.println("Hız azaltılamadı çünkü hızınız: " + this.hiz);      
        }
        else{
            this.hiz -= azalis;
            System.out.println("Hız" + azalis + "azaltıldı, anlık hız: " + this.hiz);

        }
    }
    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the yil
     */
    public int getYil() {
        return yil;
    }
    
    public void BilgileriGoster(){
        System.out.println("Arabanızın markası: " + this.marka + " modeli: " + this.model + " yili: " + this.yil + " hizi: " + this.hiz);
    }
    
}
