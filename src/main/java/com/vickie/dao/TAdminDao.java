package com.vickie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.vickie.mapper.TAdminMapper;
import com.vickie.pojo.TAdmin;
import com.vickie.util.MybatisUtil;

public class TAdminDao implements TAdminMapper {
	private TAdminMapper tAdminMapper;
	public int insert(TAdmin record) {
		SqlSession sqlSession=MybatisUtil.getSqlSession();
		int insertStatus=sqlSession.insert("insert",record);
		sqlSession.commit();
		sqlSession.close();
		return insertStatus;
	}
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	public TAdmin selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=MybatisUtil.getSqlSession();
		
		return null;
	}
	public List<TAdmin> selectAll() {
		// TODO Auto-generated method stub
		SqlSession sqlSession=MybatisUtil.getSqlSession();
		List<TAdmin> tadminList=sqlSession.selectList("selectAll");
		sqlSession.close();
		return tadminList;
	}
	public int updateByPrimaryKey(TAdmin record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
