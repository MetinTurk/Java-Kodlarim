/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bolgeselverianalizsistemi;

/**
 *
 * @author Metin
 */
public class BolgeselVeriAnalizSistemi {

    public static void main(String[] args) {
        RaporlanabilirBirim[] birimler = new RaporlanabilirBirim[2];
        
        birimler[0] = new OnlineSatis("Trendyol", "11223344", "2025");
        birimler[1] = new MagazaSatis("Vestel", "112244", "2024");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if(i < 3){
                    birimler[0].veriler[i][j] = 1000;
                }
                else{
                    birimler[1].veriler[i-3][j] = 600;
                }
                
            }
        }
        for (int i = 0; i < birimler.length; i++) {
            if(birimler[i] instanceof IZLENEBILIR){
                IZLENEBILIR izlenme = (IZLENEBILIR) birimler[i];
                if(izlenme.veriDogrulandiMi()){
                    System.out.println("Toplam kazanc : "+ birimler[i].tumYilToplaminiGetir());
                    System.out.println("Net gelir: " + birimler[i].analizYap());
                    izlenme.enventerKontroluYap("C203045");
                }
            }
        }
    }
}
