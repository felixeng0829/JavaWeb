package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {
	//C
	void add(member m);
	//R
	List<member> selectAll();
	member selectId(int id);
	member selectUsername(String username);
	member selectUsername(String username,String password);

	//U
	void update(member m);
	
	//D
	void delete(int id);
}
