import java.util.*;
import java.util.stream.*;

// ================= GOODS BOGIE CLASS =================
class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;  // Coal / Petroleum / etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " (" + cargo + ")";
    }
}

// ================= MAIN CLASS =================
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Validation System ===");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));

        System.out.println("\nGoods Bogies:");
        System.out.println(bogies);

        // Validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical → only Petroleum
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // other types are allowed
                });

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}