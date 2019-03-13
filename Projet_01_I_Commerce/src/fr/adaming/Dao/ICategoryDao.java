package fr.adaming.Dao;

import fr.adaming.model.Category;

public interface ICategoryDao {
	
	public Category createCategory(Category c);
	
	public Category getCategory(Category c);
	
	public int updateCategory(Category c);
	
	public int deleteCategory(Category c);

}
