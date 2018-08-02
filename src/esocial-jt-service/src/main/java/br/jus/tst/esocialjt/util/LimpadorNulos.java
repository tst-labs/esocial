package br.jus.tst.esocialjt.util;

import java.lang.reflect.Field;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LimpadorNulos {

	private static final Logger LOGGER = LoggerFactory.getLogger(LimpadorNulos.class);

	private LimpadorNulosConfig config;

	public LimpadorNulos() {
		this(new LimpadorNulosConfig());
	}

	public LimpadorNulos(LimpadorNulosConfig config) {
		super();
		this.config = config;
	}

	public void executarLimpeza(Object objeto) {
		getObjetoLimpo(objeto, objeto.getClass());
	}

	private Object getObjetoLimpo(Object objeto, Class<?> objectType) {
		boolean isTodasPropriedadesNulas = Stream.of(objectType.getDeclaredFields())
				.filter(filtrarPropriedadesSinteticas())
				.map(mapearPropriedadesNulasRecursivamente(objeto))
				.reduce(true, (a, b) -> a && b);

		return isTodasPropriedadesNulas ? null : objeto;
	}

	private Function<? super Field, Boolean> mapearPropriedadesNulasRecursivamente(Object objeto) {
		return field -> {
			boolean propriedadeNulaOuDefault = false;
			try {
				if (!config.isPropriedadeMarcadaNaoLimpar(field.getName())) {
					field.setAccessible(true);
					Object propriedade = field.get(objeto);

					Class<?> type = field.getType();
					if (saoMesmoPacote(objeto, propriedade)) {
						propriedade = getObjetoLimpo(propriedade, type);
						field.set(objeto, propriedade);
					}
					VerificacaoPropriedades verificacaoPropriedades = new VerificacaoPropriedades();
					propriedadeNulaOuDefault = verificacaoPropriedades.isPropriedadeNulaOuDefault(propriedade, type);
				}
			} catch (IllegalAccessException e) {
				LOGGER.error("Erro ao acessar propriedades do objeto por reflection", e);
			}
			return propriedadeNulaOuDefault;
		};
	}

	private Predicate<? super Field> filtrarPropriedadesSinteticas() {
		return field -> !field.isSynthetic();
	}



	private boolean saoMesmoPacote(Object objeto0, Object objeto1) {
		return objeto1 != null && objeto0.getClass().getPackage().equals(objeto1.getClass().getPackage());
	}
}
