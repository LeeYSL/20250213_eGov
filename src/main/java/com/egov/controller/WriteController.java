package com.egov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.egov.service.BoardService;
import com.egov.vo.BoardVO;




@Controller
@RequestMapping("/write")
public class WriteController {
	
	@RequestMapping("/write") 
	public String showWritePage() {
		return "redirect:/board/list";  // WEB-INF/jsp/metting_main/Write.jsp를 찾아서 실행
	}
		
	@Autowired
	private BoardService boardService;

		
	 @PostMapping("/insert")
	 public String insertBoard(@ModelAttribute  BoardVO board) {
			
		 System.out.println("!234");  
         boardService.insertBoard(board);
	     return "redirect:/board/list";
		}
}
