import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Binary Search: Bogie ID ===");

        // Step 1: Sorted array (IMPORTANT)
        String[] bogieIds = {"BG101", "BG150", "BG205", "BG250", "BG300"};

        // Step 2: Search key
        String key = "BG205";   // change to test

        // Step 3: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("\nBogie Found at position: " + mid);
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;   // search left
            } else {
                low = mid + 1;    // search right
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("\nBogie ID not found");
        }
    }
}