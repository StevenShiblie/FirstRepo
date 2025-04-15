import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {

    private double[][] salesData;

    @Before
    public void setUp() {
        salesData = new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0, 7.0, 8.0, 9.0}
        };
    }

    @Test
    public void testCalculateHolidayBonus() {
        double[] bonuses = HolidayBonus.calculateHolidayBonus(salesData);

        // Column-wise analysis:
        // Column 0: 6.0 (row 2) highest → 5000, 1.0 (row 0) lowest → 1000, 4.0 (row 1) → 2000
        // Column 1: 7.0 (row 2) highest → 5000, 2.0 (row 0) lowest → 1000, 5.0 (row 1) → 2000
        // Column 2: 8.0 (row 2) highest → 5000, 3.0 (row 0) lowest → 1000
        // Column 3: only row 2 → highest by default → 5000

        // Expected bonuses:
        // Row 0: 1000 (col0) + 1000 (col1) + 1000 (col2) = 3000
        // Row 1: 2000 (col0) + 2000 (col1) = 4000
        // Row 2: 5000 (col0) + 5000 (col1) + 5000 (col2) + 5000 (col3) = 20000

        assertArrayEquals(new double[] {3000.0, 4000.0, 20000.0}, bonuses, 0.001);
    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        double total = HolidayBonus.calculateTotalHolidayBonus(salesData);
        assertEquals(27000.0, total, 0.001); // 3000 + 4000 + 20000
    }

}
