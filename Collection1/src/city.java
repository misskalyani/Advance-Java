//Write a java program to accept names of ‘n’ cities, insert same into array list 
//collection and display the contents of same array list, also remove all these elements.
import java.util.*;
public class city
{
	public static void main(String arg[])
	{
		ArrayList city= new ArrayList ();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many City....");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter City Name ");
			city.add(sc.next());
		}
		System.out.println(city);

		Collections.sort(city);
		System.out.println("Sorted City = "+city);
		
		city.clear();
		System.out.println("After Removing All City");
		System.out.println(city);
	}
}
