import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.UUID;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangements;

    public ArrangementRegister() {
        arrangements = new ArrayList<>();
    }

    public void addArrangement(Arrangement arrangement) {
        arrangements.add(arrangement);
    }

    public ArrayList<Arrangement> getArrangements() {
        return arrangements;
    }

    public ArrayList<Arrangement> getByLocation() {
        ArrayList<Arrangement> byLocation = new ArrayList<>(arrangements);
        byLocation.sort(Comparator.comparing(Arrangement::getLocation));
        return byLocation;
    }

    public ArrayList<Arrangement> getByType() {
        ArrayList<Arrangement> byType = new ArrayList<>(arrangements);
        byType.sort(Comparator.comparing(Arrangement::getType));
        return byType;
    }

    public ArrayList<Arrangement> getByDate() {
        ArrayList<Arrangement> byDate = new ArrayList<>(arrangements);
        byDate.sort(Comparator.comparing(Arrangement::getDato));
        return byDate;
    }

    public Arrangement getArrangementAfterDate(int date) {
        for (Arrangement arrangement : arrangements) {
            if (arrangement.getDato() > date) {
                return arrangement;
            }
        }
        return null;
    }

    public ArrayList<Arrangement> getArrangementBetweenDate(int startDate, int endDate) {
        ArrayList<Arrangement> byDate = new ArrayList<>();
        for (Arrangement arrangement : arrangements) {
            if (arrangement.getDato() >= startDate && arrangement.getDato() <= endDate) {
                byDate.add(arrangement);
            }
        }
        byDate.sort(Comparator.comparingInt(Arrangement::getDato));
        return byDate;
    }

    public Arrangement getArrangementAtDate(int date) {
        for (Arrangement arrangement : arrangements) {
            if (arrangement.getDato() == date) {
                return arrangement;
            }
        }
        return null;
    }

    public Arrangement getArrangementAtLocation(String location) {
        for (Arrangement arrangement : arrangements) {
            if (arrangement.getLocation().equals(location)) {
                return arrangement;
            }
        }
        return null;
    }

    public void  createArrangement() {
        Scanner scanner = new Scanner(System.in);

        String id = UUID.randomUUID().toString();

        System.out.print("Enter arrangement name: ");
        String arrangement = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.print("Enter arrangor: ");
        String arrangor = scanner.nextLine();

        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        System.out.print("Enter tidspunkt as integer (e.g. 200210301800): ");
        int dato = scanner.nextInt();
        scanner.nextLine();

        Arrangement newArrangement = new Arrangement(id, arrangement, location, arrangor, type, dato);
        addArrangement(newArrangement);
    }
}