import java.util.ArrayList;
import java.util.Scanner;

public class MenyRegister {

    private ArrayList<Rett> retter;
    private ArrayList<Meny> menyer;

    public MenyRegister(){
        retter = new ArrayList<>();
        menyer = new ArrayList<>();
    }

    private void createMeny() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Rett> menyRetter = new ArrayList<>();

        System.out.println("Meny Register Menu:");
        System.out.println("1. enter Menu Name");
        String menuName = scanner.nextLine();
        System.out.println("2. enter Menu Description");
        String menuDescription = scanner.nextLine();
        
        while (true) {
            System.out.println("1. Create Rett");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                createRett(scanner, menyRetter);
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        Meny newMeny = new Meny(menuName, menuDescription, menyRetter);
        System.out.println("Meny created successfully: " + newMeny);
        menyer.add(newMeny);
    }
    

    public void createRett(Scanner scanner, ArrayList<Rett> menyRetter){

        System.out.print("Enter rett navn: ");
        String navn = scanner.nextLine();

        System.out.print("Enter rett type: ");
        String type = scanner.nextLine();

        System.out.print("Enter rett pris: ");
        int pris = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter rett oppskrift: ");
        String oppskrift = scanner.nextLine();

        Rett newRett = new Rett(navn, type, pris, oppskrift);
        menyRetter.add(newRett);
        System.out.println("Rett added successfully."); 
    }

    public Rett getRettByName(String navn) {
        for (Rett rett : retter) {
            if (rett.getNavn().equals(navn)) {
                return rett;
            }
        }
        return null;
    }

    public Rett getRettByType(String type) {
        for (Rett rett : retter) {
            if (rett.getType().equals(type)) {
                return rett;
            }
        }
        return null;
    }

    public ArrayList<Meny> getAllMenyerWithinPrice(int pris) {
        ArrayList<Meny> result = new ArrayList<>();
        for (Meny meny : menyer) {
            int totalPrice = 0;
            for (Rett rett : meny.getRetter()) {
                totalPrice += rett.getPris();
            }
            if (totalPrice <= pris) {
                result.add(meny);
            }
        }
        return result;
    }

    public void menyMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Meny Register Menu:");
            System.out.println("1. Create Meny");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createMeny();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}

