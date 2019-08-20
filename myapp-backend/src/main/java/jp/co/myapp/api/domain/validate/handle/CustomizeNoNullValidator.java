package jp.co.myapp.api.domain.validate.handle;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;

public class CustomizeNoNullValidator implements ConstraintValidator<CustomizeNoNull, String> {

	private CustomizeNoNull cnn;

	@Override
	public void initialize(CustomizeNoNull annotation) {
		this.cnn = annotation;
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
		if (str == null) {
			return false;
		}

		if ("".equals(str) || "".equals(str.trim())) {
			return false;
		}

		return true;
	}
}
