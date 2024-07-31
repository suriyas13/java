import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Trip {
    String des;
    String dd;
    String rd;

    Trip(String des, String dd, String rd) {
        this.des = des;
        this.dd = dd;
        this.rd = rd;
    }

    public static void delete(String dk, ArrayList<Trip> list) {
        Iterator<Trip> p = list.iterator();
        while (p.hasNext()) {
            Trip i = p.next();
            if (i.des.equals(dk)) {
                p.remove();
            }
        }
    }

    public static void updatereturndate(String uk, String ud, ArrayList<Trip> list) {
        for (Trip i : list) {
            if (i.des.equals(uk)) {
                i.rd = ud;
            }
        }
    }

    public String toString() {
        return des + " " + dd + " " + rd;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Trip> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter destination:");
        // String des = sc.nextLine();
        // System.out.println("Enter departure date:");
        // String dd = sc.nextLine();
        // System.out.println("Enter return date:");
        // String rd = sc.nextLine();

        // list.add(new Trip(des, dd, rd));
        list.add(new Trip("Pondy", "2024-08-01", "2024-08-05"));
        list.add(new Trip("Chennai", "2024-09-01", "2024-09-05"));

        System.out.println("Trips before deletion:");
        for (Trip trip : list) {
            System.out.println(trip);
        }
        Trip.delete("Pondy", list);
        System.out.println("Trips after deletion:");
        for (Trip trip : list) {
            System.out.println(trip);
        }
        Trip.updatereturndate("Chennai", "2024-09-13", list);
        System.out.println("Trip After Updation");
        for (Trip trip : list) {
            System.out.println(trip);
        }
        sc.close();
    }
}
