package Runnables.Multithreading;

class M implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("M of i = "+i);
		}
	}
}
class N implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("N of i = "+i);
		}
	}
}
class O implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("O of i = "+i);
		}
	}
}
class Thread1
{
	public static void main(String arg[])
	{
		M ob1 = new M();
		N ob2 = new N();
		O ob3 = new O();
		
		Thread th1 =new Thread(ob1);
		Thread th2 =new Thread(ob2);
		Thread th3 =new Thread(ob3);	
		th1.start();
		th2.start();
		th3.start();
	}
}

