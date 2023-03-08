package functioninterface;

public class Customers {
	private int RegId;
	private String Name;
	private int Phoneno;
	private String EmailId;
	private String Location;
	public Customers(int regId, String name, int phoneno, String emailId, String location) {
		super();
		RegId = regId;
		Name = name;
		Phoneno = phoneno;
		EmailId = emailId;
		Location = location;
	}
	public int getRegId() {
		return RegId;
	}
	public void setRegId(int regId) {
		RegId = regId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(int phoneno) {
		Phoneno = phoneno;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Customers [RegId=" + RegId + ", Name=" + Name + ", Phoneno=" + Phoneno + ", EmailId=" + EmailId
				+ ", Location=" + Location + "]";
	}
	
	
	
	

}
