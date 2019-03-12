package fr.adaming.Dao;

import java.util.List;

import fr.adaming.model.Wetsuit;

public interface IWetsuitDao {

	public List<Wetsuit> getListWetsuit ();
	public Wetsuit addWetsuit (Wetsuit ws);
	public int deleteWetsuit (Wetsuit ws);
	public int updateWetsuit (Wetsuit ws);
	public Wetsuit getWetsuitById (Wetsuit ws);
}
