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

import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		ArrayList<double[]> rows = new ArrayList<>();
		
		while(scan.hasNextLine()) {
			String[] line = scan.nextLine().trim().split(" ");
			double[] row = new double[line.length];
			for(int i = 0; i < line.length; i++) {
				row[i] = Double.parseDouble(line[i]);
			}
			rows.add(row);
		}
		scan.close();
		return rows.toArray(new double[0][]);
	}
	
	public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        for (double[] row : data) {
            for (int i = 0; i < row.length; i++) {
                writer.print(row[i]);
                if (i < row.length - 1) writer.print(" ");
            }
            writer.println();
        }
        writer.close();
    }
	
	public static double getTotal(double[][] data) {
        double total = 0;
        for (double[] row : data) {
            for (double val : row) {
                total += val;
            }
        }
        return total;
    }
	
	public static double getAverage(double[][] data) {
        int count = 0;
        double total = 0;
        for (double[] row : data) {
            for (double val : row) {
                total += val;
                count++;
            }
        }
        return total / count;
    }
	
	public static double getRowTotal(double[][] data, int row) {
        double total = 0;
        for (double val : data[row]) {
            total += val;
        }
        return total;
    }
	
	public static double getColumnTotal(double[][] data, int col) {
        double total = 0;
        for (double[] row : data) {
            if (col < row.length) total += row[col];
        }
        return total;
    }
	
	public static double getHighestInRow(double[][] data, int row) {
        double max = data[row][0];
        for (double val : data[row]) {
            if (val > max) max = val;
        }
        return max;
    }
	
	public static int getHighestInRowIndex(double[][] data, int row) {
        int index = 0;
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] > data[row][index]) index = i;
        }
        return index;
    }
	
	public static double getLowestInRow(double[][] data, int row) {
        double min = data[row][0];
        for (double val : data[row]) {
            if (val < min) min = val;
        }
        return min;
    }
	
	public static int getLowestInRowIndex(double[][] data, int row) {
        int index = 0;
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] < data[row][index]) index = i;
        }
        return index;
    }
	
	public static double getHighestInColumn(double[][] data, int col) {
        double max = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] > max) max = row[col];
        }
        return max;
    }
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
        int index = -1;
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > max) {
                max = data[i][col];
                index = i;
            }
        }
        return index;
    }
	
	public static double getLowestInColumn(double[][] data, int col) {
        double min = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (col < row.length && row[col] < min) min = row[col];
        }
        return min;
    }
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
        int index = -1;
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] < min) {
                min = data[i][col];
                index = i;
            }
        }
        return index;
    }
	
	public static double getHighestInArray(double[][] data) {
        double max = data[0][0];
        for (double[] row : data) {
            for (double val : row) {
                if (val > max) max = val;
            }
        }
        return max;
    }
	
	public static double getLowestInArray(double[][] data) {
        double min = data[0][0];
        for (double[] row : data) {
            for (double val : row) {
                if (val < min) min = val;
            }
        }
        return min;
    }

}
