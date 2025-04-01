import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plot1, plot2, overlappingPlot, adjacentPlot;
	
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(0, 0, 10, 10);
		plot2 = new Plot(5, 5, 5, 5);
		overlappingPlot = new Plot(8, 8, 5, 5);
		adjacentPlot = new Plot(10, 0, 5, 5);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = null;
		plot2 = null;
		overlappingPlot = null;
		adjacentPlot = null;
	}

	@Test
	void testOverlaps() {
		assertTrue(plot1.overlaps(overlappingPlot));
		assertFalse(plot1.overlaps(adjacentPlot));
	}
	
	@Test
	void testEncompasses() {
		assertTrue(plot1.encompasses(plot2));
		assertFalse(plot2.encompasses(plot1));
	}
	
	@Test
	void testGetters() {
		assertEquals(0, plot1.getX());
		assertEquals(10, plot1.getWidth());
	}

}
