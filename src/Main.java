import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Defensive Search: Empty Train Check ===");

        // Step 1: Bogie collection (try empty and non-empty)
        List<String> bogieIds = new ArrayList<>();
        // bogieIds.add("BG101"); // uncomment to test valid case

        String searchKey = "BG101";

        try {
            performSearch(bogieIds, searchKey);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search method with defensive check
    public static void performSearch(List<String> bogies, String key) {

        // Step 2: Fail-Fast Validation
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        // Step 3: Linear Search (safe to proceed)
        boolean found = false;

        for (int i = 0; i < bogies.size(); i++) {
            if (bogies.get(i).equals(key)) {
                System.out.println("Bogie Found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found");
        }
    }
}