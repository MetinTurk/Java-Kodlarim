/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garajotomasyonu;

/**
 *
 * @author Metin
 */
public class Motosiklet extends Tasit {

    /**
     * @return the yanSepetVarMi
     */
    public boolean isYanSepetVarMi() {
        return yanSepetVarMi;
    }

    public Motosiklet(String marka, String model , int yil , boolean yanSepetVarMi) {
        super(marka,model,yil);
        this.yanSepetVarMi = yanSepetVarMi;
    }
    
    private boolean yanSepetVarMi;
    
    public boolean isYanSepetVarMiKi(){
        if(this.yanSepetVarMi){
            System.out.println("Yan sepet var.");
            return true;
        }
        else{
            System.out.println("Yan sepet yok.");
            return false;
        }
    }
    
    @Override
    public void BilgileriGoster(){
        System.out.println("Arabanızın markası: " + this.getMarka() + " modeli: " + this.getModel() + " yili: " + this.getYil() + " yan sepet: " + isYanSepetVarMiKi());
    }
    
    public void TekTekerYap(){
        System.out.println("Tek teker yapıldı.");
    }
    
    
    
}
