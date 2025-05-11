package Threads;

import java.util.*;
class  MBAA extends Thread
{
	MBAA()
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
class Randomnum
{
	public static void main(String arg[])
	{
		MBAA ob = new MBAA();
	}
}

