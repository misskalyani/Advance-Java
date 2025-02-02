package List.ArrayList;
import java.util.*;
public class ArrayList3
{
  public static void main(String[] args)
  {    	  
    ArrayList a1=new ArrayList();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int n=sc.nextInt();
    System.out.println("Enter n numbers:");
    for(int i=0;i<n;i++)
    {
    	int num=sc.nextInt();
    	a1.add(num);
    }
    System.out.println(a1);
    Iterator it=a1.iterator();
    System.out.println("Even number = ");
    while(it.hasNext())
    {
    	Object ob=it.next();
    	String s1=ob.toString();
    	//String s1=it.next().toString();
    	int num=Integer.parseInt(s1);
    	if(num%2==0)
    		System.out.println(num);
    }
  }
}