package functioninterface;

import java.util.*;
import java.util.stream.Collectors;

public class City {
	public static void main(String[] args) {
		List<String> c=Arrays.asList("Trivandrum","Kazhakoottam","thrisuur","Kulathoor");
		List<String> cityname=c.stream().filter(t->t.toLowerCase().startsWith("t")).collect(Collectors.toList());
		System.out.println(cityname);
	}

}
