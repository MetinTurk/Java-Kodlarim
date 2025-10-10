/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hafta4;

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
        
        
        
        Insan i1 = new Insan(5);
        i1.KonusmaYapar("denem insan");
        
    }
}
