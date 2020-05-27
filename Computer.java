package designPatternBulider;

public class Computer { 
	private String serial;
	private String memory;
	private String processor;
	
	private boolean isLaptop;
	private boolean isOnline;
	 private String cardNumber;
	public Computer(String serial, String memory, String processor) {
		super();
		this.serial = serial;
		this.memory = memory;
		this.processor = processor;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public boolean isLaptop() {
		return isLaptop;
	}
	public void setLaptop(boolean isLaptop) {
		this.isLaptop = isLaptop;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	 
	 

}
