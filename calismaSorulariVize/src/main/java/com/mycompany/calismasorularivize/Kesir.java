/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calismasorularivize;

/**
 *
 * @author Metin
 */
public class Kesir {
    public int pay;
    public int payda;
    
    public void Toplam(Kesir k2){
        this.pay = (this.pay*k2.payda) + (this.payda * k2.pay);
        this.payda = this.payda * k2.payda;
    }
}
