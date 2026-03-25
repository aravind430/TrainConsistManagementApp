import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Bogie Class representing a physical train unit with attributes.
 */
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

/**
 * UC7: Sort Bogies by Capacity (Comparator)
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Sorting Bogies by Capacity for Resource Planning...");

        // 1. Create a List to store Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // 2. Add Bogie objects with different capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("AC Chair Car", 56));

        System.out.println("\nBefore Sorting: " + passengerBogies);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // We use a Lambda expression for concise comparison logic
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // 4. Display the sorted list
        System.out.println("After Sorting (Low to High Capacity):");
        for (Bogie b : passengerBogies) {
            System.out.println("- " + b);
        }

        // 5. Bonus: Sorting in Descending Order (High to Low)
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\nStrategic Planning (High to Low Capacity):");
        passengerBogies.forEach(b -> System.out.println("Ranked: " + b));
    }
}