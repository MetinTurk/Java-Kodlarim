/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpgkaraktersimulamatoru;

/**
 *
 * @author Metin
 */
public abstract class Karakter {

    

    
    private String isim;
    private int seviye;
    private int canPuani;
    
    public Karakter(String isim , int seviye , int canPuani)
    {
        this.isim = isim;
        this.seviye = seviye;
        this.canPuani = canPuani;
    }
    
    public abstract void saldir(Karakter rakip);
    
    public abstract void ozelYetenekKullan(Karakter rakip);
    
    public void bilgileriGoster(){
        System.out.println("Karekterin ismi: " + this.getIsim()+ " seviyesi: " + this.getSeviye() + " canı: " + this.getCanPuani());
    }
    
    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @return the seviye
     */
    public int getSeviye() {
        return seviye;
    }

    /**
     * @return the canPuani
     */
    public int getCanPuani() {
        return canPuani;
    }
    
    /**
     * @param seviye the seviye to set
     */
    public void setSeviye(int seviye) {
        this.seviye = seviye;
    }

    /**
     * @param canPuani the canPuani to set
     */
    public void setCanPuani(int canPuani) {
        this.canPuani = canPuani;
    }
    
}
