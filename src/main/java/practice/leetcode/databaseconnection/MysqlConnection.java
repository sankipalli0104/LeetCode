package practice.leetcode.databaseconnection;
import java.sql.*;
public class MysqlConnection {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//DriverClass
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_schema?serverTimezone=UTC", "root", "Apple@123"); //Connection
			// here mysql is database name, root is username and password
			// java.sql.SQLException: The server time zone value 'Standard Time PDT' is unrecognized or represents more than one time zone. You must configure either the server or JDBC driver (via the serverTimezone configuration property) to use a more specifc time zone value if you want to utilize time zone support.
			// Solution: ?serverTimezone=UTC
			Statement stmt = con.createStatement();//Statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM school_schema.STUDENT");//For result purpose
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" "+rs.getString(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
