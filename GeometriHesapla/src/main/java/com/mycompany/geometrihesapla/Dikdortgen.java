/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometrihesapla;

/**
 *
 * @author Metin
 */
public class Dikdortgen extends GeometrikSekil{
    
    private double genislik;
    private double yukseklik;
    
    public Dikdortgen(String renk , boolean doluMu, double genislik , double yukseklik){
        super(renk,doluMu);
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }
    

    @Override
    public double getAlan() {
        double Alan = this.genislik * this.yukseklik;
        return Alan;
    }
    
    
    @Override
    public String toString(){
        return "Renk: "+ this.getRenk() + " dolu mu: " + this.isDoluMu() +" genislik: " + this.genislik + " yukseklik: " + this.yukseklik;
    }
    
}
