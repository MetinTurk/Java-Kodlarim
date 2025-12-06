/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metin
 */

public class LisansOgrenci extends Ogrenci {

    
    private int sinif;
    private int donem;

    // Super constructor kullanımı 
    public LisansOgrenci(int id, String ad, String soyad, String bolum, double ortalama, int sinif, int donem) {
        super(id, ad, soyad, bolum, ortalama);
        this.sinif = sinif;
        this.donem = donem;
    }

    @Override
    public boolean gectiMi() {
        return getOrtalama() >= 50.0;
    }

    @Override
    public String toString() {
        return super.toString() + " (Lisans -> Sinif: " + getSinif() + ", Donem: " + getDonem() + ")";
    }
    
    /**
     * @return the sinif
     */
    public int getSinif() {
        return sinif;
    }

    /**
     * @param sinif the sinif to set
     */
    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    /**
     * @return the donem
     */
    public int getDonem() {
        return donem;
    }

    /**
     * @param donem the donem to set
     */
    public void setDonem(int donem) {
        this.donem = donem;
    }
}
