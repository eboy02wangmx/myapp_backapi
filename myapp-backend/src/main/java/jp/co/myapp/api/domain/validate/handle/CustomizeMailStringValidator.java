package jp.co.myapp.api.domain.validate.handle;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import jp.co.myapp.api.domain.validate.annotation.CustomizeMailString;
import jp.co.myapp.common.util.ValidatorUtil;

public class CustomizeMailStringValidator implements ConstraintValidator<CustomizeMailString, String> {

	private CustomizeMailString annotation;

	@Override
	public void initialize(CustomizeMailString annotation) {
		this.annotation = annotation;
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(str)) {
			return true;
		} 
		
		return ValidatorUtil.chkMailString(str);
	}
}
