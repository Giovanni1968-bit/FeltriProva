package it.feltrinelli.dao;
import java.sql.*;


public class DaoF {
	
	
	private static Connection con=null;
	
	private static DaoF d=null;
	private String url="jdbc:mysql://127.0.0.1/feltrinelli";
	
	private DaoF() {
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		
		if(con==null) {
			
			new DaoF();
		}
		return con;
	}

}


