/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpgkaraktersimulamatoru;

/**
 *
 * @author Metin
 */
public class Savasci extends Karakter{
    private String silahTuru;
    int silahHasari;
    int sayac = 3;
    int ozelYetenekHasar = 15;
    
    public Savasci(String isim , int seviye , int canPuani , String silahTuru){
        super(isim,seviye,canPuani);
        this.silahTuru = silahTuru;
        if(this.silahTuru == "balta"){
            this.silahHasari = 10;
        }
        else if(this.silahTuru == "Kilic"){
            this.silahHasari = 8;
        }
    }

    @Override
    public void saldir(Karakter rakip) {
        if(rakip.getCanPuani() > 0){
            System.out.println(this.getIsim() + this.silahTuru + "ile " + rakip.getIsim() + " a " + this.silahHasari + " hasar vuruyor.");
            rakip.setCanPuani(rakip.getCanPuani()- this.silahHasari);
            System.out.println(rakip.getIsim()+" canı: "+ rakip.getCanPuani());
            sayac++;
        }
        else{
            System.out.println(rakip.getIsim() + "KAYBETTİ");
        }
    }

    @Override
    public void ozelYetenekKullan(Karakter rakip) {
        if(rakip.getCanPuani() > 0){
            if(this.sayac == 3){
                sayac = 0;
                System.out.println(this.getIsim() + this.silahTuru + "ile " + rakip.getIsim() + " a dönerek"  + this.ozelYetenekHasar + " hasar vuruyor.");
                rakip.setCanPuani(rakip.getCanPuani() - 15);
                System.out.println(rakip.getIsim()+" canı: "+ rakip.getCanPuani());
            }
            else{
                System.out.println("Lütfen 3 kere saldırın yapın.");
            }
        }
        else{
            System.out.println(rakip.getIsim() + "KAYBETTİ");
        }   
    }
    
    @Override
    public void bilgileriGoster(){
        System.out.println("Karekterin ismi: " + this.getIsim()+ " seviyesi: " + this.getSeviye() + " canı: " + this.getCanPuani() + " düz saldırı hasarı: " + this.silahHasari + " ozel yetenek hasari: " + this.ozelYetenekHasar);
    }
    
}
