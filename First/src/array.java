
public class array {

	public static void main(String[] args) {
		// array = used to store multiple values in a single varibles
		//2D array = array of arrays
		
		String[] car = {"Camaro","corvette","Tesla"};
		
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
		
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars.length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}

	}

}
