/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasityonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class Otomobil extends KaraTasiti{
    
    public Otomobil(String marka, int yolcuKapasitesi, int tekerlekSayisi , int motorGucu) {
        super(marka, yolcuKapasitesi, tekerlekSayisi);
        this.motorGucu = motorGucu;
    }
    
    private int motorGucu;
    
    @Override
    public double getVergiMiktari() {
        return (super.getVergiMiktari())+ (this.motorGucu*100.0);
    }
}
