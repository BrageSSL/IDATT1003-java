public class Oppgave1 {
    private static class Student{
        private final String navn;
        private int antOppg;
        public Student(String navn){
            this.navn = navn;
            this.antOppg = 0;
        }

        public String getNavn(){
            return navn;
        }

        public int getAntOppg(){
            return antOppg;
        }

        public void økAntOppg(int antall){
            antOppg += antall;
        }

        @Override
        public String toString(){
            return navn + " har gjort " + antOppg + " oppgaver.";
        }

    }

    private static class Oppgaveoversikt {
        private Student[] studenter;
        private int antStud;

        public Oppgaveoversikt(int maksAntall) {
            studenter = new Student[maksAntall];
            antStud = 0;
        }

        public int getAntStud() {
            return antStud;
        }

        public int finnAntOppg(String navn) {
            for (int i = 0; i < antStud; i++) {
                if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
                    return studenter[i].getAntOppg();
                }
            }
            return -1; // ikke funnet
        }

        public void nyStudent(String navn) {
            if (antStud >= studenter.length) return; // unngå overflow
            studenter[antStud] = new Student(navn);
            antStud++;
        }

        public boolean økAntOppg(String navn, int økning) {
            for (int i = 0; i < antStud; i++) {
                if (studenter[i].getNavn().equalsIgnoreCase(navn)) {
                    studenter[i].økAntOppg(økning);
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder oversikt = new StringBuilder("Oversikt over studenter:\n");
            for (int i = 0; i < getAntStud(); i++) {
                oversikt.append(studenter[i].toString()).append("\n");
            }
            return oversikt.toString();
        }
    }

    public static void main(String[] args) {
        // Lite demo for å verifisere at klassen kompilerer og fungerer
        Oppgaveoversikt oversikt = new Oppgaveoversikt(10);
        oversikt.nyStudent("Ola");
        oversikt.nyStudent("Kari");
        oversikt.økAntOppg("Ola", 3);
        oversikt.økAntOppg("Kari", 2);
        int olaOppgaver = oversikt.finnAntOppg("Ola");
        System.out.println("Ola har gjort " + olaOppgaver + " oppgaver.");
        System.out.println(oversikt.toString());

    }

}