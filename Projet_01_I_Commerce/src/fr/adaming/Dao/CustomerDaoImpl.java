package fr.adaming.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.model.Customer;

public class CustomerDaoImpl implements ICustomerDao {
	
	// This annotation allows to inject an EntityManager instantiated by EJB Container
	@PersistenceContext(unitName="PU_I_Commerce")
	private EntityManager em;
	
	@Override
	public Customer addCustomer(Customer c) {
		em.persist(c);
		return c;
	}

	@Override
	public int updateCustomer(Customer c) {
		// JPQL Request
		String req = "UPDATE Customer AS c SET c.name=:pName, c.mail=:pMail, c.adress=:pAdress WHERE c.id=:pId ";
		
		// Instanciate Query Object
		Query query = em.createQuery(req);
		
		// Parameters
		query.setParameter("pName", c.getName());
		query.setParameter("pMail", c.getMail());
		query.setParameter("pAdress", c.getAdress());
		query.setParameter("pId", c.getId());
		
		return query.executeUpdate();
	}

	@Override
	public int deleteCustomer(Customer c) {
		// JPQL Request
		String req = "DELETE Customer AS c WHERE c.id=:pId ";
		
		// Instantiate Query Object
		Query query = em.createQuery(req);
		
		// Parameters
		query.setParameter("pId", c.getId());
		
		return query.executeUpdate();
	}

	@Override
	public Customer getCustomer(Customer c) {
		return em.find(Customer.class, c);
	}


}
