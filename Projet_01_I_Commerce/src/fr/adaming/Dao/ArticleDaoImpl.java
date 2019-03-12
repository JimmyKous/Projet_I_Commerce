package fr.adaming.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		// JPQL Request
		String req = "UPDATE Article AS a SET a.designation=:pDesignation, a.description=:pDescription,"
				+ " a.price=:pPrice, a.stock=:pStock, a.picture=:pPicture WHERE a.idArt=:pId ";
		
		// Instanciate Query Object
		Query query = em.createQuery(req);
		
		// Parameters
		query.setParameter("pDesignation", a.getDesignation());
		query.setParameter("pDescription", a.getDescription());
		query.setParameter("pPrice", a.getPrice());
		query.setParameter("pStock", a.getStock());
		query.setParameter("pPicture", a.getPicture());
		query.setParameter("pId", a.getIdArt());
		
		return query.executeUpdate();
	}

	@Override
	public int deleteArticle(Article a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
