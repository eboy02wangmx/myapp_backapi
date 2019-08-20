package jp.co.myapp.api.domain.validate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jp.co.myapp.api.domain.validate.handle.CustomizeTypeSizeLongValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Constraint(validatedBy = { CustomizeTypeSizeLongValidator.class })
public @interface CustomizeTypeSizeLong {

	String params() default "";

	String regexp() default "";

	int min() default 0;

	int max() default 0;

	String message() default "{}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}