package List.Vector;


import java.util.*;
import javax.swing.*;
public class JTDemo extends JFrame
{
	JTable tbl;
	JTDemo()
	{
	 setVisible(true);
	 setSize(600,600);
	 setLayout(null);
	 //String cols[]={"Roll No","Name","PER"};
	 Vector cols=new Vector();
	 cols.add("Roll No");
	 cols.add("Name");
	 cols.add("Per");
	 /*String data[][]={{"101","om","55.66"},
			 		  {"102","sai","85.66"},
			 		  {"103","ram","95.66"} };*/
	 Vector data=new Vector();
	 Vector row1=new Vector();
	 row1.add("101");
	 row1.add("Om");
	 row1.add("55.66");
	 Vector row2=new Vector();
	 row2.add("102");
	 row2.add("Sai");
	 row2.add("85.66");
	 
	 data.add(row1);
	 data.add(row2);
	 tbl=new JTable(data,cols);
	 JScrollPane jsp=new JScrollPane(tbl);
	 jsp.setBounds(100, 100, 400, 300);
	 add(jsp);
	}
   public static void main(String[] args)
   {
	 new JTDemo();
}
}

