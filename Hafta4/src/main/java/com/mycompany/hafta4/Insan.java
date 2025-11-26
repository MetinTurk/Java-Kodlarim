package com.mycompany.hafta4;


public class Insan {
    
    public Insan(int a){
        System.out.println("Insan kurucu methodu"); 
    }
    
    protected int yas;
    private String gozrengi;
    public double boyu;
    
    
    
    protected void GezmeyeGider(){
        System.out.println("Bugun gezmeye gitti.");
    }
    
    private void DersCalis(){
        gozrengi = "Kahve";
        System.out.println("Goz Rengi: "+gozrengi + " insan bugun ders calistir.");
    }
    
    public void KonusmaYapar(String metin ){
        DersCalis();
        System.out.println("bugun " + metin +" konusmasini yapti.");
    }
    
    
    
}
