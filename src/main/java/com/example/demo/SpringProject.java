package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Student")
public class SpringProject {
	@GetMapping("/StudentOne")
		// TODO Auto-generated method stub
		public String contextLoads() {
			return "Hello Codebegun!";
		}

}
