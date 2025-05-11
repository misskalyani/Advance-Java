package Threads;

class CA extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Value of i = "+i);
		}
	}
}
class Thread3
{
	public static void main(String arg[])
	{
		CA ob = new CA();
		Thread th=new Thread(ob);
		th.start();
	}
}

