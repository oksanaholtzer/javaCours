package designPatternBulider;

public class ApplicationBuilderPattern {

	public static void main(String[] args) {
		ComputerBuilder comp1 =new ComputerBuilder ("123456", "450", "pc1");
		comp1.isLapTop(true);
		
		comp1.withGraphicCard("card1");
		comp1.build ();
		
		ComputerBuilder comp2 =new ComputerBuilder ("213", "200", "pc2");
		comp2.isLapTop(false);
		
		comp2.withGraphicCard("card2");
		comp2.build ();
	}

}
