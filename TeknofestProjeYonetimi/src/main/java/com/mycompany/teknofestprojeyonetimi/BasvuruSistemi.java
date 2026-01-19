/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teknofestprojeyonetimi;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Metin23
 */
public class BasvuruSistemi implements IYonetim{
    private Set<Proje<?>> projeListesi;
    private HashMap<String,List<Proje<?>>> projeKategorisi;

    public BasvuruSistemi() {
        this.projeListesi = new LinkedHashSet<>();
        this.projeKategorisi = new HashMap<>();
    }
    
    
    
    
    
    public void basvuruEkle(Proje<?> p){
        if(projeListesi.add(p)){
            System.out.println("Projeniz eklenmiştir");
        }
        else{
            System.out.println("Projeniz sistemde kayıtlıdır.");
        }
    }
    
    public void projeleriListele(){
        for (Proje<?> proje : projeListesi) {
            System.out.println("Proje adı:" + proje.getProjeAdi() + "" + proje.getToplamPuan());
        }
    }
    
    
    public void kategoriyeGoreEkle(String kategoriAdi , Proje<?> p){
        basvuruEkle(p);
        //kategori kontrol
    }
    
    
    
    
}
