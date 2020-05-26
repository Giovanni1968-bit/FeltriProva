package it.corso.solving.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.corso.solving.dao.Dao;

public class ActorImpl implements ActorService {

	
	// PASSO LA STRINGA NOME PER SQL DINAMICO CHE MODIFICA LA QUERY SUL CAMPO 'NOME'
	@Override
	public ArrayList<Actor> getActor(String name) {
		
		ArrayList<Actor> at=new ArrayList<Actor>();
		
		Actor a=null;
		
		Connection c=Dao.getConnection();
		
		try {
			// GV vedi Connection.createStatement(), ResultSet su JD
			// CON 1 OGGETTO STATEMENT POSSO ESEGUIRE IN MEMORIA UN SOLO RESULT SET
			// POSSO DALVARE IL RESULTSET PER RIESEGUIRE, OPPURE CREARE UNO STATEMENT DIFFERNTE
			// SE VOGLIO ESEGUIRE UN'ALTRA QUERY
			
			Statement t=c.createStatement();
			
			ResultSet r=t.executeQuery("select * from actor where first_name='"+name+"';");
			
			
			while (r.next()) {
				
				a=new Actor();
				a.setCognome(r.getString("first_name"));
				a.setName(r.getString("last_name"));
				
				at.add(a);
			} 			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return at;
	}

	@Override
	public ArrayList<Actor> getAllActors() {
		
		ArrayList<Actor> at=new ArrayList<Actor>();
		
		Actor a=null;
		
		Connection c=Dao.getConnection();
		
		try {
						
			Statement t=c.createStatement();
			
			ResultSet r=t.executeQuery("select * from actor;");
						
			while (r.next()) {
				
				a=new Actor();
				a.setCognome(r.getString("first_name"));
				a.setName(r.getString("last_name"));
				
				at.add(a);
			} 
					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		
		return at;
	}

	@Override
	
	public int deleteActor(int id) {
		Connection c=Dao.getConnection();
		try {
			c.setAutoCommit(false);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int numeroId = id;
		try {
			
			// devo prima cancellare i record di film_actor per rispettare integrità referenziale
			Statement ti=c.createStatement();
			String sqld1 = "delete  from film_actor where actor_id="+ id +";";
			System.out.println("Sto cancellando film_actor" );
			
			ti.executeUpdate(sqld1);
			
			// Poi cancello da tabella principale
			
			Statement t=c.createStatement();
			String sqld2 = "delete  from actor where actor_id="+ id +";";
			System.out.println("Sto cancellando actor " );
			
			t.executeUpdate(sqld2);
			
			System.out.println("ho cancellato l'attore " + id );
			c.rollback();
			System.out.println("ho eseguito rollback per non perdere i dati" );			
	}
		catch (SQLException e) {
		e.printStackTrace();
	}
		finally {
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return numeroId;
	}
	
	

	@Override
	public int ActorModify(int id, String name) {
		Connection c=Dao.getConnection();
		
		String modifica = name;
		int numeroId = id;
		try {
						
			Statement t=c.createStatement();
			// occhio agli apici delle stringhe da ricercare su query
			String sql1 = "update actor set last_name = '"  +   modifica   +  "' where actor_id = " + id +  ";";
			t.executeUpdate(sql1);
								
		}
	
		catch (SQLException e) {
			e.printStackTrace();
		}
 			
			return numeroId;
		}
	
		

}
