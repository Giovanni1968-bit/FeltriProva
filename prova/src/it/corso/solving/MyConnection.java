package it.corso.solving;

import java.sql.*;

import it.corso.solving.dao.Dao;
public class MyConnection {
	
	

	public static void main(String[] args)
	{
		
		
		
		String query="select * from actor";
		
		try
		{
			
			
			
			
			Connection con =Dao.getConnection();

			Statement st=con.createStatement();


			ResultSet x=st.executeQuery(query);

			while (x.next())
			{
				
				
				System.out.print("  nome ---> "+x.getString("first_name"));
				System.out.println("  cognome --> "+x.getString("last_name"));
				
			}
			
		}
			

		catch (SQLException e)
			{
					System.out.println("errore sql");
					e.printStackTrace();
			}
		
	}
}

