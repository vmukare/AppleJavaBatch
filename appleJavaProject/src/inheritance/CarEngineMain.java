package inheritance;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Engine e1 = new Engine();
		e1.setCylinder(4);
		e1.setRpm("1000rpm");
		e1.setStroke(4);
		e1.setTorque(86);
		
		Car c1 = new Car();
		c1.setCompany("tata");
		c1.setPrice(950000);
		c1.setColor("blue");
		c1.setE(e1);
		
		System.out.println("-----information of car-------");
		System.out.println("name: "+c1.getCompany());
		System.out.println("price: "+c1.getPrice());
		System.out.println("color: "+c1.getColor());
		
		System.out.println("------------engine specification--------------");
		System.out.println("cylinder: "+e1.getCylinder());
		System.out.println("torque: "+e1.getTorque()+"nm");
		System.out.println("stroke: "+e1.getStroke());
		System.out.println();
		*/
		Engine1 e = new Engine1(4, 86, "1000rpm", "zest");
		Car1 c1 = new Car1(101, "tata", "grey", 950000, e);
		
		System.out.println(c1);

	}

}
