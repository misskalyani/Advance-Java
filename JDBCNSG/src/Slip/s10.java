package Slip;
/*
 * Write a Java program to display first record from student table (RNo, SName, Per) onto 
the TextFields by clicking on button. (Assume Student table is already created)
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
public class s10 extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1;
	s10()
	{
		setSize(500,500);
		setLocation(500,300);
		setLayout(new FlowLayout());
		t1=new JTextField(30);
		b1=new JButton("Show");
		add(t1);
		add(b1);
		b1.addActionListener(this);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			Connection con;
			ResultSet rs;
			Statement st;
			String q;
			try{
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
				st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				q="Select * from student";
				rs=st.executeQuery(q);
				rs.first();
				t1.setText(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
				
			}catch(Exception g){}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new s10();
	}

	

}
