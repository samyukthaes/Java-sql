package functioninterface;

public class product {
	 String productname;
	 int productid;
	 int productprice;
	public product(String productname, int productid, int productprice) {
		super();
		this.productname = productname;
		this.productid = productid;
		this.productprice = productprice;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
	
	

}
