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
	private Organizacao div;	// DIVERSOS
	private Organizacao Cfc;    // CONSELHO FEDERAL DE CONTABILIDADE
	private Organizacao Pe;		// Processo Eletrônico
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//	
	
//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS--------------------//
	
	private TipoDocumento DocRecla;	// RECLAMAÇÃO
	private TipoDocumento DocPare; // PARECER
	private TipoDocumento DocApos; // APOSENTADORIA
	private TipoDocumento DocDiv; // DIVERSOS
	private TipoDocumento DocCive; // CÍVEL
	private TipoDocumento DocSuce; // SUCESSÕES
	private TipoDocumento DocFam; // FAMÍLIA
	private TipoDocumento DocJec; // JUIZADO ESPECIAL
	private TipoDocumento DocExec; // EXECUÇÃO
	private TipoDocumento DocFazf; // FAZENDA FEDERAL
	private TipoDocumento DocPgfn; // PGFN
	private TipoDocumento DocFaze; // FAZENDA ESTADUAL
	private TipoDocumento DocPge; // PGE
	private TipoDocumento DocPref; // PREFEITURA
	private TipoDocumento DocPgm; // PGM
	private TipoDocumento DocMarc; // MARCAS
    private TipoDocumento DocDivo; // DIVORCIO
    private TipoDocumento DocTest; // TESTAMENTO
    private TipoDocumento DocDoaç; // DOAÇÃO
    private TipoDocumento DocComv; // COMPRA VENDA DE IMÓVEL
    private TipoDocumento DocProt; // PROTESTO DE TÍTULOS
    private TipoDocumento DocPsc; // PRESTAÇÃO DE SERVIÇO CONTÁBIL SJT
    private TipoDocumento DocCra; // CARTA RESPONSABILIDADE ADMINISTRAÇÃO
    private TipoDocumento DocMaci; // MANDATA DE CITAÇÃO
    private TipoDocumento DocDesp; // DESPACHO
    private TipoDocumento DocDeci; // DECISÃO
    private TipoDocumento DocPeti; // PETIÇÃO INICIAL
    private TipoDocumento DocArcps; // AVISO PRÉVIO DE RESCISÃO DE CONTRATO DE PRESTAÇÃO DE SERVIÇOS
	
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
	private ArrayList<TipoDocumento> TiposCfc; // TIPOS CONSELHO FEDERAL DE CONTABILIDADE
	private ArrayList<TipoDocumento> TiposPe; // TIPOS PROCESSO ELETRÔNICO
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//	
	
	private ArrayList<Organizacao> organizacoes;
	private Unidade juridico;
	
	public Juridico() {
		setDocRecla(new TipoDocumento(1, "Reclamação", "RECLA"));
		setDocPare(new TipoDocumento(2, "Parecer", "PARE"));
		setDocApos(new TipoDocumento(3, "Aposentadoria", "APOS"));
		setDocDiv(new TipoDocumento(4, "Diversos", "DIV"));
		setDocCive(new TipoDocumento(5, "Cível", "CIVE"));
		setDocSuce(new TipoDocumento(6, "Suecssões", "SUCE"));
		setDocFam(new TipoDocumento(7, "Família", "FAM"));
		setDocJec(new TipoDocumento(8, "Juizado Especial", "JEC"));
		setDocExec(new TipoDocumento(9, "Execução", "EXEC"));
		setDocFazf(new TipoDocumento(10, "Fazenda Federal", "FAZF"));
		setDocPgfn(new TipoDocumento(11, "PGFN", "PGFN"));
		setDocFaze(new TipoDocumento(12, "Fazenda Estadual", "FAZE"));
		setDocPge(new TipoDocumento(13, "PGE", "PGE"));
		setDocPref(new TipoDocumento(14, "Prefeitura", "PREF"));
		setDocPgm(new TipoDocumento(15, "PGM", "PGM"));
		setDocMarc(new TipoDocumento(16, "Marcas", "MARC"));
		setDocSuce(new TipoDocumento(17, "Sucessões", "SUCE"));
		setDocDivo(new TipoDocumento(18, "Divorcio", "DIVO"));
		setDocTest(new TipoDocumento(19, "Testamento", "TEST"));
		setDocDoaç(new TipoDocumento(20, "Doação", "DOAÇ"));
		setDocComv(new TipoDocumento(21, "Compra Venda de Imóvel", "COMV"));
		setDocProt(new TipoDocumento(22, "Protesto de Títulos", "PROT"));
		setDocPsc(new TipoDocumento(23, "Prestação de Serviço Contábil SJT", "SJT"));
		setDocDiv(new TipoDocumento(24, "Diversos", "DIV"));
		setDocCra(new TipoDocumento(25, "Carta Responsabilidade Administração", "CRA"));
		setDocMaci(new TipoDocumento(26, "Mandado de Citação", "MACI"));
		setDocDesp(new TipoDocumento(27, "Despacho", "DESP"));
		setDocDeci(new TipoDocumento(28, "Decisão", "DECI"));
		setDocPeti(new TipoDocumento(29, "Petição Inicial", "PETI"));
		setDocArcps(new TipoDocumento(30, "Aviso Prévio de Rescisão de Contrato de Prestação de Serviços", "ARCPS"));
		
		setTiposTrab(new ArrayList<TipoDocumento>());
		setTiposTjrj(new ArrayList<TipoDocumento>());
		setTiposJf(new ArrayList<TipoDocumento>());
		setTiposRfb(new ArrayList<TipoDocumento>());
		setTiposEst(new ArrayList<TipoDocumento>());
		setTiposMun(new ArrayList<TipoDocumento>());
		setTiposInpi(new ArrayList<TipoDocumento>());
		setTiposCart(new ArrayList<TipoDocumento>());
		setTiposCont(new ArrayList<TipoDocumento>());
		setTiposDiv(new ArrayList<TipoDocumento>());
		setTiposCfc(new ArrayList<TipoDocumento>());
		setTiposPe(new ArrayList<TipoDocumento>());
		
		TiposTrab.add(getDocRecla());
		TiposTrab.add(getDocPare());
		TiposTrab.add(getDocApos());
		TiposTrab.add(getDocDiv());
		
		TiposTjrj.add(getDocCive());
		TiposTjrj.add(getDocSuce());
		TiposTjrj.add(getDocFam());
		TiposTjrj.add(getDocJec());
		
		TiposJf.add(getDocExec());
		
		TiposRfb.add(getDocFazf());
		TiposRfb.add(getDocPgfn());
		
		TiposEst.add(getDocFaze());
		TiposEst.add(getDocPge());
		
		TiposMun.add(getDocPref());
		TiposMun.add(getDocPgm());
		
		TiposInpi.add(getDocMarc());
		
		TiposCart.add(getDocSuce());
		TiposCart.add(getDocDivo());
		TiposCart.add(getDocTest());
		TiposCart.add(getDocDoaç());
		TiposCart.add(getDocComv());
		TiposCart.add(getDocProt());
		
		TiposCont.add(getDocPsc());
		TiposCont.add(getDocDiv());
		TiposCont.add(getDocArcps());
		
		TiposDiv.add(getDocDiv());
		
		TiposCfc.add(getDocCra());
		
		TiposPe.add(getDocMaci());
		TiposPe.add(getDocDesp());
		TiposPe.add(getDocDeci());
		TiposPe.add(getDocPeti());
		
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
		setCfc(new Organizacao(11, "Conselho Federal Contabilidade", "Cfc", TiposCfc));
		setPe(new Organizacao(12, "Processo Eletrônico", "PE", TiposPe));
		
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
		getOrganizacoes().add(getCfc());
		getOrganizacoes().add(getPe());
		
		
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

	public ArrayList<TipoDocumento> getTiposPe() {
		return TiposPe;
	}


	public void setTiposPe(ArrayList<TipoDocumento> tiposPe) {
		TiposPe = tiposPe;
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

	public TipoDocumento getDocArcps() {
		return DocArcps;
	}


	public void setDocArcps(TipoDocumento docArcps) {
		DocArcps = docArcps;
	}


	public TipoDocumento getDocMaci() {
		return DocMaci;
	}


	public void setDocMaci(TipoDocumento docMaci) {
		DocMaci = docMaci;
	}


	public TipoDocumento getDocPeti() {
		return DocPeti;
	}


	public void setDocPeti(TipoDocumento docPeti) {
		DocPeti = docPeti;
	}


	public TipoDocumento getDocDeci() {
		return DocDeci;
	}


	public void setDocDeci(TipoDocumento docDeci) {
		DocDeci = docDeci;
	}


	public TipoDocumento getDocDesp() {
		return DocDesp;
	}


	public void setDocDesp(TipoDocumento docDesp) {
		DocDesp = docDesp;
	}


	public TipoDocumento getDocPsc() {
		return DocPsc;
	}


	public void setDocPsc(TipoDocumento docPsc) {
		DocPsc = docPsc;
	}


	public TipoDocumento getDocProt() {
		return DocProt;
	}


	public void setDocProt(TipoDocumento docProt) {
		DocProt = docProt;
	}


	public TipoDocumento getDocComv() {
		return DocComv;
	}


	public void setDocComv(TipoDocumento docComv) {
		DocComv = docComv;
	}


	public TipoDocumento getDocDoaç() {
		return DocDoaç;
	}


	public void setDocDoaç(TipoDocumento docDoaç) {
		DocDoaç = docDoaç;
	}


	public TipoDocumento getDocTest() {
		return DocTest;
	}


	public void setDocTest(TipoDocumento docTest) {
		DocTest = docTest;
	}


	public TipoDocumento getDocDivo() {
		return DocDivo;
	}


	public void setDocDivo(TipoDocumento docDivo) {
		DocDivo = docDivo;
	}


	public TipoDocumento getDocMarc() {
		return DocMarc;
	}


	public void setDocMarc(TipoDocumento docMarc) {
		DocMarc = docMarc;
	}


	public TipoDocumento getDocPgm() {
		return DocPgm;
	}


	public void setDocPgm(TipoDocumento docPgm) {
		DocPgm = docPgm;
	}


	public TipoDocumento getDocPref() {
		return DocPref;
	}


	public void setDocPref(TipoDocumento docPref) {
		DocPref = docPref;
	}


	public TipoDocumento getDocPge() {
		return DocPge;
	}


	public void setDocPge(TipoDocumento docPge) {
		DocPge = docPge;
	}


	public TipoDocumento getDocFaze() {
		return DocFaze;
	}


	public void setDocFaze(TipoDocumento docFaze) {
		DocFaze = docFaze;
	}


	public TipoDocumento getDocPgfn() {
		return DocPgfn;
	}


	public void setDocPgfn(TipoDocumento docPgfn) {
		DocPgfn = docPgfn;
	}


	public TipoDocumento getDocFazf() {
		return DocFazf;
	}


	public void setDocFazf(TipoDocumento docFazf) {
		DocFazf = docFazf;
	}


	public TipoDocumento getDocExec() {
		return DocExec;
	}


	public void setDocExec(TipoDocumento docExec) {
		DocExec = docExec;
	}


	public TipoDocumento getDocJec() {
		return DocJec;
	}


	public void setDocJec(TipoDocumento docJec) {
		DocJec = docJec;
	}


	public TipoDocumento getDocFam() {
		return DocFam;
	}


	public void setDocFam(TipoDocumento docFam) {
		DocFam = docFam;
	}


	public TipoDocumento getDocSuce() {
		return DocSuce;
	}


	public void setDocSuce(TipoDocumento docSuce) {
		DocSuce = docSuce;
	}


	public TipoDocumento getDocCive() {
		return DocCive;
	}


	public void setDocCive(TipoDocumento docCive) {
		DocCive = docCive;
	}


	public TipoDocumento getDocDiv() {
		return DocDiv;
	}


	public void setDocDiv(TipoDocumento docDiv) {
		DocDiv = docDiv;
	}


	public TipoDocumento getDocApos() {
		return DocApos;
	}


	public void setDocApos(TipoDocumento docApos) {
		DocApos = docApos;
	}


	public TipoDocumento getDocPare() {
		return DocPare;
	}


	public void setDocPare(TipoDocumento docPare) {
		DocPare = docPare;
	}


	public TipoDocumento getDocRecla() {
		return DocRecla;
	}

	public void setDocRecla(TipoDocumento docRecla) {
		DocRecla = docRecla;
	}
	
public TipoDocumento getDocCra() {
		return DocCra;
	}


	public void setDocCra(TipoDocumento docCra) {
		DocCra = docCra;
	}


public ArrayList<TipoDocumento> getTiposCfc() {
		return TiposCfc;
	}


	public void setTiposCfc(ArrayList<TipoDocumento> tiposCfc) {
		TiposCfc = tiposCfc;
	}


	public Organizacao getPe() {
		return Pe;
	}


	public void setPe(Organizacao pe) {
		Pe = pe;
	}


	public Organizacao getCfc() {
		return Cfc;
	}


	public void setCfc(Organizacao cfc) {
		Cfc = cfc;
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
