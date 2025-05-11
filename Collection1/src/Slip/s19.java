package Slip;
//Write a java program to accept ‘N’ Integers from a user store them into LinkedList Collection and display only negative integers.
import java.util.*;
public class s19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		LinkedList l=new LinkedList();
		System.out.println("Enter N Integer ");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			l.add(num);
		}
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Object nums=it.next();
			String s=nums.toString();
			int nm=Integer.parseInt(s);
			if(nm<0)
			{
				System.out.println("Number is Negative");
			}
			else
			{
				System.out.println("Number is Positive");
			}
		}
	}

}
