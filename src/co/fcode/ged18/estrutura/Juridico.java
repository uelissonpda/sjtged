package co.fcode.ged18.estrutura;

/***************
*@author UANJOS*
***************/

import java.util.ArrayList;
import java.util.Collections;

import co.fcode.ged18.*;

public class Juridico {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	private Organizacao trab;	// TRABALHISTA
	private Organizacao tjrj;	// TRIBUNAL DE JUSTIÇA RJ
	private Organizacao jf;		// JUSTIÇA FEDERAL
	private Organizacao rfb;	// RECEITA FEDERAL DO BRASIL
	private Organizacao est;	// RECEITA ESTADUAL
	private Organizacao mun;	// RECEITA FEDERAL
	private Organizacao inpi;	// INPI
	private Organizacao cart;	// CARTÓRIO
	private Organizacao cont;	// CONTRATOS
	private Organizacao div;	// DIVERSPS
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//	
	
//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS--------------------//
	
	private TipoDocumento DocRecla;	// RECLAMAÇÃO
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//
	
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//	
	
	private ArrayList<TipoDocumento> TiposTrab;	// TIPOS TRABALHISTAS
	private ArrayList<TipoDocumento> TiposTjrj;	// TIPOS TRIBUNAL DE JUSTIÇA RJ
	private ArrayList<TipoDocumento> TiposJf;	// TIPOS JUSTIÇA FEDERAL
	private ArrayList<TipoDocumento> TiposRfb;	// TIPOS RECEITA FEDERAL DO BRASIL
	private ArrayList<TipoDocumento> TiposEst;	// TIPOS FAZENDA ESTADUAL
	private ArrayList<TipoDocumento> TiposMun;	// TIPOS FAZENDA MUNICIPAL
	private ArrayList<TipoDocumento> TiposInpi;	// TIPOS INPI
	private ArrayList<TipoDocumento> TiposCart;	// TIPOS CARTÓRIO
	private ArrayList<TipoDocumento> TiposCont;	// TIPOS CONTRATOS
	private ArrayList<TipoDocumento> TiposDiv;	// TIPOS DIVERSOS
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//	
	
	private ArrayList<Organizacao> organizacoes;
	private Unidade juridico;
	
	public Juridico() {
		setDocRecla(new TipoDocumento(1, "Reclamação", "RECLA"));
		
		setTiposTrab(new ArrayList<TipoDocumento>());
		setTiposTjrj(new ArrayList<TipoDocumento>());
		setTiposJf(new ArrayList<TipoDocumento>());
		setTiposEst(new ArrayList<TipoDocumento>());
		setTiposMun(new ArrayList<TipoDocumento>());
		setTiposInpi(new ArrayList<TipoDocumento>());
		setTiposCart(new ArrayList<TipoDocumento>());
		setTiposCont(new ArrayList<TipoDocumento>());
		setTiposDiv(new ArrayList<TipoDocumento>());
		
		TiposTrab.add(getDocRecla());		
		
		setTrab(new Organizacao(1, "Trabalhista", "Trab", TiposTrab));
		setTjrj(new Organizacao(2, "Tribunal de Justiça RJ", "TJRJ", TiposTjrj));
		setJf(new Organizacao(3, "Justiça Federal", "JF", TiposJf));
		setRfb(new Organizacao(4, "Receita Federal do Brasil", "RFB", TiposRfb));
		setEst(new Organizacao(5, "Fazenda Estadual", "EST", TiposEst));
		setMun(new Organizacao(6, "Fazenda Municipal", "MUN", TiposMun));
		setInpi(new Organizacao(7, "INPI", "INPI", TiposInpi));
		setCart(new Organizacao(8, "Cartório", "CART", TiposCart));
		setCont(new Organizacao(9, "Contratos", "CONT", TiposCont));
		setDiv(new Organizacao(10, "Diversos", "Div", TiposDiv));
		
		setOrganizacoes(new ArrayList<Organizacao>());
		getOrganizacoes().add(getTrab());
		getOrganizacoes().add(getTjrj());
		getOrganizacoes().add(getJf());
		getOrganizacoes().add(getRfb());
		getOrganizacoes().add(getEst());
		getOrganizacoes().add(getMun());
		getOrganizacoes().add(getInpi());
		getOrganizacoes().add(getCart());
		getOrganizacoes().add(getCont());
		getOrganizacoes().add(getDiv());
		
		
		setJuridico(new Unidade(6, "Jurídico", "JR", getOrganizacoes()));
		
		/* Organização dos Arrays em Ordem Crescente! - Fellipe Pimentel */
		Collections.sort(getTiposTrab(), new ComparadorTipoDocumento());
		Collections.sort(getTiposTjrj(), new ComparadorTipoDocumento());
		Collections.sort(getTiposJf(), new ComparadorTipoDocumento());
		Collections.sort(getTiposRfb(), new ComparadorTipoDocumento());
		Collections.sort(getTiposEst(), new ComparadorTipoDocumento());
		Collections.sort(getTiposMun(), new ComparadorTipoDocumento());
		Collections.sort(getTiposInpi(), new ComparadorTipoDocumento());
		Collections.sort(getTiposCart(), new ComparadorTipoDocumento());
		Collections.sort(getTiposCont(), new ComparadorTipoDocumento());
		Collections.sort(getTiposDiv(), new ComparadorTipoDocumento());
		
		Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
	}
	
	
//---------------------------------------------------------------------------------------------------		
	
