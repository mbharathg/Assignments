package Tdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



class AirportTest1 {
	@DisplayName("Given there is a business flight")
	@Nested
	class BusinessFlightTest {
		private Flight businessFlight;
		@BeforeEach
		void setUp() {
			businessFlight = new Flight("2", "Business");
		}
		@Test
		public void testBusinessFlightRegularPassenger() {
			Passengers mike = new Passengers("Mike", false);
			assertEquals(false, businessFlight.addPassengers(mike));
			assertEquals(0, businessFlight.getPassengersList().size());
			assertEquals(false, businessFlight.removePassenger(mike));
			assertEquals(0, businessFlight.getPassengersList().size());
		}
		@Test
		public void testBusinessFlightVipPassenger() {
			Passengers james = new Passengers("James", true);
			assertEquals(true, businessFlight.addPassengers(james));
			assertEquals(1, businessFlight.getPassengersList().size());
			assertEquals(false, businessFlight.removePassenger(james));
			assertEquals(1, businessFlight.getPassengersList().size());
		}
	}
}

