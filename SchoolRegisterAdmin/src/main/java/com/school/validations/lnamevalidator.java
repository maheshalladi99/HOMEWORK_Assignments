package com.school.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class lnamevalidator  implements ConstraintValidator<lname, String> {

	public boolean isValid(String value, ConstraintValidatorContext context) {

		//		String string = null;
//		String s1= string.substring(string.length()-3);
		//boolean result=value.matches("^[A-z].*") && s1=="pur";
		
		String s1=value.substring(value.length() - 3);
		System.out.println(value);
		System.out.println(s1);
		boolean result= value.matches("^[A-Z].*") && s1.equals("pur");
		System.out.println(result);
		return result;
	}

}