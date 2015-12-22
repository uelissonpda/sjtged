package co.fcode.ged18;

import java.util.Comparator;

public class ComparadorTipoDocumento implements Comparator<TipoDocumento>{

	@Override
	public int compare(TipoDocumento t1, TipoDocumento t2) {
		return t1.getNomeCompleto().compareTo(t2.getNomeCompleto());
	}
	
}
