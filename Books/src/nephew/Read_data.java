package nephew;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read_data {
	
	public Read_data() {
		DB_Connection conn = new DB_Connection();
		Connection connection = conn.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from NEPHEW";
			ps = connection.prepareStatement(query);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Name :"+rs.getString("name"));
				System.out.println("Father_name :"+rs.getString("Father_name"));
				System.out.println("Mother_name :"+rs.getString("Mother_name"));
				System.out.println("Birth_date :"+rs.getString("Birth_date"));
				System.out.println("..................................");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
