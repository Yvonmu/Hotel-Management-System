package ManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
	
	Connection c;
	Statement s;
	
	public connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///projecthas","root","yvione");
			s=c.createStatement();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
