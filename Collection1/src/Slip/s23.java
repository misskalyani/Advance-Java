package Slip;
/*Write a java program to accept ‘N’ student names through command line, store them 
into the appropriate Collection and display them by using Iterator and ListIterator 
interface.*/
import java.util.*;

public class s23 {

	public static void main(String[] args) {
		int size=args.length;
		String s []=new String[size];
		ArrayList a=new ArrayList();
		
		for(int i =0;i<size;i++)
		{
			s[i]=args[i];
			a.add(s[i]);
		}
		/*System.out.println("Names are ");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(s[i]);
		}*/
		
		//System.out.println(a);
		
		Iterator sc=a.iterator();
		while(sc.hasNext())
		{
			System.out.print(sc.next()+"\t");
		}
		ListIterator li=a.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next()+"\t");
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous()+"\t");
		}
	}

}
