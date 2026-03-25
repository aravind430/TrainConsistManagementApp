import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * This class demonstrates CRUD operations on a dynamic collection.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Initialize the Train App
        System.out.println("=== Train Consist Management App ===");

        // 2. Create an ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 3. Add Bogies: Sleeper, AC Chair, First Class
        // ArrayList preserves the insertion order, simulating the order of attachment.
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies: " + passengerBogies);

        // 4. Remove one bogie (e.g., AC Chair)
        // This simulates detaching a coach for maintenance or rerouting.
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing AC Chair: " + passengerBogies);

        // 5. Use contains() to check if Sleeper exists
        // This is a search operation to verify if a specific coach is in the consist.
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper bogie present? " + hasSleeper);

        // 6. Print final list state and count
        System.out.println("Final Train Consist: " + passengerBogies);
        System.out.println("Total Bogies: " + passengerBogies.size());
    }
}