/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.otoparkyonetimotomasyonu;

import java.util.*;

class Deneme2 {
    private String deneme1;
    
    @Override
    public String toString(){
        return "merhaba ben class";
    }
}

public class OtoparkYonetimOtomasyonu {

    public static void main(String[] args) {
        
        Otopark otopark1 = new Otopark();
        Arac araba1 = new Otomobil("26");
        Arac motor1 = new Motosiklet("33");
        otopark1.aracGirisYap(araba1);
        otopark1.aracGirisYap(motor1);
        otopark1.araclariListele();
        otopark1.aracCikisYap(araba1);
        otopark1.aracCikisYap(motor1);
        otopark1.araclariListele();
    }
}

