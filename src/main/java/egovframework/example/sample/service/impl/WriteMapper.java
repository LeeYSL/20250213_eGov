package egovframework.example.sample.service.impl;

import com.egov.service.WriteVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface WriteMapper {
	
	void insertWrite(WriteVO vo) throws Exception;

}
