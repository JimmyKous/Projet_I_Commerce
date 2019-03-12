package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="accessories")
public class Accessorie extends Article {

	// Constructor 
	public Accessorie() {
		super();
	}

	public Accessorie(int ref, String itemName, String description, double price, int stock, int qty, byte[] pic) {
		super(ref, itemName, description, price, stock, qty, pic);
	}

	public Accessorie(String itemName, String description, double price, int stock, int qty, byte[] pic) {
		super(itemName, description, price, stock, qty, pic);
	}
	
	
	
}
