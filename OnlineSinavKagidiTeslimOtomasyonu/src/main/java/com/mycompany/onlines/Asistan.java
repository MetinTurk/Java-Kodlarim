/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlines;

/**
 *
 * @author Metin23
 */
public class Asistan implements Runnable{
    
    private int verilecekPuan;
    private SinavKagidi<?> kagit;
    
    public Asistan(int verilecekPuan , SinavKagidi<?> kagit){
        this.verilecekPuan = verilecekPuan;
        this.kagit = kagit;
    }
    
    
    @Override
    public void run(){
        try {
            kagit.puanEkle(verilecekPuan);
            
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}
