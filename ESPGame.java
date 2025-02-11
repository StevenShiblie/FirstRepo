/*
 * Class: CMSC203 
 * Instructor: Dr. Ahmed Tarek
 * Description: Player selects how many colors they want to be displayed. Then the program randomly selects a color and the player has to try and guess the color. The color guessing repeats 2 more times for a total of 3 rounds. The game then asks if they want to continue the game. If the player chooses yes, the program shows the options again and repeats steps 1 and 2. If the player says no or chooses option 4 the program then asks for the player to enter information then terminates.
 * Due: 02/10/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Steven Shiblie
*/

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class ESPGame {

	public static void main(String[] args) throws java.io.IOException{
		//Variables
		String OPTION1 = "	1- read and display on the screen first 16 names of colors from a file colors.txt, so the player can select on of the names of colors.";
		String OPTION2 = "	2- read and display on the screen first 10 names of colors from a file colors.txt, so the player can select on of the names of colors.";
		String OPTION3 = "	3- read and display on the screen first 5 names of colors from a file colors.txt, so the player can select on of the names of colors.";
		String OPTION4 = "	4- Exit from the program.";
		String name = null;
		String description = null;
		String dueDate = null;
		String userFileName;
		String guess;
		String realColor;
		String answer;

		int temp = 0;
		int optionChoice;
		int roundNum = 1;
		int randNum;
		int winCounter = 0;

		//Introduction Display
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.println("Welcome to ESP - extrasensory perception!");
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Would you please choose one of the 4 options from the menu: ");
			System.out.println("");
			System.out.println(OPTION1 + "\n" + OPTION2 + "\n" + OPTION3 + "\n" + OPTION4);
			System.out.println("Enter the option number: ");
			optionChoice = scan.nextInt();

			if(optionChoice == 1)
				temp = 16;
			else if(optionChoice == 2)
				temp = 10;
			else if(optionChoice == 3)
				temp = 5;
			else
				break;

			System.out.println("Enter the filename: ");
			userFileName = scan.next();
			System.out.println("There are " + temp + " colors from a file:");
			File f = new File(userFileName);
			Scanner fi = new Scanner(f);
			for(int i = 1; i <= temp; i++)
				System.out.println(i + " " + fi.nextLine());
			fi.close();
			while(roundNum <=3) {
				Random rand = new Random();
				randNum = rand.nextInt(temp)+1;
				switch(randNum) {
				case 1:
					realColor = "Black";
					break;
				case 2:
					realColor = "White";
					break;
				case 3:
					realColor = "Gray";
					break;
				case 4:
					realColor = "Silver";
					break;
				case 5:
					realColor = "Maroon";
					break;
				case 6:
					realColor = "Red";
					break;
				case 7:
					realColor = "Purple";
					break;
				case 8:
					realColor = "Fuchsia";
					break;
				case 9:
					realColor = "Green";
					break;
				case 10:
					realColor = "Lime";
					break;
				case 11:
					realColor = "Olive";
					break;
				case 12:
					realColor = "Yellow";
					break;
				case 13:
					realColor = "Navy";
					break;
				case 14:
					realColor = "Blue";
					break;
				case 15:
					realColor = "Teal";
					break;
				default:
					realColor = "Aqua";
				}
				System.out.println(" ");
				System.out.println("Round " + roundNum);
				System.out.println("\nI am thinking of a color.");
				System.out.println("It is a color in the list above.");
				System.out.println("Enter your guess(color name): ");
				guess = scan.next();
				if(guess.equalsIgnoreCase(realColor)) 
					winCounter += 1;
				System.out.print("\nI was thinking of " + realColor + ".");
				roundNum++;
			}
			System.out.println("\nGame Over");
			System.out.println("You guessed " + winCounter + " out of 3 colors correctly.");
			System.out.println("\nWould you like to replay the game? Type Yes/No");
			answer = scan.next();
			roundNum = 1;
			winCounter = 0;
		}
		while(answer.equalsIgnoreCase("Yes"));

		
		scan.nextLine();
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("Describe yourself: ");
		description = scan.nextLine();
		System.out.println("Due Date (MM/DD/YY): ");
		dueDate = scan.nextLine();
		System.out.println("Username: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Date: " + dueDate);
		
		PrintWriter pw = new PrintWriter("EspGameResults.txt");
		pw.println("Game Over");
		pw.println("You guessed " + winCounter + " out of 3 colors correctly.");
		pw.println("Due Date: " + dueDate);
		pw.println("Username: " + name);
		pw.println("User Description: " + description);
		pw.println("Date: 02/10");
		pw.close();

		System.exit(0);
	}

}
