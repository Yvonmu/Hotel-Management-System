package ManagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class customer extends JFrame implements ActionListener {
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5;
	JComboBox c1;
	Choice c2;
	JButton b1,b2;
	JRadioButton r1,r2;
	customer(){
		
		l1=new JLabel("New customer form");
		l1.setBounds(100,20,300,30);
		add(l1);
		
		l2=new JLabel("ID");
		l2.setBounds(35,80,100,20);
		add(l2);
		
		c1=new JComboBox(new String[] {"password","driving licence","jvote card"});
		c1.setBounds(200,80,150,20);
		add(c1);

		l3=new JLabel("Number");
		l3.setBounds(35,120,100,20);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200,120,150,20);
		add(t1);
		
		l4=new JLabel("name");
		l4.setBounds(35,160,100,20);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(200,160,150,20);
		add(t2);
		
		l5=new JLabel("Gender");
		l5.setBounds(35,200,100,20);
		add(l5);
		
		r1=new JRadioButton("male");
		r1.setBounds(100,200,100,20);
		add(r1);
		
		r2=new JRadioButton("female");
		r2.setBounds(200,200,100,20);
		add(r2);
		
		l6=new JLabel("Country");
		l6.setBounds(35,240,100,20);
		add(l6);
		
		t3=new JTextField();
		t3.setBounds(200,240,150,20);
		add(t3);
		
		l7=new JLabel("allocated room nbr");
		l7.setBounds(35,280,150,20);
		add(l7);
		
		c2=new Choice();
		try {
			connection c=new connection();
			String str="select * from rooms";
			ResultSet rs=c.s.executeQuery(str);
			while(rs.next()) {
				c2.add(rs.getString("room_number"));//put nbr of rooms in mysql
			}
		}catch(Exception e1){}
			c2.setBounds(200,280,150,20);
			add(c2);
		

		
		l8=new JLabel("check in");
		l8.setBounds(35,320,100,20);
		add(l8);
		
		t4=new JTextField();
		t4.setBounds(200,320,150,20);
		add(t4);
		
		l9=new JLabel("deposit");
		l9.setBounds(35,360,100,20);
		add(l9);
		
		t5=new JTextField();
		t5.setBounds(200,360,150,20);
		add(t5);
		
		b1=new JButton("ADD customer");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(90,380,100,20);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(200,380,100,20);
		b2.addActionListener(this);
		add(b2);
		
		setLayout(null);
		setBounds(500,200,900,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new customer();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			
		    String id=(String) c1.getSelectedItem();
		    String number=t1.getText();
		    String name=t2.getText();
		    String gender=null;
		    if(r1.isSelected()) {
			    gender="male";
		    }else if(r2.isSelected()) {
			    gender="female";
		    }
		    String country=t3.getText();
		    String room=c2.getSelectedItem();
		    String status=t4.getText();
		    String deposit=t5.getText();
		
		    String str="insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+status+"','"+deposit+"')";
		    String str1="update room set available='busy' whereroom='"+room+"'";
		    try {
		    	
			    connection c=new connection();
		        c.s.executeUpdate(str);
			    c.s.executeUpdate(str1);
			    
			    new reception().setVisible(true);
			    this.setVisible(false);
			
		    }catch(Exception e1) {
		    	System.out.println(e1);
		    	JOptionPane.showMessageDialog(null,"new customer added");
		   }
	     	}else if(e.getSource()==b2) {
			    new reception().setVisible(true);
			    this.setVisible(false);
		}
		
	}

}
