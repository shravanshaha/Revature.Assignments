package MySqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class test1 {
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/practice";
	public static String username = "root";
	public static String password = "mysql";

	public static void readAllUser() {
		try {
			
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, username, password);
			
			Statement stmt = con.createStatement();
			
			 String sql="SELECT * FROM employee ";
			 ResultSet rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 
				 String EmpName= rs.getString("EmpName");
				 System.out.println("Emp Name: " + EmpName);
			 } 
		
		con.close();}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public static void insertEmp() {
		try {
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, username, password);
			
			
			 String sql="INSERT INTO employee (EmpId, EmpName, EmpDept, deptno) values(?,?,?,?)";
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setInt(1, 5);
			 ps.setString(2, "ford");
			 ps.setString(3, "research");
			 ps.setInt(4, 4);
			 
			 ps.executeUpdate();
			 
			 
		con.close();
		System.out.println("User added successfuly");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

	public static void updateEmp() {
		try {
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, username, password);
			String sql="UPDATE EMPLOYEE SET EMPNAME=? WHERE EMPID=?";
			con.prepareStatement(sql);
			 PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, "king");
			 ps.setInt(2,1);
			 
			 ps.executeUpdate();
			 
			 con.close();
				System.out.println("Updated successfuly");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void DeleteEmp() {
		try {
			Class.forName(driver);
			Connection con= DriverManager.getConnection(url, username, password);
			String sql="DELETE FROM EMPLOYEE WHERE EMPID=?";
			con.prepareStatement(sql);
			 PreparedStatement ps = con.prepareStatement(sql);
			 
			 ps.setInt(1, 5);
			 
			 ps.executeUpdate();
			 
			 con.close();
				System.out.println("Deleted successfuly");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		readAllUser();
		insertEmp();
		updateEmp();
		DeleteEmp();
	}
}
