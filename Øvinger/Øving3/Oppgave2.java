import java.util.*;

class Oppgave2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("hvilket tall vil du primtalssjekke?");
        int tall = scanner.nextInt();
        int O = 0;

        for(int i = 2; i <= tall/2; i++){
            if (tall % i == 0){
                O += 1;
            }
        }
        if (O == 0){
            System.out.println("Det er et primtall");
        }
        else{
            System.out.println("Det er ikke et primtall!");
        }
    }
}