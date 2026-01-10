
package OOP;


public class Film extends Medya {
    private int sureDk;

    public Film(int id, String baslik, String tur, int yapimYili, double puan, int sureDk) {
        super(id, baslik, tur, yapimYili, puan);
        this.sureDk = sureDk;
    }

    @Override
    public String getDetayBilgisi() {
        return "FİLM - " + sureDk + " dk";
    }
}




