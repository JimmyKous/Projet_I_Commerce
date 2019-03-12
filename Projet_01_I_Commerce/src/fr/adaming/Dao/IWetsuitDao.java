package fr.adaming.Dao;

import java.util.List;

import fr.adaming.model.Wetsuit;

public interface IWetsuitDao {

	public List<Wetsuit> getListeWetSuit ();
	public Wetsuit addWetsuit (Wetsuit a);
	public int deleteWetsuit (Wetsuit a);
	public int updateWetsuit (Wetsuit a);
	public Wetsuit getWetsuitById (Wetsuit a);
}
