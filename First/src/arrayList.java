import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// ArrayList = a resizable array;
		//			   Elements can be added and removed after compilation phase
		//			   store reference data types
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hotdog");
		food.add("hamburger");
		food.add("sandwitch");
		
		food.set(1, "samusa");
		food.remove(1);
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
			
		
		
	
		}
		

	}

}
