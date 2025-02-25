/*
 * Class: CMSC203 
 * Instructor: Dr. Ahmed Tarek
 * Description: Create a program that intakes a patient's information in one class. Then that patient's procedure’s information in another class. Then displaying a report that contains the patients information and the list of procedures along with the corresponding information. Then displaying the total cost of all the procedures combined. Then displaying information about the programmer and the assignment.
 * Due: 02/24/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Steven Shiblie
*/
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class PatientDriverApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Variables revolving around patient's info
		String firstName;
		String middleName;
		String lastName;
		String streetAddress;
		String city;
		String state;
		String zipcode;
		String phoneNumber;
		String emergencyContactName;
		String emergencyContactNumber;
		
		System.out.println("Please enter the patient's first name: ");
		firstName = scan.nextLine();
		System.out.println("Please enter the patient's middle name: ");
		middleName = scan.nextLine();
		System.out.println("Please enter the patient's last name: ");
		lastName = scan.nextLine();
		System.out.println("Please enter the patient's street address: ");
		streetAddress = scan.nextLine();
		System.out.println("Please enter the patient's city: ");
		city = scan.nextLine();
		System.out.println("Please enter the patient's state: ");
		state = scan.nextLine();
		System.out.println("Please enter the patient's zipcode: ");
		zipcode = scan.nextLine();
		System.out.println("Please enter the patient's phone number (XXX-XXX-XXXX): ");
		phoneNumber = scan.nextLine();
		System.out.println("Please enter the patient's emergency contact full name: ");
		emergencyContactName = scan.nextLine();
		System.out.println("Please enter the patient's emergency contacts phone number (XXX-XXX-XXXX): ");
		emergencyContactNumber = scan.nextLine();
		
		Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipcode, phoneNumber, emergencyContactName, emergencyContactNumber);
		
		//Variables revolving around patients procedure info
		String procedureName1;
		String procedureName2;
		String procedureName3;
		String procedure1Date;
		String procedure2Date;
		String procedure3Date;
		String procedure1Practitioner;
		String procedure2Practitioner;
		String procedure3Practitioner;
		Double procedure1Cost;
		Double procedure2Cost;
		Double procedure3Cost;
		
		//Procedure 1 info gathering
		System.out.println("What was the first procedure that you got done (procedure name): ");
		procedureName1 = scan.nextLine();
		System.out.println("What was the date of your first procedure (MM/DD/YYYY): ");
		procedure1Date = scan.nextLine();
		System.out.println("What was the name of practitioner that performed this procedure: ");
		procedure1Practitioner = scan.nextLine();
		System.out.println("What was the full cost of this procedure ($XXXX.XX): ");
		procedure1Cost = scan.nextDouble();
		scan.nextLine();
		
		Procedure procedure1 = new Procedure(procedureName1, procedure1Date, procedure1Practitioner, procedure1Cost);
		
		//Procedure 2 info gathering
		System.out.println("What was the second procedure that you got done (procedure name): ");
		procedureName2 = scan.nextLine();
		System.out.println("What was the date of your second procedure (MM/DD/YYYY): ");
		procedure2Date = scan.nextLine();
		System.out.println("What was the name of practitioner that performed this procedure: ");
		procedure2Practitioner = scan.nextLine();
		System.out.println("What was the full cost of this procedure ($XXXX.XX): ");
		procedure2Cost = scan.nextDouble();
		scan.nextLine();
		
		Procedure procedure2 = new Procedure(procedureName2, procedure2Date, procedure2Practitioner, procedure2Cost);

		//Procedure 3 info gathering
		System.out.println("What was the third procedure that you got done (procedure name): ");
		procedureName3 = scan.nextLine();
		System.out.println("What was the date of your third procedure (MM/DD/YYYY): ");
		procedure3Date = scan.nextLine();
		System.out.println("What was the name of practitioner that performed this procedure: ");
		procedure3Practitioner = scan.nextLine();
		System.out.println("What was the full cost of this procedure ($XXXX.XX): ");
		procedure3Cost = scan.nextDouble();
		scan.nextLine();
		
		Procedure procedure3 = new Procedure(procedureName3, procedure3Date, procedure3Practitioner, procedure3Cost);
		
		System.out.println(patient.toString());
		System.out.println("\n\n\t" + procedure1.toString());
		System.out.println("\n\n\t" + procedure2.toString());
		System.out.println("\n\n\t" + procedure3.toString());
		Double totalCharge = procedure1Cost + procedure2Cost + procedure3Cost;
		System.out.println("\n\nTotal Charges: $" + totalCharge);
		System.out.println("\n\nStudent Name: Steven Shiblie\nMC#: M21135829\nDue Date: 02/24/2025");
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
