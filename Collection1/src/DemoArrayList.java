//collection:is a group of object.
//homogeneous,heterogenous,unique,duplicate,null
//Collection :interface
//Collections:class

//List
//ArrayList,Vector,LinkedList
//Unlimited
//heterogeneous
//duplicate
//null
//ordered by insertion

//common method to all collection classes
//int size()
//boolean isEmpty()
//void clear():[]
//boolean remove(Object)
//boolean add(Object)
//boolean contains(Object)
import java.util.*;
public class DemoArrayList
{
	public static void main(String arg[])
	{
		ArrayList a=new ArrayList();
		System.out.println("Intital Size : "+a.size());
		ArrayList a1=new ArrayList(50);//50 is not size it is considered as capacity
		System.out.println("Size = "+a1.size());
		System.out.println("Empty = "+a1.isEmpty());//true

		/*Student st =new Student();
		Teacher t=new teacher();
		Emp e =new emp();

		a1.add(st);*/
		a1.add('e');
		a1.add('t');
		//a1.add(new students());
		a1.add("Hello");
		a1.add(new Integer(5));
		a1.add(new Float(5.6f));
		a1.add(21);//after JDK 1.5 automatically convert ..21...<new Integer(21)
		a1.add(32.5f);
		a1.add("Hello");
		a1.add(null);

		boolean ans=a1.contains("Hello");
		System.out.println("conatins = "+ans);//true

		
		Integer ob =new Integer(60);
		a1.add(ob);
		boolean s=a1.remove(ob);
		System.out.println("After Deletion "+a1);
		System.out.println("Result = "+s);//true 
		
		Integer ob1 =new Integer(6);
		a1.add(ob1);
		boolean s2=a1.remove(ob);
		System.out.println("After Deletion "+a1);
		System.out.println("Result = "+s2);//false



	}
}