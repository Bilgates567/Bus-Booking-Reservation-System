package BusResv;

import java.sql.*;

public class DbConnection{
	private static final String url = "jdbc:mysql://localhost:3306/busresv";
	private static final String userName = "root";
	private static final String passWord = "Billa123@*";
	
	public static Connection getConnection()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return  DriverManager.getConnection(url,userName,passWord);
	}

}