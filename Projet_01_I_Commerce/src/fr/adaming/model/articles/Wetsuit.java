package fr.adaming.model.articles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="wetsuits")
public class Wetsuit extends Article {
	
	// Attributes
	@Column(name="size_w")
	private String sizeW;

	public Wetsuit() {
		super();
	}

	public Wetsuit(String itemName, String description, double price, int stock, int qty, byte[] pic, String sizeW) {
		super(itemName, description, price, stock, qty, pic);
		this.sizeW = sizeW;
	}

	public Wetsuit(int ref, String itemName, String description, double price, int stock, int qty, byte[] pic,
			String sizeW) {
		super(ref, itemName, description, price, stock, qty, pic);
		this.sizeW = sizeW;
	}

	public String getSizeW() {
		return sizeW;
	}

	public void setSizeW(String sizeW) {
		this.sizeW = sizeW;
	}
	
	
}