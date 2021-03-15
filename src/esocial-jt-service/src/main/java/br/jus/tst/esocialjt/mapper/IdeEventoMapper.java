package br.jus.tst.esocialjt.mapper;

import java.lang.reflect.Field;

import org.mapstruct.TargetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ReflectionUtils;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocialjt.xml.gerador.GeradorXml;

public class IdeEventoMapper {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GeradorXml.class);
	
	public <T extends Object> T mapearIdeEventoPagto(IdeEventoFolha reference, @TargetType Class<T> entityClass) {
		T instance = null;
		try {
			instance =  entityClass.newInstance();
			if(reference != null ) {
				applyValue(instance, "nrRecibo", reference.getNrRecibo());
				applyValue(instance, "indGuia", reference.getIndGuia());
				applyValue(instance, "indApuracao", reference.getIndApuracao());
				applyValue(instance, "perApur", reference.getPerApur());
			}
		} catch (Exception e) {
			LOGGER.debug(e.getMessage(), e);
		}
		return instance;
	}
	
	private void applyValue(Object o, String fieldName, Object value) {
		Field field = ReflectionUtils.findField(o.getClass(), fieldName);
		if (field != null) {
			ReflectionUtils.makeAccessible(field);
			ReflectionUtils.setField(field, o, value);
		}
	}
}
