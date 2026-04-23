import java.util.*;

// ================= CUSTOM RUNTIME EXCEPTION =================
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ================= GOODS BOGIE CLASS =================
class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {

        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    public String toString() {
        return type + " (" + (cargo != null ? cargo : "No Cargo") + ")";
    }
}

// ================= MAIN CLASS =================
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Cargo Safety Management System ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        // Safe assignment
        b1.assignCargo("Coal");

        // Unsafe assignment (will trigger exception)
        b1.assignCargo("Petroleum");

        // Safe assignment
        b2.assignCargo("Petroleum");

        // Final state
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);
    }
}