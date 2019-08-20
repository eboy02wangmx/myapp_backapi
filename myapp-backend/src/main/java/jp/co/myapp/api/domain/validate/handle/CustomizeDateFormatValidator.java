package jp.co.myapp.api.domain.validate.handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.common.util.MyUtils;

public class CustomizeDateFormatValidator implements ConstraintValidator<CustomizeDateFormatString, String> {

	private CustomizeDateFormatString dfs;

	@Override
	public void initialize(CustomizeDateFormatString annotation) {
		this.dfs = annotation;
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = true;
		if (StringUtils.isEmpty(str)) {
			return result;
		}

		String pattern = dfs.pattern();
		SimpleDateFormat df = new SimpleDateFormat(pattern);

		try {
			df.setLenient(false);
			df.parse(MyUtils.replaceDateStr(str));
		} catch (ParseException e) {
			result = false;
		}

		return result;
	}
}
