import java.util.*;

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

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by capacity):");
        System.out.println(bogies);
    }
}