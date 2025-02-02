
import java . awt.*;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Q8 extends Frame implements ActionListener
{
	HashMap hm=new HashMap();
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3;
  Q8()
  {
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
	l1=new Label("City NAme:");
	l2=new Label("STD Code:");
	t1=new TextField(10);
	t2=new TextField(10);
	b1=new Button("Add");
	b2=new Button("Remove");
	b3=new Button("Search");
	add(l1); add(t1);
	add(l2); add(t2);
	add(b1); add(b2); add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
  }
 
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		String name=t1.getText();
		String std=t2.getText();
		hm.put(name, std);
		JOptionPane.showMessageDialog(this,"Record Insert...");
	}
	if(ae.getSource()==b2)
	{
		String name=t1.getText();
		hm.remove(name);
		JOptionPane.showMessageDialog(this,"Deleted.");
	}
	if(ae.getSource()==b3)
	{
		String name=t1.getText();
        if(hm.containsKey(name))
		 JOptionPane.showMessageDialog(this,"STD Code="+hm.get(name));
        else
        	JOptionPane.showMessageDialog(this,"NOt Found...");
	}
}
  public static void main(String[] args)
  {
	new Q8();
}
}

