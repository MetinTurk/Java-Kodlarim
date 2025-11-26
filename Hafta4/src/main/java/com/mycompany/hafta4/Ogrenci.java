/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hafta4;

/**
 *
 * @author Metin
 */
import java.util.*;

public class Ogrenci {
   private int numara;
   private String adi;
   private String soyadi;
   private double gno=0;
   private String bolum;
   private int yas;
   private List<Ders> ogrders;
   

   public Ogrenci(int ogrno)
   {
       this.numara=ogrno;
       this.ogrders=new ArrayList<Ders>();
   }
   
   public void yazdir()
   {
       for(int i=1;i<=10;i++){
           System.out.println(i);
       }
   }
   public double derscalis()
   {
       gno=gno+0.1;
       return gno;
   }
   public double cokcalis(double nekadar){
         gno=gno+nekadar;
       return gno;
   }
   
    public int getNumara() {
        return numara;
    }

    /**
     * @param numara the numara to set
     */
    public void setNumara(int numara) {
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
}
