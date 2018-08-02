package br.jus.tst.esocialjt.mapper.infrateste;

import java.math.BigInteger;

public class BigIntegerComparator<T> extends ObjectComparator<BigInteger> {

	@Override
	public int compareObjects(BigInteger bi1, Object o2) {
		if(o2 instanceof BigInteger) {
			return bi1.compareTo((BigInteger)o2);
		} 
		if(o2 instanceof Integer) {
			return bi1.compareTo(BigInteger.valueOf((Integer)o2));
		}
		return bi1.toString().compareTo(o2.toString());
	}

	
}
