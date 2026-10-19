package project370;

// Concrete State: Airplane is at gate
public class AtGateState implements AirplaneState {

    @Override
    public void handle(Airplane airplane) {
        airplane.setState(new TaxiingState());// Gate -> Taxiing
    }

    @Override
    public String getStateName() {
        return "At Gate";
    }
}
