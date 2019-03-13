package fr.adaming.Service;

import fr.adaming.model.Category;

public interface ICategoryService {

	public Category createCategory(Category c);
	
	public Category getCategory(Category c);
	
	public int updateCategory(Category c);
	
	public int deleteCategory(Category c);
	
}
