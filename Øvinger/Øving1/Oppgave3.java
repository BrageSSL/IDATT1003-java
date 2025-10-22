import java.util.*;

class Oppgave3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange sekunder?");
        double sekunder = scanner.nextDouble();  

        double sekmod = sekunder % 60;     
        double minmod = sekunder % 3600;

        double sek = sekmod;
        double min = (minmod - sekmod)/60;
        double timer = (sekunder - minmod)/3600; 

        System.out.println("Det blir :");
        System.out.println(timer + " timer");
        System.out.println(min + " minutter");
        System.out.println(sek + " Sekunder");
    }
}