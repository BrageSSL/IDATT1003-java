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

    public ArrayList<Arrangement> getArrangementBetweenDate(long startDate, long endDate) {
        ArrayList<Arrangement> byDate = new ArrayList<>();
        for (Arrangement arrangement : arrangements) {
            if (arrangement.getDato() >= startDate && arrangement.getDato() <= endDate) {
                byDate.add(arrangement);
            }
        }
        byDate.sort(Comparator.comparingLong(Arrangement::getDato));
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
        long dato = scanner.nextLong();
        scanner.nextLine();

        Arrangement newArrangement = new Arrangement(id, arrangement, location, arrangor, type, dato);
        addArrangement(newArrangement);
    }
    public void arrangementMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Create Arrangement");
        System.out.println("2. View All Arrangements");
        System.out.println("3. View Arrangements by Date");
        System.out.println("4. View Arrangements at Date");
        System.out.println("5. View Arrangements after Date");
        System.out.println("6. View Arrangements between Dates");
        System.out.println("7. View Arrangements by Location");
        System.out.println("8. View Arrangements by Type");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                createArrangement();
                break;
            case 2:
                for (Arrangement arr : getArrangements()) {
                    System.out.println(arr);
                }
                break;
            case 3:
                ArrayList<Arrangement> byDate = getByDate();
                for (Arrangement arr : byDate) {
                    System.out.println(arr);
                }
                break;
            case 4:
                System.out.print("Enter date (integer): ");
                int dateAt = scanner.nextInt();
                Arrangement atDate = getArrangementAtDate(dateAt);
                if (atDate != null) {
                    System.out.println(atDate);
                } else {
                    System.out.println("No arrangement found at this date.");
                }
                break;
            case 5:
                System.out.print("Enter date (integer): ");
                int dateAfter = scanner.nextInt();
                Arrangement afterDate = getArrangementAfterDate(dateAfter);
                if (afterDate != null) {
                    System.out.println(afterDate);
                } else {
                    System.out.println("No arrangement found after this date.");
                }
                break;
            case 6:
                System.out.print("Enter start date (integer): ");
                int startDate = scanner.nextInt();
                System.out.print("Enter end date (integer): ");
                int endDate = scanner.nextInt();
                ArrayList<Arrangement> betweenDates = getArrangementBetweenDate(startDate, endDate);
                for (Arrangement arr : betweenDates) {
                    System.out.println(arr);
                }
                break;
            case 7:
                ArrayList<Arrangement> byLocation = getByLocation();
                for (Arrangement arr : byLocation) {
                    System.out.println(arr);
                }
                break;
            case 8:
                ArrayList<Arrangement> byType = getByType();
                for (Arrangement arr : byType) {
                    System.out.println(arr);
                }
                break;
            case 9:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
