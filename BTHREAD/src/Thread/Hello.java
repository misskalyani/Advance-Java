class A extends Thread
{
	A()
	{
		start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello Java");
		}
	}
}
class MDemo
{
	public static void main(String arg[])
	{
		A ob = new A();
	}
}

