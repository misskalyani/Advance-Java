package Threads;

class AA extends Thread
{
	AA()
	{
		start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i = "+i);
		}
	}
}
class Thread1
{
	public static void main(String arg[])
	{
		AA ob = new AA();
	}
}

