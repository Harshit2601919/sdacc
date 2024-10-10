package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main5 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into info values(?,?)");
		preparedStatement.setInt(1,21);
		preparedStatement.setString(2, "Arjun");
		preparedStatement.execute();
		System.out.println("Inert");
		connection.close();
	}
}