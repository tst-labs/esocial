package br.jus.tst.esocialjt.mapper.infrateste;

import java.util.Comparator;

public abstract class ObjectComparator<T> implements Comparator<Object> {

	@SuppressWarnings("unchecked")
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 == null || o2 == null ) {
			return -1;
		} 
		return compareObjects((T)o1, o2);
	}
	
	public abstract int compareObjects(T o1, Object o2);
}
