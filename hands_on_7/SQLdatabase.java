package hands_on_7;

// YOU NEED TO ADD THE JDBC CONNECTOR DRIVER TO YOUR CLASS PATH!!!!!!!!!!
// Right click -> Build Path -> Libraries -> Add External JAR  -> and add the mySQL Connector JAR
// (C:\Program Files (x86)\MySQL\Connector.J 5.1\mysql-connector-java-5.1.25-bin.jar)

import java.sql.*;
//import com.mysql.jdbc;




public class SQLdatabase {
	// JDBC driver name and database URL:
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";
	
    // Database credentials:
    static final String USER = "root"; 
    static final String PASS = "root"; // insert the password to SQL server 
    
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try{
			// Register JDBC driver:
			Class.forName(JDBC_DRIVER);
			
			// Open a connection:
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// Execute a query to create database:
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			// Create database students
			String sql = "create database if not exists students";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
			
			// Connect to the created database STUDENTS and create table REGISTRATION
			conn = DriverManager.getConnection(DB_URL + "STUDENTS", USER, PASS);
			
			// Create table REGISTRATION with corresponding attributes
			sql = "use students";
			stmt.executeUpdate(sql);
			sql = "drop table if exists registration";
			stmt.executeUpdate(sql);
			sql = "create table if not exists registration(id int NOT NULL, first_name varchar(50), last_name varchar(50), age int, primary key (id))";
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database successfully...");
			
			// Insert values into the table
			sql = "insert into registration values(100,'Anders','Berg',21)";
			stmt.executeUpdate(sql);
			sql = "insert into registration values(101,'Anna','Bellini',20)";
			stmt.executeUpdate(sql);
			sql = "insert into registration values(102,'Steve','Warlock',22)";
			stmt.executeUpdate(sql);
			sql = "insert into registration values(103,'Sumit','Mittal',24)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
			
			sql = "SET SQL_SAFE_UPDATES = 0";
			stmt.executeUpdate(sql);
			
			// Create the java mySQL update Prepared Statement
			String query = "update registration set age=? where first_name=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt(1,23);
			preparedStmt.setString(2,"Sumit");
			preparedStmt.execute();
			System.out.println("Sumit Updated");
			
			// Insert a new values to the table with Prepared Statement
			query = "insert into registration values(?, ?, ?, ?)";
			preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt(1,104);
			preparedStmt.setString(2,"Todor");
			preparedStmt.setString(3,"Nicolescu");
			preparedStmt.setInt(4,27);
			preparedStmt.execute();
			//preparedStmt.setInt(1,105);
			//preparedStmt.setString(2,"Matteo");
			//preparedStmt.setString(3,"Berlusconi");
			//preparedStmt.setInt(4,23);
			//preparedStmt.execute();
			System.out.println("Nicolescu Updated");
			
		}
		catch(SQLException se){
			//Handle errors for JDBC 
			System.out.println("Problems with the SQL DBMS - Please Check SQL Server, Driver, Connection, Username, Pass, ... \n");
			//se.printStackTrace();
		}
		catch(Exception e){
			//Handle errors for JDBC 
			e.printStackTrace();
		}
		
		System.out.println("Goodbye!"); 
	}

}
