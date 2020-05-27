package designPatternBulider;

public class ComputerBuilder {
	Computer comp= null;
	
	public ComputerBuilder (String serial, String memory, String processor) {
		this.comp= new Computer( serial, memory, processor);
	}
	
	public void withGraphicCard (String card) {
		this.comp.setCardNumber(card);
	}
	
	public void isLapTop (boolean isLaptop) {
		this.comp.setLaptop(isLaptop);
	}
	
	public Computer build () {
		System.out.println (" Computer serial  "+comp.getSerial()+ "computor memory "+ comp.getMemory() + "comp is laptop " + comp.isLaptop());
		return comp;
	}

}
