import java.util.*;
public class MovieDriver_Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the title of a movie: ");
		String movieTitle = scan.nextLine();
		System.out.println("Please enter the rating for this movie: ");
		String rating = scan.nextLine();
		System.out.println("Please enter the number of tickets sold for this movie: ");
		int ticketsSold = scan.nextInt();

		Movie movieAll = new Movie(movieTitle, rating, ticketsSold);
		System.out.println(movieAll.toString());
		System.out.println("Goodbye");
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
