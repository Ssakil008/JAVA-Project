
public class Pizza {
	
	
	String bread;
	String sauce;
	String cheese;
	String topping;

	void pizza(){
		
	}
	
	void pizza(String bread){
		
		this.bread = bread;
		
	}
	
	void pizza(String bread, String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
		
	}
	
	void pizza(String bread, String sauce, String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	
	}
	void pizza(String bread, String sauce, String cheese, String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}
