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

	// Constructor
	public Order() {
		super();
	}

	public Order(String adress, Customer customer, OrderLine orderLine) {
		super();
		this.adress = adress;
		this.customer = customer;
		this.orderLine = orderLine;
	}

	public Order(int id, String adress, Customer customer, OrderLine orderLine) {
		super();
		this.id = id;
		this.adress = adress;
		this.customer = customer;
		this.orderLine = orderLine;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}
	
}
