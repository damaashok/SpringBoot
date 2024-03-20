package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Student")
public class StudentsList {
	@Autowired
	BeanExample StudentInfo;
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<StudentInfoEntity>> getAllStudents(){
		return new ResponseEntity<>(StudentInfo.m1(),HttpStatus.OK);
	}
}
