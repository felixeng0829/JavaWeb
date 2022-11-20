package Dao.porder;

import java.util.List;


import Model.porder;

public interface porderDao {
	//C
	void add(porder p);
	//R
	porder selectId(int id);
	List<porder> selectAll();
	//U
	void update(porder p);
	//D
	void delete(int id);

}
