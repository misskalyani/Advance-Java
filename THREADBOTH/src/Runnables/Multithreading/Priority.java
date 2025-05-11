package Runnables.Multithreading;

class A implements Runnable
{
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
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("B of i = "+i);
		}
	}
}
class C implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("C of i = "+i);
		}
	}
}
class Priority
{
	public static void main(String arg[])
	{
		A ob1 = new A();
		B ob2 = new B();
		C ob3 = new C();
		
		Thread th1 =new Thread(ob1);
		Thread th2 =new Thread(ob2);
		Thread th3 =new Thread(ob3);	
		
		System.out.println("Priority of th1 = "+th1.getPriority());
		th1.setPriority(7);//th1.setPriority(Thread.MIN_PRIORITY)
		th2.setPriority(1);//th1.setPriority(Thread.MAX_PRIORITY)
		th3.setPriority(5);//th1.setPriority(Thread.NORM_PRIORITY)
		th1.start();
		th2.start();
		th3.start();
	}
}

