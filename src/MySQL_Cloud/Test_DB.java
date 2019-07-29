package MySQL_Cloud;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_DB {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:sql106.epizy.com/epiz_23246390_MySql",
					"epiz_23246390", "T5zUPYW3kUtw");
			System.out.println("Connection established Successfully...");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}
}
