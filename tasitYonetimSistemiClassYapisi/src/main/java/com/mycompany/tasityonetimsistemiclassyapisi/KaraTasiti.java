/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasityonetimsistemiclassyapisi;

/**
 *
 * @author Metin
 */
public class KaraTasiti extends Tasit{

    private int tekerlekSayisi;
    
    public KaraTasiti(String marka, int yolcuKapasitesi , int tekerlekSayisi) {
        super(marka, yolcuKapasitesi);
        this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public double getVergiMiktari() {
        return 5000.0+(this.tekerlekSayisi*200.0);
    }
    
    protected void lastikDegistir(){
        System.out.println("Tekerlek sayısı kadar lastik değişimi yapıldı: " + this.tekerlekSayisi);
    }
    
}
