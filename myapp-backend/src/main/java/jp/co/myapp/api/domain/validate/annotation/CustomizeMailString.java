package jp.co.myapp.api.domain.validate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jp.co.myapp.api.domain.validate.handle.CustomizeMailStringValidator;


@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Constraint(validatedBy = { CustomizeMailStringValidator.class })
public @interface CustomizeMailString {

	String params() default "";
	
	String message() default "{}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}