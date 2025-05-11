package Slip;
/*Write a Java program to create LinkedList of integer objects and perform the following: 
i. Add element at first position 
ii. Delete last element 
iii. Display the size of link list */
import java.util.*;
public class s29 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.print("\nActual Linked List is = "+l);
		l.addFirst(5);
		System.out.print("\nAdding First Elemet = "+l);
		System.out.print("\nSize Of Linked List = "+l.size());
		l.removeLast();
		System.out.print("\nRemoving Last Elment = "+l);
		
	}

}
