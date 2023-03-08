package functioninterface;

import java.util.*;
import java.util.stream.Collectors;

public class Predicate{
	public static void main(String[] args) {
	
	List<Integer> s=Arrays.asList(26,67,88,45,90);
	
	List<Integer> evennumberlist=s.stream().filter(t->t%2==0).collect(Collectors.toList());
    System.out.println(evennumberlist);
}}

