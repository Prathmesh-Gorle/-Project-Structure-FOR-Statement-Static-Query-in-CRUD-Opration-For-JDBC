package PSG.DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
	public void select() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		Statement s = c2.createStatement();

		ResultSet rs = s.executeQuery("select * from details"); // To fetch/select a data from database
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}

	}

	public void insert() throws Exception {
		// **Load the JDBC DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		// **Define connection url
		// **Establish the database connection using DriverManager.getConnection()
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		// **create statement object for executing SQL queries
		// ** 1)Statement.executeupdate(), 2)Statement.executeQuery();
		Statement s = c1.createStatement();
		s.executeUpdate("insert into details values(3,'Prakash')"); // for INSERT/UPDATE/DELETE
		System.out.println("Record Inserted...");
	}

	public void update() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		Statement s = c2.createStatement();
		s.executeUpdate("update details set name='Pavan' where sid=3"); // single quote require in name
		System.out.println("Record updated...");
	}

	public void delete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		Statement s = c2.createStatement();
		s.executeUpdate("delete from details where sid=3"); // single quote require in name
		System.out.println("Record deleted...");
	}

}
