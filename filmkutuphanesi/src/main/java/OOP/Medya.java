
package OOP;


public abstract class Medya {
    private int id;
    private String baslik;
    private String tur;
    private int yapimYili;
    private double puan;

    public Medya(int id, String baslik, String tur, int yapimYili, double puan) {
        this.id = id;
        this.baslik = baslik;
        this.tur = tur;
        this.yapimYili = yapimYili;
        this.puan = puan;
    }

    public abstract String getDetayBilgisi();

    public int getId() { return id; }
    public String getBaslik() { return baslik; }
    public String getTur() { return tur; }
    public int getYapimYili() { return yapimYili; }
    public double getPuan() { return puan; }
}
