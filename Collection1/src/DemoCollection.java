//Collections is a utilty class having many static methods
//shuffle(),reverse(),max(),min(),sort(),binarySearch()
import java.util.*;
class DemoCollection
{

	public static void main(String arg[])
	{
		ArrayList a1=new ArrayList ();
		a1.add(30);
		a1.add(3);
		a1.add(45);
		a1.add(15);
		a1.add(60);
		a1.add(80);

		System.out.println(a1);

		Collections.shuffle(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);

		Object o,o1;
		o=Collections.max(a1);
		System.out.println("Max Element = "+o);

		o1=Collections.min(a1);
		System.out.println("Min Element = "+o);

		Collections.sort(a1);
		System.out.println(a1);

		int loc;
		loc=Collections.binarySearch(a1,30);//element not found then return negative number
		System.out.println("30 is at location is = "+loc);
		
	} 
}