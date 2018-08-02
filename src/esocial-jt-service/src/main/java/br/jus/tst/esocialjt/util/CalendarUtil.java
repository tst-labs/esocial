package br.jus.tst.esocialjt.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CalendarUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalendarUtil.class);

	public static final String FORMATO_PERIODO_ESOCIAL = "yyyy-MM";
	public static final String FORMATO_DATA_ESOCIAL = "yyyy-MM-dd";

	private CalendarUtil() {
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public static Calendar dateToCalendar(java.sql.Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	public static String formatoDataESocial(Calendar calendar) {
		SimpleDateFormat s = new SimpleDateFormat(FORMATO_DATA_ESOCIAL);
		Date data = calendar.getTime();
		return s.format(data);
	}

	public static String formatoPeriodoESocial(Calendar calendar) {
		SimpleDateFormat s = new SimpleDateFormat(FORMATO_PERIODO_ESOCIAL);
		Date data = calendar.getTime();
		return s.format(data);
	}

	public static String formatoPeriodoESocial(int ano, int mes) {
		StringBuilder anoMes = new StringBuilder();
		anoMes.append(String.valueOf(ano));
		anoMes.append("-");
		anoMes.append(String.format("%02d", mes));
		return anoMes.toString();
	}

	public static Calendar data(int ano, int mes, int dia) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(0);
		calendar.set(ano, mes - 1, dia, 0, 0, 0);
		return calendar;
	}

	public static Calendar data(Calendar calendar) {
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH);
		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.setTimeInMillis(0);
		calendar.set(ano, mes, dia, 0, 0, 0);
		return calendar;
	}

	public static XMLGregorianCalendar paraXMLGregorianCalendar(Calendar calendar) {
		XMLGregorianCalendar xmlGC = null;
		if (calendar != null) {
			final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			final String data = df.format(calendar.getTime());
			try {
				xmlGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(data);
			} catch (DatatypeConfigurationException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return xmlGC;
	}

}
