package Dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnection {

	public static void main(String[] args) {
		System.out.println(new DbConnection().getDb());
	}
	public static SqlSession getDb() 
	{
		SqlSession se=null;
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
			se = sf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return se;
		
	}

}
