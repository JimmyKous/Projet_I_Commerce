package fr.adaming.Service;

import javax.ejb.EJB;

import fr.adaming.Dao.CategoryDaoImpl;
import fr.adaming.Dao.ICategoryDao;
import fr.adaming.model.Category;

public class CategoryServiceImpl implements ICategoryService {

	// Transform UML to Java Association
	@EJB
	ICategoryDao catDao = new CategoryDaoImpl();
		
	@Override
	public Category createCategory(Category c) {
		return catDao.createCategory(c);
	}

	@Override
	public Category getCategory(Category c) {
		return catDao.getCategory(c);
	}

	@Override
	public int updateCategory(Category c) {
		return catDao.updateCategory(c);
	}

	@Override
	public int deleteCategory(Category c) {
		return catDao.deleteCategory(c);
	}

	
}