package List;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> customer = new HashMap<Integer, String>();
		
		customer.put(101, "Ssakil");
		customer.put(102, "Tahin");
		customer.put(103, "Shahin");
		
		System.out.println(customer.get(101));
		System.out.println(customer.get(102));
		System.out.println(customer.get(103));
		

	}

}
