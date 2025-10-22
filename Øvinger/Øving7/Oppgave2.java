class editor {
    
    String text;

    public editor(String text) {
        this.text = text;
    }
    public static void statistikk(String Setning){
        String[] tekst = Setning.split("[ :;!?.]+");
        int lengde = tekst.length;
        double average = 0;
        System.out.println("setningen inneholder " + lengde + " ord");
        for (int i = 0; i < lengde; i++) {
            String ord = tekst[i];
            average += ord.length();
        }
        System.out.println("average lenden på ord er:" + average /lengde);
    }
    public static void bytte(String setning, String ord1, String ord2){
        String byttet = setning.replaceAll(ord1,ord2);
        System.out.println(byttet);
    }
    public static void lese(String setning){
        System.out.println(setning);
        System.out.println(setning.toUpperCase());
    }
}

public class Oppgave2 {
    
    public static void main(String[] args) {
        editor tekst = new editor ("Andre folk Ser! Jeg gjør ikke!"); 
        editor.statistikk(tekst.text);
        editor.bytte(tekst.text, "Andre", "alle");
        editor.lese (tekst.text);
    }
}