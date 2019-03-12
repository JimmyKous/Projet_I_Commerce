package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Auto Increment
	@Column(name="ref_a")
	private int ref;
	
	@Column(name="itemName_a")
	private String itemName;
	
	@Column(name="description_a")
	private String description;
	
	@Column(name="price_a")
	private double price;
	
	@Column(name="stock_a")
	private int stock;
	
	@Column(name="qty_a")
	private int qty;
	
	@Column(name="pic_a")
	private byte[] pic;
	
	// Transform UML to Java Association
	@ManyToOne
	@JoinColumn(name="o_id", referencedColumnName="id_o")
	private Order order;
	
}
