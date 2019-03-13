package fr.adaming.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.model.Category;

public class CategoryDaoImpl implements ICategoryDao {

	// This annotation allows to inject an EntityManager instantiated by EJB Container
	@PersistenceContext(unitName="PU_I_Commerce")
	private EntityManager em;
	
	
	@Override
	public Category createCategory(Category c) {
		em.persist(c);
		return c;
	}

	@Override
	public Category getCategory(Category c) {
		return em.find(Category.class, c);
	}

	@Override
	public int updateCategory(Category c) {
		// JPQL Request
		String req = "UPDATE Catgory AS c SET c.categoryName=:pCategoryName, c.description=:pDescription,"
			+ "WHERE a.idCat=:pIdCat ";
		
		// Instantiate Query Object
		Query query = em.createQuery(req);
		
		// Parameters
		query.setParameter("pCategoryName", c.getCategoryName());
		query.setParameter("pDescription", c.getDescription());
		
		return query.executeUpdate();
	}

	@Override
	public int deleteCategory(Category c) {
		// JPQL Request
		String req = "DELETE Category AS c WHERE c.idCat=:pIdCat";
		
		// Instantiate Query Object
		Query query = em.createQuery(req);
		
		// Parameters
		query.setParameter("pIdCat", c.getIdCat());
		
		return query.executeUpdate();
	}

}
