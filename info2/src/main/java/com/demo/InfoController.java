package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	@GetMapping("/welcome")
	public String Welcome() {
		 return "Welcome To Infocareer";
		 
	}

}
