package project370;

// Concrete State: Airplane is taxiing to runway
public class TaxiingState implements AirplaneState {

    @Override
    public void handle(Airplane airplane) {
        airplane.setState(new TakeoffState());// Taxi -> Flight
    }

    @Override
    public String getStateName() {
        return "Taxiing";
    }
}