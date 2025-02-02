package List.ArrayList;
import java.util.*;
public class ArrayList2
{
  public static void main(String[] args)
  {
	 //ArrayList a1=new ArrayList();
	  ArrayList a1=new ArrayList(10);
    a1.add("book");
    a1.add("java");
    a1.add("java");
    a1.add("xml");
    a1.add("advjava");
    System.out.println(a1);
    ArrayList a2=new ArrayList(a1);
    a2.add("DBMS");
    System.out.println(a2);
 }
}