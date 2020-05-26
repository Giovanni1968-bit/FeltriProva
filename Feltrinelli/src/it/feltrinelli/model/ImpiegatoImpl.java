package it.feltrinelli.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.feltrinelli.dao.DaoF;

public class ImpiegatoImpl implements ImpiegatoService {
	
	String tableInq = null;
	String FunctionInq= null;
	String whereInq = null;
	String[] campiInq1 = null;
	String[] campiInq2 = null;
	
	
	@Override
	public ArrayList<Impiegato> getImpiegato(String nome) {
		
		
		ArrayList<Impiegato> im = new ArrayList<Impiegato>();
		
		
		Impiegato i = null;
		
		Connection c = DaoF.getConnection();
		
		try {
			
			Statement t = c.createStatement();
			
			ResultSet r = t.executeQuery("select * from impiegati where Nome='"+nome+"';");
			
			while (r.next()) {
				
				i=new Impiegato();
				i.setCognome(r.getString("Cognome"));
				i.setNome(r.getString("Nome"));
				
				im.add(i);
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return im;
	}


	@Override
	public ArrayList<Impiegato> getImpiegati() {
		// TODO Auto-generated method stub
		ArrayList<Impiegato> im = new ArrayList<Impiegato>();
		Impiegato i = null;
		
		Connection c = DaoF.getConnection();
		
		try {
			
			Statement t = c.createStatement();
			
			ResultSet r = t.executeQuery("select * from impiegati");
			
			while (r.next()) {
				
				i=new Impiegato();
				i.setCognome(r.getString("Cognome"));
				i.setNome(r.getString("Nome"));
				
				im.add(i);
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return im;
	}

	@Override
	public int deleteImpiegato(int id_impiegato) {
		Connection c=DaoF.getConnection();
		try {
			c.setAutoCommit(false);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int numeroId = id_impiegato;
		try {					
			// cancello da tabella impiegato
			
			Statement t=c.createStatement();
			String sqld2 = "delete  from impiegati where id_impiegato="+ id_impiegato +";";
			System.out.println("Sto cancellando l'impiegato " );
			
			t.executeUpdate(sqld2);
			
			System.out.println("ho cancellato l'impiegato " + id_impiegato );
			c.rollback();
			System.out.println("ho eseguito rollback per non perdere i dati" );			
	}
		catch (SQLException e) {
		e.printStackTrace();
	}
		
		return numeroId;
	}
	
	
	@Override
	public int ImpiegatoModify(int id_impiegato, String nome) {
		Connection c=DaoF.getConnection();
		
		String modifica = nome;
		int numeroId = id_impiegato;
		try {
						
			Statement t=c.createStatement();
			// occhio agli apici delle stringhe da ricercare su query
			String sql1 = "update impiegati set cognome = '"  +   modifica   +  "' where id_impiegato = " + id_impiegato +  ";";
			t.executeUpdate(sql1);
								
		}
	
		catch (SQLException e) {
			e.printStackTrace();
		}
 			
			return numeroId;
		}
	
	@Override
	// prova public int ImpiegatoInsert( int id_impiegato, String Nome,  String Cognome,  String Data_nascita,
	public boolean ImpiegatoInsert( String Nome,  String Cognome,  String Data_nascita,
			String Data_assunzione,
			  float Stipendio,
			  int id_sede) 
	{
		Connection c=DaoF.getConnection();
		try {
			c.setAutoCommit(true);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			 // test  int id_imp = id_impiegato;
			boolean  seInserito = true;
		
			  // TIPI E CAMPI DA INSERIRE
			  
			  
			  // ***codice
			  try {
					
					Statement t=c.createStatement();
					String sql1 = "insert  into impiegati  ( Nome,  Cognome,  " 
							+ "Data_nascita, Data_assunzione, Stipendio, id_sede) "
		//					+ "VALUES ( " +  id_impiegato + ", '" + Nome + "',' " + Cognome+ " ',' " + Data_nascita + 
							+ "VALUES ( ' " +  Nome + "',' " + Cognome+ " ',' " + Data_nascita + 
							 "',' " + Data_assunzione + "'," + Stipendio  +  ", "  + id_sede + ");   ";
					
					t.executeUpdate(sql1);
										
				}
			
				catch (SQLException e) {
					e.printStackTrace();
					seInserito = false;
					return seInserito;
				}
			  
	           // test return id_imp;}
	           return seInserito; }




}
