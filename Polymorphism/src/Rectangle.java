
public class Rectangle extends Shape{
	
double base, height;
	
	Rectangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	double area() {
		System.out.print("Area of Rectangle : ");
		return base*height;
	}

}
