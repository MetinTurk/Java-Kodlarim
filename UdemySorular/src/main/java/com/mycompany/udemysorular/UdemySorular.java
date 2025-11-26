/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.udemysorular;

import java.util.*;

/**
 *
 * @author Metin
 */
public class UdemySorular {

    public static void main(String[] args) {
        Random random = new Random();
        
        
        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        
        for(int i = 0;i<100;i++){
            Ogrenci ogrenci1 = new Ogrenci();
            ogrenci1.setNot(random.nextInt(100));
            ogrenci1.setOgrId(String.valueOf(random.nextInt(100)));
            System.out.println(ogrenci1.getOgrId() + " : " + ogrenci1.getNot());
        }
        

        //System.out.println(random.nextInt(100-0)+0);
    }
}
