package runTimePolymorphism;

public class Fruit {
	
	void taste()
	{
		System.out.println("fruits are generally sweet in taste");
	}
}
	
	class Apple extends Fruit
	{
		void taste()
		{
			System.out.println("apples are sweet in taste");
		}
	}
	
	class Strawberry extends Fruit
	{
		void taste()
		{
			System.out.println("srawberries are sweet and sour in taste");
		}
	}

	
