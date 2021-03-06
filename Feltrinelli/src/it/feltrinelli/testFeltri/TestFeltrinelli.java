package it.feltrinelli.testFeltri;


import java.util.ArrayList;

import it.feltrinelli.model.Impiegato;
import it.feltrinelli.model.ImpiegatoImpl;

public class TestFeltrinelli {
	
public static void main(String[] args) {
		
	ImpiegatoImpl ii = new ImpiegatoImpl();
		
	//gv chiamo select di impiegati con discriminante 'where'... ** gi� implementato
		ArrayList<Impiegato> i = ii.getImpiegato("Emanuele");
		
		for(int j=0; j<i.size();j++) {
			System.out.println("cognome impiegato --->"+i.get(j).getCognome());
			System.out.println("nome impiegato --->"+i.get(j).getNome());
		}
		
	//gv chiamo update
		ImpiegatoImpl aui=new ImpiegatoImpl();	
		int numActUpdate  =aui.ImpiegatoModify(5, "HEASE");
		
		System.out.println("ho modificato il cognome  dell'attore con  id" + numActUpdate+ " in  HEASE" );
	 
		// gv chiamo cancellazione
		
		ImpiegatoImpl aud=new ImpiegatoImpl();
	
		int impiegatoDel = aud.deleteImpiegato(5);
		System.out.println(" sono in testFeltrinelli, ho cancellato il numero:" + impiegatoDel);
		
		// gv chiamo INSERT
		
				ImpiegatoImpl ins=new ImpiegatoImpl();
//				int impiegatoInsert = ins.ImpiegatoInsert(13, "SERGIO", "ROSSI" , "1988-02-15", "2008-02-15", 1700, 2);
				boolean seInserito = ins.ImpiegatoInsert( "Giovanni", "Bino" , "1945-12-15", "1972-10-07", 2300, 2);
				if (seInserito) {System.out.println(" sono in testFeltrinelli, INSERITO l impiegato cognome Sergio rossi  ");
				}
				
				
				
	}

}
