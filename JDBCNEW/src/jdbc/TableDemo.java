package jdbc;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import java.io.*;
import java.sql.*;
public class TableDemo extends JFrame
{
	
	TableDemo()
	{
		setSize(500,500);
		setLocation(300,300);
		Connection con;
		ResultSet rs;
		PreparedStatement st;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			st=con.prepareStatement("select * from emp");
			rs=st.executeQuery();
			String col [] ={"ENO","NAME","Salary","DEPT","COMM","Total"};
			DefaultTableModel dt=new DefaultTableModel(col,0);
			while(rs.next())
			{
				dt.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4),rs.getString(5),rs.getString(6)});
			}
			JTable tb=new JTable();
			JScrollPane jsp=new JScrollPane(tb);
			add(jsp);
			tb.setModel(dt);
			setVisible(true);
			
		}catch(Exception e){}
	}
	public static void main(String arg[]) 
	{
		TableDemo t =new TableDemo();
	}
}

/*
finanace	111	21000.0	aaa	21000.00	0.00
it	222	31000.0	bbb	34100.00	3100.00
hr	333	45000.0	ccc	54000.00	9000.00
it	444	25000.0	ddd	27500.00	2500.00
finance	555	25000.0	eee	32500.00	7500.00
finance	666	15000.0	fff	19500.00	4500.00
hr	777	30000.0	ggg	36000.00	6000.00
hr	888	27000.0	hhh	32400.00	5400.00
*/