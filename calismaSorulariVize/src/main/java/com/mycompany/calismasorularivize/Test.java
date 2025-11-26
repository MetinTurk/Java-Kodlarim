/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calismasorularivize;

/**
 *
 * @author Metin
 */
public class Test extends Musteri{

    @Override
    public void musteriKaydet() {
        System.out.println("Kayıt yapıldı.");
    }
    
    @Override
    public void musteriBilgisiGetir(){
        System.out.println("Yeni Müşteri");
    }
    
    
    public abstract class Araba{
        public Araba(){
            
        }
        
        public abstract void MerhabaDe();
    }
    
    
    
}
