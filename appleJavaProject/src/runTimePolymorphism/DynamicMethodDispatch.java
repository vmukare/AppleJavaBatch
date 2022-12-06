package runTimePolymorphism;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f1 = new Fruit();
		f1.taste();
		
	    f1 = new Apple();
	    f1.taste();
	    
	    f1 = new Strawberry();
	    f1.taste();

	}

}
