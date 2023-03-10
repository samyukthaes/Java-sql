package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.junit.jupiter.api.Test;


public class WordCTest {
	
	@Test
	public void freqtest() {
		List<String> s = Arrays.asList("sasi","abu","kodiyan");
		Map<String,Long> expected = new HashMap<String,Long>();
		expected.put("sasi", (long) 1);
		expected.put("abu",(long) 1);
		expected.put("kodiyan",(long) 1);
		
		Map<String,Long> actual = WordC.count(s);
		assertEquals(expected,actual);
	}
}