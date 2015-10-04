package co.fcode.ged18;

public class TipoDocumento {
	private int codigo;
	private String nomeCompleto;
	private String sigla;
	
	public TipoDocumento(int codigo, String nomeCompleto, String sigla){
		this.setCodigo(codigo);
		this.setNomeCompleto(nomeCompleto);
		this.setSigla(sigla);
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
