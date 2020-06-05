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
                        //��ȡMybatis��������
			inputstream = Resources.getResourceAsStream("mybatis.xml");
			if (sqlsessionfactory == null) {
                        //�½�һ��factory������������������sqlSeesion
				sqlsessionfactory = new SqlSessionFactoryBuilder().build(inputstream);
			}
                        //ʹ��factory��open��������һ��sqlSeesion
			SqlSession sqlsession = sqlsessionfactory.openSession();
			return sqlsession;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
