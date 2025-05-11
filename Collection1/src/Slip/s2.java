package Slip;
//Write a java program to read ‘N’ names of your friends, store it into HashSet and display them in ascending order.
import java.util.*;
public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n =sc.nextInt();
		System.out.println("Enter N Friend Names ");
		HashSet hs=new HashSet();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			hs.add(s);
		}
		System.out.println("Before sorting = "+hs);
		TreeSet ts=new TreeSet(hs);
		System.out.println("After sorting = "+ts);
	}

}
