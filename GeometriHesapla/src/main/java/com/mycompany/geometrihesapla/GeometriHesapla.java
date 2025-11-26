/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometrihesapla;

/**
 *
 * @author Metin
 */
public class GeometriHesapla {

    public static void main(String[] args) {
        GeometrikSekil[] sekiller = new GeometrikSekil[2];
        sekiller[0] = new Daire("Kirmizi" , true, 5.0);
        sekiller[1] = new Dikdortgen("Siyah", true, 4.0, 6.0);
        
        for(int i = 0; i< sekiller.length;i++){
            System.out.println(sekiller[i]);
        }
    }
}
