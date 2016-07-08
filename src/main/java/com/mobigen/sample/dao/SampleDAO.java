package com.mobigen.sample.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobigen.sample.common.utils.SampleUtil;
import com.mobigen.sample.domain.Sample;

@Repository("sampleDAO")
public class SampleDAO {
	
	/**
	 * DB 연결을 sampleUtil로 대체
	 */
//	@Autowired
//	private SampleUtil sampleUtil;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<Sample> getList() {
		return sqlSession.selectList("sampleDAO.selectList");
	}
}
