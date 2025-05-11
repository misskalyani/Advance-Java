package Slip;
//Write a Java Program to create the hash table that will maintain the mobile number and 
//student name. Display the details of student using Enumeration interface. 
import java.util.*;
public class s5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(76663885, "Om");
		ht.put(12345677, "Om");
		ht.put(90756895, "Om");
		ht.put(65345678, "Om");
		ht.put(90434555, "Om");
		
		Enumeration e=ht.keys();
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println("Key   = "+o);
			System.out.println("Value = "+ht.get(o));
		}
	}

}
