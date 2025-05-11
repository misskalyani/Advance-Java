import java.util.*;
class A extends Thread
{
	A()
	{
		start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				sleep(1000);
				Random r1=new Random();
				int n=r1.nextInt(100);
				System.out.println("value = "+n);
			}
			catch(Exception e)
			{
			}
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

