package Runnables.Multithreading;

class E implements Runnable
{
	Thread th;
	E()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("E of i = "+i);
		}
	}
}
class D implements Runnable
{
	Thread th;
	D()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("D of i = "+i);
		}
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("DD of i = "+i);
			}
		}
	}
}
class synchronizeblock
{
	public static void main(String arg[])
	{
		E ob1 = new E();
		D ob2 = new D();

	}
}

