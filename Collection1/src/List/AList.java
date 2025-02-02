package List;

//Some Special Method in List
//void add(int ,object) <<here first parameter is index
//Object remove(int)   <<here parameter is index;overloaded methods of remove()
//Object get(index)
//void set(int,object) <<update sathi use
//int indexOf(Object)
//int lastIndexOf(Object)


//boolean remove()<<datawise
//Object reomve(int)<<indexwise only for list





//addAll(),removeAll(),containsAll()
import java.util.*;
public class AList
{
	public static void main(String arg[])
	{
		ArrayList a1=new ArrayList();
		a1.add("Hello");
		a1.add(5);
		a1.add(333);
		a1.add(5.6f);
		a1.add(21);
		a1.add(32.5f);
		a1.add(333);
		a1.add("Hello");
		a1.add(null);
		System.out.println(a1);
		
		System.out.println("Index = "+a1.get(3));
		
		a1.set(2,"php");		//update
		System.out.println(a1);

		a1.add(2,"TCs");	//Insert
		System.out.println(a1);
		
		//a1.remove(111)		//runtime exception<<ArrayIndexOutOfBound Exception

		Object o;
		o=a1.remove(1);
		System.out.println("After Deletion \n = "+a1);
		System.out.println("Deleted Object = "+o);


		System.out.println("Fist Occurences of 333 at index = "+a1.indexOf(333));
		System.out.println("Fist Occurences of 333 = "+a1.lastIndexOf(333));


	}
}