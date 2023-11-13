package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class insert_data{
	
	public insert_data(int id, String name, String email) {

		DB_Connection conn = new DB_Connection();
		Connection connection = conn.get_connection();

		PreparedStatement ps = null;
		try {
			String query = "insert into user(id,name,email) values (?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}

