//package Demo;
//
//import com.mysql.cj.jdbc.Driver;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class InsertDataIntoDataBase_10 {
//
//	public static void main(String[] args) throws SQLException {
//		
//		// step1:- Register driver/load mysql database
//		
//				Driver driverRef = new Driver();
//
//				DriverManager.registerDriver(driverRef);
//
//				// step2:- get connect to database
//				
//				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root", "Neeta_1980");
//				
//				// step3:- create SQL statement
//				
//				Statement state = conn.createStatement();
//				
//				String query = "insert into employee values('4','boo','ram','goa')";
//
//				int result = state.executeUpdate(query);
//				
//				if (result == 1) {
//					
//					System.out.println("Data is inserted");
//					
//				} else {
//					
//					System.out.println("Data is not inserted");
//				}
//
//				conn.close();
//			}
//
//
//
//	}
//
