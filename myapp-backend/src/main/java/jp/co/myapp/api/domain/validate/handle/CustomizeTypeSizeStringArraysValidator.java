package jp.co.myapp.api.domain.validate.handle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class CustomizeTypeSizeStringArraysValidator implements ConstraintValidator<CustomizeTypeSizeStringArrays, String[]> {

	private CustomizeTypeSizeStringArrays cts;

	@Override
	public void initialize(CustomizeTypeSizeStringArrays annotation) {
		this.cts = annotation;
	}

	@Override
	public boolean isValid(String[] str, ConstraintValidatorContext constraintValidatorContext) {
		if (str == null || str.length <= 0) {
			return true;
		}
		for (String common : str) {
			if (cts.min() != 0 && common.length() < cts.min()) {
				return false;
			}

			if (cts.max() != 0 && common.length() > cts.max()) {
				return false;
			}
			String regEx = cts.regexp();
			if (!StringUtils.isEmpty(regEx)) {
				Pattern pattern = Pattern.compile(regEx);
				Matcher matcher = pattern.matcher(common);
				return matcher.matches();
			}
		}
		return true;
	}
}
