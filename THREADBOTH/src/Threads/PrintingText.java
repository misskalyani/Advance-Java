package Threads;

class E extends Thread
{
	String msg;
	int n;
	E(String msg,int n)
	{
		this.msg=msg;
		this.n=n;
		start();
	}
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			try
			{
				sleep(1000);
				System.out.println(msg);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class PrintingText
{
	public static void main(String arg[])
	{
		E ob1 = new E("JOB-1",10);
		E ob2 = new E("JOB-2",20);
		E ob3 = new E("JOB-3",30);
	}
}

