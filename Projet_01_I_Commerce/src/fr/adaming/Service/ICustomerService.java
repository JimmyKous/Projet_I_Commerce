package fr.adaming.Service;

import fr.adaming.model.Customer;

public interface ICustomerService {
	
	public Customer addCustomer(Customer c);
	
	public int updateCustomer(Customer c);
	
	public int deleteCustomer(Customer c);
	
	public Customer getCustomer(Customer c);

}
