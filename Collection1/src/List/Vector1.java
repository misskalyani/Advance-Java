package List;

//capacity
//capacity gets doubled automatically once fulled
//Vector is legacy class <<legacy means oldest parmpara
//All Methods Are Synchronized
import java.util.*;
public class Vector1
{
	public static void main(String arg[])
	{
		Vector v=new Vector(5);//Capacity =5
		
		System.out.println("Intial Size = "+v.size());//0
		System.out.println("Empty = "+v.isEmpty());//true
		System.out.println("Capacity  = "+v.capacity());//5

		System.out.println(v);//[]

		v.add("Hello");
		v.add(5);
		v.add(333);
		v.add(5.6f);
		v.add(21);
		v.add(32.5f);
		v.add(333);
		v.add("Hello");
		v.add(null);
	
		System.out.println("Intial Size = "+v.size());
		System.out.println("Empty = "+v.isEmpty());
		System.out.println("Capacity  = "+v.capacity());//capacity automatically double increase hote

		System.out.println(v);

		

	}

}