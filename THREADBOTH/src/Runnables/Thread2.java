package Runnables;
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i = "+i);
		}
	}
}
class Thread2
{
	public static void main(String arg[])
	{
		B ob = new B();
		Thread th=new Thread(ob);
		th.start();
	}
}

