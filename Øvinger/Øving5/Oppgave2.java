import java.util.Random;

class minRandom {
    Random verdi = new Random();

    public int nesteHeltall(int nedre, int ovre) {
        return verdi.nextInt(ovre - nedre) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        return verdi.nextDouble() * (ovre - nedre) + nedre;
    }
}

public class Oppgave2 {

    public static void main(String[] args) {
        minRandom generator = new minRandom();
        int tall1 = generator.nesteHeltall(4500000, 5000000);
        System.out.println("ditt heltall er: " + tall1);
        double tall2 = generator.nesteDesimaltall(0.7, 0.8);
        System.out.println("ditt heltall er: " + tall2);
    }
}
