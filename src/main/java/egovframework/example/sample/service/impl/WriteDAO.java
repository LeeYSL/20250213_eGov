package egovframework.example.sample.service.impl;


import org.springframework.stereotype.Repository;

import com.egov.service.WriteVO;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("WriteDAO")
public class WriteDAO extends EgovAbstractDAO  {

	public String insertWrite(WriteVO vo) throws Exception {
		return (String) insert("WriteDAO.insertWrite", vo);
		
		
		
	}



}
