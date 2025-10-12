/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garajotomasyonu;

import java.util.*;

/**
 *
 * @author Metin
 */
public class GarajOtomasyonu {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Tasit t1 = new Tasit("BMW" , "E60" , 2005);
        Tasit o1 = new Otomobil("BMW", "E36", 1990, 4);
        Tasit m1 = new Motosiklet("BMW", "S100RR", 2022, false);
        Tasit k1 = new Kamyon("BMC", "TC150", 2000, 44);
        
        List<Tasit> tasitlar = new ArrayList<Tasit>();
        tasitlar.add(t1);
        tasitlar.add(o1);
        tasitlar.add(m1);
        tasitlar.add(k1);
        
        for(Tasit tasit : tasitlar){
            tasit.BilgileriGoster();
            System.out.println("----------------------------");
        }
    }
        
}

