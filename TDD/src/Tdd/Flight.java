package Tdd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Flight
{
	private String id;
	private List<Passengers> passengers = new ArrayList<Passengers>();
	private String flightType; public Flight(String id, String flightType) {
		this.id = id;
		this.flightType = flightType;
	} 
	public String getId() {
		return id;
	} 
	public List<Passengers> getPassengersList() {
		return Collections.unmodifiableList(passengers);
	} 
	public String getFlightType() {
		return flightType;
	}
	public boolean addPassengers(Passengers passenger) {
		switch (flightType) {
		case "Economy":
			return passengers.add(passenger);
		case "Business":
			if (passenger.isVip()) {
				return passengers.add(passenger);
			}
			return false;
		default:
			throw new RuntimeException("Unknown type: " + flightType);
		}
	} 
	public boolean removePassenger(Passengers passenger) {
			switch (flightType) {
			case "Economy":
				if (!passenger.isVip()) {
					return passengers.remove(passenger);
				}
				return false;
			case "Business":
				return false;
			default:
				throw new RuntimeException("Unknown type: " + flightType);
			}
		}
}

