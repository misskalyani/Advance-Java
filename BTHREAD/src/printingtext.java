	/*a) Program to define a thread for printing text on output screen for ‘n’ number of times. Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor. 
	Example: 
		i. First thread prints “COVID19” 10 times. 
		ii. Second thread prints “LOCKDOWN2020” 20 times 
		iii. Third thread prints “VACCINATED2021” 30 times */
class printingtext  extends Thread 
{
	int n;
	String msg;
	printingtext(String msg,int n)
	{
		this.msg=msg;
		this.n=n;
		start();
	}	
		public void run()
		{
		  try
		  {
			  for(int i=1;i<=n;i++)
			  {
				  System.out.println(msg);
			  }	
			 }
			 catch(Exception e)
			 {
			 
			 }
		}
	
}
class Thdemo 
{
	public static void main(String arg[])
	{
		printingtext  ob1 = new printingtext ("COVID19",10);
		printingtext  ob2 = new printingtext ("LOCKDOWN2020" ,20);
		printingtext  ob3 = new printingtext ("VACCINATED2021" ,30);
	}
}
