
package List.ArrayList;
import java.util.*;
public class DemoArrayList
{
	public static void main(String arg[])
	{
		ArrayList a1=new ArrayList(50);//50 is not size it is considered as capacity
		//System.out.println("Size = "+a1.size());
		a1.add("Hello");
		a1.add(5);
		a1.add(333);
		a1.add(5.6);
		a1.add(21);
		a1.add(32.5); //returns true
		a1.add(333);
		
		a1.add(null);   //returns true

		a1.add(3,"Hello");   // returns void
		System.out.println(a1);

		//by default indexwise remove
		Object o=a1.remove(4);//removes 4th number element ,becuase 4 is index
		System.out.println("removed element = "+o);
		System.out.println(a1);
		//a1.remove("php"); //returns false
		
		//a1.remove(121); //121 is index RunTimeException : ArrayIndexOutOfBoundException

		a1.remove(new Integer(121)); //121 is object
		
		a1.contains("php");  //return false

	}

}