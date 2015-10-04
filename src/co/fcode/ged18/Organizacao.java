package co.fcode.ged18;

import java.util.ArrayList;

public class Organizacao {
	private int codigo;
	private String nomeCompleto;
	private String sigla;
	private ArrayList<TipoDocumento> documentos;
	
	public Organizacao(int codigo,String nomeCompleto, String sigla, ArrayList<TipoDocumento> documentos){
		this.setCodigo(codigo);
		this.setNomeCompleto(nomeCompleto);
		this.setSigla(sigla);
		this.setDocumentos(documentos);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public ArrayList<TipoDocumento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(ArrayList<TipoDocumento> documentos) {
		this.documentos = documentos;
	}
	
	
}
