/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garajotomasyonu;

/**
 *
 * @author Metin
 */
public class Kamyon extends Tasit {

    /**
     * @return the yukKapasitesi
     */
    public double getYukKapasitesi() {
        return yukKapasitesi;
    }
    private double yukKapasitesi;

    public Kamyon(String marka, String model, int yil , double yukKapasitesi) {
        super(marka, model, yil);
        this.yukKapasitesi = yukKapasitesi;
    }
    
    @Override
    public void BilgileriGoster(){
        System.out.println("Arabanızın markası: " + this.getMarka() + " modeli: " + this.getModel() + " yili: " + this.getYil() + " yük kapasitesi: " +  this.yukKapasitesi + " ton");
    }
    
    public void yukTasi(double miktar){
        if(this.yukKapasitesi - miktar < 0){
            System.out.println("Girdiğiniz yük kapasiteyi aşıyor.");
        }
        else{
            this.yukKapasitesi -= miktar;
            System.out.println("Yük alınmıştır İyi yolculuklar.");
        }
    }
    
    
    
    
    
}
