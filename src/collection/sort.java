package collection;
import java.util.*;

public class sort{
	public static void  main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
	       list1.add("Apple");
	       list1.add("Mango");
	       list1.add("Orange");
	       list1.add("Grapes");
	       Collections.sort(list1);
	       for(String fruit:list1) {
	    	   System.out.println(fruit);
	       }
	       System.out.println("Sorting numbers");
	       ArrayList<Integer> list2=new ArrayList<Integer>();
	       list2.add(21);
	       list2.add(11);
	       list2.add(51);
	       list2.add(1);
	       Collections.sort(list2);
	       for(Integer number:list2) {
	    	   System.out.println(number);
	       }
	       
	       
	}}
	   
