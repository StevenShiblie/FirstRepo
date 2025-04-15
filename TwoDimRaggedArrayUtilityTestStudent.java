import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {
	
	private double[][] testData;

	@BeforeEach
	void setUp() throws Exception {
		testData = new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0, 7.0, 8.0, 9.0}
        };
	}

	@Test
    public void testGetTotal() {
        assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(testData), 0.001);
    }

    @Test
    public void testGetAverage() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(testData), 0.001);
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(testData, 0), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(testData, 1), 0.001);
    }

    @Test
    public void testGetColumnTotal() {
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(testData, 0), 0.001); // 1 + 4 + 6
        assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(testData, 1), 0.001); // 2 + 5 + 7
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(testData, 2), 0.001); // 3 + 8
        assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(testData, 3), 0.001);  // only row 2
    }

    @Test
    public void testGetHighestInRow() {
        assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(testData, 0), 0.001);
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(testData, 1), 0.001);
    }

    @Test
    public void testGetHighestInRowIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(testData, 0));
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(testData, 1));
    }

    @Test
    public void testGetLowestInRow() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(testData, 0), 0.001);
        assertEquals(4.0, TwoDimRaggedArrayUtility.getLowestInRow(testData, 1), 0.001);
    }

    @Test
    public void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(testData, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(testData, 1));
    }

    @Test
    public void testGetHighestInColumn() {
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(testData, 0), 0.001);
        assertEquals(7.0, TwoDimRaggedArrayUtility.getHighestInColumn(testData, 1), 0.001);
    }

    @Test
    public void testGetHighestInColumnIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(testData, 0));
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(testData, 1));
    }

    @Test
    public void testGetLowestInColumn() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(testData, 0), 0.001);
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(testData, 1), 0.001);
    }

    @Test
    public void testGetLowestInColumnIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(testData, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(testData, 1));
    }

    @Test
    public void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(testData), 0.001);
    }

    @Test
    public void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(testData), 0.001);
    }


}
