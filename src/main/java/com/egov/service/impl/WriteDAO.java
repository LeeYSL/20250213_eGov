package com.egov.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.egov.service.WriteVO;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("WriteDAO")
public class WriteDAO extends EgovAbstractDAO  {

	public String insertWrite(WriteVO vo) throws Exception {
		return (String) insert("WriteDAO.insertWrite", vo);
		
		
		
	}



}
