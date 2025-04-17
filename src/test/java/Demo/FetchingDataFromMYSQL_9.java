package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.jdbc.Driver;

public class FetchingDataFromMYSQL_9 {

	public static void main(String[] args) throws SQLException {
		
		//step1:- Register driver/load mysql database
		
		//Driver driverRef	= new Driver();		
		
	//	DriverManager.registerDriver(driverRef);
		
		//step2:- get connect to database
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "Neeta_1980");
		
		//step3:- create SQL statement
		
		Statement state = conn.createStatement();
		
		String query = "select * from employee";
		
		//step4:-excute statement/query
		
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		
		//step5:- close the database connection
		conn.close();
	
	}

}