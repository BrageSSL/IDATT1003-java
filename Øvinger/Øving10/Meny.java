import java.util.ArrayList;

public class Meny {
    private String navn;
    private String beskrivelse;
    private ArrayList<Rett> retter;

    public Meny(String navn, String beskrivelse, ArrayList<Rett> retter) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.retter = retter;
    }
    public String getNavn() {
        return navn;
    }
    public String getBeskrivelse() {
        return beskrivelse;
    }
    public ArrayList<Rett> getRetter() {
        return retter;
    }
    @Override
    public String toString() {
        return "Meny: " + navn + ", Beskrivelse: " + beskrivelse + ", Retter: " + retter;
    }   
}
