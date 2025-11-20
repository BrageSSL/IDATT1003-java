package Øvinger.Øving11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EiendomManager manager = new EiendomManager();
        manager.createEiendommer();

        Interfaces ui = new Interfaces(manager, scanner);

        boolean running = true;
        while (running) {
            ui.printMenu();
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid menu option.\n");
                continue;
            }

            running = ui.handleChoice(choice);
        }

        scanner.close();
    }
}

