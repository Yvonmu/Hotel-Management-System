package ManagementSystem;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class employee extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton r1,r2;
	JComboBox c1;
	JButton b1;
	employee(){
		
		
		JLabel fname=new JLabel("First Name");
		fname.setBounds(60,30,120,20);
		fname.setFont(new Font("arial",Font.PLAIN,12));
		
		t1=new JTextField();
		t1.setBounds(160,30,150,20);
		add(t1);
		
		JLabel lname=new JLabel("Last Name");
		lname.setBounds(60,60,120,20);
		lname.setFont(new Font("arial",Font.PLAIN,12));
		
		t2=new JTextField();
		t2.setBounds(160,60,150,20);
		add(t2);
		
		JLabel age=new JLabel("Age");
		age.setBounds(60,90,120,20);
		age.setFont(new Font("arial",Font.PLAIN,12));
		
		t3=new JTextField();
		t3.setBounds(160,90,150,20);
		add(t3);
		
		JLabel gender=new JLabel("Gender");
		gender.setBounds(60,120,120,20);
		gender.setFont(new Font("arial",Font.PLAIN,12));
		add(gender);
		
		r1=new JRadioButton("male");
		r1.setBounds(160,120,70,20);
		add(r1);
		r2=new JRadioButton("female");
		r2.setBounds(250,120,70,20);	
		add(r2);
		
		JLabel jod=new JLabel("JOD");
		jod.setBounds(60,150,120,20);
		jod.setFont(new Font("arial",Font.PLAIN,12));
		add(jod);
		
		String[] str= {"Select jod","waitress","hospitality"};
		c1=new JComboBox(str);
		c1.setBounds(160,150,120,20);
		add(c1);
		
		JLabel salary=new JLabel("Salary");
		salary.setBounds(60,180,120,20);
		salary.setFont(new Font("arial",Font.PLAIN,12));
		add(salary);
		
		t4=new JTextField();
		t4.setBounds(160,180,150,20);
		add(t4);
		
		JLabel phone=new JLabel("Phone");
		phone.setBounds(60,210,120,20);
		phone.setFont(new Font("arial",Font.PLAIN,12));
		add(phone);
		
		t5=new JTextField();
		t5.setBounds(160,210,150,20);
		add(t5);
		JLabel email=new JLabel("Email");
		email.setBounds(60,240,120,20);
		email.setFont(new Font("arial",Font.PLAIN,12));
		add(email);
		
		t6=new JTextField();
		t6.setBounds(160,240,150,20);
		add(t6);
		
		b1=new JButton("submit");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(100,290,150,20);
		add(b1);
		b1.addActionListener(this);
		
		add(fname);
		add(lname);
		add(age);
		setLayout(null);
		setBounds(400,200,400,550);
		setVisible(true);
	}

	public static void main(String[] args) {
		new employee();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fname=t1.getText();
		String lname=t2.getText();
		String age=t3.getText();
		String salary=t4.getText();
		String phone=t5.getText();
		String email=t6.getText();
		
		String gender=null;
		if(r1.isSelected()) {
			gender="male";
		}else if(r2.isSelected()){
			gender="female";
		}
		
		String job=(String) c1.getSelectedItem();
		
		connection c=new connection();

		String str="insert into employee values('"+fname+"','"+lname+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"')";
		
		try {
			c.s.executeUpdate(str);
			JOptionPane.showMessageDialog(null, "New employee added");
			this.setVisible(false);
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		}

}

