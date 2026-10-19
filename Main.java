package project370;

public class Main {

    public static void main(String[] args) {

        // Demo that shows state transitions of airplane
        Airplane airplane = new Airplane("NO789");

        for (int i = 0; i < 6; i++) {
            System.out.println("Flight " + airplane.getFlightNumber() +
                               " is in state: " + airplane.getStateName());
            airplane.update(); // move to next state
        }

        System.out.println("TESTS ----------------");

        // Run simple boolean unit tests
        System.out.println("Test 1 (Gate -> Taxiing): " + testGateToTaxiing());
        System.out.println("Test 2 (Full Cycle Back to Gate): " + testFullCycle());
    }

    // Test that checks if airplane moves from Gate → Taxiing
    public static boolean testGateToTaxiing() {
        Airplane airplane = new Airplane("Test1");

        if (!airplane.getStateName().equals("At Gate")) {
            return false;
        }

        airplane.update();

        return airplane.getStateName().equals("Taxiing");
    }

    // Test that checks full cycle returns to Gate
    public static boolean testFullCycle() {
        Airplane airplane = new Airplane("Test2");

        airplane.update(); // Taxiing
        airplane.update(); // Takeoff
        airplane.update(); // In Flight
        airplane.update(); // Landing
        airplane.update(); // Back to Gate

        return airplane.getStateName().equals("In Flight");
    }
}