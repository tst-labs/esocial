package br.jus.tst.esocialjt.mapper;

import java.lang.reflect.Field;

import org.mapstruct.TargetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ReflectionUtils;

import br.jus.tst.esocial.ocorrencia.dados.IdeEvento;
import br.jus.tst.esocial.ocorrencia.dados.IdeEventoPagto;
import br.jus.tst.esocialjt.xml.gerador.GeradorXml;

public class IdeEventoMapper {
	
	private static final byte IND_RETIF_DEFAULT = (byte)1;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GeradorXml.class);
	
	public <T extends Object> T mapearIdeEvento(IdeEvento reference, @TargetType Class<T> entityClass) {
		T instance = null;
		try {
			instance =  entityClass.newInstance();
			if(reference == null) {
				applyValue(instance, "indRetif", IND_RETIF_DEFAULT);
			} else {
				Byte indRetif = reference.getIndRetif();
				applyValue(instance, "indRetif", indRetif == null ? IND_RETIF_DEFAULT : indRetif);
				applyValue(instance, "nrRecibo", reference.getNrRecibo());
			}
		} catch (Exception e) {
			LOGGER.debug(e.getMessage(), e);
		}
		return instance;
    }
	
	public <T extends Object> T mapearIdeEventoPagto(IdeEventoPagto reference, @TargetType Class<T> entityClass) {
		T instance = null;
		try {
			instance =  entityClass.newInstance();
			if(reference == null ) {
				applyValue(instance, "indRetif", IND_RETIF_DEFAULT);
			} else {
				Byte indRetif = reference.getIndRetif();
				applyValue(instance, "indRetif", indRetif == null ? IND_RETIF_DEFAULT : indRetif);
				applyValue(instance, "nrRecibo", reference.getNrRecibo());
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
