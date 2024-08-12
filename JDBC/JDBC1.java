package MySqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBC1 {
	public static void main(String[] args) {
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/practice";
			String username = "root";
			String password = "mysql";

			Class.forName(driver);
			
		Connection con= DriverManager.getConnection(url, username, password);
		System.out.println("Connection Success");
		
		}
		catch (Exception e) {
			e.printStackTrace();

		}
	}

}

