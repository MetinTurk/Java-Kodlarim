/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bolgeselverianalizsistemi;

/**
 *
 * @author Metin
 */
public interface IZLENEBILIR {
    double STANDART_VERGI_ORANI = 0.18;
    boolean veriDogrulandiMi();
    void enventerKontroluYap(String kontrolKodu);
}
