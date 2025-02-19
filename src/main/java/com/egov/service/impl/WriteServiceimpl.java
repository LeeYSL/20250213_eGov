package com.egov.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.service.WriteService;
import com.egov.service.WriteVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;


@Service("writeService")  // 빈 이름을 "writeService"로 설정
public class WriteServiceimpl extends EgovAbstractServiceImpl implements WriteService {
    // 서비스 로직

	
//	@Resource(name = "WriteDAO")
//	private WriteDAO writeDAO;


	/** ID Generation */
	@Resource(name = "egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;
	
	@Override
	public String insertWrite(WriteVO vo) throws Exception {
		
		System.out.println("서비스 임플" + vo);
		
		String id = egovIdGnrService.getNextStringId();
		vo.setMeeting_id(id);
		
	//	writeDAO.insertWrite(vo);		
		return id;
	}

	
	

}
