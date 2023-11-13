package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class read_data {

	public read_data(int id) {

		DB_Connection conn = new DB_Connection();
		Connection connection = conn.get_connection();

		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String query = "select * from user where id =?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			System.out.println(ps);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("ID : " + rs.getString("id"));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Email : " + rs.getString("email"));
				System.out.println("---------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
