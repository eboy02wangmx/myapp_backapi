package jp.co.myapp.api.domain.validate.handle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeInteger;

public class CustomizeTypeSizeIntegerValidator implements ConstraintValidator<CustomizeTypeSizeInteger, Integer> {

	private CustomizeTypeSizeInteger cts;

	@Override
	public void initialize(CustomizeTypeSizeInteger annotation) {
		this.cts = annotation;
	}

	@Override
	public boolean isValid(Integer object, ConstraintValidatorContext constraintValidatorContext) {

		if (object == null) {
			return true;
		}
		String value = object.toString();
		if (value.toString().trim().length() == 0) {
			return true;
		}

		if (cts.min() != 0 && value.length() < cts.min()) {
			return false;
		}

		if (cts.max() != 0 && value.length() > cts.max()) {
			return false;
		}

		String regEx = cts.regexp();
		if (!StringUtils.isEmpty(regEx)) {
			Pattern pattern = Pattern.compile(regEx);
			Matcher matcher = pattern.matcher(value);
			return matcher.matches();
		}

		return true;
	}

}
