// Create the hash table that will maintain the mobile number and student name. Display 
//the contact list. 

import java.util.*;
public class Q4
{
  public static void main(String[] args)
  {
    Hashtable ht=new Hashtable();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	System.out.println("Enter Student Name:");
    	String name=sc.next();
    	System.out.println("Enter Contact Number:");
    	String ph=sc.next();
    	ht.put(ph, name);
    }
    //System.out.println(ht);
    Enumeration e1=ht.keys();
    while(e1.hasMoreElements())
    {
    	Object key=e1.nextElement();
    	System.out.println(ht.get(key)+"="+key);
}
}
}