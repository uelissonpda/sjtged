package co.fcode.ged18.estrutura;

import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;

public class DepartamentoPessoal {
	private Organizacao a;
	private Organizacao b;
	private Organizacao c;
	
	private TipoDocumento doc1; // Documento OrgA
	private TipoDocumento doc2; // Documento OrgB
	private TipoDocumento doc3; // Documento OrgC
	
	private ArrayList<TipoDocumento> tiposDocA;
	private ArrayList<TipoDocumento> tiposDocB;
	private ArrayList<TipoDocumento> tiposDocC;
	
	public DepartamentoPessoal(){
	}
}
