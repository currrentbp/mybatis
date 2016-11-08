package com.bp.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 专门作为myBatis的工具类
 * @author current_bp
 * @createTime 20160506
 *
 */
public class MybatisUtil {
	
	/**
	 * 开启sqlSession
	 * @return
	 */
	public static SqlSession getSqlSession() {
		SqlSession ss = null;
		InputStream is;
		try {
			is = Resources.getResourceAsStream("resource/mybatis_config.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			
			ss = factory.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ss;
	}
	
	/**
	 * 关闭连接
	 * @param ss
	 */
	public void closeSqlSession(SqlSession ss){
		ss.close();
	}

}
