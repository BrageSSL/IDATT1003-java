import java.util.*;

class Oppgave1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilke tall vil du se gangetabellen fra?");
        int Tall1 = scanner.nextInt();
        System.out.println("Hvilke tall vil du se gangetabellen til?");
        int Tall2 = scanner.nextInt();

        for(int j = Tall1; j <= Tall2; j++){
                for (int i = 0; i < 10; i++){
                System.out.println(j + " * " + (i + 1) + " = " + j * (i+1));
            }
            System.out.println("--------------------");
        }
    }
}