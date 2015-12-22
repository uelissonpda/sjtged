package co.fcode.ged18;

import java.util.Comparator;

public class ComparadorOrganizacao implements Comparator<Organizacao>{

	@Override
	public int compare(Organizacao o1, Organizacao o2) {
		return o1.getNomeCompleto().compareTo(o2.getNomeCompleto());
	}
	
}
