package singleton;

import java.util.ArrayList;
import java.util.List;

public  class PrinterCentralizer {
	private static PrinterCentralizer printerCentralizer;
	private static List<Printer> printers;
	public static int  count=0;
	
	private PrinterCentralizer() {
		printers=new ArrayList <Printer>();
	}
	
	public  static PrinterCentralizer getInstance() {
		return printerCentralizer=new PrinterCentralizer();
	}
	
	public static void addPrinter (Printer printer) {
		printers.add(printer);
	}

	public static List<Printer> getPrinters() {
		return printers;
	}
	
	public static Printer getPrinter () {
		
		
		if (count==printers.size()) {
			
			count=0;
		}
		return printers.get(count++);
	}

	
	

}
