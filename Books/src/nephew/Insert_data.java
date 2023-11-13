package nephew;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert_data {
	
	public Insert_data(String name, String Father_name, String Mother_name, String date) {
		
		DB_Connection conn = new DB_Connection();
		
		Connection connection = conn.getConnection();
		
		PreparedStatement ps = null;
		
		try {
			String query = "insert into NEPHEW (Name, Father_name, Mother_name, Birth_date) values (?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, Father_name);
			ps.setString(3, Mother_name);
			ps.setString(4, date);
			
			ps.executeUpdate();
			
			System.out.println(ps);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
