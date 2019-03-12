package fr.adaming.Dao;

import java.util.List;

import fr.adaming.model.Accessorie;

public interface IAccessorieDao {

	public List<Accessorie> getListAccessorie ();
	public Accessorie addArticle (Accessorie a);
	public int deleteArticle (Accessorie a);
	public int updateArticle (Accessorie a);
	public Accessorie getArticleById (Accessorie a);
}
