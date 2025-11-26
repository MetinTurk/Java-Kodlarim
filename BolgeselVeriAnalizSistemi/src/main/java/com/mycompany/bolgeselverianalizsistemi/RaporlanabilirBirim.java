/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolgeselverianalizsistemi;

/**
 *
 * @author Metin
 */
public abstract class RaporlanabilirBirim {
    protected String birimAdi;
    protected String bolgeKodu;
    protected String veriGirisTarihi;
    protected int[][] veriler = new int[3][4];
    
    public RaporlanabilirBirim(String birimAdi , String bolgeKodu , String veriGirisTarihi){
        this.birimAdi = birimAdi;
        this.bolgeKodu = bolgeKodu;
        this.veriGirisTarihi = veriGirisTarihi;
    }
    
    public abstract double analizYap();
    
    public int tumYilToplaminiGetir(){
        int toplamSatis = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                toplamSatis += veriler[i][j];
            }
        }
        return toplamSatis;
    }
}
