public class Main {

    public static void main(String[] args) {

        System.out.println("=== Bubble Sort: Passenger Bogie Capacities ===");

        // Step 1: Input array
        int[] capacities = {72, 60, 40, 80, 50};

        System.out.print("\nBefore Sorting: ");
        printArray(capacities);

        // Step 2: Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            // Optimization: check if any swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) break;
        }

        System.out.print("\nAfter Sorting: ");
        printArray(capacities);
    }

    // Helper method
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}