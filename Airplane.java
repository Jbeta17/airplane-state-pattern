package project370;

// The context class in the State pattern
// Maintains a reference to current state
public class Airplane {
    private AirplaneState currentState; // Current state of airplane
    private String flightNumber;

    // Initializes the airplane in "At Gate" state
    public Airplane(String flightNumber) {
        this.flightNumber = flightNumber;
        this.currentState = new AtGateState();
    }
    
    // Changes the current state
    public void setState(AirplaneState state) {
        this.currentState = state;
    }
    
    // Delegates behaviour to current state
    public void update() {
        currentState.handle(this);
    }

    // Returns the current state
    public String getStateName() {
        return currentState.getStateName();
    }
    
    
    public String getFlightNumber() {
        return flightNumber;
    }
}