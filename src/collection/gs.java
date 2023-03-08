package collection;
import java.util.*;

public class gs {
	public static void  main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	       list.add("Apple");
	       list.add("Mango");
	       list.add("Orange");
	       list.add("Grapes");
	       System.out.println("Returing element:"+list.get(1));
	       list.set(1,"Dates");
	       for(String fruit:list) {
	    	   System.out.println(fruit);
	       }
	       
	}}