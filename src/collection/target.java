package collection;

import java.util.*;

public class target {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
	       list.add(5);
	       list.add(10);
	       list.add(15);
	       list.add(20);
	       list.add(25);
	       list.add(30);
	       list.add(35);
	       list.add(40);
	       for(int i=0;i<8;i++) {
	    	   for(int j=1;j<8;j++) {
	    		   if((list.get(i)+list.get(j))==25) {
	    			   int a=list.get(i);
	    			   int b=list.get(j);
	    			   System.out.println(a+"+"+b+"="+25);
	    			   break;
	    		   }
	    		   
	    	   }
	    	   
	}

	}}
