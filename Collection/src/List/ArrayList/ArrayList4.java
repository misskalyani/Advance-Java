package List.ArrayList;
import java.util.*;
public class ArrayList4
{
  public static void main(String[] args)
  {
    ArrayList a1=new ArrayList();
    a1.add("100");
    a1.add("java");
    a1.add("xml");
    a1.add("10.33");
    System.out.println(a1);
    a1.add(2, "joomla");
    System.out.println(a1);
    a1.remove(1);
    System.out.println(a1);
    a1.remove("xml");
    System.out.println(a1);
    //a1.clear();
    //a1.removeAll();
    //System.out.println(a1);
   if(a1.contains("xml"))
	   System.out.println("XML Object is Found....");
   else
		System.out.println("Arraylist is not Empty...");
   
   ArrayList a2=new ArrayList();
   a2.add("DBMS");
   a2.add("RDBMS");
   a2.add("Oracle");
   System.out.println(a2);
   //a1.addAll(a2);
   a1.addAll(2,a2);
   //a1.remove("DBMS");
   System.out.println(a1);
   if(a1.containsAll(a2))
	   System.out.println("a2 collection is found in the a1");
}
}