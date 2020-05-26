package it.corso.solving;

import java.util.ArrayList;

import it.corso.solving.model.Actor;
import it.corso.solving.model.ActorImpl;

public class TestActor {

	public static void main(String[] args) {
		
		ActorImpl ai=new ActorImpl();		
		ArrayList<Actor> a=ai.getActor("penelope");
		
		//GV ESTRAGGO TUTTI GLI ATTORI DI NOME PENELOPE
		System.out.println("Estraggo solo gli attori di nome Penelope");
		
		for(int j=0;j<a.size();j++) {
			
			System.out.println("cognome attore --->"+a.get(j).getCognome());
			System.out.println("nome attore --->"+a.get(j).getName());
			   
		}				

				
		// gv   ESTRAGGO TUTTI GLI ATTORI
		
		ActorImpl ab=new ActorImpl();	
		ArrayList<Actor> b=ab.getAllActors();
		System.out.println("Estraggo tutti  gli attori ");	
		
		for(int j1=0;j1<b.size();j1++) {
			
			System.out.println("cognome attore --->"+b.get(j1).getCognome());
			System.out.println("nome attore --->"+b.get(j1).getName());
		}
		
		
		// gv   update DELL'  ATTORE CON ID IN INPUT E STRINGA CORRETTA IN INPUT.
		ActorImpl aui=new ActorImpl();	
		int numActUpdate  =aui.ActorModify(3, "HEASE");
		
		System.out.println("ho modificato il cognome  dell'attore con  id" + numActUpdate+ " da CHASE A HEASE" );
		
		// gv   CANCELLAZIONE  DELL'  ATTORE CON ID IN INPUT 
		
		ActorImpl aud=new ActorImpl();
		//int attoreDel = aud.deleteActor(4);
		// l'id 4 e 5 ormai l'ho cancellato testo la rollback su 6 (OK)
		int attoreDel = aud.deleteActor(6);
		
		}
		
	}
		
		
			
		
		
			
	

	

