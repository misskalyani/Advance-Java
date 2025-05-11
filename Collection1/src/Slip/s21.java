package Slip;
//. Write a java program to accept ‘N’ Subject Names from a user store them into LinkedList Collection and Display them by using Iterator interface.
import java.util.*;
public class s21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		System.out.println("Enter Subject Names ");
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			l.add(s);
		}
		Iterator it=l.iterator();
		System.out.println(" Subject Names Are ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
