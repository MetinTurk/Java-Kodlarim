/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faturauygulamasi;

/**
 *
 * @author Metin
 */
public class Musteri {

    /**
     * @return the tutarArama
     */
    public double getTutarArama() {
        return tutarArama;
    }

    /**
     * @return the tutarSms
     */
    public double getTutarSms() {
        return tutarSms;
    }

    /**
     * @return the tutarInternet
     */
    public double getTutarInternet() {
        return tutarInternet;
    }

    /**
     * @return the tutarFatura
     */
    public double getTutarFatura() {
        return tutarFatura;
    }

    /**
     * @return the kullanilanArama
     */
    public int getKullanilanArama() {
        return kullanilanArama;
    }

    /**
     * @param kullanilanArama the kullanilanArama to set
     */
    public void setKullanilanArama(int kullanilanArama) {
        this.kullanilanArama = kullanilanArama;
    }

    /**
     * @return the kullanilanSms
     */
    public int getKullanilanSms() {
        return kullanilanSms;
    }

    /**
     * @param kullanilanSms the kullanilanSms to set
     */
    public void setKullanilanSms(int kullanilanSms) {
        this.kullanilanSms = kullanilanSms;
    }

    /**
     * @return the kullanilanInternet
     */
    public int getKullanilanInternet() {
        return kullanilanInternet;
    }

    /**
     * @param kullanilanInternet the kullanilanInternet to set
     */
    public void setKullanilanInternet(int kullanilanInternet) {
        this.kullanilanInternet = kullanilanInternet;
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
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return the adres
     */
    public String getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
    private String adi;
    private String soyadi;
    private String telNo;
    private String adres;
    
    private final double aramaFiyat = 0.5;
    private final double smsFiyat = 0.25;
    private final double internetFiyat = 2;
    
    private int kullanilanArama;
    private int kullanilanSms;
    private int kullanilanInternet;
    
    private double tutarArama;
    private double tutarSms;
    private double tutarInternet;
    private double tutarFatura;
    
    private void Hesapla(){
        this.tutarArama = aramaFiyat * kullanilanArama;
        this.tutarSms = smsFiyat * kullanilanSms;
        this.tutarInternet = internetFiyat * kullanilanInternet;
        this.tutarFatura = tutarArama + tutarSms + tutarInternet;
    }
    
    public Musteri(int kullanilanArama , int kullanilanSms , int kullanilanInternet){
        this.kullanilanArama = kullanilanArama;
        this.kullanilanSms = kullanilanSms;
        this.kullanilanInternet = kullanilanInternet;
        Hesapla();
    }
    
    
    
    
     
    
    
}
