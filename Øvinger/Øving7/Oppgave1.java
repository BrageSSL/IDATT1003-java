final class editor {
    
    private final String text;

    public editor(String text) {
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public static void forkort(String Setning){
        String[] tekst = Setning.split("[ :;!?.]+");

        for (String ord : tekst){
            if (!ord.isEmpty()){
                char bokstav = ord.charAt(0);
                System.out.print(bokstav);
            }
        }
    }
    public static void remove(String setning, String x){
        String endret = setning.replace(x,"");
        System.out.println("\n" + endret);
    }
}
public class Oppgave1 {
    public static void main(String[] args) {
        editor tekst = new editor ("Andre folk Ser! Jeg gjør ikke!!"); 
        editor.forkort(tekst.getText());
        editor.remove(tekst.getText(), "e");
        
    }
}