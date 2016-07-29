package sk.ehr.learning.trainee.domain.entity;

import sk.ehr.learning.util.Entity;

public class Trainee implements Entity {
	//
	private String eid; 
	private String name; 
	private String title; 
	private String department; 
	private String asignedTask; 
	
	public Trainee() {
		// 
	}

	@Override
	public String getId() {
		return eid; 
	}
	
	@Override
	public String getIdFormat() {
		return "%1d%4d"; 		// 1:type, 4:sequence 
	}

}