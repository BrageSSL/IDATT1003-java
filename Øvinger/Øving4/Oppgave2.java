import java.util.Random;

class sum{
    int poeng;
    int terning;
    int ferdig;
    String person;

    public sum(int poeng, int terning, int ferdig, String person){
        this.poeng = poeng;
        this.terning = terning;
        this.ferdig = ferdig;
        this.person = person;
    }

    public void kastTerningen(){
        Random terningen = new Random();
        this.terning = terningen.nextInt(6) + 1;
        if (this.poeng < 100 & this.terning != 1) {
            this.poeng = this.poeng + this.terning;
        }
        else if (this.poeng > 100 & this.terning != 1){
            this.poeng = this.poeng - this.terning;
        }
        else if (this.terning == 1) {
            this.poeng = 0;
        }
        System.out.println("\n" + this.person + " rolled a " + this.terning);
        System.out.println("total points: " + this.poeng);
        System.out.println("turns taken: " + this.ferdig + "\n");
        
        this.ferdig += 1;
    }
    public void erFerdig(){
        if (this.poeng == 100){
            System.out.println("\nGratulerer " + this.person + " du har Vunnet");
            System.out.println("Du hadde " + this.poeng + "Poeng, og brukte " + this.ferdig + " forsøk");
        }
        else{
            System.out.println("\nBeklager " + this.person + " Du Tapte");
            System.out.println("Du hadde " + this.poeng + "Poeng, og brukte " + this.ferdig + " forsøk\n\n\n\n\n");
        }
    }
}

public class Oppgave2{
    public static void main(String[] args) {
        sum Alvin = new sum(0, 0, 0, "Alvin");
        sum Bernt = new sum(0, 0, 0, "Bernt");

        while (Alvin.poeng != 100 & Bernt.poeng != 100) { 
            Alvin.kastTerningen();
            Bernt.kastTerningen();
        }
        if(Alvin.poeng == 100){
            Alvin.erFerdig();
            Bernt.erFerdig();
        }
        else if(Bernt.poeng == 100){
            Bernt.erFerdig();
            Alvin.erFerdig();
        }
    }
}