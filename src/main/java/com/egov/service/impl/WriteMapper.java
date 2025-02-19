package com.egov.service.impl;

import com.egov.service.WriteVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("writeMapper")
public interface WriteMapper {
	
	void insertWrite(WriteVO vo) throws Exception;

}
