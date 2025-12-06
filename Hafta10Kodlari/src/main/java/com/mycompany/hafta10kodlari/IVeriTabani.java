/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.hafta10kodlari;

import java.util.List;

/**
 *
 * @author metin
 */
public interface IVeriTabani<T , N> {
    
    public String ekle(T t);
    public String guncelle(T t);
    public List<T> tumliste();
    public List<N extends Number> idGoreAra();


    
}
