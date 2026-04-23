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
}

// ================= MAIN CLASS =================
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Performance Comparison: Loop vs Stream ===");

        // Create test data
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }

        // -------- LOOP-BASED FILTER --------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------- STREAM-BASED FILTER --------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------- OUTPUT --------
        System.out.println("\nLoop Filter Count: " + loopResult.size());
        System.out.println("Stream Filter Count: " + streamResult.size());

        System.out.println("\nLoop Time (nanoseconds): " + loopTime);
        System.out.println("Stream Time (nanoseconds): " + streamTime);
    }
}