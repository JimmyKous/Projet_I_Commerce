package fr.adaming.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.adaming.model.Article;

public class ArticleDaoImpl implements IArticleDao {

	// This annotation allows to inject an EntityManager instantiated by EJB Container
	@PersistenceContext(unitName="PU_I_Commerce")
	private EntityManager em;
	
	@Override
	public Article createArticle(Article a) {
		em.persist(a);
		return a;
	}

	@Override
	public Article getArticle(Article a) {
		return em.find(Article.class, a);
	}

	@Override
	public int updateArticle(Article a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteArticle(Article a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
