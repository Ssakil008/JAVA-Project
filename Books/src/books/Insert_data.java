package books;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert_data {
	
	public Insert_data(String movie_name, String author_name, int year) {
		
		Connect conn = new Connect();
		
		Connection connection = conn.getConnection();
		
		PreparedStatement ps = null;
		
		try {
			String query = "insert into Books(Title,Author,Release_year) values (?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, movie_name);
			ps.setString(2, author_name);
			ps.setInt(3, year);
			System.out.println(ps);
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
