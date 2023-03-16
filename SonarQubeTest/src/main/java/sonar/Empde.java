package sonar;

public class Empde {

	private String empname;
	private int age;
	private int year;
	private double salary;

	public Empde(String empname, int age, int year, double salary) {
		super();
		this.empname = empname;
		this.age = age;
		this.year = year;
		this.salary = salary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empde [empname=" + empname + ", age=" + age + ", year=" + year + ", salary=" + salary + "]";
	}

}
