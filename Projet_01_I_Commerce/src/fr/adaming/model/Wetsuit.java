package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="wetsuits")
public class Wetsuit extends Article {
	
	// Attributes
	@Column(name="size_w")
	private String sizeW;
	
}