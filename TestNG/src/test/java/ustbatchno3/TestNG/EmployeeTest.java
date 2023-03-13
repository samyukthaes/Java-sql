package ustbatchno3.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class EmployeeTest {
	
	@Test
	public  void testforemployee(){
		
		Employee e=new Employee("Sharath",32,"IT");
		assertEquals(e.getName(),"Sharath");
		
		
		
		
	
   
    }

	
		
	
}
