
package OOP;


public class Dizi extends Medya {
    private int sezonSayisi;

    public Dizi(int id, String baslik, String tur, int yapimYili, double puan, int sezonSayisi) {
        super(id, baslik, tur, yapimYili, puan);
        this.sezonSayisi = sezonSayisi;
    }

    @Override
    public String getDetayBilgisi() {
        return "DİZİ - " + sezonSayisi + " Sezon";
    }
}
