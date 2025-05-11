package Threads;

class AN extends Thread
{
	Thread th;
	AN()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i = "+i);
		}
	}
}
class Thread4
{
	public static void main(String arg[])
	{
		AN ob = new AN();
	}
}

