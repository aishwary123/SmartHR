package com.sap.aish.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@NotBlank(message = "{blankPan}")
@Size(min=10, max=15, message = "{PanSize}")
@Documented
@Retention(RUNTIME)
@Target({METHOD, FIELD, CONSTRUCTOR, PARAMETER, ANNOTATION_TYPE})
@Constraint(validatedBy=UniquePanValidator.class)
public @interface UniquePan {

}
