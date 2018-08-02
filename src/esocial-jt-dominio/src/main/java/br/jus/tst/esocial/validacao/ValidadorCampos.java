package br.jus.tst.esocial.validacao;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidadorCampos {
	
	private ValidadorCampos(){
		
	}
	
	public static <T> Set<ConstraintViolation<T>> validar(T object, Class<?>... groups){
		Locale.setDefault(new Locale("pt", "BR"));
		ValidatorFactory factory = Validation.byDefaultProvider()
				.configure()
				.buildValidatorFactory();
		Validator validator = factory.getValidator();
		
		return validator.validate(object, groups);
	}
	
	public static List<String> validarFormatado(Object object, Class<?>... groups){
		return validar(object, groups).stream()
			.map( constraintViolation -> String.format("[%s:  '%s'] %s", 
						constraintViolation.getPropertyPath(), 
						constraintViolation.getInvalidValue(), 
						constraintViolation.getMessage())
				)
			.sorted()
			.collect(Collectors.toList());
	}
	
}
