import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> trainConsist = new LinkedHashSet<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        trainConsist.add("Sleeper");

        System.out.println("Final train formation: " + trainConsist);
    }
}