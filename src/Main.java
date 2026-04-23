import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Sorting Bogie Types (Arrays.sort) ===");

        // Step 1: Create array of bogie names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Engine"};

        // Before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Step 2: Sort using built-in method
        Arrays.sort(bogieTypes);

        // After sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}