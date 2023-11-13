package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class update_data {
	
	public update_data(int id, int new_id, String name, String email) {

		DB_Connection conn = new DB_Connection();
		Connection connection = conn.get_connection();

		PreparedStatement ps = null;
		try {
			String query = "update user set id = ? ,name = ? , email = ? where id = ?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, new_id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, id);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
