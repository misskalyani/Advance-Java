package Runnables;
class A implements Runnable
{
	Thread th;
	A()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i = "+i);
		}
	}
}
class Thread1
{
	public static void main(String arg[])
	{
		A ob = new A();
	}
}

