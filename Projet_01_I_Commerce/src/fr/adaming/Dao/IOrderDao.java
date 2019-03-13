package fr.adaming.Dao;

import fr.adaming.model.Order;

public interface IOrderDao {

	public Order addOrder(Order o);
	
	public int updateOrder(Order o);
	
	public int deleteOrder(Order o);
	
	public Order getOrder(Order o);
	
}
