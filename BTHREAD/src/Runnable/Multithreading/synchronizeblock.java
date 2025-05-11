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
			System.out.println("A of i = "+i);
		}
	}
}
class B implements Runnable
{
	Thread th;
	B()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("B of i = "+i);
		}
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("BB of i = "+i);
			}
		}
	}
}
class MDemo
{
	public static void main(String arg[])
	{
		A ob1 = new A();
		B ob2 = new B();

	}
}

