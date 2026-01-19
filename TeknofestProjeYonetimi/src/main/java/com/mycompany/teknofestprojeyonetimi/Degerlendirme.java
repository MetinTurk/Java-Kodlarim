/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teknofestprojeyonetimi;

/**
 *
 * @author Metin23
 */
public class Degerlendirme implements Runnable{
    
    private int projePuani;
    private Proje<?> proje;
    
    public Degerlendirme(Proje<?> p , int verilecekPuan){
        this.proje = p;
        this.projePuani = verilecekPuan;
    }
    
    
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            proje.PuanEkle(projePuani);
        } catch (Exception e) {
        }
        
               
    }
}
