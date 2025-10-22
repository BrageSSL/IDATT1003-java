import java.util.*;

class Oppgave2 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("hvor mye veier vare 1 i gramm?");
        double vekt1 = scanner.nextDouble();
        System.out.println("hvor mye koster vare 1?");
        double pris1 = scanner.nextDouble();

        System.out.println("hvor mye veier vare 2 i gramm?");
        double vekt2 = scanner.nextDouble();
        System.out.println("hvor mye koster vare 2?");
        double pris2 = scanner.nextDouble();
        
        double Kilopris1 = (pris1 / vekt1) * 1000;
        double kilopris2 = (pris2 / vekt2) * 1000;

        System.out.println("Vare 1 koster: " + Kilopris1 + "kr per kilo");
        System.out.println("Vare 2 koster: " + kilopris2 + "kr per kilo");

        if (Kilopris1 > kilopris2){
            System.out.println("vare 1 er dyrere en vare 2");
        }
        else if (Kilopris1 < kilopris2){
            System.out.println("Vare 2 er dyrere en vare 1");
        }
        else if (Kilopris1 == kilopris2){
            System.out.println("Begge varene koster like mye");
        }
    }
}