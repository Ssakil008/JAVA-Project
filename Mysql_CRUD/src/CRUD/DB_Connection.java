package CRUD;

import java.sql.DriverManager;

import java.sql.Connection;

public class DB_Connection {
	
	public static void main(String[] args) {
		
		DB_Connection conn = new DB_Connection();
		
		System.out.println(conn.get_connection());
	}
	
	public Connection get_connection() {
		
		Connection connection = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root", "");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
