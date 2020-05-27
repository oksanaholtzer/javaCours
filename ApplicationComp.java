package singleton;

public class ApplicationComp {

	public static void main(String[] args) {
		Computer comp0 = new Computer(0,"comp0");
		
		Computer comp1= new Computer(1,"comp1");
		Computer comp2 = new Computer(2,"comp2");
		Computer comp3 = new Computer(3,"comp3");
		Computer comp4 = new Computer(4,"comp4");
		Computer comp5 = new Computer(5,"comp5");
		
		Printer print0 = new Printer("0","Epson0");
		Printer print1= new Printer("1","Epson1");
		Printer print2 = new Printer("2","Epson2");
		
		
		PrinterCentralizer printerInstance=PrinterCentralizer.getInstance();
		printerInstance.addPrinter(print0);
		printerInstance.addPrinter(print1);
		printerInstance.addPrinter(print2);
		
		comp0.print();
		comp1.print();
		comp2.print();
		comp3.print();
		comp4.print();
		comp5.print();

	}

}
