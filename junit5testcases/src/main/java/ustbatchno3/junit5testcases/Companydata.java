package ustbatchno3.junit5testcases;

public class Companydata {
	int count;
	String item;
	double totalprice;
	public Companydata(int count, String item, double totalprice) {
		super();
		this.count = count;
		this.item = item;
		this.totalprice = totalprice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "Companydata [count=" + count + ", item=" + item + ", totalprice=" + totalprice + "]";
	}
	
	
	
	
	
	

}
