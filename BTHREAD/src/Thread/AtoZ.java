import java.util.*;
class A extends Thread
{
	A()
	{
		start();
	}
	public void run()
	{
		for(char ch='A'; ch<='Z'; ch++)
		{
			try
			{
				sleep(5000);
				System.out.println("value = "+ch);
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

