package books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Read_data {
	
	public Read_data(int Serial_no) {
		
		Connect conn = new Connect();
		
		Connection connection = conn.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String query = "select * from Books where Serial_no = ?";
			ps = connection.prepareStatement(query);
			
			ps.setInt(1, Serial_no);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("Serial_no : "+rs.getString("Serial_no"));
				System.out.println("Title : "+rs.getString("Title"));
				System.out.println("Author : "+rs.getString("Author"));
				System.out.println("Release_year : "+rs.getString("Release_year"));
				System.out.println("--------------------------------");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
