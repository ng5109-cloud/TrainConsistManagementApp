public class Main {

    public static void main(String[] args) {

        System.out.println("=== Linear Search: Bogie ID ===");

        // Step 1: Create array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG150", "BG300", "BG250"};

        // Step 2: Search key
        String searchKey = "BG150";   // change this to test

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(searchKey)) {
                System.out.println("\nBogie Found at position: " + i);
                found = true;
                break; // Early termination
            }
        }

        // Step 4: Result
        if (!found) {
            System.out.println("\nBogie ID not found");
        }
    }
}