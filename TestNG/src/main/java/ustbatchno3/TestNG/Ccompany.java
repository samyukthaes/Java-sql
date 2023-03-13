package ustbatchno3.TestNG;

public class Ccompany {
	private String City;
	private int price_with;
	private int price_without;
	public Ccompany(String city, int price_with, int price_without) {
		super();
		City = city;
		this.price_with = price_with;
		this.price_without = price_without;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPrice_with() {
		return price_with;
	}
	public void setPrice_with(int price_with) {
		this.price_with = price_with;
	}
	public int getPrice_without() {
		return price_without;
	}
	public void setPrice_without(int price_without) {
		this.price_without = price_without;
	}
	@Override
	public String toString() {
		return "Ccompany [City=" + City + ", price_with=" + price_with + ", price_without=" + price_without + "]";
	}
	
	
	

}
