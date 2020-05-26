package prova;

public class Exec_Dipendente package it.feltrinelli.feltrinelli;

import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Scrollbar;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;

import it.feltrinelli.model.*;




public class FinestraAccesso extends Frame implements ActionListener{

	public TextField campoDipendente = null;
	public Label scrittaDipendente = null;
	public TextField campoDipendenteInserito = null;
	public TextField campoDipendenteInserito2 = null;
	public Label scrittaDipendenteInserito = null;
	public Button bottoneCerca = null;
	public Button bottoneCerca2 = null;
	public Button bottoneEsci = null;
	public Label erroreInserimento = null;
	public ImpiegatoImpl listaImpiegati = new ImpiegatoImpl();

	
	public FinestraAccesso(String title){

		super(title);
		


		this.setBackground(Color.YELLOW);
		this.setLayout(null); 
		this.setSize(500,300);
		this.setLocation(430,200);
		this.setVisible(true);


		campoDipendente = new TextField();
		campoDipendente.setBackground(Color.WHITE);
		campoDipendente.setLocation(30,90);
		campoDipendente.setSize(130,20);
		this.add(campoDipendente);


		scrittaDipendente = new Label("CERCA DIPENDENTE (NOME)");
		scrittaDipendente.setLocation(20,60);
		scrittaDipendente.setSize(180,20);
		this.add(scrittaDipendente);
		
		campoDipendenteInserito = new TextField();
		campoDipendenteInserito.setBackground(Color.WHITE);
		campoDipendenteInserito.setLocation(30,200);
		campoDipendenteInserito.setSize(130,20);
		this.add(campoDipendenteInserito);
		
		campoDipendenteInserito2 = new TextField();
		campoDipendenteInserito2.setBackground(Color.WHITE);
		campoDipendenteInserito2.setLocation(30,230);
		campoDipendenteInserito2.setSize(130,20);
		this.add(campoDipendenteInserito2);


		scrittaDipendenteInserito = new Label("INSERISCI DIPENDENTE (nome e cognome)");
		scrittaDipendenteInserito.setLocation(20,170);
		scrittaDipendenteInserito.setSize(250,20);
		this.add(scrittaDipendenteInserito);


		bottoneCerca = new Button("CERCA");
		bottoneCerca.setBackground(Color.PINK);
		bottoneCerca.setLocation(270,60);
		bottoneCerca.setSize(80,37);
		bottoneCerca.addActionListener(this);
		this.add(bottoneCerca);
		
		bottoneCerca2 = new Button("CERCA");
		bottoneCerca2.setBackground(Color.GREEN);
		bottoneCerca2.setLocation(270,207);
		bottoneCerca2.setSize(80,37);
		bottoneCerca2.addActionListener(this);
		this.add(bottoneCerca2);

		bottoneEsci = new Button("ESCI");
		bottoneEsci.setBackground(Color.WHITE);
		bottoneEsci.setLocation(390,240);
		bottoneEsci.setSize(70,30);
		bottoneEsci.addActionListener(this);
		this.add(bottoneEsci);

		erroreInserimento = new Label(""); //dopo diventa dipendente non trovato
		erroreInserimento.setLocation(40,255);
		erroreInserimento.setForeground(Color.RED);
		erroreInserimento.setSize(290,20);
		this.add(erroreInserimento);
	
		
	}

	public void actionPerformed(ActionEvent e){
		
		

		if (e.getSource().equals(bottoneEsci)){ 


			System.exit(0);
		}
						
				
				//se   stato cliccato il pulsante acc ovvero accedi
		if(e.getSource()==bottoneCerca)	{

			ArrayList<Impiegato> i = listaImpiegati.getImpiegato(campoDipendente.getText());
			
			if((listaImpiegati.getImpiegato(campoDipendente.getText()) != null)) {
											
				for(int j=0; j<i.size();j++) {
					
					
					 JFrame frame = new JFrame("Dipendenti");
					 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 Vector <String> listaImpiegato = new Vector <String>();
					 JList <String> list = new JList <String> (listaImpiegato); 
					 listaImpiegato.add(i.get(j).getCognome()); 
					 frame.add(new JScrollPane(list));
					 frame.setLocation(950, 290);
					 frame.setSize(300, 130); // per visualizzare barre a scorrimento
					 frame.setVisible(true);
					 

					 
							
				}
			}
		}
		int contatore = 0;
		
		if(e.getSource()==bottoneCerca2)	{
		
			ArrayList<Impiegato> i = listaImpiegati.getImpiegato(campoDipendenteInserito.getText());
			
			
			if((listaImpiegati.getImpiegato(campoDipendenteInserito.getText()) != null)) {
				
				for(int j=0; j<i.size();j++) {
					
					
					if (i.get(j).getCognome().equals(campoDipendenteInserito2.getText())) {
						contatore ++;
					}
					
					if (contatore == 1) {
						erroreInserimento.setText("Ciao dipendente "+ campoDipendenteInserito.getText() + " " + campoDipendenteInserito2.getText());
						
					}
					else {
						erroreInserimento.setText("Non esiste nessun dipendente");
					}
					
				}
			}
		}
	}		
}