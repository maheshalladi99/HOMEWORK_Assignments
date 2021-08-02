package com.school.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameSize implements ConstraintValidator<fnamelen, String> {

	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		int a =value.length();
		boolean result= (a>8 &&a<20);
		return result;
	}

}


