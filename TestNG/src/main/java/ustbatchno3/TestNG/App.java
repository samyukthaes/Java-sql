package ustbatchno3.TestNG;

/**
 * Hello world!
 *
 */
public class App 
{
    private String name;
    private int age;
    private String department;
	public App(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "App [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
    
    
    }

