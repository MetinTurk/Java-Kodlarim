/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometrihesapla;

/**
 *
 * @author Metin
 */
public abstract class GeometrikSekil {

     /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the doluMu
     */
    public boolean isDoluMu() {
        return doluMu;
    }

    /**
     * @param doluMu the doluMu to set
     */
    public void setDoluMu(boolean doluMu) {
        this.doluMu = doluMu;
    }

    
    private String renk;
    private boolean doluMu;
    
    public GeometrikSekil(String renk , boolean doluMu){
        this.renk = renk;
        this.doluMu = doluMu;
    }
    
    public abstract double getAlan();
    
    @Override
    public String toString(){
        return "Renk: "+ this.renk + " dolu mu: " + this.doluMu;
    }
    
}
