package co.fcode.ged18;

import java.util.ArrayList;

public class Unidade {
	private int codigo;
	private String nomeCompleto;
	private String sigla;
	private ArrayList<Organizacao> organizacao;
	
	public Unidade(int codigo, String nomeCompleto, String sigla, ArrayList<Organizacao> organizacao){
		this.setCodigo(codigo);
		this.setNomeCompleto(nomeCompleto);
		this.setOrganizacao(organizacao);
		this.setSigla(sigla);
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
	public ArrayList<Organizacao> getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(ArrayList<Organizacao> organizacao) {
		this.organizacao = organizacao;
	}
	
	
}
