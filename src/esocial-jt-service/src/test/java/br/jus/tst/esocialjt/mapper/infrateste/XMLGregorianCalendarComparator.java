package br.jus.tst.esocialjt.mapper.infrateste;

import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import br.jus.tst.esocialjt.util.CalendarUtil;

public class XMLGregorianCalendarComparator<T> extends ObjectComparator<XMLGregorianCalendar>{

	@Override
	public int compareObjects(XMLGregorianCalendar xmlCal1, Object o2) {
		XMLGregorianCalendar xmlCal2 = CalendarUtil.paraXMLGregorianCalendar((Calendar) o2);
		return xmlCal1.compare(xmlCal2);
	}

}
