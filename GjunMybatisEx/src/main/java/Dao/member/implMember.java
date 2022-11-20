package Dao.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import Dao.DbConnection;
import Model.member;

public class implMember implements memberDao {

	public static void main(String[] args) {
		//System.out.println(new implMember().selectAll());
		//member m =new member("username","ps","name","台灣","1","2");
		//new implMember().add(m);
		//System.out.println(new implMember().selectUsername("aaaa"));
		System.out.println(new implMember().selectUsername("1","2"));
	}

	@Override
	public List<member> selectAll() {
		SqlSession se=new DbConnection().getDb();
		List<member> l=se.selectList("memberMapper.selectAll");
		return l;
	}

	@Override
	public void add(member m) {
		// TODO Auto-generated method stub
		SqlSession se=new DbConnection().getDb();
		se.insert("memberMapper.add", m);
		se.commit();
	}

	@Override
	public member selectId(int id) {
		SqlSession se=new DbConnection().getDb();
		List<member> l=se.selectList("memberMapper.selectId", id);
		member[] m=l.toArray(new member[l.size()]);
		return m[0];
	}

	@Override
	public void update(member m) {
		SqlSession se=new DbConnection().getDb();
		se.update("memberMapper.update", m);
		se.commit();
		
	}

	@Override
	public void delete(int id) {
		SqlSession se=new DbConnection().getDb();
		se.delete("memberMapper.deleteId", id);
		
	}

	@Override
	public member selectUsername(String username) {
		SqlSession se=new DbConnection().getDb();
		member m=null;
		List<member> l=se.selectList("memberMapper.selectUsername", username);
		member[] M=l.toArray(new member[l.size()]);
		if(l.size()!=0) m=M[0];
		return m;
	}

	@Override
	public member selectUsername(String username, String password) {
		SqlSession se=new DbConnection().getDb();
		Map<String,String> map=new HashMap();
		map.put("username", username);
		map.put("password", password);
		member m=null;
		List<member> l=se.selectList("memberMapper.selectUsername", map);
		member[] M=l.toArray(new member[l.size()]);
		if(l.size()!=0) m=M[0];
		return m;
	}



}
