/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmotomasyonuudemy;

/**
 *
 * @author Metin
 */
public class Login {
    
    private String kAdi;
    private String sifre;
    private String eposta;
    private int dYili;
    private String ibanNo;
    private int yas;
    
    public Login(String kulAdi , String sifre , String eposta , int dYili){
        this.kAdi = kulAdi;
        this.sifre = sifre;
        this.eposta = eposta;
        this.dYili = dYili;
        this.yas = 2025 - dYili;
        this.ibanNo =  "TR" + dYili + "0000" + yas + "12";
    }
    
}
