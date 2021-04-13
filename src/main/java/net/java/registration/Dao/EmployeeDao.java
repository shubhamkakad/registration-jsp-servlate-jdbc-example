package net.java.registration.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import net.java.registration.model.Employee;

public class EmployeeDao extends Employee {
//	create register employee method
	
	public int Registeremployee(Employee employee) throws ClassNotFoundException{
		String INSERT_USER_SQL = "INSERT INTO employee" + "(id, FirstName,LastName,username ,pass,city) VALUES "+
	"(?,?,?,?,?,?);";
		
		int result = 0;									
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection connection = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mysql_database?useSSL = false","root","root");
			
				
//				Create a statement using  connection object
				
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL))
		{  	
		
        		preparedStatement.setInt(1,1);
				preparedStatement.setString(2, employee.getFirstName());
				preparedStatement.setString(3, employee.getLastName());
				preparedStatement.setString(4, employee.getUserName());
				preparedStatement.setString(5, employee.getPass());
				preparedStatement.setString(2, employee.getCity());
				System.out.println(preparedStatement);
				
//				Execute query update 
				result = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		
//		Process sequel exception
		
		e.printStackTrace();
	
	}
return result;	

	}
}
