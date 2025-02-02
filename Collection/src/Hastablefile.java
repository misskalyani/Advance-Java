
import java.io.*;

import java.util.*;

public class Hastablefile
{
  public static void main(String[] args)throws Exception
  {
	  Hashtable ht=new Hashtable();
	FileReader f1=new FileReader("abc.txt");
	BufferedReader br=new BufferedReader(f1);
	String s1="";
	while((s1=br.readLine())!=null)
	{
		String word[]=s1.split("\t");
		ht.put(word[0], word[1]);
	}
	System.out.println(ht);
}
}