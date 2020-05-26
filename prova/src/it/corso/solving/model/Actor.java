package it.corso.solving.model;


//java bean sulla tabella actor del db sakila
public class Actor {
	
	private String name;
	private String cognome;
	private int id;
	
	
	
	public Actor() {
		super();
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
