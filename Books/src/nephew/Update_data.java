package nephew;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update_data {

	public Update_data(int Serial_no, String name, String Father_name, String Mother_name, String Birth_date) {
		DB_Connection conn = new DB_Connection();

		Connection connection = conn.getConnection();

		PreparedStatement ps = null;

		try {
			String query = "update NEPHEW set Name = ?, Father_name = ?, Mother_name = ?, Birth_date = ? where Serial_no = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, Father_name);
			ps.setString(3, Mother_name);
			ps.setString(4, Birth_date);
			ps.setInt(5, Serial_no);

			ps.executeUpdate();
			System.out.println(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
