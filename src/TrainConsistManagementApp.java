import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * This class ensures uniqueness while maintaining the physical attachment sequence.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Building Ordered & Unique Formation...");

        // 1. Initialize a LinkedHashSet
        // LinkedHashSet prevents duplicates (Set) but keeps insertion order (Linked).
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in a specific sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to attach a duplicate bogie (Intentional)
        // The system will recognize 'Sleeper' is already attached and ignore this.
        System.out.println("\nAttempting to re-attach 'Sleeper'...");
        trainFormation.add("Sleeper");

        // 4. Display the final formation
        // Notice the order remains: Engine -> Sleeper -> Cargo -> Guard
        System.out.println("Final Train Formation: " + trainFormation);

        // 5. Verify the properties
        System.out.println("Total Unique Bogies: " + trainFormation.size());

        System.out.println("\nSuccess: Order preserved and duplicates blocked.");
    }
}