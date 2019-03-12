package fr.adaming.model.articles;

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

	public Surf() {
		super();
	}

	public Surf(String itemName, String description, double price, int stock, int qty, byte[] pic, String shapeS,
			double heightS, double widthS, double thickS) {
		super(itemName, description, price, stock, qty, pic);
		this.shapeS = shapeS;
		this.heightS = heightS;
		this.widthS = widthS;
		this.thickS = thickS;
	}

	public Surf(int ref, String itemName, String description, double price, int stock, int qty, byte[] pic,
			String shapeS, double heightS, double widthS, double thickS) {
		super(ref, itemName, description, price, stock, qty, pic);
		this.shapeS = shapeS;
		this.heightS = heightS;
		this.widthS = widthS;
		this.thickS = thickS;
	}

	public String getShapeS() {
		return shapeS;
	}

	public void setShapeS(String shapeS) {
		this.shapeS = shapeS;
	}

	public double getHeightS() {
		return heightS;
	}

	public void setHeightS(double heightS) {
		this.heightS = heightS;
	}

	public double getWidthS() {
		return widthS;
	}

	public void setWidthS(double widthS) {
		this.widthS = widthS;
	}

	public double getThickS() {
		return thickS;
	}

	public void setThickS(double thickS) {
		this.thickS = thickS;
	}

}
