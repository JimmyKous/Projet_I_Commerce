package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="boardshorts")
public class Boardshort extends Article {
	
	// Attributes
	@Column(name="size_b")
	private String sizeB;
	
}