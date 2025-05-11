class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("A of i = "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("B of i = "+i);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("C of i = "+i);
		}
	}
}
class MDemo
{
	public static void main(String arg[])
	{
		A ob1 = new A();
		B ob2 = new B();
		C ob3 = new C();
		ob1.start();
		ob2.start();
		ob3.start();
	}
}

