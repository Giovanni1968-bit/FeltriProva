package it.feltrinelli.model;

import java.util.ArrayList;

public interface ImpiegatoService {
	
public ArrayList<Impiegato> getImpiegato(String nome);
	
	public ArrayList<Impiegato> getImpiegati();
	
	public int deleteImpiegato(int id_impiegato);
	
	public int ImpiegatoModify(int id_impiegato, String nome);
	
	//gv
	
	// public int ImpiegatoInsert( int id_impiegato, String Nome,  String Cognome,  
	 public boolean ImpiegatoInsert(String Nome,  String Cognome, 
			String Data_nascita,
			String Data_assunzione,
			 float Stipendio,
			int id_sede);
	

}
