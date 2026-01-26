/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_collection_thread_kodlari;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

/**
 *
 * @author Metin23
 */
public class BasvuruSistemi implements IYonetim{
    private Set<Proje<?>> projeListesi;
    private Map<String , List<Proje<?>>> kategoriHaritasi;
    
    public BasvuruSistemi(){
        this.projeListesi= new LinkedHashSet<>();
        this.kategoriHaritasi = new HashMap<>();
    }
    
    @Override
    public void basvuruEkle(Proje<?> p){
        if(projeListesi.add(p)){
            System.out.println("Eklendi: " + p.getProjeAdi());
        }
        else{
            System.out.println("HATA: Bu proje zaten kayıtlı! ID: " + p.getProjeID());
        }
    }
    
    public void projelerListele(){
        System.out.println("\n --Tüm Projeler ---");
        for (Proje<?> proje : projeListesi) {
            System.out.println(proje);
        }
    }
    
    public void kategoriyeGoreEkle(String kategoriAdi, Proje<?> p){
        basvuruEkle(p);
        
        if(!kategoriHaritasi.containsKey(kategoriAdi)){
            kategoriHaritasi.put(kategoriAdi, new ArrayList<>());
        }
        
        kategoriHaritasi.get(kategoriAdi).add(p);
    }

  
}
