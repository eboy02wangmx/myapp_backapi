package jp.co.myapp.api.domain.validate.handle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class CustomizeTypeSizeStringValidator implements ConstraintValidator<CustomizeTypeSizeString, String> {

	private CustomizeTypeSizeString cts;

	@Override
	public void initialize(CustomizeTypeSizeString annotation) {
		this.cts = annotation;
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {

		if (str == null || str.trim().length() == 0) {
			return true;
		}
		
		if (cts.min() != 0 && str.length() < cts.min()) {
			return false;
		}
		
		if (cts.max() != 0 && str.length() > cts.max()) {
			return false;
		}

		String regEx = cts.regexp();
		if (!StringUtils.isEmpty(regEx)) {
			Pattern pattern = Pattern.compile(regEx);
			Matcher matcher = pattern.matcher(str);
			return matcher.matches();
		}
		
		return true;
	}
}
