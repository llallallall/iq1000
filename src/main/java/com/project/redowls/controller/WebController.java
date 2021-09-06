package com.project.redowls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/")
	public String main() {
		return "html/index";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "html/contactthanks";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "html/index2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "html/index3";
	}
}
