 package List.ArrayList;
import java.util.*;
public class ArrayList1
{
  public static void main(String[] args)
  {
    ArrayList  a1=new ArrayList();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit:");
    int n=sc.nextInt();
    System.out.println("Enter n Numbers:");
    for(int i=0;i<n;i++)
    {
    	int num=sc.nextInt();
    	a1.add(num);
    }
    System.out.println("All Numbers="+a1);
    Collections.reverse(a1);
    System.out.println("All Numbers in Reverse="+a1);
  }
}