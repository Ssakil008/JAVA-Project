//abstraction is the porcess of hiding the implementation details and showing only the functionality to the user.
//An interface is a collection of abstract methods.
public class Test {

	public static void main(String[] args) {
		MobileUser mu; //reference variable
		
		mu = new Rahim();
		mu.sendMassage();
		mu.call();
		
		mu = new Karim();
		mu.sendMassage();
	}
}