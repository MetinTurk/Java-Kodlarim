/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hafta3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Metin
 */
public class Hafta3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //List <Circle> circles = new ArrayList<Circle>();  //Dinamik Liste.
        
        //Kompozisyon
        //Bir class'ın başka bir class'ı kullanmasına denir.
        //Kompozisyon ile önceden yazılmış sınıflar yeni yazılan sınıfların içerisinde doğrdan kullanılabilir.
        
        
        
        //Kalıtımda calss'lar birbirine bağımlı oluyor.
        
    }
}

class Meyve{
    
}

class Elma{
    private Meyve m = new Meyve();
}
