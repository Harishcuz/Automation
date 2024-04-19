package SeleniumConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConcept {

	public static String cvb(String localReference) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql:127.0.0.1:3306/databaseschema","root","");
		String sqlQuery = "select * from testtable"+"where locatorreference ='"+localReference+"'";
		PreparedStatement ps = connect.prepareStatement(sqlQuery);
		ResultSet r = ps.executeQuery();
		while(r.next()) {
			String locator = r.getString(3);
			System.out.println(locator);
		}
		connect.close();
		return sqlQuery;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		cvb("username");
	}
}
