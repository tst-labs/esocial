package br.jus.tst.esocialjt.mapper.infrateste;

import java.util.Comparator;

public class Ignore<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		return 0;
	}

}
