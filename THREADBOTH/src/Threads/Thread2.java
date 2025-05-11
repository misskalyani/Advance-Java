package Threads;

class BA extends Thread
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
		BA ob = new BA();
		ob.start();
	}
}

