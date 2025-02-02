import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> c=new LinkedList<String>();
        c.add("red");
        c.add("blue");
        c.add("yellow");
        c.add("Orange");
        
        Iterator cursor=c.iterator();
        while(cursor.hasNext())
        {
        	System.out.println(cursor.next());
        }
        System.out.println("Reverse :: ");
        ListIterator li=c.listIterator(c.size());
        while(li.hasPrevious())
        {
        	System.out.println(li.previous());
        }
        LinkedList c2=new LinkedList();
        c2.add("pink");
        c2.add("green");
        
        int loc=Collections.binarySearch(c,"yellow");
        c.addAll(loc,c2);
        
       
        System.out.println("Updated List of colors "+c);
	
        c.addFirst("White");
        System.out.println("Updated List of colors "+c);
    	
        c.removeLast();
        System.out.println("Updated List of colors "+c);
    	
        System.out.println("Updated List of colors size  "+c.size());
    	
	}

}
