package books;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update_data {
	
	public Update_data(int Serial_no, String Title, String Author, int Release_year){
		
		Connect conn = new Connect();
		
		Connection connection = conn.getConnection();
		
		PreparedStatement ps = null;
		
		try {
			
			String query = "update Books set Title = ?, Author = ?, Release_year = ? where Serial_no =?";
			ps = connection.prepareStatement(query);
			ps.setInt(3, Release_year);
			ps.setString(1, Title);
			ps.setNString(2, Author);
			ps.setInt(4, Serial_no);
			
			ps.executeUpdate();
			
			System.out.println(ps);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
