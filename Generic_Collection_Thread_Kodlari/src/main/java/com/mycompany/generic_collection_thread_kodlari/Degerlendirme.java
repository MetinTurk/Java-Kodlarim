/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_collection_thread_kodlari;

/**
 *
 * @author Metin23
 */
public class Degerlendirme implements Runnable{
    private Proje<?> proje;
    private int verilecekPuan;
    
    public Degerlendirme(Proje<?> proje , int verilecekPuan){
        this.proje = proje;
        this.verilecekPuan = verilecekPuan;
    }
    
    @Override
    public void run(){
        try{
            Thread.sleep(100);
            proje.puanEkle(verilecekPuan);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
