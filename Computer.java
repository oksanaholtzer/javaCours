package singleton;

public class Computer {
	private int id;
	private String name;
	private PrinterCentralizer printerCenter =PrinterCentralizer.getInstance();
	
	
	
	
	
	
	public PrinterCentralizer getPrinterCenter() {
		return printerCenter;
	}
	public void setPrinterCenter(PrinterCentralizer printerCenter) {
		this.printerCenter = printerCenter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Computer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void print( ) {
		
		System.out.println ("Computer "+this.name + " print on the printer " + printerCenter.getPrinter().print());
	}
}
