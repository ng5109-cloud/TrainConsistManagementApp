import java.util.*;
import java.util.stream.*;

// ================= BOGIE CLASS =================
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

// ================= MAIN CLASS =================
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBogies:");
        System.out.println(bogies);

        // Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)           // extract capacities
                .reduce(0, Integer::sum);       // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity:");
        System.out.println(totalCapacity);
    }
}