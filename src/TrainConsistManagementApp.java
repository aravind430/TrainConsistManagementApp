import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity (HashMap)
 * This class associates bogie types with their respective operational capacities.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Initializing Bogie Capacity Mapping...");

        // 1. Create a HashMap to store Bogie-Capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 2. Use put() to map each bogie to its specific capacity
        // Passenger Bogies
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);

        // Goods Bogies
        bogieCapacityMap.put("Rectangular Cargo", 1000); // in quintals/kg
        bogieCapacityMap.put("Cylindrical Tanker", 500);

        // 3. Iterate over the map using entrySet()
        // entrySet() is the most efficient way to access both Key and Value together.
        System.out.println("\n--- Train Capacity Manifest ---");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieType = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieType + " | Capacity: " + capacity);
        }

        // 4. Fast Lookup Example
        // HashMap allows us to instantly find capacity without searching the whole list.
        String searchBogie = "Sleeper";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("\nQuick Lookup: " + searchBogie + " capacity is " + bogieCapacityMap.get(searchBogie));
        }

        System.out.println("\nCapacity mapping completed successfully.");
    }
}