package List.Vector;
import java.util.*;
class Vectorprint
{
	public static void main(String arg[])
	{
		int i;
		Vector v=new Vector();//by default capacity is 10
		v.add("Hello");
		//v.add(new Integer(5));  //jdk 1.5
		v.add(333);//333-->new Integer(333) //autoboxing
		v.add(5.6);
		v.add(21);
		v.add(32.5);
		v.add(333);
		v.add("Hello");
		v.add(null);
		//Option 1:print using println()
		System.out.println(v);//toString()
		//Option 2:print using for/while  (only for List)
		System.out.print("[");
		for(i=0;i<v.size()-1;i++)
		{
				System.out.print(v.get(i)+",");
		}
		System.out.print(v.get(i));
		System.out.print("]");

		//Option 3:print using advanced for loop i.e.foreach
		for(Object o:v)
		{
			System.out.println(o);
		}
		//Option 3:print using Iterator ::unidirection

		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());

		}

		//Option 5:print using ListIterator ::bidirection (only for list)

		System.out.println("Data in reverse order");
		ListIterator litr=v.listIterator(v.size());//start from end

		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());

		}

		System.out.println("Data in foerword order");
		ListIterator lit=v.listIterator();
		while(lit.hasNext())
		{
			System.out.print(lit.next());

		}
		//Option 6:print using Enumeration(Only for vector And HashTable )
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement());

		}
		
	}
}