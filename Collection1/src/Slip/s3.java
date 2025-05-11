package Slip;
/*. Write a Java program to create LinkedList of String objects and perform the following:
i. Add element at the end of the list
ii. Delete first element of the list
iii. Display the contents of list in reverse order*/
import java.util.*;
public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		System.out.println("Original LL = "+l);
		l.addLast("F");
		System.out.println("Add element at the end of the list = "+l);
		
		l.removeFirst();
		System.out.println("Delete first element of the list = "+l);
		
		Collections.reverse(l);
		System.out.println("Display the contents of list in reverse order= "+l);
	}

}
