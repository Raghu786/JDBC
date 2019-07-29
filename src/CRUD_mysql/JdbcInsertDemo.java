package CRUD_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A sample program that demonstrates how to execute SQL INSERT statement using
 * JDBC.
 * 
 * @author www.codejava.net
 * 
 */
public class JdbcInsertDemo {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sonoo";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(dbURL, username,
				password)) {

			String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, "bill");
			statement.setString(2, "secretpass");
			statement.setString(3, "Bill Gates");
			statement.setString(4, "bill.gates@microsoft.com");

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}// if condition

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}//main()
}