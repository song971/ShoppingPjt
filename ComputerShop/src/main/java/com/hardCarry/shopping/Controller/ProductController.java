package com.hardCarry.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController { // 제품 컨트롤러
	
	@RequestMapping("desktop") // 데스크탑 페이지
	public String desktop(Model model){
		return "desktop";
	}
	
	@RequestMapping("notebook") // 노트북 페이지
	public String notebook(Model model){
		return "notebook";
	}
	
	@RequestMapping("part") // 부품 페이지
	public String part(Model model){
		return "part";
	}
	
	@RequestMapping("Device") // 주변기기 페이지
	public String Device(Model model){
		return "Device";
	}
	
	@RequestMapping("cpu") // 부품 cpu 페이지 (드롭다운)
	public String cpu(Model model){
		return "cpu";
	}
	
	@RequestMapping("ram") // 부품 ram 페이지 (드롭다운)
	public String ram(Model model){
		return "ram";
	}
	
	@RequestMapping("mainboard") // 부품 메인보드 페이지 (드롭다운)
	public String mainboard(Model model){
		return "mainboard";
	}
	
	@RequestMapping("graphic") // 부품 그래픽카드 페이지 (드롭다운)
	public String graphic(Model model){
		return "graphic";
	}
	
	@RequestMapping("hdd") // 부품 하드디스크 페이지 (드롭다운)
	public String hdd(Model model){
		return "hdd";
	}
	
	@RequestMapping("ssd") // 부품 ssd 페이지 (드롭다운)
	public String ssd(Model model){
		return "ssd";
	}
	
	@RequestMapping("power") // 부품 파워 페이지 (드롭다운)
	public String power(Model model){
		return "power";
	}
	
	@RequestMapping("monitor") // 주변기기 모니터 페이지 (드롭다운)
	public String monitor(Model model){
		return "monitor";
	}
	
	@RequestMapping("Speaker") // 주변기기 스피커 페이지 (드롭다운)
	public String Speaker(Model model){
		return "Speaker";
	}
	
}
