import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * This class ensures that every bogie added to the system has a unique identifier.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Enforcing Unique Bogie IDs...");

        // 1. Initialize a HashSet for Bogie IDs
        // HashSet implements the Set interface, which automatically prevents duplicates.
        Set<String> bogieIds = new HashSet<>();

        // 2. Add Bogie IDs to the Set
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // 3. Attempt to add a duplicate ID (Intentional)
        // In a List, this would add a second entry. In a Set, it is simply ignored.
        bogieIds.add("BG101");

        // 4. Print the final set
        // Note: The order of output may differ from insertion order because HashSet is unordered.
        System.out.println("Current Bogie IDs in System: " + bogieIds);

        // 5. Display the count to verify deduplication
        System.out.println("Total Unique Bogies: " + bogieIds.size());

        System.out.println("Verification: Duplicate 'BG101' was automatically rejected.");
    }
}