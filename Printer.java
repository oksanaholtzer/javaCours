package singleton;

public class Printer {
	private String id ;
	private String brand;
	public Printer(String id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String print () {
		return this.brand;
	}

}
