package books;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete_data {
	
	public Delete_data(int Serial_no) {
		Connect conn = new Connect();
		Connection connection = conn.getConnection();
		
		PreparedStatement ps = null;
		
		try {
			String query = "delete from Books where Serial_no = ?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, Serial_no);
			
			ps.executeUpdate();
			 
			System.out.println(ps);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
