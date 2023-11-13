package nephew;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete_data {

	public Delete_data(int Serial_no) {
		DB_Connection conn = new DB_Connection();

		Connection connection = conn.getConnection();

		PreparedStatement ps = null;

		try {
			String query = "delete from NEPHEW where Serial_no = ?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, Serial_no);
			ps.executeUpdate();
			System.out.println(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
