class A extends Thread
{
	String msg;
	int n;
	A(String msg,int n)
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
class MDemo
{
	public static void main(String arg[])
	{
		A ob1 = new A("JOB-1",10);
		A ob2 = new A("JOB-2",20);
		A ob3 = new A("JOB-3",30);
	}
}

