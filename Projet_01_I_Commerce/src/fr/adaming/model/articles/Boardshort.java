package fr.adaming.model.articles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="boardshorts")
public class Boardshort extends Article {
	
	// Attributes
	@Column(name="size_b")
	private String sizeB;

	public Boardshort() {
		super();
	}

	public Boardshort(String itemName, String description, double price, int stock, int qty, byte[] pic, String sizeB) {
		super(itemName, description, price, stock, qty, pic);
		this.sizeB = sizeB;
	}

	public Boardshort(int ref, String itemName, String description, double price, int stock, int qty, byte[] pic,
			String sizeB) {
		super(ref, itemName, description, price, stock, qty, pic);
		this.sizeB = sizeB;
	}

	public String getSizeB() {
		return sizeB;
	}

	public void setSizeB(String sizeB) {
		this.sizeB = sizeB;
	}
	
}