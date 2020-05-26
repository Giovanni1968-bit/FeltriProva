package it.feltrinelli.testFeltri;

import java.sql.*;

import it.feltrinelli.dao.DaoF;
public class MyConnection {
	
	

	public static void main(String[] args)
	{
		
		
		
		String query="select * from impiegato";
		
		try
		{
			
			
			
			
			Connection con =DaoF.getConnection();

			Statement st=con.createStatement();


			ResultSet x=st.executeQuery(query);

			while (x.next())
			{
				
				
				System.out.print("  nome ---> "+x.getString("Nome"));
				System.out.println("  cognome --> "+x.getString("Cognome"));
				
			}
			
		}
			

		catch (SQLException e)
			{
					System.out.println("errore sql");
					e.printStackTrace();
			}
		
	}
}


