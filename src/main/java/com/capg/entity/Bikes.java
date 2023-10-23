package com.capg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bikes {
	
@Id
	private int id;
	private String name;
	
	public Bikes(){
		
	}

	public Bikes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bikes [id=" + id + ", name=" + name + "]";
	}
	
	

}
