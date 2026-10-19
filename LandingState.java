package project370;

// Concrete state: Airplane is landing
public class LandingState implements AirplaneState {

    @Override
    public void handle(Airplane airplane) {
        airplane.setState(new AtGateState()); //Flight -> Landing
    }

    @Override
    public String getStateName() {
        return "Landing";
    }
}