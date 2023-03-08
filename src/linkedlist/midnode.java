package linkedlist;
import java.util.*;

public class midnode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> myListOfFruits=new LinkedList<String>();
		for(int index=0;index<7;index++) {
			System.out.println("Enter the element("+(index+1)+"):");
			myListOfFruits.add(sc.next());
		}
		System.out.println("size of linked list:"+myListOfFruits.size());
		System.out.println("middle node:"+myListOfFruits.get(myListOfFruits.size()/2));
			
			
		}
	}
	


