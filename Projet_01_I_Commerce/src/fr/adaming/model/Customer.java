package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

		public Customer() {
			super();
		}

		// Constructors
		public Customer(String name, String mail) {
			super();
			this.name = name;
			this.mail = mail;
		}

		public Customer(int id, String name, String mail) {
			super();
			this.id = id;
			this.name = name;
			this.mail = mail;
		}

		// Getters & Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		// toString
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", mail=" + mail + "]";
		}
		
		
		
		
		
}
