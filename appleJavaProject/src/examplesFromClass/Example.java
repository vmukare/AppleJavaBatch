package examplesFromClass;

public class Example {
	public static void main(String[] args) {
		int x,y,z;
		x=0;
		y=1;
		x=y=z=8;
		System.out.println(x + " "+ y +" "+ z);
		System.out.println(x++ - y*2 + ++z - --y);// 8-8*2+9-7 =8-16+2
		System.out.println(x + " "+ y +" "+ z);
		
		//c=x++;   c=8  x++ 9
		//
	
	}

}
