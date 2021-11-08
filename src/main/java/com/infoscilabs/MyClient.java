package com.infoscilabs;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.infoscilabs.model.User;

public class MyClient {

	public static void main(String[] args) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		
		User user = new User();
		//user.setName("mohan");
		user.setWorking(false);
		user.setAboutMe("Its all about me!");
		user.setAge(51);
		user.setEmail("m.com");
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);

		for (ConstraintViolation<User> violation : violations) {
		    System.out.println(violation.getMessage()); 
		}	
		
	}

}
