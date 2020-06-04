package com.hardCarry.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController { // 사용자 컨트롤러
	
	@RequestMapping("login") // 로그인 페이지
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("membership") // 회원가입 페이지
	public String membership(Model model) {
		return "membership";
	}
	
	@RequestMapping("findid") // 아이디 찾기 페이지
	public String findid(Model model) {
		return "findid";
	}
	
	@RequestMapping("findpw") // 비밀번호 찾기 페이지
	public String findpw(Model model) {
		return "findpw";
	}
	
	@RequestMapping("mypage") // My Page 
	public String mypage(Model model) {
		return "mypage";
	}
	
	@RequestMapping("infochange") // 회원정보 수정 페이지
	public String infochange(Model model) {
		return "infochange";
	}
	
	@RequestMapping("shoppingbasket") // 장바구니 페이지
	public String shoppingbasket(Model model) {
		return "shoppingbasket";
	}
	
	@RequestMapping("Ordering") // 주문 페이지
	public String Ordering(Model model) {
		return "Ordering";
	}
	
	@RequestMapping("Ordercheck") // 주문 조회 페이지
	public String Ordercheck(Model model) {
		return "Ordercheck";
	}
	
	@RequestMapping("myview") // 내가 쓴 글 페이지
	public String myview(Model model) {
		return "myview";
	}
	
	@RequestMapping("mywrite") // 내가 쓴 글 상세 페이지
	public String mywrite(Model model) {
		return "mywrite";
	}
	
}
