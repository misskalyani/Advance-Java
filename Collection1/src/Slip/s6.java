package Slip;
/* Write a Java program to accept ‘n’ integers from the user and store them in a collection. 
Display them in the sorted order. The collection should not accept duplicate elements. 
(Use a suitable collection). Search for a particular element using predefined search 
method in the Collection framework.*/
import java.util.*;
public class s6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList hs=new ArrayList();
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		System.out.println("Enter N Integers ");
		int cnt=0;
		while(cnt<n)
		{
			int num=sc.nextInt();
			if(hs.contains(num))
			{
				System.out.println("Duplicate Elements Are NOT allowed");
			}
			else
			{
				hs.add(num);
				cnt++;
			}
		}
		System.out.println(" N Integers Are "+hs);
		TreeSet t=new TreeSet(hs);
		System.out.println(" Sorted Integers Are "+t);
		
		System.out.println(" Enter Integer To Search ");
		int s=sc.nextInt();
		
		int loc;
		loc=Collections.binarySearch(hs, s);
		
		if(loc<0)
			System.out.println(" Number Not Found ");
		else
			System.out.println("Number Found ");
			
		}
	}


