package abstraction;

public class ElectronicsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s = new SmartPhone();
		
		s.setWeight(150);
		s.setColor("white");
		s.setPrice(26000);
		
		s.display();
		
		s.electricityConsumption();
		s.features();
		s.processor();
		s.rating();
		s.semiConductor();
	}

}
