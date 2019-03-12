package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Auto Increment
	@Column(name="ref_a")
	private int ref;
	
	@Column(name="itemName_a")
	private String itemName;
	
	@Column(name="description_a")
	private String description;
	
	@Column(name="price_a")
	private double price;
	
	@Column(name="stock_a")
	private int stock;
	
	@Column(name="qty_a")
	private int qty;
	
	@Column(name="pic_a")
	private byte[] pic;
	
	// Transform UML to Java Association
	@ManyToOne
	@JoinColumn(name="o_id", referencedColumnName="id_o")
	private Order order;

	public Article() {
		super();
	}

	public Article(String itemName, String description, double price, int stock, int qty, byte[] pic) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.qty = qty;
		this.pic = pic;
	}

	public Article(int ref, String itemName, String description, double price, int stock, int qty, byte[] pic) {
		super();
		this.ref = ref;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.qty = qty;
		this.pic = pic;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
