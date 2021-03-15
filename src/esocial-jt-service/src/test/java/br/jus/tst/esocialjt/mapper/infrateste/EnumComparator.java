package br.jus.tst.esocialjt.mapper.infrateste;

@SuppressWarnings("rawtypes")
public class EnumComparator<T> extends ObjectComparator<Enum> {

	@Override
	public int compareObjects(Enum bi1, Object o2) {
		return bi1.toString().compareTo(o2.toString());
	}

	
}
