package Øvinger.Øving11;

public class Eiendommer {
    private final int komuneNr;
    private final String komune;
    private final int gårdsNr;
    private final int bruksNr;
    // Disse verdiene er veldig sansynlig at endres med tiden, så å gjøre dem
    // endrebare er viktig.
    private String bruksNavn;
    private double areal;
    private String eierNavn;

    /**
     * Konstruktør for å oprette ny eiendom
     * Krever komuneNr, komune, gårdsNr, bruksNr, bruksNavn, areal og eierNavn
     */
    public Eiendommer(int komuneNr, String komune, int gårdsNr, int bruksNr, String bruksNavn, double areal,
            String eierNavn) {
        this.komuneNr = komuneNr;
        this.komune = komune;
        this.gårdsNr = gårdsNr;
        this.bruksNr = bruksNr;
        this.bruksNavn = bruksNavn;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }

    /**
     * Henter kommunenavnet til eindommen
     */
    public String getKomune() {
        return komune;
    }

    /**
     * Henter bruksnavnet til eindommen
     */
    public String getBruksNavn() {
        return bruksNavn;
    }

    /**
     * Henter arealet til eindommen
     */
    public double getAreal() {
        return areal;
    }

    /**
     * Henter eiernavnet til eindommen
     */
    public String getEierNavn() {
        return eierNavn;
    }

    /**
     * Henter kommunenummeret til eindommen
     */
    public int getKomuneNr() {
        return komuneNr;
    }

    /**
     * Henter gårdsnummeret til eindommen
     */
    public int getGårdsNr() {
        return gårdsNr;
    }

    /**
     * Henter bruksnummeret til eindommen
     */
    public int getBruksNr() {
        return bruksNr;
    }

    /**
     * Henter nummeret til eindommen i formatet "komuneNr-gårdsNr/bruksNr"
     */
    public String getNr() {
        return komuneNr + "-" + gårdsNr + "/" + bruksNr;
    }

    /**
     * Disse verdiene er veldig sansynlig at endres med tiden, så å gjøre dem
     * endrebare er viktig.
     * Setter nytt bruksnavn for eindommen. krever et gyldig navn
     */
    public void setBruksNavn(String bruksNavn) {
        this.bruksNavn = bruksNavn;
    }

    /**
     * Setter nytt areal for eindommen. krever et gyldig areal
     */
    public void setAreal(double areal) {
        this.areal = areal;
    }

    /**
     * Setter ny eier for eindommen. krever et gyldig navn
     */
    public void setEierNavn(String eierNavn) {
        this.eierNavn = eierNavn;
    }

    /**
     * Returnerer en strengrepresentasjon av eindommen
     */
    @Override
    public String toString() {
        return "Eindommens nummer: " + getNr() + "\n" +
                "Komune: " + getKomune() + "\n" +
                "Bruksnavn: " + getBruksNavn() + "\n" +
                "Areal: " + getAreal() + " m²\n" +
                "Eier: " + getEierNavn();
    }
}