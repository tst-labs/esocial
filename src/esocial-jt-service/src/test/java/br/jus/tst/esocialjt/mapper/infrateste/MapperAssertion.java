package br.jus.tst.esocialjt.mapper.infrateste;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class MapperAssertion {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static AbstractObjectAssert assertThat(Object o) {
		return Assertions.assertThat(o)
			.usingComparatorForType(new XMLGregorianCalendarComparator(), XMLGregorianCalendar.class)
			.usingComparatorForType(new BigIntegerComparator(), BigInteger.class);
	}
}
