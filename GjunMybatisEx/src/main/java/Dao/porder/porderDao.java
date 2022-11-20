package Dao.porder;

import java.util.List;


import Model.porder;

public interface porderDao {
	//C
	void add(porder p);
	//R
	porder selectId(int id);
	List<porder> selectAll();
	List<porder> selectSum(int start,int end);
	//U
	void update(porder p);
	//D
	void delete(int id);

}
