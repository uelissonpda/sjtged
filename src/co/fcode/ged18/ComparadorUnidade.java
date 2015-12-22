package co.fcode.ged18;

import java.util.Comparator;

public class ComparadorUnidade implements Comparator<Unidade>{

	@Override
	public int compare(Unidade u1, Unidade u2) {
		return u1.getNomeCompleto().compareTo(u2.getNomeCompleto());
	}
	
}
