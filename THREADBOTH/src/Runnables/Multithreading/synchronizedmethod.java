package Runnables.Multithreading;

class F implements Runnable
{
	synchronized public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("F of i = "+i);
		}
	}
}
class I implements Runnable
{
	synchronized public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I of i = "+i);
		}
	}
}
class J implements Runnable
{
	synchronized public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("J of i = "+i);
		}
	}
}
class synchronizedmethod
{
	public static void main(String arg[])
	{
		F ob1 = new F();
		I ob2 = new I();
		J ob3 = new J();
		
		Thread th1 =new Thread(ob1);
		Thread th2 =new Thread(ob2);
		Thread th3 =new Thread(ob3);	
		th1.start();
		th2.start();
		th3.start();
	}
}

