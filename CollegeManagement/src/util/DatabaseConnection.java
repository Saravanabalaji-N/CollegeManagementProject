package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection connectionDrive() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagement", "root",
				"Saravana#026");
		return connection;
	}
	
}