package functioninterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Sam","Sona","Sam","Athulya");
		List<String> repnames=names.stream().filter(p->Collections.frequency(names,p)>1).collect(Collectors.toList());
		System.out.println(repnames);
	}

}
