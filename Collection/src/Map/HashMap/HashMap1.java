package Map.HashMap;
import java.util.*;
public class HashMap1
{
  public static void main(String[] args)
  {    	  
    HashMap hm=new HashMap();
    hm.put("rno","101");
    hm.put("name","Om");
    hm.put("per","99.44");
    hm.put("add","shrirampur");
    hm.put("name","sai");
    
   //HashMap hm1=new HashMap(hm);
    //hm1.put("mh","Maharashtra");
    //System.out.println(hm1);
    
    //hm.clear();
    //hm.remove("rno");
    System.out.println(hm);
    System.out.println("Value="+hm.get("per"));
    if(hm.containsKey("name"))
    	System.out.println("name key found....");
    if(hm.containsValue("Om"))
    	System.out.println("Om value found....");
    else
    	System.out.println("Om value not found....");
    
    //System.out.println("Number of elements="+hm.size());
    if(hm.isEmpty())
    	System.out.println("Map is empty....");
    else
		System.out.println("Om value not found....");
    
    //System.out.println("Number of elements="+hm.size());
    if(hm.isEmpty())
    	System.out.println("Map is empty....");
    else
    	System.out.println("Map is not empty...");
  }
}
