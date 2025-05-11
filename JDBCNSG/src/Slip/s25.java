//2. Write a Java Program for the following: Assume database is already created.        
package Slip;
import java.sql.*;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class s25 extends JFrame implements ActionListener {
	JLabel l;
	JTextField t;
	JButton create,alter,drop;
	s25()
	{
		setSize(300,300);
		setLayout(new FlowLayout());
		l=new JLabel("Type your DDL query here");
		t=new JTextField(30);
		add(l);
		add(t);
		create=new JButton("Create Table");
		alter=new JButton("alter Table");
		drop=new JButton("drop table ");
		add(create);
		add(alter);
		add(drop);
		create.addActionListener(this);
		drop.addActionListener(this);
		alter.addActionListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		new s25();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con =DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			System.out.println("Connection Succces....");
			if(ae.getSource()==create  || ae.getSource()==alter || ae.getSource()==drop)
			{
				String q=t.getText();
				PreparedStatement pst=con.prepareStatement(q);
				pst.execute();
				JOptionPane.showMessageDialog(this,"Success");
				t.setText(" ");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