	public Unidade getJuridico() {
		return juridico;
	}

	public void setJuridico(Unidade juridico) {
		this.juridico = juridico;
	}

//---------------------------------------------------------------------------------------------------		

	public ArrayList<Organizacao> getOrganizacoes() {
		return organizacoes;
	}

	public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
		this.organizacoes = organizacoes;
	}
	
//---------------------------------------------------------------------------------------------------		
	public ArrayList<TipoDocumento> getTiposDiv() {
		return TiposDiv;
	}

	public void setTiposDiv(ArrayList<TipoDocumento> tiposDiv) {
		TiposDiv = tiposDiv;
	}

	public ArrayList<TipoDocumento> getTiposCont() {
		return TiposCont;
	}

	public void setTiposCont(ArrayList<TipoDocumento> tiposCont) {
		TiposCont = tiposCont;
	}

	public ArrayList<TipoDocumento> getTiposCart() {
		return TiposCart;
	}

	public void setTiposCart(ArrayList<TipoDocumento> tiposCart) {
		TiposCart = tiposCart;
	}

	public ArrayList<TipoDocumento> getTiposInpi() {
		return TiposInpi;
	}

	public void setTiposInpi(ArrayList<TipoDocumento> tiposInpi) {
		TiposInpi = tiposInpi;
	}

	public ArrayList<TipoDocumento> getTiposMun() {
		return TiposMun;
	}

	public void setTiposMun(ArrayList<TipoDocumento> tiposMun) {
		TiposMun = tiposMun;
	}

	public ArrayList<TipoDocumento> getTiposRfb() {
		return TiposRfb;
	}

	public ArrayList<TipoDocumento> getTiposEst() {
		return TiposEst;
	}

	public void setTiposEst(ArrayList<TipoDocumento> tiposEst) {
		TiposEst = tiposEst;
	}

	public void setTiposRfb(ArrayList<TipoDocumento> tiposRfb) {
		TiposRfb = tiposRfb;
	}

	public ArrayList<TipoDocumento> getTiposJf() {
		return TiposJf;
	}

	public void setTiposJf(ArrayList<TipoDocumento> tiposJf) {
		TiposJf = tiposJf;
	}

	public ArrayList<TipoDocumento> getTiposTjrj() {
		return TiposTjrj;
	}

	public void setTiposTjrj(ArrayList<TipoDocumento> tiposTjrj) {
		TiposTjrj = tiposTjrj;
	}

	public ArrayList<TipoDocumento> getTiposTrab() {
		return TiposTrab;
	}

	public void setTiposTrab(ArrayList<TipoDocumento> tiposTrab) {
		TiposTrab = tiposTrab;
	}

//---------------------------------------------------------------------------------------------------		
	
	public TipoDocumento getDocRecla() {
		return DocRecla;
	}

	public void setDocRecla(TipoDocumento docRecla) {
		DocRecla = docRecla;
	}
	
//---------------------------------------------------------------------------------------------------
	public Organizacao getDiv() {
		return div;
	}

	public void setDiv(Organizacao div) {
		this.div = div;
	}

	public Organizacao getCont() {
		return cont;
	}

	public void setCont(Organizacao cont) {
		this.cont = cont;
	}

	public Organizacao getCart() {
		return cart;
	}

	public void setCart(Organizacao cart) {
		this.cart = cart;
	}

	public Organizacao getInpi() {
		return inpi;
	}

	public void setInpi(Organizacao inpi) {
		this.inpi = inpi;
	}

	public Organizacao getMun() {
		return mun;
	}

	public void setMun(Organizacao mun) {
		this.mun = mun;
	}

	public Organizacao getEst() {
		return est;
	}

	public void setEst(Organizacao est) {
		this.est = est;
	}

	public Organizacao getRfb() {
		return rfb;
	}

	public void setRfb(Organizacao rfb) {
		this.rfb = rfb;
	}

	public Organizacao getJf() {
		return jf;
	}

	public void setJf(Organizacao jf) {
		this.jf = jf;
	}

	public Organizacao getTrab() {
		return trab;
	}

	public void setTrab(Organizacao trab) {
		this.trab = trab;
	}
	public Organizacao getTjrj() {
		return tjrj;
	}
	public void setTjrj(Organizacao tjrj) {
		this.tjrj = tjrj;
	}
}
