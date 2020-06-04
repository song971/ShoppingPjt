package com.hardCarry.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController { // 카테고리 컨트롤러
	
	@RequestMapping("service") // 고객센터 페이지
	public String service(Model model) {
		return "service";
	}
	
	@RequestMapping("freq") // 자주하는 질문 페이지
	public String freq(Model model) {
		return "freq";
	}
	
	@RequestMapping("Notice") // 공지사항 페이지
	public String Notice(Model model) {
		return "Notice";
	}
	
	@RequestMapping("qa") // Q & A 페이지
	public String qa(Model model) {
		return "qa";
	}
}
