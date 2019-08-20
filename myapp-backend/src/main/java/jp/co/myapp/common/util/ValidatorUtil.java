package jp.co.myapp.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;

import org.springframework.context.MessageSource;

import jp.co.myapp.api.app.data.error.ErrorInfoData;
import jp.co.myapp.common.Constants;

 
public class ValidatorUtil {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * beanにannotationがあるフィールドをチェックする
     * 
     * @param obj
     * @param messageSource
     * @param locale
     * @return
     */
    public static <T> List<ErrorInfoData> validate(T obj, MessageSource messageSource, Locale locale) {
    	List<ErrorInfoData> errlist = new ArrayList<ErrorInfoData>();

        Set<ConstraintViolation<T>> set = validator.validate(obj, Default.class);

        if(set != null && set.size() > 0) {
        	String property = null;
        	String errorId = null;
        	String[] msgParams = null;

            for(ConstraintViolation<T> cv : set){
            	property = cv.getPropertyPath().toString();
            	errorId = cv.getMessageTemplate();
            	String str = cv.getConstraintDescriptor().getAttributes().get("params").toString();
    
            	msgParams = MyUtils.getMsgParams(str);
				if (msgParams != null) {
					for (int i = 0; i < msgParams.length; i++) {
						if (MyUtils.isMsgParamString(msgParams[i])) {
							msgParams[i] = msgParams[i].substring(1, msgParams[i].length() - 1);
						} else if (messageSource != null && locale != null) {
							msgParams[i] = MyUtils.getMessageDiscription(messageSource, msgParams[i], null, locale);
						}
					}
				}

            	ErrorInfoData error = new ErrorInfoData(property, errorId, msgParams);
            	errlist.add(error);
            }
        }

        return errlist;
    }
    
    public static boolean chkMailString(String str) {
		// String regEx = "^[a-zA-Z0-9_-]+(\\.*[a-zA-Z0-9_-]+)+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		String regEx = "^([.]|[a-zA-Z0-9_-])+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

		return MyUtils.chkStringByPatten(str, regEx);
    }
    
    public static boolean chkDateString(String str, String pattern) {
    	SimpleDateFormat df = new SimpleDateFormat(pattern);

		try {
			df.setLenient(false);
			df.parse(str);
		} catch (ParseException e) {
			return false;
		}
		return true;
    }
    
    public static boolean chkFullHirakanaString(String str) {
		return MyUtils.chkStringByPatten(str, Constants.REGEXP_FULL_HIRAKANA);
    }
    public static boolean chkFullKitakanaString(String str) {
		return MyUtils.chkStringByPatten(str, Constants.REGEXP_FULL_KATAKANA);
    }
    public static boolean chkFullJpString(String str) {
		return MyUtils.chkStringByPatten(str, Constants.REGEXP_FULL_JP_STRING);
    }
}