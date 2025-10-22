
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Val{
    double value;
    String name;

    public Val(double value, String name){
        this.value = value;
        this.name = name;
    }
}

public class Oppgave1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Val Nok = new Val(1, "Norwegian Krone");
        Val Usd = new Val(10.5, "United States Dollar");
        Val Eur = new Val(11.8, "European Euro");
        Val Sek = new Val(1.06, "Swedish krone");
        Val Yen = new Val(0.069, "Japanese Yen");

        Map<String, Val> registry = new HashMap<>();
        registry.put("Nok", Nok);
        registry.put("Usd", Usd);
        registry.put("Eur", Eur);
        registry.put("Sek", Sek);
        registry.put("Yen", Yen);

        int x = 0;

        while (x == 0){
            System.out.println("what do you want to convert to?");
            System.out.println("Usd \nYen \nEur \nSek \nEnd\n");

            String inName = scanner.nextLine();
            Val chosen = registry.get(inName); 

            if (inName.equals("End")){
                x += 1;
                System.out.println("thank you for using this currency converter");
            }
            else{
                try {
                    System.out.println("how much do you want to convert?");
                    int inValue = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\n \n---------------------------------");
                    System.out.println("That is " + chosen.value * inValue + "Nok");
                    System.out.println("---------------------------------\n \n ");
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Sorry Please enter a valid currency");
                }
            }
        }
    }
}
