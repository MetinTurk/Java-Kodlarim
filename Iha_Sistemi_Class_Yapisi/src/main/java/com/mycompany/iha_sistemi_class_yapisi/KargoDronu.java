/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iha_sistemi_class_yapisi;

/**
 *
 * @author metin
 */
public class KargoDronu extends HavaAraci implements IHareketEdebilir,IYukTasiyabilir{

    public KargoDronu(String seriNo, double pilSeviyesi, int maxYukseklik) {
        super(seriNo, pilSeviyesi, maxYukseklik);
    }

    //her 100 m'de 5 derece kaybetse
    
    @Override
    public void yakitTuket(int mesafe) {
        double guncelPilSeviyesi = getPilSeviyesi();
        setPilSeviyesi(guncelPilSeviyesi - ((mesafe*1.1)/20));
        System.out.println("%"+((mesafe*1.1)/20) + " pil seviyesi harcandi.");
    }

    @Override
    public void UcusYap(int mesafe) {
        yakitTuket(mesafe);
        System.out.println(mesafe + " metre ucus yapildi.");
    }

    @Override
    public void inisYap() {
        System.out.println("Inis yapiliyor...");
    }

    @Override
    public void YukAl(String yukTipi, double agirlik) {
        System.out.println(yukTipi + " tipinde bir yuk alindi agirlik:" + agirlik + "kg");
    }

    @Override
    public void YukBosalt() {
        System.out.println("Yük Boşaltılıyor.");
    }
    
}
