package br.jus.tst.esocialjt.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class CalendarUtilTest {

	@Test
	public void utilDateToCalendarComSucesso() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2017);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		Date data = calendar.getTime();	
		
		Calendar cal = CalendarUtil.dateToCalendar(data);
		
		assertEquals(2017, cal.get(Calendar.YEAR));
		assertEquals(1, cal.get(Calendar.MONTH));
		assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void sqlDateToCalendarComSucesso() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2017);
		calendar.set(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		java.sql.Date data = new java.sql.Date(calendar.getTime().getTime());	
		
		Calendar cal = CalendarUtil.dateToCalendar(data);
		
		assertEquals(2017, cal.get(Calendar.YEAR));
		assertEquals(1, cal.get(Calendar.MONTH));
		assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void dataComSucesso() {
		Calendar cal = CalendarUtil.data(2017, 1, 1);
		
		assertEquals(2017, cal.get(Calendar.YEAR));
		assertEquals(0, cal.get(Calendar.MONTH));
		assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
		assertEquals(0, cal.get(Calendar.HOUR));
		assertEquals(0, cal.get(Calendar.MINUTE));
		assertEquals(0, cal.get(Calendar.SECOND));
		assertEquals(0, cal.get(Calendar.MILLISECOND));
	}

	@Test
	public void dataFromCalendarComSucesso() {
		Calendar input = Calendar.getInstance();
		
		
		Calendar out = CalendarUtil.data(input);
		
		assertNotEquals(0, out.get(Calendar.YEAR));
		assertNotEquals(0, out.get(Calendar.DAY_OF_MONTH));
		assertEquals(0, out.get(Calendar.HOUR));
		assertEquals(0, out.get(Calendar.MINUTE));
		assertEquals(0, out.get(Calendar.SECOND));
		assertEquals(0, out.get(Calendar.MILLISECOND));
	}

	@Test
	public void testaFormatoPeriodoESocialCalendar() {
		int ano = 2017;
		int mes = 6;
		String expected = "2017-06";
		assertEquals(expected, CalendarUtil.formatoPeriodoESocial(ano, mes));
	}

	@Test
	public void testaFormatoPeriodoESocialIntInt() {
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 5, 1);
		String expected = "2017-06";
		assertEquals(expected, CalendarUtil.formatoPeriodoESocial(cal));
	}
	
	@Test
	public void testaFormatoDataESocialIntInt() {
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 5, 1);
		String expected = "2017-06-01";
		assertEquals(expected, CalendarUtil.formatoDataESocial(cal));
	}
}
