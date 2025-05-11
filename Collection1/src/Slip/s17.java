package Slip;
/* Write a java program to accept ‘N’ integers from a user. Store and display integers in 
sorted order having proper collection class. The collection should not accept duplicate 
elements.*/
import java.util.*;
public class s17 {

	public static void main(String[] args) {
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		HashSet hs=new HashSet();
		System.out.println("Enter N Integer ");
		/*for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
		
			if(hs.contains(num))
			{
				System.out.println("Duplicate elemet Not allowed");
				
			}
			else
			{
				hs.add(num);
			}
		}*/
		while(cnt<n)
		{
			int num=sc.nextInt();
			
			if(hs.contains(num))
			{
				System.out.println("Duplicate elemet Not allowed");
				
			}
			else
			{
				hs.add(num);
				cnt++;
			}
			
		}
			System.out.println(hs);
		
	}

}
