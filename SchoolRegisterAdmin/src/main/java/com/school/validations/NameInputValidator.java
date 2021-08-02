package com.school.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameInputValidator implements ConstraintValidator<namevalid, String> {

	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result=value.contains("ha") && value.matches("^[A-Z].*");
		return result;
	}

}
