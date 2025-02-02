package List.ArrayList;
import java.util.*;
public class Demo2
{
	public static void main(String arg[])
	{
		//superclass ref=subclass object
		List a1=new ArrayList(50);
		List a2=new ArrayList(50);
		a1.add(111);
		a1.add(222);
		a1.add(333);
		a1.add(444);
		
		a2.add(333);
		a2.add(444);
		a2.add(555);

		System.out.println(a1);
		System.out.println(a2);

		//a1.addAll(a2); //append
		//a1.addAll(2,a2);//insert at 2 no index

		//System.out.println(a1);
		//a1.removeAll();
		//System.out.println(a1);

		//a1.retainAll(a2);
		//System.out.println(a1);
	
}
}


