package functioninterface;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;



public class Main {
	public static void main(String[] args) {
		
	List < Employee > EmployeeDetails = new ArrayList <Employee>();
	
    EmployeeDetails.add(new Employee( "Sam",1,55000 ));
    EmployeeDetails.add(new Employee( "Sona",1,102000 ));
    EmployeeDetails.add(new Employee( "Athulya",1,45000 ));
    
    List<Employee> e=EmployeeDetails.stream().filter(Employee->Employee.getSalary()<=200000)
    		.sorted(Comparator.comparing(Employee::getSalary).reversed())
    		.peek(Employee->{
    			double salary=Employee.getSalary();
    			if(salary>100000) {
    				Employee.setSalary(salary*1.05);
    			}else if(salary>50000) {
    				Employee.setSalary(salary*1.1);
    			}
    		})
    		.collect(Collectors.toList());
     System.out.println(e);
    				   
}}
