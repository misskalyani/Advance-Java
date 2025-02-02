//Write a Java program to accept ‘n’ employee names through command line, Store them 
//in vector. Display the name of employees starting with character ‘S’.

import java.io.*;
import java.util.*;
public class commandline
{
  public static void main(String[] args)throws Exception
  {
	  Vector v1=new Vector();
	  for(int i=1;i<args.length;i++)
		  v1.add(args[i]);
	  System.out.println(v1);
	  Iterator it=v1.iterator();
	  while(it.hasNext())
	  {
		  String s1=it.next().toString();
		  if(s1.startsWith("s"))
			  System.out.println(s1);
		}
}
}