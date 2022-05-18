import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveUser {
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONNECTION_URL = "jdbc:mysql://localhost:3307/shopApp";
	String USER_ID = "root";
	String PASSWORD = "root";
	Statement stmt = null;
	public Connection createConnection(String name, String email, String password) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(CONNECTION_URL, USER_ID, PASSWORD);
			if(con != null) {
//				String name = "John";
//				String email = "john12@gmail.com";
//				String password = "1234";
				stmt = con.createStatement();
				System.out.println("Connection Created...");
//				String query = "INSERT INTO users VALUES ('Ravi', 'ravi12@gmail.com', '1234')";
				String query = "INSERT INTO users VALUES ('" + name + "'," + "'" + email + "','" + password + "')";
				stmt.executeUpdate(query);
				System.out.println("Data Inserted Successfully...");
			}
		return null;
	}

//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		SaveUser obj = new SaveUser();
//		obj.createConnection();
//	}

}
