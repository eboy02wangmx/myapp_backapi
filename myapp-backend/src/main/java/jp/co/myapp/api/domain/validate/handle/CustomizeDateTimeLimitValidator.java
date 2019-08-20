package jp.co.myapp.api.domain.validate.handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateTimeLimitString;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.util.MyUtils;

public class CustomizeDateTimeLimitValidator implements ConstraintValidator<CustomizeDateTimeLimitString, String> {

	private CustomizeDateTimeLimitString dts;

	@Override
	public void initialize(CustomizeDateTimeLimitString annotation) {
		this.dts = annotation;
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = true;
		if (StringUtils.isEmpty(str)) {
			return result;
		}
		
		String pattern = dts.pattern();
		SimpleDateFormat df = new SimpleDateFormat(pattern);

		try {
			df.setLenient(false);
			df.parse(MyUtils.replaceDateStr(str));
		} catch (ParseException e) {
			return result;
		}

		if (!StringUtils.isEmpty(dts.min())) {
			String min = dts.min();
			if (min.compareTo(str) > 0) {
				result = false;
			}
		}

		if (result && !StringUtils.isEmpty(dts.max())) {
			String max = dts.max();
			if (max.compareTo(str) < 0) {
				result = false;
			}
		}
		
		if (result && !StringUtils.isEmpty(dts.sysYearAfter())) {
			Date maxDate = MyUtils.plusYears(new Date(), Integer.valueOf(dts.sysYearAfter()));
			String maxYear = MyUtils.changeToString(maxDate, Constants.DATE_FORMAT_YYYY);
			String max = maxYear + "1231";
			if (max.compareTo(str) < 0) {
				result = false;
			}
		}


		return result;
	}
}
