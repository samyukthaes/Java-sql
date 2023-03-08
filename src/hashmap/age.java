package hashmap;
import java.util.*;

public class age {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("sharath", 32);
		map.put("ravi", 35);
		map.put("dave", 40);
		
		int age=map.get("sharath");
		System.out.println("the age of sharath:"+age);
		
		boolean contains=map.containsKey("ravi");
		System.out.println("Hashmap contains"+contains);
		
		map.remove("ravi");
		System.out.println("ravi is removed from the hashmap");
		
		
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
}
