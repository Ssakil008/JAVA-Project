package List;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> fruitnames = new HashSet<String>();
		
		fruitnames.add("Apple");
		fruitnames.add("Pineapple");
		fruitnames.add("Orange");
		fruitnames.add("Banana");
		fruitnames.add("Mango");
		
		System.out.println(fruitnames);
		System.out.println(fruitnames.size());

	}

}
