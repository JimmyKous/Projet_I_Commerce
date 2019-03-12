package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
	
	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Auto Increment
	@Column(name="id_cat")
	private int idCat;
	
	@Column(name="Name_cat")
	private String categoryName;
	
	@Column(name="description_cat")
	private String description;

	// Constructors
	public Category() {
		super();
	}

	public Category(String categoryName, String description) {
		super();
		this.categoryName = categoryName;
		this.description = description;
	}

	public Category(int idCat, String categoryName, String description) {
		super();
		this.idCat = idCat;
		this.categoryName = categoryName;
		this.description = description;
	}

	// Getters & Setters
	public int getIdCat() {
		return idCat;
	}

	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
	
