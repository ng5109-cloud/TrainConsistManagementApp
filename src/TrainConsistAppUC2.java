import java.util.ArrayList;
import java.util.List;

public class TrainConsistAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs 'Sleeper' present? " + exists);

        // Final list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}