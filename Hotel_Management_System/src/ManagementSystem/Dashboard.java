package ManagementSystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener {
	
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem i1,i3,i2,i4;
	Dashboard(){
		mb=new JMenuBar();
		
		
		m1=new JMenu("System Management");
		//m1.setBackground(Color.BLACK);
		m1.setForeground(Color.BLUE);
		mb.add(m1);
		
		m2=new JMenu("Admin");
		//m2.setBackground(Color.black);
		m2.setForeground(Color.RED);
		mb.add(m2);
		
		i1=new JMenuItem("RECEPTION");
		i1.addActionListener(this);
		m1.add(i1);
		
		i2=new JMenuItem("ADD EMPLOYEE");
		i2.addActionListener(this);
		m2.add(i2);
		
		i3=new JMenuItem("ADD ROOMS");
		i3.addActionListener(this);
		m2.add(i3);
		
		i4=new JMenuItem("ADD DRIVERS");
		i4.addActionListener(this);
		m2.add(i4);
		
		mb.setBounds(0,0,1390,30);
						
		JLabel l2=new JLabel("Welcome YMC CORPORATION");
		l2.setBounds(200,60,1000,50);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",Font.PLAIN,50));
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("reception.JPG"));
		Image i2=i1.getImage().getScaledInstance(1590,950,	Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel l1=new JLabel(i3);
		l1.setBounds(0,0,1350,1000);
		
		
		l1.add(l2);
		add(l1);
		
		setLayout(null);
		
		add(mb);
		
		setBounds(0,0,1390,1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Dashboard();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("RECEPTION")) {
			new reception().setVisible(true);
		}else if(e.getActionCommand().equals("ADD EMPLOYEE")) {
			new employee().setVisible(true);
			
		}else if(e.getActionCommand().equals("ADD ROOMS")) {
			new rooms().setVisible(true);
		}else if(e.getActionCommand().equals("ADD DRIVERS")) {
			
		}
		
	}

}

