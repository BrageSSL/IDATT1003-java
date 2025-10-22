import java.util.*;;

class counter {
    
    String text;

    public counter(String text) {
        this.text = text;
    }
    public void counting (char ord) {
        int[] antallTegn = new int[30];
        int[] bokstaver = new int[30];
        int n = text.length();
        int o = 0;
        for (int i = 0; i < n; i++) {
            char a = ((text.toLowerCase().charAt(i)));
            char b = a;
            if (a >= 97 && a <= 122) {
                a -= 97;
            } else if (a == 230) {
                a = 26;
            }else if (a == 248) {
                a = 27;
            }else if (a == 229) {
                a = 28;
            }else {
                a = 29;
                b = '?';
            }
            antallTegn[a]++;
            bokstaver[a] = b;
        }
        for (int i = 0; i < 30; i++) {
            if (antallTegn[i] != 0) {
                System.out.println((char) bokstaver[i] + " = "+ antallTegn[i]);
            }
        }
        if (ord == ' ') {
            System.out.println("no letter given, your letter is b");
            System.out.println(antallTegn[1]);
        }
        else if ((ord - 97) < 25) {
            o = ord - 97;
        }else if (ord == 230) {
            o = 26;  
        }else if (ord == 248) {
            o = 27;  
        }else if (ord == 229) {
            o = 28;                  
        }else {
            o = 29;    
        }
        int max = 0;
        for (int i = 0; i < 30; i++) {
            if (antallTegn[i] > max) {
                max = antallTegn[i];
            }
        }
        System.out.println("setningen din er " + n + " tegn langt");
        System.out.println((((int) antallTegn[29] * 100)/n) + " prosent av teksten er ikke mellom a-å");
        System.out.println("Setningen har  " + antallTegn[o] + " av bokstaven " + ord); 
        System.out.print("Mest brukte bokstav(er): ");
        char bokstav = '\0';
        for (int i = 0; i < 30; i++) {
            if (antallTegn[i] == max) {
                if (i < 26) {
                    bokstav = (char) (i + 'a'); // a-z
                } else if (i == 26) {
                    bokstav = 'æ';
                } else if (i == 27) {
                    bokstav = 'ø';
                } else if (i == 28) {
                    bokstav = 'å';
                } else if (i == 29) {
                    bokstav = '?';
                }
                System.out.print(bokstav + " ");
            }
        }
        System.out.println(" med " + max + " forekomster.");
    }
}

public class Oppgave2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        char ord = 'q';
        while (m == 0) {
            
            System.out.println("Hvilke setning vil du analysere?");
            String word = scanner.nextLine();            
            counter tekst = new counter (word); 
            tekst.counting(ord);
            
        }
    }
}