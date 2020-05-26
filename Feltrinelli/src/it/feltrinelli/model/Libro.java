package it.feltrinelli.model;

import java.util.Date;

public class Libro {
	
	private int id_libro;
	
	private String Titolo;
	
	private String Autore;
	
	private int Pagine;
	
	private String Casa_editrice;
	
	private Date Data_pubblicazione;
	
	private String Genere;
	
	private  int Copie_disponibili;
	
	private int Copie_vendute;
	
	private float Prezzo;

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public String getAutore() {
		return Autore;
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public int getPagine() {
		return Pagine;
	}

	public void setPagine(int pagine) {
		Pagine = pagine;
	}

	public String getCasa_editrice() {
		return Casa_editrice;
	}

	public void setCasa_editrice(String casa_editrice) {
		Casa_editrice = casa_editrice;
	}

	public Date getData_pubblicazione() {
		return Data_pubblicazione;
	}

	public void setData_pubblicazione(Date data_pubblicazione) {
		Data_pubblicazione = data_pubblicazione;
	}

	public String getGenere() {
		return Genere;
	}

	public void setGenere(String genere) {
		Genere = genere;
	}

	public int getCopie_disponibili() {
		return Copie_disponibili;
	}

	public void setCopie_disponibili(int copie_disponibili) {
		Copie_disponibili = copie_disponibili;
	}

	public int getCopie_vendute() {
		return Copie_vendute;
	}

	public void setCopie_vendute(int copie_vendute) {
		Copie_vendute = copie_vendute;
	}

	public float getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}

}
