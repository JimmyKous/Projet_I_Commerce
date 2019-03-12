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
	
	
	
}
