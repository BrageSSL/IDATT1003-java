import java.util.*;

 class Oppgave2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange timer?");
        double timer = scanner.nextDouble() * 3600;
        System.out.println("Hvor mange minutter?");
        double minutter = scanner.nextDouble() * 60;
        System.out.println("Hvor mange Sekunder?");
        double sekunder = scanner.nextDouble();

        double sek = timer + minutter + sekunder;  

        System.out.println("Det blir " + sek + "sekunder!");
    }
 }