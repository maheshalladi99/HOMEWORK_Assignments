package com.school.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CityValidator  implements ConstraintValidator<city, String> {

	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result=value.matches("[^a-z]*");
		return result;
	}

}