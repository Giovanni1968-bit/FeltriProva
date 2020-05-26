package it.corso.solving.dao;
import java.sql.*;


public class Dao {
	
	
	private static Connection con=null;
	
	private static Dao d=null;
	private String url="jdbc:mysql://127.0.0.1/sakila";
	
	private Dao() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			con =DriverManager.getConnection(url,"root", "root");
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("classe non trovata");
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		
		if(con==null) {
			
			new Dao();
		}
		return con;
	}

}
