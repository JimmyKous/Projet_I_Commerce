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
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_o")
	private int id;
	
	@Column(name="adress_o")
	private String adress;
	
	// Transform UML to Java Association
	@ManyToOne
	@JoinColumn(name="c_id", referencedColumnName="id_c")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name="id_ol_art", referencedColumnName="id_ol")
	private OrderLine orderLine;
	


}
