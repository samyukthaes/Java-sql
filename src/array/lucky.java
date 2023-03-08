package array;
import  java.util.Scanner;


public class lucky {
	public static void main(String[] args) {
		System.out.println("enter the elements of array");
		Scanner sc = new Scanner(System.in);
		int unknown=sc.nextInt();
		int digit;
		boolean digit3present=false,digit6present=false,digit9present=false;
		while(unknown>0) {
			digit=unknown%10;
			
			if(digit==3) {
				digit3present=true;
			}
			if(digit==6) {
				digit6present=true;
			}
			if(digit==9) {
				digit9present=true;
			}
		unknown/=10;
		
		}
		if(digit3present && digit6present && digit9present) {
			System.out.println("lucky number");
			}
		else
			System.out.println("unlucky number");
	}
	

}
