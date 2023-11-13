import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		
		int temp = 15;
		if(temp>30) {
			System.out.println("it is hot outside");
		}
		
		else if(temp>=20 && temp<=30) {
			System.out.println("it is warm outside");
		}
		
		else{
			System.out.println("it is cold outside");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yor are playing a game. Press q or Q to quit");
		String response =scanner.next();
	
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game.");
		}
		
		else{
			System.out.println("You quit the game");
		}
	}
}
