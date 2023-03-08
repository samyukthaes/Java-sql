package collection;
import java.util.*;

public class arraylist {
	public static void  main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	       list.add("Apple");
	       list.add("Mango");
	       list.add("Orange");
	       list.add("Grapes");
	       Iterator itr=list.iterator();
	       while(itr.hasNext()) {
	    	   System.out.println(itr.next());
	       }
	       
	       
				
		
		
	}

}
