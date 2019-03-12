package fr.adaming.Dao;

import java.util.List;

import fr.adaming.model.Article;
import fr.adaming.model.Surf;

public interface ISurfDao {
	public List<Surf> getListeS ();
	public Surf addSurf (Surf a);
	public int deleteSurf (Surf a);
	public int updateSurf (Surf a);
	public Surf getSurfById (Surf a);

}
