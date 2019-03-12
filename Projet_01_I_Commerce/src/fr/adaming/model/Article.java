package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class Article {
	
	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_art")
	private int idArt;
	
	@Column(name="designation_art")
	private String designation;
	
	@Column(name="description_art")
	private String description;
	
	@Column(name="price_art")
	private double price;
	
	@Column(name="stock_art")
	private String stock;
	
	@Column(name="picture_art")
	private byte[] picture;
	
	// Transform UML to Java Association
	@ManyToOne
	@JoinColumn(name="id_cat_art", referencedColumnName="id_cat")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="id_ol_art", referencedColumnName="id_ol")
	private OrderLine orderLine;
	
	
}
