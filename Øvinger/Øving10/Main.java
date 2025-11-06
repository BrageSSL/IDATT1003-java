import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrangementRegister register = new ArrangementRegister();
        MenyRegister menyRegister = new MenyRegister();
        while (true) {

            System.out.println("Do you want to look at arrangements or menus?");
            
            String choice = scanner.nextLine();

            switch (choice) {
                case "arrangements":
                    register.arrangementMenu();
                    break;
                case "menus":
                    menyRegister.menyMenu();
                    break;
                case "exit":
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}