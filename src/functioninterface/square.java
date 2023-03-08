package functioninterface;

import java.util.*;
import java.util.stream.Collectors;

public class square {
	public static void main(String[] args) {
		List<Integer> squarenumbers=Arrays.asList(2,4,6,8,10);
		List<Integer> squarenumberslist=squarenumbers.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(squarenumberslist);
	}

}
