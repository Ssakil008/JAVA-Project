package nephew;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {

	public static void main(String[] args) {
		DB_Connection conn = new DB_Connection();
		System.out.println(conn.getConnection());

	}
	
	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ssakil","root","Depre$$!0n");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
