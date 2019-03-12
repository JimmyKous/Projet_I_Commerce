package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	@OneToOne
	@JoinColumn(name="c_id", referencedColumnName="id_c")
	private Customer c;

	@OneToMany(mappedBy="order", cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@Column
	private List<Article> choices;

	// Constructors
	public Order() {
		super();
	}
	
	public Order(String adress) {
		super();
		this.adress = adress;
	}

	public Order(int id, String adress) {
		super();
		this.id = id;
		this.adress = adress;
	}

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

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}

	public List<Article> getChoices() {
		return choices;
	}

	public void setChoices(List<Article> choices) {
		this.choices = choices;
	}

}
