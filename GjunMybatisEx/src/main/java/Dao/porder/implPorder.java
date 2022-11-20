package Dao.porder;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.porder;

public class implPorder implements porderDao{

	public static void main(String[] args) {
		//porder p=new porder("C桌",2,2,2);
		//new implPorder().add(p);
		
				for(porder o:new implPorder().selectAll())
				{System.out.println(o.getId()+"\t"+o.getSum());}
				

	}

	@Override
	public void add(porder p) {
		SqlSession se=new DbConnection().getDb();
		se.insert("porderMapper.add", p);
		se.commit();
		
	}

	@Override
	public porder selectId(int id) {
		SqlSession se=new DbConnection().getDb();
		porder p=null;
		List<porder> l=se.selectList("porderMapper.selectId", id);
		if (l.size()!=0)
		{
			porder[] P=l.toArray(new porder[l.size()]);
			p=P[0];
		}
		return p;
	}

	@Override
	public List<porder> selectAll() {
		SqlSession se=new DbConnection().getDb();
		List<porder> l=se.selectList("porderMapper.selectAll");
		return l;
	}


	@Override
	public void delete(int id) {
		SqlSession se=new DbConnection().getDb();
		se.delete("porderMapper.deleteId", id);
		se.commit();
	}

	@Override
	public void update(porder p) {
		SqlSession se=new DbConnection().getDb();
		se.update("porderMapper.update",p);
		se.commit();
	}

}
