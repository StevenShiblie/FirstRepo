import java.util.Scanner;
public class MovieDriver_Task2 {

	public static void main(String[] args) {
		String reply;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the title of a movie: ");
			String movieTitle = scan.nextLine();
			System.out.println("Please enter the rating for this movie: ");
			String rating = scan.nextLine();
			System.out.println("Please enter the number of tickets sold for this movie: ");
			int ticketsSold = scan.nextInt();

			Movie movieAll = new Movie(movieTitle, rating, ticketsSold);
			System.out.println(movieAll.toString());
			System.out.println("Do you want to enter another? (yes or no): ");
			reply = scan.next();
		}
		while(reply.equalsIgnoreCase("yes"));
		System.out.println("Goodbye");
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
