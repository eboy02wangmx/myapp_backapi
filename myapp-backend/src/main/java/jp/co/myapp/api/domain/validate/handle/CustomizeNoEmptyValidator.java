package jp.co.myapp.api.domain.validate.handle;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;

public class CustomizeNoEmptyValidator implements ConstraintValidator<CustomizeNoEmpty, String> {

	private CustomizeNoEmpty cne;

	@Override
	public void initialize(CustomizeNoEmpty annotation) {
		this.cne = annotation;
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
		if (str == null) {
			return true;
		}

		if ("".equals(str) || "".equals(str.trim())) {
			return false;
		}

		return true;
	}
}
