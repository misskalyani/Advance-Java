class A extends Thread
{
	A()
	{
		start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i = "+i);
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

