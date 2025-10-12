/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kargosirketi;

import java.util.*;

/**
 *
 * @author Metin
 */
public class KargoSirketi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Musteri musteri1 = new Musteri("Sila" , "Turk" , "6545613" , "Eskisehir");
        musteri1.SiparisVer(10, 20, "Normal");
        musteri1.SiparisVer(2, 50, "Hizli");
        
        List<Musteri> musteriler = new ArrayList<Musteri>();
        musteriler.add(musteri1);
        
        
        int sayac = 1;
        for(Kargo kargo : musteri1.kargolar){
            System.out.println(sayac + ". kargonun faturasi : " + musteri1.FaturaGoster(kargo));
            sayac++;
        }
        
        
    }
}
