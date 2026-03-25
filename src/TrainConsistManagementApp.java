import java.util.ArrayList;
import java.util.List;

    /**
     * UC1: Initialize Train and Display Consist Summary
     * This class serves as the entry point for the Train Consist Management App.
     */
    public class TrainConsistManagementApp {

        public static void main(String[] args) {
            // 1. Display Welcome Message
            System.out.println("=== Train Consist Management App ===");

            // 2. Initialize an empty List using ArrayList (Dynamic Collection)
            // We use the List interface for abstraction and ArrayList for resizability.
            List<String> trainConsist = new ArrayList<>();

            // 3. Display the initial bogie count
            // Using .size() allows us to track the current length of the collection.
            System.out.println("Initial Bogie Count: " + trainConsist.size());

            // 4. Program continues...
            System.out.println("Train system initialized successfully.");
        }
    }
