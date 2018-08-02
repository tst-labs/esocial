package br.jus.tst.esocialjt.util;

import java.util.List;

public class VerificacaoPropriedades {
	private static final double EPSILON = 0.00000001;

	public boolean isPropriedadeNulaOuDefault(Object propriedade, Class<?> type) {
		return isObjetoNulo(propriedade, type) || isBooleanDefault(propriedade, type) || isListaVazia(propriedade)
				|| isNumeroDefault(propriedade, type);
	}

	private boolean isListaVazia(Object propriedade) {
		return propriedade instanceof List && ((List<?>) propriedade).isEmpty();
	}

	private boolean isNumeroDefault(Object propriedade, Class<?> type) {
		return type.isPrimitive() && type != boolean.class && Math.abs(((Number) propriedade).doubleValue()) <= EPSILON;
	}

	private boolean isBooleanDefault(Object propriedade, Class<?> type) {
		return type == boolean.class && Boolean.FALSE.equals(propriedade);
	}

	private boolean isObjetoNulo(Object propriedade, Class<?> type) {
		return !type.isPrimitive() && propriedade == null;
	}
}
