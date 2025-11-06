public class Rett {
    private String navn;
    private String type;
    private int pris;
    private String oppskrift;

    public Rett(String navn, String type, int pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public int getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    @Override
    public String toString() {
        return "Rett: " + navn + ", Oppskrift: " + oppskrift;
    }

}
