package br.jus.tst.esocialjt.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XMLGregorianCalendarMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(XMLGregorianCalendarMapper.class);

	public XMLGregorianCalendar paraXMLGregorianCalendar(Calendar calendar) {
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
