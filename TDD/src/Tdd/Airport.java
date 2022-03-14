package Tdd;

public class Airport {
	public static void main(String[] args) 
	{
		Flight economyFlight = new Flight("1", "Economy");
		Flight businessFlight = new Flight("2", "Business");
		Passengers james = new Passengers("James", true);
		Passengers mike = new Passengers("Mike", false);
		businessFlight.addPassengers(james);
		businessFlight.removePassenger(james);
		businessFlight.addPassengers(mike);
		economyFlight.addPassengers(mike);
		System.out.println("Business flight passengers list:");
		for (Passengers passenger: businessFlight.getPassengersList()) 
		{
			System.out.println(passenger.getName());
		}
		System.out.println("Economy flight passengers list:");
		for (Passengers passenger: economyFlight.getPassengersList())
		{
			System.out.println(passenger.getName());
		}
	}
}
