package br.jus.tst.esocial.validacao;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CheckDateValidator.class)
public @interface CheckDate {

	String message() default "Data inválida";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	// optional
	String[] dateFormat();
}