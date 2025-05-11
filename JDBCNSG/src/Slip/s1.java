package Slip;
// Write a Java program to accept the details of Employee (Eno, EName, Designation, Salary) from a user and store it into the database. (Use Swing)
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;
import java.sql.*;
public class s1 extends JFrame implements ActionListener {
	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4;
	JButton b1;
	s1()
	{
		setSize(500,800);
		setLayout(new FlowLayout());
		l1=new JLabel("Enter Eno   = ");
		l2=new JLabel("Enter EName = ");
		l3=new JLabel("Enter EDesi = ");
		l4=new JLabel("Enter ESala = ");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(l4);add(t4);
		b1=new JButton("Insert");
		add(b1);
		b1.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			Connection con;
			PreparedStatement ps;
			String q;
			String eno=t1.getText();
			int no=Integer.parseInt(eno);
			String nm=t2.getText();
			String d=t3.getText();
			String s=t4.getText();
			float sal=Float.parseFloat(s);
			try{
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
				q="insert into emp values(?,?,?,?)";
				ps=con.prepareStatement(q);
				ps.setInt(1,no);
				ps.setString(2,nm);
				ps.setString(3,d);
				ps.setFloat(4,sal);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this, "Insert SuccesFully");
				//System.out.println("Insert Succc");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				}catch(Exception e)
				{}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new s1();
		
	}

	

}
