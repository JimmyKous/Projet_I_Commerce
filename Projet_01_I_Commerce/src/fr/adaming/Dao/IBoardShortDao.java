package fr.adaming.Dao;

import java.util.List;

import fr.adaming.model.articles.Boardshort;

public interface IBoardShortDao {
	
	public List<Boardshort> getListBoardshort ();
	public Boardshort addBoardshort (Boardshort b);
	public int deleteBoardshort (Boardshort b);
	public int updateBoardshort (Boardshort b);
	public Boardshort getBoardshortById (Boardshort b);

}
