
public class Arrangement {
    private String id;
    private String arrangement;
    private String location;
    private String arrangor;
    private String type;
    private long  dato;

    public Arrangement(String id, String arrangement, String location, String arrangor, String type, long dato) {
        this.id = id;
        this.arrangement = arrangement;
        this.location = location;
        this.arrangor = arrangor;
        this.type = type;
        this.dato = dato;
    }

    public String getArrangement() {
        return arrangement;
    }

    public String getLocation() {
        return location;
    }

    public String getArrangor() {
        return arrangor;
    }

    public String getType() {
        return type;
    }

    public long getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "Arrangement: " + arrangement + ", Location: " + location + ", Arrangor: " + arrangor + ", Type: " + type + ", Tidspunkt: " + dato;
    }
}
