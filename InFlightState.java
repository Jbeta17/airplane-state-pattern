package project370;

// Concrete State: Airplane is flying
public class InFlightState implements AirplaneState {

    @Override
    public void handle(Airplane airplane) {
        airplane.setState(new LandingState());// Flight -> Landing
    }

    @Override
    public String getStateName() {
        return "In Flight";
    }
}
