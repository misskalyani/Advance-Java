package Threads;

class D extends Thread
{
	D()
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
class Hello
{
	public static void main(String arg[])
	{
		D ob = new D();
	}
}

