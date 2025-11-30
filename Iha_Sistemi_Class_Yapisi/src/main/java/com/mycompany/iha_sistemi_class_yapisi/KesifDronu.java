/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iha_sistemi_class_yapisi;

/**
 *
 * @author metin
 */
public class KesifDronu extends HavaAraci implements IHareketEdebilir,IOtonom{

    private String sensorKalitesi;
    public KesifDronu(String seriNo, double pilSeviyesi, int maxYukseklik , String sensorKalitesi) {
        super(seriNo, pilSeviyesi, maxYukseklik);
        this.sensorKalitesi = sensorKalitesi;
    }

    //her 100 m'de 2 derece kaybetse
    
    @Override
    public void yakitTuket(int mesafe) {
        double guncelPilSeviyesi = getPilSeviyesi();
        setPilSeviyesi(guncelPilSeviyesi - (mesafe/50));
        System.out.println("%"+(mesafe/50) + " pil seviyesi harcandi.");
    }

    @Override
    public void UcusYap(int mesafe) {
        System.out.println(mesafe + " metre ucus yapildi.");
    }

    @Override
    public void inisYap() {
        System.out.println("İniş yapılıyor...");
    }

    @Override
    public void CevreTaramasiYap() {
        yakitTuket(500);
        System.out.println("Cevre Taramasi yapiliyor.");
    }

    @Override
    public void SarjIstasyonunaDon() {
        System.out.println("Şarj istasyonuna dönüldü Lütfen şarjı dolana kadar bekleyin.");
    }

    
    
}
