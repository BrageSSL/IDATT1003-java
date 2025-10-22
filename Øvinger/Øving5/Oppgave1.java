
class beregn {

    private int teller;
    private int nevner;

    public beregn(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("nevner kan ikke være 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public beregn(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public static void multiply(beregn a, beregn b) {
        int teller1 = a.teller * b.teller;
        int nevner1 = a.nevner * b.nevner;
        beregn result = new beregn(teller1, nevner1);
        System.out.println(a.teller + "/" + a.nevner + " * " + b.teller + "/" + b.nevner);
        System.out.println(" = " + result.teller + "/" + result.nevner);
    }

    public static void Division(beregn a, beregn b) {
        int teller1 = a.teller * b.nevner;
        int nevner1 = a.nevner * b.teller;
        beregn result = new beregn(teller1, nevner1);
        System.out.println(a.teller + "/" + a.nevner + " / " + b.teller + "/" + b.nevner);
        System.out.println(" = " + result.teller + "/" + result.nevner);
    }

    public static void adittion(beregn a, beregn b) {
        int teller1 = a.teller * b.nevner + a.nevner * b.teller;
        int nevner1 = a.nevner * b.nevner;
        beregn result = new beregn(teller1, nevner1);
        System.out.println(a.teller + "/" + a.nevner + " + " + b.teller + "/" + b.nevner);
        System.out.println(" = " + result.teller + "/" + result.nevner);
    }

    public static void subtract(beregn a, beregn b) {
        int teller1 = a.teller * b.nevner - a.nevner * b.teller;
        int nevner1 = a.nevner * b.nevner;
        beregn result = new beregn(teller1, nevner1);
        System.out.println(a.teller + "/" + a.nevner + " - " + b.teller + "/" + b.nevner);
        System.out.println(" = " + result.teller + "/" + result.nevner);
    }
}

public class Oppgave1 {

    static beregn a = new beregn(1, 5);
    static beregn b = new beregn(5, 31);
    static beregn c = new beregn(15);

    public static void main(String[] args) {
        beregn.multiply(a, b);
        beregn.Division(c, b);
        beregn.adittion(a, b);
        beregn.subtract(a, c);
    }
}
