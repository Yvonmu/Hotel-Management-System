package ManagementSystem;



import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hotelmanagementsystem extends JFrame implements ActionListener {
	private JButton b1,b2;
	Hotelmanagementsystem() {
		//setBounds(300,200,500,500);
		setSize(500,333);
		setResizable(false);
		//setLocation(300,300);
	    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("overview.JPG"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0, 0, 500, 333);
		
		JLabel l2=new JLabel("Hotel Managements System");
		l2.setBounds(0, 100, 900, 90);
		l2.setForeground(Color.RED);
		l2.setFont(new Font ("serif",Font.PLAIN,33));
		l1.add(l2);
		
		b1=new JButton("Login");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(290,260,110,30);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2=new JButton("REGISTER");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(290,0,110,30);
		b2.addActionListener(this);
		l1.add(b2);
		
		add(l1);
		setLayout(null);
		setVisible(true);
		
		while(true) {
			l2.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				l2.setVisible(true);
			}
			l2.setVisible(true);
			try {
				Thread.sleep(500);
				
			}catch(Exception e) {
				
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		new Hotelmanagementsystem();

	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1) {
			new login().setVisible(true);
			this.setVisible(false);
		}
		else if(e.getSource()==b2) {
			new employee().setVisible(true);
			
		}
		
	}

}

