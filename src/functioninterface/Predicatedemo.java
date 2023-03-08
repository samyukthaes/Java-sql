package functioninterface;

import java.util.*;

public class Predicatedemo {
	public static void main(String[] args) {
	
	List<Integer> s=Arrays.asList(26,67,88,45,90);
	
	s.stream().filter(t->t%2==0).forEach(t->System.out.println("print even:"+t));

}}
