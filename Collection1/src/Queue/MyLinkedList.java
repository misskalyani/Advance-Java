package Queue;


//addFirst()
//addLast()
//removeFirst()
//removeLast()
//getFirst()
//getLast()

import java.util.*;
public class MyLinkedList
{
	public static void main(String arg[])
	{
		
		LinkedList l1 =new LinkedList();
		System.out.println("Intial Size = "+l1.size());//0
		System.out.println("Empty = "+l1.isEmpty());//true
		

		System.out.println(l1);//[]

		l1.add("Hello");
		l1.add(5);
		l1.add(333);
		l1.add(5.6f);
		l1.add(21);
		l1.add(32.5f);
		l1.add(null);
	
		System.out.println("Intial Size = "+l1.size());
		System.out.println("Empty = "+l1.isEmpty());
		
		System.out.println(l1);

		l1.addFirst(333);
		l1.addLast("Hello");
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);

		System.out.println("First Element = "+l1.getFirst());	
		System.out.println("First Element = "+l1.getLast());		
		

	}

}
