package jp.co.myapp.api.domain.validate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jp.co.myapp.api.domain.validate.handle.CustomizeDateFormatValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Constraint(validatedBy = { CustomizeDateFormatValidator.class })
public @interface CustomizeDateFormatString {
	
	String params() default "";
	
	String pattern() default "yyyyMMdd";
	
	String message() default "{}";
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
