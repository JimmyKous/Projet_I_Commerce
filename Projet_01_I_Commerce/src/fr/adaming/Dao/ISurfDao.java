package fr.adaming.Dao;

import java.util.List;

import fr.adaming.model.Surf;

public interface ISurfDao {
	public List<Surf> getListSurf ();
	public Surf addSurf (Surf s);
	public int deleteSurf (Surf s);
	public int updateSurf (Surf s);
	public Surf getSurfById (Surf s);

}
