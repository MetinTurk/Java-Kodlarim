package model;

public class Ogrenci {
    
    private int id;
    private String ad;
    private String soyad;
    private String bolum;
    private double ortalama;

    
    public Ogrenci() {
    }

    
    public Ogrenci(int id, String ad, String soyad, String bolum, double ortalama) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
        this.ortalama = ortalama;
    }

     
    public boolean gectiMi() {
        return this.getOrtalama() >= 60.0;
    }

    
    @Override
    public String toString() {
        return "Ogrenci [ID=" + getId() + ", Ad=" + getAd() + " " + getSoyad() + ", Bolum=" + getBolum() + ", Ort=" + getOrtalama() + "]";
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the bolum
     */
    public String getBolum() {
        return bolum;
    }

    /**
     * @param bolum the bolum to set
     */
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    /**
     * @return the ortalama
     */
    public double getOrtalama() {
        return ortalama;
    }

    /**
     * @param ortalama the ortalama to set
     */
    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }
}