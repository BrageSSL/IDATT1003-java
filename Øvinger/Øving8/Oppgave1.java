import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

final class Person {
    private final String fornavn;
    private final String etternavn;
    private final int fødselsår;

    public Person(String fornavn, String etternavn, int fødselsår) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fødselsår = fødselsår;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFødselsår() {
        return fødselsår;
    }

    @Override
    public String toString() {
        return etternavn + ", " + fornavn + " (" + fødselsår + ")";
    }
}

public class Oppgave1 {
    private final Person personalia;
    private final int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;

    public Oppgave1(Person personalia, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = personalia;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    public void setMånedslønn(double manedslønn) {
        this.månedslønn = manedslønn;
    }

    private double skattPerManed() {
        return månedslønn * (skatteprosent / 100);
    }

    private double bruttoLønnPerAar() {
        return månedslønn * 12;
    }

    private double skattetrekkPerAar() {
        return skattPerManed() * 10.5;
    }

    private String navn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    private int alder() {
        GregorianCalendar kalender = new GregorianCalendar();
        int aar = kalender.get(Calendar.YEAR);
        return aar - personalia.getFødselsår();
    }

    private int antallårAnsatt() {
        GregorianCalendar kalender = new GregorianCalendar();
        int aar = kalender.get(Calendar.YEAR);
        return aar - ansettelsesår;
    }

    private boolean harVærtAnsattMerEnn(int antallår) {
        return antallårAnsatt() > antallår;
    }

    @Override
    public String toString() {
        return "Navn: " + navn() +
                "\nAlder: " + alder() +
                "\nAnsatt i " + ansettelsesår + " (" + antallårAnsatt() + " år siden)" +
                "\nMånedslønn: " + månedslønn +
                "\nSkatteprosent: " + skatteprosent +
                "\nSkatt per måned: " + skattPerManed() +
                "\nÅrslønn brutto: " + bruttoLønnPerAar() +
                "\nÅrlig skattetrekk: " + skattetrekkPerAar();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person p = new Person("Berit", "Johnsen", 1985);
        Oppgave1 a = new Oppgave1(p, 2015, 45000, 30);

        System.out.println("=== Informasjon om arbeidstaker ===");
        System.out.println(a);

        while (true) {

            System.out.println("Vil du oppdatere månedslønn og skatteprosent?\n1. Ja\n2. Nei");
            int valg = scanner.nextInt();
            if (valg == 2) {
                scanner.close();
                break;
            }

            System.out.print("Oppdater månedslønn :");
            int nyMånedslønn = scanner.nextInt();
            System.out.print("\nOppdater Skatteprosent :");
            int nyProsent = scanner.nextInt();

            System.out.println("\n--- Endrer verdier ---");
            a.setMånedslønn(nyMånedslønn);
            a.setSkatteprosent(nyProsent);

            System.out.println(a);

            System.out.println("\nHar vært ansatt mer enn 5 år? " + a.harVærtAnsattMerEnn(5));
        }

    }
}