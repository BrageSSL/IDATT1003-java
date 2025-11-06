import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrangementRegister register = new ArrangementRegister();
        MenyRegister menyRegister = new MenyRegister();

        System.out.println("Do you want to look at arrangements or menus?");
        
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("arrangements")) {
            register.arrangementMenu();
        } else if (choice.equalsIgnoreCase("menus")) {
            menyRegister.menyMenu();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
