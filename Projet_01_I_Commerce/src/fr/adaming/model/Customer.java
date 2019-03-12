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

@Entity // Persistant Entity
@Table(name="customers") // Table Name
public class Customer {

	// Attributes
	@Id // id is primary key 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Auto Increment
	@Column(name="id_c") // Column name
	private int id;
	
	@Column(name="mail_c")
	private String name;
	
	@Column(name="pw_c")
	private String mail;
	
	@Column(name="adress_c")
	private String adress;
	
	// Transform UML to Java association
	@OneToMany(mappedBy="customer", cascade={CascadeType.REMOVE, CascadeType.PERSIST}, fetch=FetchType.EAGER)
	private List<Order> orders;
	
}