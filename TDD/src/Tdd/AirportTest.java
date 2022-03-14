package Tdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AirportTest
{
    @DisplayName("Given there is an economy flight")
	@Nested
	class EconomyFlightTest 
	 {
    	private Flight economyFlight;
    	@BeforeEach
		void setUp() 
    	{
			economyFlight = new Flight("1", "Economy");
		}

    	@Test
		public void testEconomyFlightRegularPassenger() 
    	{
			Passengers mike = new Passengers("Mike", false);



			assertEquals("1", economyFlight.getId());
			assertEquals(true, economyFlight.addPassengers(mike));
			assertEquals(1, economyFlight.getPassengersList().size());
			assertEquals("Mike",
					economyFlight.getPassengersList().get(0).getName());



			assertEquals(true, economyFlight.removePassenger(mike));
			assertEquals(0, economyFlight.getPassengersList().size());
		}

    	@Test
		public void testEconomyFlightVipPassenger() 
    	{
			Passengers james = new Passengers("James", true);
			assertEquals("1", economyFlight.getId());
			assertEquals(true, economyFlight.addPassengers(james));
			assertEquals(1, economyFlight.getPassengersList().size());
			assertEquals("James",economyFlight.getPassengersList().get(0).getName());
			assertEquals(false, economyFlight.removePassenger(james));
			assertEquals(1, economyFlight.getPassengersList().size());
		}
	}
}

