/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemysorular;

/**
 *
 * @author Metin
 */
public class CemberDaire {

    /**
     * @return the cevre
     */
    public double getCevre() {
        return cevre;
    }

    /**
     * @param cevre the cevre to set
     */
    public void setCevre(double cevre) {
        this.cevre = cevre;
    }

    /**
     * @return the alan
     */
    public double getAlan() {
        return alan;
    }

    /**
     * @param alan the alan to set
     */
    public void setAlan(double alan) {
        this.alan = alan;
    }
    
    private final double pi = 3.14; 
    /**
     * @return the _yaricap
     */
    public double getYaricap() {
        return _yaricap;
    }

    /**
     * @param _yaricap the _yaricap to set
     */
    public void setYaricap(double _yaricap) {
        this._yaricap = _yaricap;
    }
    
    private double _yaricap;
    private double cevre;
    private double alan;
    
    CemberDaire(double yaricap){
        this._yaricap = yaricap;
        this.cevre = cevreHesapla();
        this.alan = alanHesapla();
    }
    
    
    private double cevreHesapla(){
        return 2 * pi * this._yaricap;
    }
    
    private double alanHesapla(){
        return pi * (this._yaricap*this._yaricap);
    }
    
}
