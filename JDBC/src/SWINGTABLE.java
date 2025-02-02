import javax.swing.*;
public class SWINGTABLE extends JFrame
{
	JTable tbl;
	SWINGTABLE()
	{
	 setVisible(true);
	 setSize(600,600);
	 setLayout(null);
	 String cols[]={"Roll No","Name","PER"};
	 String data[][]={{"101","om","55.66"},
			 		  {"102","sai","85.66"},
			 		  {"103","ram","95.66"} };
	 tbl=new JTable(data,cols);
	 JScrollPane jsp=new JScrollPane(tbl);
	 jsp.setBounds(100, 100, 400, 300);
	 add(jsp);
	}
   public static void main(String[] args)
   {
		 new SWINGTABLE();
   }
}
