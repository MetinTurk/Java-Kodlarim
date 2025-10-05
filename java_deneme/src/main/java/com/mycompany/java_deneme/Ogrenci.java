/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_deneme;

import java.util.*;

/**
 *
 * @author Metin
 */

//constructor sınıf ile aynı isimde olamk zorundadır.
public class Ogrenci {


    
    private int numara;
    private String adi;
    private String soyadi;
    private double gno = 0;
    private String bolum;
    private int yas;
    private List<Ders> ogrders;
    
    
    public Ogrenci(int ogrno){
        this.numara = ogrno;
        //this.ogrders = new Ders();              //içerisinde mutlaka new ile oluşturmamız gerekiyor.
        this.ogrders = new ArrayList<Ders>();     //burada sadece liste oluşturduk. yinede ders nesnesi oluşturmamız gerekiyor.
    }
    
    /**
     * @return the ogrders
     */
    public List<Ders> getOgrders() {
        return ogrders;
    }

    /**
     * @param ogrders the ogrders to set
     */
    public void setOgrders(List<Ders> ogrders) {
        this.ogrders = ogrders;
    }
    
    
    
    public void yazdir(){
        for(int i = 1;i<=10;i++)
            System.out.println(i);
    }
    
    public double dersCalis(){
        gno= gno + 0.1;
        return gno;
    }
    
    public double cokCalis(double neKadar){
        gno = gno + neKadar;
        return gno;
    }

    /**
     * @return the numara
     */
    public int getNumara() {    //değer okuma işlemi
        return numara;
    }

    /**
     * @param numara the numara to set
     */
    public void setNumara(int numara) { //değer atama işlemi
        this.numara = numara;
    }

    /**
     * @return the adi
     */
    public String getAdi() {
        return adi;
    }

    /**
     * @param adi the adi to set
     */
    public void setAdi(String adi) {
        this.adi = adi;
    }

    /**
     * @return the soyadi
     */
    public String getSoyadi() {
        return soyadi;
    }

    /**
     * @param soyadi the soyadi to set
     */
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    /**
     * @return the gno
     */
    public double getGno() {
        return gno;
    }

    /**
     * @param gno the gno to set
     */
    public void setGno(double gno) {
        this.gno = gno;
    }

    /**
     * @return the bolum
     */
    public String getBolum() {
        return bolum;
    }

    /**
     * @param bolum the bolum to set
     */
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }
    
}
