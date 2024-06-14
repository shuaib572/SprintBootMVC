package com.coding.studentValidator;


import org.hibernate.annotations.Comments;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.coding.model.Student;
@Service
public class StdValidator implements org.springframework.validation.Validator{

	@Override
	public boolean supports(Class<?> classType) {
		// Allow only student class object
		return Student.class.isAssignableFrom(classType);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// traget => Model class Object
		Student s=(Student) target;
		//------------- write validation code
		if(s.getStdName()==null || s.getStdName().isBlank()) {
			errors.rejectValue("stdName", null,"Please Enter Student Name");
		}
			
				}

}
 