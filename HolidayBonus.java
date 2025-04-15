/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Create a class that manipulates a two-dimesional ragged array of doubles. That class will create a
 * sale report for retail district #5. Create another class that will calculate the holiday bonuses given a ragged array of doubles
 * which represent the sales for each store in each category. IT will also take in bonus amount for the store with the highest sales
 * in a category, the bonus amount for the store with the lowest sales in a category and the bonus amount for all other stores.
 * Due: 04/14/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Steven Shiblie
*/
public class HolidayBonus {
	public static final double HIGHEST_SALES = 5000.0;
	public static final double LOWEST_SALES = 1000.0;
	public static final double OTHER_SALES = 2000.0;
	
	public static double[] calculateHolidayBonus(double[][] data) {
		double[] bonuses = new double[data.length];
		
		int maxColumns = 0;
		for(double[] row : data) {
			if(row.length > maxColumns) {
				maxColumns = row.length;
			}
		}
		
		for (int col = 0; col < maxColumns; col++) {
            int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
            int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

            for (int row = 0; row < data.length; row++) {
                if (col < data[row].length && data[row][col] > 0) {
                    if (row == highestIndex) {
                        bonuses[row] += HIGHEST_SALES;
                    } else if (row == lowestIndex) {
                        bonuses[row] += LOWEST_SALES;
                    } else {
                        bonuses[row] += OTHER_SALES;
                    }
                }
            }
		}
		return bonuses;
	}
	
	
	public static double calculateTotalHolidayBonus(double[][] data) {
		double total = 0;
		double[] bonuses = calculateHolidayBonus(data);
		for(double bonus : bonuses) {
			total += bonus;
		}
		return total;
	}

}
