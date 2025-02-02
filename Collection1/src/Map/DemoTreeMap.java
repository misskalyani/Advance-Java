package Map;

//homogeneous key
import java.util.*;
public class DemoTreeMap
{
	 public static void main(String[] args)
	{
		TreeMap tm =new TreeMap();
		tm.put(11,"java");
		tm.put(67,"tcs");
		tm.put(78,45);
		tm.put(32,"php");
		tm.put(54,"python");
		tm.put(111,"ds");
		System.out.println(tm);//Sorted keywise order//null key not allowed :-NULlPointerException

		TreeMap <Integer,String>tm1=new TreeMap <Integer,String>();
		tm.put(67,"tcs");
		//tm.put(78,45);//ERROR generic group
		tm.put(32,"php");
		tm.put(54,"python");
		System.out.println(tm1);

		Hashtable ht=new Hashtable();
		ht.put(12,"java");
		ht.put(12,"java");
		ht.put("yh","java");
		ht.put(3.4f,"java");
		System.out.println(ht);//null key And Value not allowed :-NULlPointerException

		Set s=ht.keySet();
		System.out.println("All Key = "+s);//[key......]

		Collection c=ht.values();
		System.out.println("All Values = "+c);//[value......]

		Set ss = ht.entrySet();
		System.out.println("All Entrys = "+ss);//[key:value......]

		System.out.println("data of 11 number key = "+ht.get(11));//keywise

		Set s1=ht.keySet();
		Iterator itr =s1.iterator();
		while(itr.hasNext())
		{
			Object k=itr.next();
			System.out.println("Key = "+k);
			System.out.println("value = "+ht.get(k));
			
		}
	}
}
