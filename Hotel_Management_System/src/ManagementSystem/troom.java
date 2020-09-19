package ManagementSystem;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class troom extends JFrame implements ActionListener {
	
	JTable t1;
	JButton b1,b2;

	troom(){
		t1=new JTable();
		t1.setBounds(0,40,500,400);
		add(t1);
		
		b1=new JButton("load data");
		b1.setBounds(10,460,120,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("back");
		b2.setBounds(250,460,120,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		setLayout(null);
		setBounds(450,200,1000,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new troom();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			connection c=new connection();
			try {
				String str="select*from rooms";
				ResultSet rs=c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(rs));
			   
			}catch(Exception e1) {
				System.out.println(e1);
				
			}
			
		}else if(e.getSource()==b2) {
			new reception().setVisible(true);
			this.setVisible(false);
		}
		
	}

}





