import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 * This class models the physical sequence of a train consist.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Building physical train sequence...");

        // 1. Initialize a LinkedList for the consist
        // LinkedList is ideal for frequent insertions and deletions at the ends.
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add initial bogies to the train
        // Using addLast ensures they are attached to the back of the current consist.
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");
        trainConsist.add("Guard Coach");

        System.out.println("Initial Sequence: " + trainConsist);

        // 3. Insert a Pantry Car at position 2 (index 2)
        // This demonstrates inserting a bogie in the middle of the train.
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Adding Pantry Car at position 2: " + trainConsist);

        // 4. Remove the first and last bogie
        // Simulating uncoupling the Engine and the Guard Coach.
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("Final Ordered Consist: " + trainConsist);
        System.out.println("Current Bogie Count: " + trainConsist.size());
    }
}