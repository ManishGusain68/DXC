package com.stateObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrainerDetails")
public class Trainer {
	@Id
	private int id;
	private String name;
	private int rating;

	public Trainer(int id, String name, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	

}
