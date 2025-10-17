/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometrihesapla;

/**
 *
 * @author Metin
 */
public class Daire extends GeometrikSekil{

    private double yaricap;
    double pi = 3.14;
    
    public Daire(String renk , boolean doluMu, double yaricap)
    {
        super(renk, doluMu);
        this.yaricap = yaricap;
    }
    
    
    @Override
    public double getAlan() {
        double alan = pi*(this.yaricap*this.yaricap);
        return alan;
    }
    
     @Override
    public String toString(){
        return "Renk: "+ this.getRenk() + " dolu mu: " + this.isDoluMu() +" yaricap: " + this.yaricap;
    }
    
}
