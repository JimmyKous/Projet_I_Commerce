package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="surfs")
public class Surf extends Article {
	
	// Attributes
	@Column(name="shape_s")
	private String shapeS;
	
	@Column(name="height_s")
	private double heightS;
	
	@Column(name="width_s")
	private double widthS;
	
	@Column(name="thick_s")
	private double thickS;

}
