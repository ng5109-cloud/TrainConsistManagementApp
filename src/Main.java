import java.util.*;

// ================= CUSTOM EXCEPTION =================
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ================= PASSENGER BOGIE CLASS =================
class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        // Validation (Fail-Fast)
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0 for " + name);
        }

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

        System.out.println("=== Passenger Bogie Validation System ===");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 60));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nFinal Train Bogies:");
        System.out.println(bogies);
    }
}