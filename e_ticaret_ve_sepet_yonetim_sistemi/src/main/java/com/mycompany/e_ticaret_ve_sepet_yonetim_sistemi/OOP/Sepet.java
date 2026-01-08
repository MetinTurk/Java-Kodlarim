/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e_ticaret_ve_sepet_yonetim_sistemi.OOP;

import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private List<Urun> sepetUrunleri;

    public Sepet() {
        this.sepetUrunleri = new ArrayList<>();
    }

    public void sepeteEkle(Urun urun) {
        sepetUrunleri.add(urun);
    }

    public List<Urun> getUrunler() {
        return sepetUrunleri;
    }

    public void sepetiBosalt() {
        sepetUrunleri.clear();
    }

    
    public String sepetOzeti() {
        if (sepetUrunleri.isEmpty()) return "Sepetiniz boş.";
        
        StringBuilder sb = new StringBuilder();
        double toplamTutar = 0;
        
        for (Urun u : sepetUrunleri) {
            sb.append(u.getAd())
              .append(" - Fiyat: ").append(u.getFiyat())
              .append(" + KDV: ").append(u.kdvHesapla())
              .append("\n");
            toplamTutar += u.getFiyat() + u.kdvHesapla();
        }
        sb.append("\nTOPLAM TUTAR: ").append(toplamTutar).append(" TL");
        return sb.toString();
    }
}
