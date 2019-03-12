package fr.adaming.Dao;

import fr.adaming.model.Article;

public interface IArticleDao {

	public Article createArticle(Article a);
	
	public Article getArticle(Article a);
	
	public int updateArticle(Article a);
	
	public int deleteArticle(Article a);
	
}
