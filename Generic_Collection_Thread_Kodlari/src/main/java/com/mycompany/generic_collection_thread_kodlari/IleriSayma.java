/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_collection_thread_kodlari;

/**
 *
 * @author Metin23
 */
public class IleriSayma implements Runnable{
    
    public int kacSaniye;
    
    public IleriSayma(int kacSaniye){
        this.kacSaniye = kacSaniye;
    }
    
    @Override
    public void run(){
        
        try{
            for(int i = 0;i < kacSaniye; i++){
            System.out.println("Son: " + i);
            Thread.sleep(1000);
        }
        System.out.println("Süreniz Bitti!");
        }
        catch(Exception ex){
            System.out.println("Patladık");
        }
        
    }
    
}
