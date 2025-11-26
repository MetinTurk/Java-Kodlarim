/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kargosirketi;

/**
 *
 * @author Metin
 */
public class Kargo {

    /**
     * @return the fatura
     */
    public double getFatura() {
        return fatura;
    }
    private double agirlik;
    private double uzaklik;
    private String kargoTipi;
    private double fatura = 0;
    
    public Kargo(double agirlik , double uzaklik , String kargoTipi){
        this.agirlik = agirlik;
        this.uzaklik = uzaklik;
        this.kargoTipi = kargoTipi;
        this.UcretHesapla();
    }
    
    public void UcretHesapla(){
        if(this.kargoTipi == "Normal"){
            this.fatura = (this.agirlik*2)+ (this.uzaklik*0.5); 
        }
        else if(this.kargoTipi == "Hizli"){
            this.fatura = (this.agirlik*3) + (this.uzaklik*0.75);
        }
        else{
            System.out.println("Hatalı tuşlama yapıldı fatura iptal.");
        }
    }
}
