package com.hardCarry.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController { // 관리자 컨트롤러
	
	@RequestMapping("AdminMain") // 관리자 메인 페이지
	public String AdminMain(Model model) {
		return "AdminMain";
	}
	
	@RequestMapping("Membercheck") // 관리자 회원 조회 페이지
	public String Membercheck(Model model) {
		return "Membercheck";
	}
	
	@RequestMapping("Orderdetails") // 관리자 주문 내역 페이지
	public String Orderdetails(Model model) {
		return "Orderdetails";
	}
	
	@RequestMapping("Productcheck") // 관리자 상품 조회 페이지
	public String Productcheck(Model model) {
		return "Productcheck";
	}
	
	@RequestMapping("Productregistration") // 관리자 상품 등록 페이지
	public String Productregistration(Model model) {
		return "Productregistration";
	}
	
	@RequestMapping("Salescheck") // 관리자 매출 조회 페이지
	public String Salescheck(Model model) {
		return "Salescheck";
	}
	
	@RequestMapping("AdminNotice") // 관리자 공지사항 페이지
	public String AdminNotice(Model model) {
		return "AdminNotice";
	}
	
	@RequestMapping("imagePage") // 관리자 광고 이미지 페이지
	public String imagePage(Model model) {
		return "imagePage";
	}
}
