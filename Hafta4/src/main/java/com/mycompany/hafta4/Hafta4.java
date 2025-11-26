/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hafta4;

import java.util.*;

/**
 *
 * @author Metin
 */
public class Hafta4 {

    public static void main(String[] args) {
        OkuyanOgrenci o1 = new OkuyanOgrenci(5);
        o1.KonusmaYapar("deneme ogrenci");
        o1.GezmeyeGider();
        o1.SinavlaraGir();
        o1.KonusmaYapar("deneme ogrenci", 5);
        
        Ogrenci ogr = new Ogrenci(5);
        
        
        List<Ogrenci> ogrliste = new ArrayList<>();
        
        List<Integer> notlar = new ArrayList<>();
        
        List ogrliste1 = new ArrayList();
        
        
        
        ogrliste.add(ogr);
        
        ogrliste1.add(1);
        ogrliste1.add("deneme");
        ogrliste1.add(ogr);
        
        
        Box<Integer> b = new Box();
        Box<Ogrenci> b1 = new Box();
        b1.setAdi(ogr);
        
        
        
        Insan i1 = new Insan(5);
        i1.KonusmaYapar("denem insan");
        
    }
}
