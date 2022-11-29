package forLooping;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2 , power = 3 , power1=1;//2*2*2
		for(int i = 1 ; i <= power; i++) {
			power1 = base * power1;
		}
 System.out.println(power1);
	}

}
