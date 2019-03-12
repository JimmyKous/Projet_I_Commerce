package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_lines")
public class OrderLine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ol")
	private int idOL;

	@Column(name="qty_ol")
	private int qtyOL;
	
	@Column(name="price_ol")
	private double priceOL;
	
	// Transform UML to Java Association
	@OneToMany(mappedBy="orderLine", cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<Article> articles;
	
	@OneToMany(mappedBy="orderLine", cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<Order> orders;
}
