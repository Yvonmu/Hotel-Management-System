package ManagementSystem;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class rooms extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t4,t5;
	JComboBox c1,c2,c3;
	JButton b1,b2;
	private JPanel p;
	rooms(){
		l1=new JLabel("Room Numbers");
		l1.setBounds(20,20,150,30);
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(150,20,150,30);
		add(t1);
		
		l2=new JLabel("Availability");
		l2.setBounds(20,60,150,30);
		add(l2);
		
		String[] str1= {"available","busy"};
		c1=new JComboBox(str1);
		c1.setBounds(150,60,150,30);
		add(c1);
		
		
		l3=new JLabel("Cleaning status");
		l3.setBounds(20,100,150,30);
		add(l3);
		
		String[] str2= {"cleaned","non cleaned"};
		c2=new JComboBox(str2);
		c2.setBounds(150,100,150,30);
		add(c2);
		
		l4=new JLabel("price");
		l4.setBounds(20,140,150,30);
		add(l4);
		
		t4=new JTextField();
		t4.setBounds(150,140,150,30);
		add(t4);
		
		l5=new JLabel("bed type");
		l5.setBounds(20,180,150,30);
		add(l5);
		
		String[] str3= {"single","double"};
		c3=new JComboBox(str3);
		c3.setBounds(150,180,150,30);
		add(c3);
		
		b1=new JButton("ADD ROOM");
		b1.setBounds(30,220,100,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("CANCEL");
		b2.setBounds(140,220,100,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		p=new JPanel();
		//setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("registration.JPG"));
		Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		l3=new JLabel(i3);
		l3.setBounds(240,10,200,200);
		add(p);
		
		setLayout(null);
		setBounds(300,200,700,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new rooms();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String room_number=t1.getText();
			String availability=(String) c1.getSelectedItem();
			String status=(String) c2.getSelectedItem();
			String price=t4.getText();
			String bed=(String) c3.getSelectedItem();
			
			connection c=new connection();
			String str="insert into rooms values('"+room_number+"','"+availability+"','"+status+"','"+price+"','"+bed+"')";
			try {
				
				c.s.executeUpdate(str);
			JOptionPane.showMessageDialog(null, "Room added");
			} catch (SQLException e1) {
				System.out.println(e1);
				
			}
		
			this.setVisible(true);
		}else if(e.getSource()==b2) {
			
			this.setVisible(false);
		
	}

}
}

