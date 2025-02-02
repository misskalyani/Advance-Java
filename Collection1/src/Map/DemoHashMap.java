package Map;
import java.util.*;
class DemoHashMap
{
	 public static void main(String[] args)
  	{
		HashMap hm=new HashMap();
		System.out.println("Size = "+hm.size());//0
		System.out.println("Empty = "+hm.isEmpty());//true
		System.out.println(hm);{}

		hm.put(14,"java");
		
		
		Object o1;
		o1=hm.put("heloo","comp");   //no duplicate key
		System.out.println("no duplicate key = "+o1);//null
		hm.put(null,"pdotnet");
		hm.put(19.5f,"jsp");
		hm.put(16,"python");
	
		Object o;
		o=hm.put(14,"php");  // java replace python //duplicate key
		System.out.println("Old Value = "+o);	
	
		System.out.println(hm);		


		o= hm.remove(19.5f);
		System.out.println("Deleted Value = "+o);	
		System.out.println(hm);	

		System.out.println("Key Present "+hm.containsKey("heloo"));//true
		
		System.out.println("Key Present "+hm.containsKey("bye"));//false
	
		System.out.println("value Present "+hm.containsValue("heloo"));//false


		//hm.clear();
		//System.out.println(hm);	

		HashMap hm1=new HashMap();
		hm1.put(11,"java");
 		hm1.put(11,"os");
		hm1.put(11,"tcs");
		hm1.put(11,"sw");

		hm.putAll(hm1);
		System.out.println(hm);

		
				
	}  

}
