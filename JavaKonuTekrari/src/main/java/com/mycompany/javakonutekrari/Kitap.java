/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javakonutekrari;

/**
 *
 * @author Metin
 */
public class Kitap {
    
    private String _kitapAdi;
    private Yazar _yazar;
    private String _isbn;
    private String _kategori;
    private int _sayfaSayisi;
    private boolean _okunduMu;
    
    public Kitap(String kitapAdi , Yazar yazar , String isbn , String kategori , int sayfaSayisi , boolean okunduMu){
        _kitapAdi = kitapAdi;
        _yazar = yazar;
        _isbn = isbn;
        _kategori = kategori;
        _sayfaSayisi = sayfaSayisi;
        _okunduMu = okunduMu;
    }
    
    /**
     * @return the _kitapAdi
     */
    public String getKitapAdi() {
        return _kitapAdi;
    }

    /**
     * @param _kitapAdi the _kitapAdi to set
     */
    public void setKitapAdi(String _kitapAdi) {
        this._kitapAdi = _kitapAdi;
    }

    /**
     * @return the _yazar
     */
    public Yazar getYazar() {
        return _yazar;
    }

    /**
     * @param _yazar the _yazar to set
     */
    public void setYazar(Yazar _yazar) {
        this._yazar = _yazar;
    }

    /**
     * @return the _isbn
     */
    public String getIsbn() {
        return _isbn;
    }

    /**
     * @param _isbn the _isbn to set
     */
    public void setIsbn(String _isbn) {
        this._isbn = _isbn;
    }

    /**
     * @return the _kategori
     */
    public String getKategori() {
        return _kategori;
    }

    /**
     * @param _kategori the _kategori to set
     */
    public void setKategori(String _kategori) {
        this._kategori = _kategori;
    }

    /**
     * @return the _sayfaSayisi
     */
    public int getSayfaSayisi() {
        return _sayfaSayisi;
    }

    /**
     * @param _sayfaSayisi the _sayfaSayisi to set
     */
    public void setSayfaSayisi(int _sayfaSayisi) {
        this._sayfaSayisi = _sayfaSayisi;
    }

    /**
     * @return the _okunduMu
     */
    public boolean isOkunduMu() {
        return _okunduMu;
    }

    /**
     * @param _okunduMu the _okunduMu to set
     */
    public void setOkunduMu(boolean _okunduMu) {
        this._okunduMu = _okunduMu;
    }
    
    public void BilgileriGoster(){
        System.out.println("Kitap Adı: " + getKitapAdi() + " Kitap Yazarı: " + getYazar() + " Kategorisi: " + getKategori() + " Sayfa Sayısı: " + getSayfaSayisi());
    }
    
    public void okunduOlarakIsaretle(){
        setOkunduMu(true);
    }
    
    
    
}
