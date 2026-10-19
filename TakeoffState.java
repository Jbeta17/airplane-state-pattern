package project370;

public class TakeoffState implements AirplaneState{
	
	@Override
	public void handle(Airplane airplane) {
		airplane.setState(new InFlightState());// Takeoff -> In flight 
	}
	
	@Override 
	public String getStateName() {
		return "Taking off";
	}
}
