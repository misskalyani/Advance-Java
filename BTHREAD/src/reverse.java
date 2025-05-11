//b) Write a program in which thread sleep for 6 sec in the loop in reverse order from 100 to 1 and change the name of thread.
class thread extends Thread
{
	thread(String nm)
	{
		super(nm);
		start();
	}
	public void run()
	{
		for(int i=100; i>=1;i--)
		{
			System.out.println(getName() +" = "+i);
			try
			{
				Thread.sleep(6000);
			}catch(Exception e)
			{
			}
		}
	}
}
class Mddemo
{
	public static void main(String arg[])
	{
		thread th=new thread("sleep");
	}
}
