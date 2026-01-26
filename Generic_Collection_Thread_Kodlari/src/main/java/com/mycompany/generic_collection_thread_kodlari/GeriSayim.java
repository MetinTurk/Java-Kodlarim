/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_collection_thread_kodlari;

/**
 *
 * @author Metin23
 */
public class GeriSayim implements Runnable{
    private String sayacAdi;
    private int baslangicDegeri;
    public GeriSayim(String _sayacAdi , int _baslangicDegeri){
        this.baslangicDegeri = _baslangicDegeri;
        this.sayacAdi = _sayacAdi;
    }
    
    @Override
    public void run(){
        try {
            while(baslangicDegeri > 0){
                System.out.println(sayacAdi + " : " + baslangicDegeri);
                baslangicDegeri--;
                
                Thread.sleep(1000);
            }
            System.out.println(sayacAdi + "BİTTİ!");
        } catch (InterruptedException e) {
            System.out.println("Sayac Kesintiye uğradı");
        }
    }
    
}
