package com.egov.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.egov.vo.BoardVO;

@Repository("boardDAO") //Spring이 자동으로 이 클래스를 Bean으로 등록해서 다른것에서 주입 받을 수 있다.
public class BoardDao {
	
    @Autowired // Spring이 자동으로 SqlSession을 주입해줌
    private SqlSession sqlSession;
		
		public void insertBoard(BoardVO board) { // BoardVO 객체를 받아서 MyBatis의 SQL 실행 메서드에 전달하는 역할
		  sqlSession.insert("BoardMapper.insertBoard", board); // BoardMapper.xml에 있는 insertBoard라는 ID의 SQL을 실행
	}
	
}
