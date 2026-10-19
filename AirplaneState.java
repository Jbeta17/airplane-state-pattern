package project370;

// State interface that defines the behaviour for all concrete states
public interface AirplaneState {
	
	// Defines and responsible for the transition of current state
    void handle(Airplane airplane);
    // Returns the name of the state
    String getStateName();
}
