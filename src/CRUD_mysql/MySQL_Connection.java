package CRUD_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_Connection {
	public static void main(String[] args) throws ClassNotFoundException {
		String databaseURL = "";
		String user = "";
		String password = "";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sonoo", "root", "");
			if (conn != null) {
				System.out
						.println("MySQL DB: Connection Established Successfully");
			}
		} catch (SQLException ex) {
			System.out
					.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}// catch block
			}// if block
		}// finally
	}// main()

}