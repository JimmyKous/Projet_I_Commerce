package fr.adaming.Dao;

import fr.adaming.model.articles.Article;

public interface IArticleDao {
	
	public Article addArticle (Article a);
	public int deleteArticle (Article a);
	public int updateArticle (Article a);
	public Article getArticleById (Article a);

}
