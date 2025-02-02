import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al=new ArrayList<Integer>();
		int n,i,t,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit :: ");
		n=sc.nextInt();
		/*for(i=0;i<n;i++)
		{
			t=sc.nextInt();
			if(al.contains(t))
				System.out.println("Duplicate Elemt not allowed ");
			else
				al.add(t);
		}*/
		while(cnt<n)
		{
			t=sc.nextInt();
			if(al.contains(t))
				System.out.println("Duplicate Elemt not allowed ");
			else{
				al.add(t);
				cnt++;
			}
		}
		Collections.sort(al);
		System.out.println("Sorted Order :: ");
		System.out.println(al);
		
		int x;
		System.out.println("Enter Number to search :: ");
		x=sc.nextInt();
		
		int loc;
		loc=Collections.binarySearch(al, x);
		if(loc<0)
			System.out.println(" Number Not Found ");
		else
			System.out.println("Number Found ");
	}

}
