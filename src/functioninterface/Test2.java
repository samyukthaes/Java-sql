package functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Test2 {
	public static void main(String[]  args) {
		List < Customers > CustomersDetails = new ArrayList <Customers>();
		
	    CustomersDetails.add(new Customers(12, "Sam",1566787,"sam@gmail.com","Tvm" ));
	    CustomersDetails.add(new Customers(21,"Sona",18765645,"samu@gmail.com","KKM"));
	    CustomersDetails.add(new Customers(13, "Athulya",1887659,"samyu@gmail.com","KKD" ));
	    CustomersDetails.add(new Customers(31, "Sam",1875445,"samuu@gmail.com","Ekm" ));
	    CustomersDetails.add(new Customers(14, "Sona",198675,"sami@gmail.com","ksd" ));
	    CustomersDetails.add(new Customers(41,"Athulya",17675547,"samm@gmail.com","knr"));
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the id");
	    int RegId=sc.nextInt();
	    
	    
	    		List<Customers> c = CustomersDetails.stream()
	    		  .filter(val ->( val.getRegId()) == RegId)
	    		  .collect(Collectors.toList());
	            if(c.isEmpty())
	            	System.out.println("Records not found");
	            else
	            	
		            System.out.println(c);
	}

}
