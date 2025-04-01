import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	private Property property;

	@BeforeEach
	void setUp() throws Exception {
		property = new Property("April", "Duca", 1200.0, "Kawa");
	}

	@AfterEach
	void tearDown() throws Exception {
		property = null;
	}

	@Test
	void testConstructorAndGetters() {
		assertEquals("April", property.getPropertyName());
		assertEquals("Duca", property.getCity());
		assertEquals(1200.0, property.getRentalAmount());
		assertEquals("Kawa", property.getOwner());
		
	}
	
	@Test
	void testGetPropertyName() {
		assertEquals("April", property.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(1200.00, property.getRentalAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, property.getPlot().getX());
		assertEquals(0, property.getPlot().getY());
		assertEquals(1, property.getPlot().getWidth());
		assertEquals(1, property.getPlot().getDepth());
	}
	
	@Test
	void testToString() {
		String expected = "April,Duca,Kawa,1200.0";
		assertEquals(expected, property.toString());
	}

}
