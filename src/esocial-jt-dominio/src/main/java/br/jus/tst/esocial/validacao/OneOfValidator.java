package br.jus.tst.esocial.validacao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OneOfValidator implements ConstraintValidator<OneOf, Object> {
	private int[] values;

	@Override
	public void initialize(OneOf constraintAnnotation) {
		this.values = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		for (int s : values) {
			if (s == (int) value) {
				return true;
			}
		}

		return false;
	}
}
