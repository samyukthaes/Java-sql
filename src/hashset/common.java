package hashset;
import java.io.*;
import java.util.*;
class common {
	private static void FindCommonElemet(Integer[] arr1,
										Integer[] arr2)
	{
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					// add common elements
					set.add(arr1[i]);
					break;
				}
			}
		}
		for (Integer i : set) {
			System.out.print(i + " ");
		}
	}

	// main method
	public static void main(String[] args)
	{

		// create Array 1
		Integer[] arr1
			= {12,5,7,43 };

		// create Array 2
		 Integer[] arr2 = {13,12,7,88 };

		
		System.out.print("Common Elements: ");

		// Find the common elements
		FindCommonElemet(arr1, arr2);
	}

	
}

