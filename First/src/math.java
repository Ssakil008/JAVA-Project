import java.util.Scanner;

public class math {

	public static void main(String[] args) {
	
    double x = 3.14;
    double y = -10;
    
    double max = Math.max (x, y);
    double min = Math.min(x, y);
    double abs = Math.abs(y);
    double sqrt = Math.sqrt(y);
    double floor = Math.floor(x);
    double ceiling = Math.ceil(x);
    double round = Math.round(x);
    
    
    System.out.println(max);
    System.out.println(min);
    System.out.println(abs);
    System.out.println(sqrt);
    System.out.println(floor);
    System.out.println(ceiling);
    System.out.println(round);
    
    double base, perpendiculer, hypotenuse;
    
    Scanner scanner = new Scanner(System.in); 
    
    System.out.println("Enter side Base : ");
    base = scanner.nextDouble();
    
    System.out.println("Enter side Perpendicular : ");
    perpendiculer = scanner.nextDouble();
    
    hypotenuse = Math.sqrt((base*base)+(perpendiculer*perpendiculer));
    
    System.out.println("The hypotenuse is : "+hypotenuse);
    
    scanner.close();
    
    
	}

}
