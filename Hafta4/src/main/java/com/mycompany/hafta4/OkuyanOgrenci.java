package com.mycompany.hafta4;

public class OkuyanOgrenci extends Insan {
        
    public OkuyanOgrenci(int deger){
        super(deger);
        System.out.println("OkuyanOgrenci kurucu methodu");
    }
    
    public int sinifi;
    public String bolumu;
        
    public void SinavlaraGir(){
        System.out.println("Sinava girer");
    }
        
    @Override       //Override = miras'dan gelen fonksiyonu kullanmak istemeyip içeriğini değiştirmek istersek kullanırız.
    public void KonusmaYapar(String metin ){
    //DersCalis();
        System.out.println("bugun " + metin +" (mirastan gelmeyen) konusmasini yapti.");
    }
    public void KonusmaYapar(String metin , int kacKez){        //overload = aynı fonks. kullanabilirsin fakat imzası = (parametreleri) farklı olucak.
    //DersCalis();
        System.out.println("bugun " + kacKez + " kez " + metin +" konusmasini  yapti.");
    }     
        
        
        
        
}
