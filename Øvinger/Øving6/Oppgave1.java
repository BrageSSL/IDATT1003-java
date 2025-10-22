import java.util.Random;

class counter {
    int number;
    int amount;

    public counter(int number) {
        this.number = number;
        this.amount = 0;
    }

    public void count() {
        this.amount++;
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Random random = new Random();

        int generations = 100000;

        counter[] counters = new counter[10];
        for (int i = 0; i < 10; i++) {
            counters[i] = new counter(i);
        }

        for (int i = 0; i < generations; i++) {
            int num = random.nextInt(10);
            counters[num].count();
        }

        for (counter c : counters) {
            System.out.println("Number " + c.number + ": " + c.amount);
        }
    }
}