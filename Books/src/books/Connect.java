package books;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static void main(String[] args) {
		Connect conn = new Connect();

		System.out.println(conn.getConnection());

	}

	public Connection getConnection() {
		Connection connection = null;

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Ssakil", "root", "Depre$$!0n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}
}
