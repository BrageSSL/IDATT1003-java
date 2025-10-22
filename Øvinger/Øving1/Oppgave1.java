import java.util.*;

 class Oppgave1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How lang er det i tommer?");
        double lengde = scanner.nextDouble();
        double tommer = 2.54;

        double cm = lengde * tommer;   

        System.out.println("det er " + cm + "cm");
    }
}
