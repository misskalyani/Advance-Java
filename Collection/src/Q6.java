//b) Write a program to sort HashMap by keys and display the details before sorting and after sorting.
import java.io.*;
import java.util.*;
public class Q6
{
  public static void main(String[] args)throws Exception
  {
	  HashMap ht=new HashMap();
	  ht.put("mh", "maharashtra");
	  ht.put("rj", "rajastan");
	  ht.put("gj", "gujrat");
	  ht.put("mp", "madhya pradesh");
	System.out.println("Original Hashmap="+ht);
	Set t1=ht.keySet();
	System.out.println("Keys="+t1);
	
	TreeSet t2=new TreeSet(t1);
	Iterator it=t2.iterator();
	while(it.hasNext())
	{
		Object k=it.next();
		System.out.println(k+"="+ht.get(k));
	}
}
}