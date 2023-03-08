package functioninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {
		
		
		
        List < Hotel > HotelDetails = new ArrayList <Hotel>();
		
	    HotelDetails.add(new Hotel( "Zam Zam",3200,"Tvm" ));
	    HotelDetails.add(new Hotel("Halais",3500,"KKM"));
	    HotelDetails.add(new Hotel( "Sharavana Bhavan",2000,"KKD" ));
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the budget limit:");
	    int limit=sc.nextInt();
	    
	    List<Hotel> h=HotelDetails.stream().filter(val->(val.getBudget())<limit).collect(Collectors.toList());   
	    System.out.println(h);
	    
	    
	}

}
