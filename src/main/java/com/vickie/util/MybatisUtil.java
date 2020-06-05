package com.vickie.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	private static SqlSessionFactory sqlsessionfactory;
	public static SqlSession getSqlSession() {
		InputStream inputstream;
		try {
                        //获取Mybatis容器内容
			inputstream = Resources.getResourceAsStream("mybatis.xml");
			if (sqlsessionfactory == null) {
                        //新建一个factory，他的作用用来生产sqlSeesion
				sqlsessionfactory = new SqlSessionFactoryBuilder().build(inputstream);
			}
                        //使用factory的open方法创建一个sqlSeesion
			SqlSession sqlsession = sqlsessionfactory.openSession();
			return sqlsession;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
