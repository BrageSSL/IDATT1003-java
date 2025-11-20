package Øvinger.Øving11;

/* Imports */
import java.util.List;
import java.util.Scanner;

public class Interfaces {
    private final EiendomManager manager;
    private final Scanner scanner;

    /** Constructor to initialize Interfaces with EiendomManager and Scanner */
    public Interfaces(EiendomManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    /** Creates a new Eiendom by reading user input */
    public void createNewEiendom() {
        int komuneNr = readInt("Enter komuneNr: ");
        String komune = readLine("Enter komune: ");
        int gårdsNr = readInt("Enter gårdsNr: ");
        int bruksNr = readInt("Enter bruksNr: ");
        String bruksNavn = readLine("Enter bruksNavn (leave blank if none): ");
        double areal = readDouble("Enter areal: ");
        String eierNavn = readLine("Enter eierNavn: ");

        Eiendommer newEiendom = new Eiendommer(komuneNr, komune, gårdsNr, bruksNr, bruksNavn, areal, eierNavn);
        manager.addEiendom(newEiendom);
        System.out.println("Eiendom registered.\n");
    }

    /** Prints the main menu */
    public void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1.  Create new Eiendom");
        System.out.println("2.  Search Eiendom by Nr");
        System.out.println("3.  Search Eiendom by komuneNr");
        System.out.println("4.  Search Eiendom by gårdsNr");
        System.out.println("5.  Search Eiendom by bruksNr");
        System.out.println("6.  Search Eiendommer by eierNavn");
        System.out.println("7.  List Eiendommer sorted by komuneNr");
        System.out.println("8.  List Eiendommer sorted by gårdsNr");
        System.out.println("9.  List Eiendommer sorted by bruksNr");
        System.out.println("10. List Eiendommer sorted by eierNavn");
        System.out.println("11. List Eiendommer sorted by areal");
        System.out.println("12. List all Eiendommer");
        System.out.println("13. Exit");
        System.out.print("Input a number: ");
    }

    /** Handles the user's menu choice */
    public boolean handleChoice(int valg) {
        switch (valg) {
            case 1:
                createNewEiendom();
                return true;
            case 2:
                String nr = readLine("Enter Nr to search (format komuneNr-gårdsNr/bruksNr): ");
                Eiendommer eiendom = manager.getEiendomByNr(nr);
                if (eiendom != null) {
                    System.out.println("Found eiendom:\n" + eiendom + "\n");
                } else {
                    System.out.println("No eiendom found for nummer " + nr + "\n");
                }
                return true;
            case 3:
                int komuneNr = readInt("Enter komuneNr to search: ");
                printEiendomList(manager.getEiendommerByKomuneNr(komuneNr));
                return true;
            case 4:
                int gårdsNr = readInt("Enter gårdsNr to search: ");
                printEiendomList(manager.getEiendommerByGårdsNr(gårdsNr));
                return true;
            case 5:
                int bruksNr = readInt("Enter bruksNr to search: ");
                printEiendomList(manager.getEiendommerByBruksNr(bruksNr));
                return true;
            case 6:
                String eierNavn = readLine("Enter eierNavn to search: ");
                printEiendomList(manager.getEiendommerByEier(eierNavn));
                return true;
            case 7:
                printEiendomList(manager.getEiendommerSortedByKomuneNr());
                return true;
            case 8:
                printEiendomList(manager.getEiendommerSortedByGårdsNr());
                return true;
            case 9:
                printEiendomList(manager.getEiendommerSortedByBruksNr());
                return true;
            case 10:
                printEiendomList(manager.getEiendommerSortedByEier());
                return true;
            case 11:
                double minAreal = readDouble("Enter minimum areal: ");
                double maxAreal = readDouble("Enter maximum areal: ");
                printEiendomList(manager.getEiendommersByArealRange(minAreal, maxAreal));
                return true;
            case 12:
                printEiendomList(manager.getEiendommer());
                return true;
            case 13:
                System.out.println("Goodbye!");
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
                return true;
        }
    }

    /** Prints a list of Eiendommer */
    private void printEiendomList(List<Eiendommer> eiendomList) {
        if (eiendomList.isEmpty()) {
            System.out.println("No eiendommer found.\n");
            return;
        }

        System.out.println("Results:");
        for (Eiendommer eiendom : eiendomList) {
            System.out.println(eiendom);
            System.out.println();
        }
    }

    /** Reads an integer from user input with prompt */
    private int readInt(String prompt) {
        while (true) {
            try {
                String value = readLine(prompt);
                return Integer.parseInt(value.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    /** Reads a double from user input with prompt */
    private double readDouble(String prompt) {
        while (true) {
            try {
                String value = readLine(prompt);
                return Double.parseDouble(value.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid decimal number.");
            }
        }
    }

    /** Reads a line of text from user input with prompt */
    private String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
