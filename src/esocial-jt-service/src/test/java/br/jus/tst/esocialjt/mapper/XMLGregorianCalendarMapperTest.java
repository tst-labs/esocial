package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

public class XMLGregorianCalendarMapperTest {

	private XMLGregorianCalendarMapper xmlGregorianCalendarMapper = new XMLGregorianCalendarMapper();

	@Test
	public void deveRetornarXMLGregorianCalendarSePassadoCalendar() throws ParseException {
		String formato = "yyyy-MM-dd";
		
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		Calendar calendar = Calendar.getInstance();
		String data = "2017-10-16";
		calendar.setTime(sdf.parse(data));
		
		XMLGregorianCalendar xgc = xmlGregorianCalendarMapper.paraXMLGregorianCalendar(calendar);
		assertThat(xgc.toString()).isEqualTo(data);
	}
	
	@Test
	public void deveRetornarNuloSePassadoNulo() throws ParseException {
		XMLGregorianCalendar xgc = xmlGregorianCalendarMapper.paraXMLGregorianCalendar(null);
		assertThat(xgc).isNull();
	}

}
