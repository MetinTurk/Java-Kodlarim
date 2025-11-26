/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpgkaraktersimulamatoru;

/**
 *
 * @author Metin
 */
public class RPGKarakterSimulamatoru {

    public static void main(String[] args) {
        Savasci hambur = new Savasci("hambur",  1 , 200, "kilic");
        Buyucu elips = new Buyucu("elips" , 1 , 130 , 100);
        while(true){
            if(hambur.getCanPuani() > 0 && elips.getCanPuani() > 0){
                
            }
            else{
                break;
            }
        }
    }
}
