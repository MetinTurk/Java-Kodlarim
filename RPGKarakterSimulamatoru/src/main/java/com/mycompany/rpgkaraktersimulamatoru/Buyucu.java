/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpgkaraktersimulamatoru;

/**
 *
 * @author Metin
 */
public class Buyucu extends Karakter{

    
    private int manaPuani;
    int sayac = 3;
    int saldiriHasar = 10;
    int ozelYetenekHasar = 20;
    
    public Buyucu(String isim , int seviye , int canPuani , int manaPuani)
    {
        super(isim,seviye,canPuani);
        this.manaPuani = manaPuani;
        
    }

    @Override
    public void saldir(Karakter rakip) {
        if(rakip.getCanPuani() > 0){
            System.out.println(this.getIsim() + " " + rakip.getIsim() + " a ateş topu ile " + this.saldiriHasar +" hasar vuruyor ve haracanan mana 5.");
            rakip.setCanPuani(rakip.getCanPuani() - 10);
            System.out.println(rakip.getIsim()+" canı: "+ rakip.getCanPuani());
            sayac++;
            this.setManaPuani(this.getManaPuani() - 20);
            System.out.println(this.getIsim() + " kalan manası: " + this.manaPuani);
        }
        else{
            System.out.println(rakip.getIsim() + "KAYBETTİ");
        }
    }

    @Override
    public void ozelYetenekKullan(Karakter rakip) {
        if(rakip.getCanPuani() > 0){
            if(this.sayac == 4){
                sayac = 0;
                System.out.println(this.getIsim() + " " + rakip.getIsim() + " a buz büyüsü ile "+this.ozelYetenekHasar+" hasar vuruyor ve harcanan mana 20");
                rakip.setCanPuani(rakip.getCanPuani() - 15);
                System.out.println(rakip.getIsim()+" canı: "+ rakip.getCanPuani());
                this.setManaPuani(this.getManaPuani() - 20);
                System.out.println(this.getIsim() + " kalan manası: " + this.manaPuani);
            }
            else{
                System.out.println("Lütfen 4 kere saldırın yapın.");
            }
        }
        else{
            System.out.println(rakip.getIsim() + "KAYBETTİ");
        }    
    }
    
    @Override
    public void bilgileriGoster(){
        System.out.println("Karekterin ismi: " + this.getIsim()+ " seviyesi: " + this.getSeviye() + " canı: " + this.getCanPuani() + " düz saldırı hasarı: " + this.saldiriHasar + " ozel yetenek hasari: " + this.ozelYetenekHasar);
    }
    
    /**
     * @return the manaPuani
     */
    public int getManaPuani() {
        return manaPuani;
    }

    /**
     * @param manaPuani the manaPuani to set
     */
    public void setManaPuani(int manaPuani) {
        this.manaPuani = manaPuani;
    }
}
