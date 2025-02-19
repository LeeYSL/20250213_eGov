package com.egov.controller;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springmodules.validation.commons.DefaultBeanValidator;

import com.egov.service.WriteService;
import com.egov.service.WriteVO;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.rte.fdl.property.EgovPropertyService;


@Controller
public class WriteController {


	/** EgovSampleService */
	@Resource(name = "sampleService")
	private EgovSampleService sampleService;
	   
		/** EgovPropertyService */
		@Resource(name = "propertiesService")
		protected EgovPropertyService propertiesService;

		/** Validator */
		@Resource(name = "beanValidator")
		protected DefaultBeanValidator beanValidator;
	
	
	// 날짜 포맷을 지정하여 바인딩
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 원하는 날짜 형식을 지정 (yyyy-MM-dd 형식으로 변환)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

	  @RequestMapping("/list") // list 화면 호출
	    public String redirectToList() {
		  System.out.println("1111111111");
	        return "redirect:/list";  // /list로 리디렉션
	    }
	

	
	@RequestMapping("/write") //write 호출
	public String showWritePage2() {
		System.out.println("1234");
		return "metting_main/Write"; 
	}
	/*
	 *  글 등록
	 * @param writeVO - 등록할 정보가 담긴 VO
	 * @return "metting_main/list"; 
	 * @exception Exception
	 */
	@RequestMapping(value = "/write/insertWrite.do", method = RequestMethod.POST)
	@ModelAttribute("WriteVO")
	public String insertWrite(@ModelAttribute("WriteVO") WriteVO writeVO, Model model) throws Exception {	
		
			System.out.println("WriteVO" + writeVO);
			
			sampleService.insertWrite(writeVO);
			

			System.out.println("WriteVO12345" + writeVO);
			
		return "metting_main/list"; 
		
	}


}