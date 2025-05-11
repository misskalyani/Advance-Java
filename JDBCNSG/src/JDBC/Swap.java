package JDBC;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=7;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		 a=4;b=6;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
