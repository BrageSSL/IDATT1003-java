import java.util.*;

class Oppgave1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in et årstall");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " er et skuddår");
        }
        else if (year % 400 == 0) {
            System.out.println(year + " er et skuddår");
        }
        else {
            System.out.println(year + " er ikke et skuddår");
        }
    }
}