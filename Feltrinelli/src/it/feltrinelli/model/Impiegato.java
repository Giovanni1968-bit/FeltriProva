package it.feltrinelli.model;

import java.util.Date;

public class Impiegato {
	
		private int id_impiegato;
		
		private String nome;
		
		private String cognome;
		
		private Date Data_nascita;
		
		private Date Data_assunzione;
		
		private float Stipendio;
		
		private int id_sede;
		
		public Impiegato() {
			super();
		}
		
		public int getId() {
			return id_impiegato;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}
		
		public Date getData_nascita() {
			return Data_nascita;
		}

		public void setData_nascita(Date data_nascita) {
			this.Data_nascita = data_nascita;
		}
		
		public Date getData_assunzione() {
			return Data_assunzione;
		}

		public void setData_assunzione(Date data_assunzione) {
			this.Data_assunzione = data_assunzione;
		}
		
		public float getStipendio() {
			return Stipendio;
		}

		public void setStipendio(float stipendio) {
			this.Stipendio = stipendio;
		}
		
		public int getId_sede() {
			return id_sede;
		}

		public void setId_sede(int id_sede) {
			this.id_sede = id_sede;
		}

}
