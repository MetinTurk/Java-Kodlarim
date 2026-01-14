
package com.mycompany.onlines;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OgrenciIsleri implements ISistemiYonet{
    
    private Set<SinavKagidi<?>> sinavKagidiListesi;
    private Map<String , List<SinavKagidi<?>>> dersKodunaGoreKagit;
    
    public OgrenciIsleri(){
        this.sinavKagidiListesi = new HashSet();
        this.dersKodunaGoreKagit = new HashMap<>();
    }
    
        
    @Override
    public void KagidiTeslimEt(SinavKagidi<?> kagit){
        if(sinavKagidiListesi.add(kagit)){
            System.out.println("Sınavınız teslim edildi");
        }
        else{
            System.out.println("Daha öncesinde sınav teslim edilmiştir");
        }
    }
    
    @Override
    public void tumKagitlariListele(){
        for (SinavKagidi<?> sinavKagidi : sinavKagidiListesi) {
            System.out.println(sinavKagidi.getOgrenciNo()+" nolu öğrencinin" + sinavKagidi.getNotOrtalamasi());
        }
    }
    
    public void derseGoreEkle(String dersKodu, SinavKagidi<?> kagit){
        dersKodunaGoreKagit.get(dersKodu).add(kagit);
    }
    
    
}
