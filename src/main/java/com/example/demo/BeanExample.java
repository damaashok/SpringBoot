package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("StudentInfo")
public class BeanExample {
	public List<StudentInfoEntity> m1() {
			List<StudentInfoEntity> obj1=new ArrayList<StudentInfoEntity>();
			StudentInfoEntity obj2=new StudentInfoEntity();
			obj2.setName("Ashok12");
			obj2.setEmailid("ashok@gmail.com");
			obj1.add(obj2);
		return obj1;
	}
}
