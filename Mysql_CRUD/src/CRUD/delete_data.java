package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class delete_data {
	
	public delete_data(int id) {

		DB_Connection conn = new DB_Connection();
		Connection connection = conn.get_connection();

		PreparedStatement ps = null;
		try {
			String query = "delete from user where id = ?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
