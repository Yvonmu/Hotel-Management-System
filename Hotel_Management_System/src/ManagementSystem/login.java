package ManagementSystem;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Arrays;

import javax.swing.*;

public class login extends JFrame implements ActionListener {
	private JPanel p;
	private JLabel l2,l1,l3;
	private JTextField t1,pa;
	private JPasswordField t2;
	public JButton b1,b2;
	login(){
		l1=new JLabel("Username ");
		l1.setBounds(40, 20,150,20);
		
		t1=new JTextField();
		t1.setBounds(120, 20, 150, 20);
		
		l2=new JLabel("Password ");
		l2.setBounds(40, 50,150,20);
		t2=new JPasswordField("",20);
		t2.setBounds(120,50,150,20);
		//t2.setToolTipText("Password must contain at least 8 characters");
		
		pa=new JTextField();
		pa.add(t2);
		
		b1=new JButton("login");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(40,80,150,25);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(200,80,150,25);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		
		p=new JPanel();
		//setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("login.JPG"));
		Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		l3=new JLabel(i3);
		l3.setBounds(340,10,200,200);
		
		getContentPane().setBackground(Color.WHITE);
		add(l3);
		add(b2);
		add(b1);
		add(t2);
		add(t1);
		add(l1);
		add(l2);
		add(p);
		
		setBounds(500,300,600,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			String username=t1.getText();
			String  password=t2.getText();
			//char[] pa=t2.getPassword();
			//String password=String.valueOf(pa);
			//if(checkIfCorrect(password)) {
				//JOptionPane.showMessageDialog(null, "password is correct");
			//}
			//else {
			//	JOptionPane.showMessageDialog(null, "password is incorrect");
			//}
			connection c=new connection();
			
			String str="select * from login where username = '"+username+"' and password= '"+password+"'";
			try{
				ResultSet rs=c.s.executeQuery(str);
				if(rs.next()) {
					//JOptionPane.showMessageDialog(null,"username and password grated");
					new Dashboard().setVisible(true);;
					
					this.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"INVALID username and password");
					this.setVisible(false);
				}
			}catch(Exception e1){
				
			}
		}else if(e.getSource()==b2) {
			System.exit(0);
		}
		
	}
	//private boolean checkIfCorrect(char[] password) {
	//	boolean isCorrect=false;
	//	char[] correctPass= {'1','2','3'};
		
	//	if(password.length !=correctPass.length) {
	//		isCorrect=false;
	//	}else {
	//		isCorrect=Arrays.equals(password, correctPass);
	//	}
		//Arrays.fill(correctPass, '0');
	//	return isCorrect;
	//}

}

