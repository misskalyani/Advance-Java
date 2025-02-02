import java.util.*;

import javax.swing.RowFilter.Entry;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> ht = new Hashtable<String,String>();
		int n;
		String c,nm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit :: ");
		n=sc.nextInt();
		while(true)
		{
			System.out.println("Enter Name :: ");
			nm=sc.next();
			System.out.println("Enter Mobile Number :: ");
			c=sc.next();
			if(ht.containsKey(c))
			{
				System.out.println("Duplicate Key Not Allowed");
			}
			else
			{
				ht.put(c, nm);
				n--;
			}	
			if(n==0)
				break;
		}
		System.out.println("Name \t \tContact ");
		Set keys=ht.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext())
		{
			Object k=it.next();
			Object v=ht.get(k);
			//System.out.println("Name :"+v+"Contact :"+k);
			System.out.println(v+"\t\t"+k);
		}
	
	System.out.println("Enter Mobile number to the search ");
	String s=sc.next();
	boolean ans =ht.containsKey(s);
	if(ans==true)
	{
		System.out.println("Namec :"+ht.get(s));
	}
	else
		System.out.println("Mobile Number Not Found");
		
	/*System.out.println("Enter Mobile number to the search ");
	String s=sc.next();	
	Set entries=ht.entrySet();
	Iterator it=entries.iterator();
	while(it.hasNext())
	{
		Entry e=(Entry)it.next();
		//System.out.println("Mobile Number :: "+e.getKey());
		//System.out.println("Name :: "+e.getValue());
		String k=(String)e.getKey();
		String v=(String)e.getValue();
		if(v.equals(s))
		{
			System.out.println("Mobile Number :: "+k);
			break;
		}*/
	}
}
