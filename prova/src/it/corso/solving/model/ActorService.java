package it.corso.solving.model;

import java.util.ArrayList;

public interface ActorService {
	
	
	public ArrayList<Actor> getActor(String name);
	
	public ArrayList<Actor> getAllActors();
	
	public int deleteActor(int id);
	
	public int ActorModify(int id,String name);
	
	//GV inserisce nuovo attore
//	public int ActorInsert(int id,String name ........);
	
	// public int Actorinsert(Actor attore);
		
	
	
	
	

}
