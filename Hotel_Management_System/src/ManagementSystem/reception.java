package ManagementSystem;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class reception extends JFrame implements ActionListener {

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	reception(){
		b1=new JButton("New Customer Forms");
		b1.setBounds(10,30,200,20);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Rooms");
		b2.setBounds(10,60,200,20);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Department");
		b3.setBounds(10,90,200,20);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.addActionListener(this);
		add(b3);
		
		b4=new JButton("All Employee Info");
		b4.setBounds(10,120,200,20);
		b4.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		b4.addActionListener(this);
		add(b4);
		
		b5=new JButton("Customer Info");
		b5.setBounds(10,150,200,20);
		b5.setForeground(Color.WHITE);
		b5.setBackground(Color.BLACK);
		b5.addActionListener(this);
		add(b5);
		
		b6=new JButton("Manager Info");
		b6.setBounds(10,180,200,20);
		b6.setForeground(Color.WHITE);
		b6.setBackground(Color.BLACK);
		b6.addActionListener(this);
		add(b6);
		
		b7=new JButton("Check Out");
		b7.setBounds(10,210,200,20);
		b7.setForeground(Color.WHITE);
		b7.setBackground(Color.BLACK);
		b7.addActionListener(this);
		add(b7);
		
		b8=new JButton("Update Check Status");
		b8.setBounds(10,240,200,20);
		b8.setForeground(Color.WHITE);
		b8.setBackground(Color.BLACK);
		b8.addActionListener(this);
		add(b8);
		
		b9=new JButton("Update Room Status");
		b9.setBounds(10,270,200,20);
		b9.setForeground(Color.WHITE);
		b9.setBackground(Color.BLACK);
		b9.addActionListener(this);
		add(b9);
		
		b10=new JButton("Pick Up");
		b10.setBounds(10,300,200,20);
		b10.setForeground(Color.WHITE);
		b10.setBackground(Color.BLACK);
		b10.addActionListener(this);
		add(b10);
		
		b11=new JButton("Search Room");
		b11.setBounds(10,330,200,20);
		b11.setForeground(Color.WHITE);
		b11.setBackground(Color.BLACK);
		b11.addActionListener(this);
		add(b11);
		
		b12=new JButton("Log Out");
		b12.setBounds(10,360,200,20);
		b12.setForeground(Color.WHITE);
		b12.setBackground(Color.BLACK);
		b12.addActionListener(this);
		add(b12);
		
		
		setBounds(400,100,400,500);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new reception();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new customer().setVisible(true);
			this.setVisible(false);
		}else if(e.getSource()==b2) {
			new troom();
			setVisible(false);
		}else if(e.getSource()==b3) {
			
		}else if(e.getSource()==b4) {
			
		}else if(e.getSource()==b5) {
			
		}else if(e.getSource()==b6) {
			
		}else if(e.getSource()==b7) {
			
		}else if(e.getSource()==b8) {
			
		}else if(e.getSource()==b9) {
			
		}else if(e.getSource()==b11) {
			
		}else if(e.getSource()==b12) {
			setVisible(false);
		}
		
	}

}

