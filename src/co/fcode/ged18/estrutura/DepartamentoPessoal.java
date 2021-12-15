package co.fcode.ged18.estrutura;

import java.util.ArrayList;
import java.util.Collections;

import co.fcode.ged18.*;
/***************
*@author UANJOS*
***************/
public class DepartamentoPessoal {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
	//private Organizacao rot;  // ROTINAS
	private Organizacao dvrs; // DIVERSOS
	private Organizacao rais; // RAIS

//-----------------------FIM DA DECLARAÇÃO----------------------------// 

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
	
	private TipoDocumento DocAdmiss; // ADMISSÃO
	private TipoDocumento DocQuitac; // QUITAÇÃO
	private TipoDocumento DocFolhas; // FOLHAS
	private TipoDocumento DocGfip;   // GFIP
	private TipoDocumento DocDarf;   // DARF
	private TipoDocumento DocGps;    // GPS
	private TipoDocumento DocCaged;  // CAGED
	private TipoDocumento DocCompvt; // COMPVT
	private TipoDocumento DocPonto;  // PONTO
	private TipoDocumento DocFerias; // FÉRIAS
	private TipoDocumento DocGrcsu;  // GUIAS SINDICAIS
	private TipoDocumento DocAssist; // GUIAS ASSISTENCIAIS
	private TipoDocumento DocConfed; // GUIAS CONFEDERATIVAS
	private TipoDocumento DocProlab; // PROLABORE
	private TipoDocumento DocPatron; // PATRONAL
	private TipoDocumento DocPis;    // PIS SOBRE FOLHA
	private TipoDocumento DocRecibo; // RECIBO DE ENTREGA
	private TipoDocumento DocRais;   // RAIS
	private TipoDocumento DocInfrend;// INFORMES DE RENDIMENTOS
	private TipoDocumento DocProces; // PROCESSOS TRABALHISTAS
	private TipoDocumento DocCrf;    // CRF
	private TipoDocumento DocCndtra;// CND TRABALHISTA
	private TipoDocumento DocDeclar; // DECLARAÇÕES
	private TipoDocumento DocConven; // DISSIDIO COM DATA BASE
	private TipoDocumento DocParcel; // PARCELAMENTOS
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//
	
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
	
	private ArrayList<TipoDocumento> TiposRot;  // TIPOS ROTINA
	private ArrayList<TipoDocumento> TiposDvrs; // TIPOS DOCUMENTOS DIVERSOS
	private ArrayList<TipoDocumento> TiposRais; // TIPOS RAIS
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//
	
	private ArrayList<Organizacao> organizacoes;
	private Unidade dp;
	
	public DepartamentoPessoal(){
		setDocAdmiss(new TipoDocumento(1,"Admissão","ADMISS"));
		setDocQuitac(new TipoDocumento(1,"Quitação", "QUITAC"));
		setDocFolhas(new TipoDocumento(2,"Folhas","FOLHAS"));
		setDocGfip(new TipoDocumento(3,"Gfip","GFIP"));
		setDocDarf(new TipoDocumento(4,"Darf","DARF"));
		setDocGps(new TipoDocumento(5,"Gps","GPS"));
		setDocCaged(new TipoDocumento(6,"Caged","CAGED"));
		setDocCompvt(new TipoDocumento(7,"Compra de VT","COMPVT"));
		setDocPonto(new TipoDocumento(8, "Ponto","PONTO"));
		setDocFerias(new TipoDocumento(9,"Férias","FERIAS"));
		setDocGrcsu(new TipoDocumento(10,"Guias Sindicais","GRCSU"));
		setDocAssist(new TipoDocumento(11,"Guias Assistenciais","ASSIST"));
		setDocConfed(new TipoDocumento(12,"Guias Confederativas","CONFED"));
		setDocProlab(new TipoDocumento(13,"Prolabore","PROLAB"));
		setDocPatron(new TipoDocumento(14,"Patronal","PATRON"));
		setDocPis(new TipoDocumento(15,"PIS sobre folha","PIS"));
		setDocDeclar(new TipoDocumento(16,"Declarações","DECLAR"));
		setDocRais(new TipoDocumento(17,"Rais","RAIS"));
		setDocInfrend(new TipoDocumento(18,"Informes de Rendimentos","INFREND"));
		setDocProces(new TipoDocumento(19,"Processos Trabalhistas","PROCES"));
		setDocParcel(new TipoDocumento(20, "Parcelamentos", "PARCEL"));
		setDocRecibo(new TipoDocumento(21, "Recibo de Entrega", "Recibo"));
		setDocCrf(new TipoDocumento(23,"CRF","CRF"));
		setDocCndtra(new TipoDocumento(24,"CND Trabalhista","CNDTRA"));
		setDocDeclar(new TipoDocumento(25,"Declarações","DECLAR"));
		setDocConven(new TipoDocumento(26,"Convenção Coletiva","CONVEN"));
		
		//setTiposRot(new ArrayList<TipoDocumento>());
		setTiposDvrs(new ArrayList<TipoDocumento>());
		setTiposRais(new ArrayList<TipoDocumento>());
		
		/*TiposRot.add(getDocAdmiss());
		TiposRot.add(getDocQuitac());
		TiposRot.add(getDocFolhas());
		TiposRot.add(getDocGfip());
		TiposRot.add(getDocDarf());
		TiposRot.add(getDocGps());
		TiposRot.add(getDocCaged());
		TiposRot.add(getDocCompvt());
		TiposRot.add(getDocPonto());
		TiposRot.add(getDocFerias());
		TiposRot.add(getDocGrcsu());
		TiposRot.add(getDocAssist());
		TiposRot.add(getDocProlab());
		TiposRot.add(getDocPatron());
		TiposRot.add(getDocPis());*/
		
		TiposDvrs.add(getDocProces());
		TiposDvrs.add(getDocCrf());
		TiposDvrs.add(getDocCndtra());
		TiposDvrs.add(getDocDeclar());
		TiposDvrs.add(getDocConven());
		TiposDvrs.add(getDocParcel());
		
		TiposRais.add(getDocDeclar());
		TiposRais.add(getDocRecibo());
				
		//setRot(new Organizacao(1, "Rotinas", "ROT", TiposRot));
		setRais(new Organizacao(2, "RAIS", "RAIS", TiposRais));
		setDvrs(new Organizacao(3, "Diversos", "DVRS", TiposDvrs));
		
		setOrganizacoes(new ArrayList<Organizacao>());
		//getOrganizacoes().add(getRot());
		getOrganizacoes().add(getDvrs());
		getOrganizacoes().add(getRais());
		
		setDp(new Unidade(3,"Depto. Pessoal","DP",getOrganizacoes()));
		
		/* Organização dos Arrays em Ordem Crescente! - Fellipe Pimentel */
		Collections.sort(getTiposDvrs(), new ComparadorTipoDocumento());
		//Collections.sort(getTiposRot(), new ComparadorTipoDocumento());
		Collections.sort(getTiposRais(), new ComparadorTipoDocumento());
		
		Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
	}
//------------------------------------------------------------------------------------------------	
/**
	 * @return the tiposDvrs
	 */
	public ArrayList<TipoDocumento> getTiposDvrs() {
		return TiposDvrs;
	}

	/**
	 * @param tiposDvrs the tiposDvrs to set
	 */
	public void setTiposDvrs(ArrayList<TipoDocumento> tiposDvrs) {
		TiposDvrs = tiposDvrs;
	}

/**
	 * @return the tiposRot
	 */
	public ArrayList<TipoDocumento> getTiposRot() {
		return TiposRot;
	}

	/**
	 * @param tiposRot the tiposRot to set
	 */
	public void setTiposRot(ArrayList<TipoDocumento> tiposRot) {
		TiposRot = tiposRot;
	}


//--------------------------------------------------------------------------------------------------
	
	public ArrayList<TipoDocumento> getTiposRais() {
	return TiposRais;
}
public void setTiposRais(ArrayList<TipoDocumento> tiposRais) {
	TiposRais = tiposRais;
}
	public TipoDocumento getDocConven() {
		return DocConven;
	}

	/**
	 * @param docDataba the docDataba to set
	 */
	public void setDocConven(TipoDocumento docConven) {
		DocConven = docConven;
	}

/**
	 * @return the docDeclar
	 */
	public TipoDocumento getDocDeclar() {
		return DocDeclar;
	}

	/**
	 * @param docDeclar the docDeclar to set
	 */
	public void setDocDeclar(TipoDocumento docDeclar) {
		DocDeclar = docDeclar;
	}

/**
	 * @return the docCndtra
	 */
	public TipoDocumento getDocCndtra() {
		return DocCndtra;
	}

	/**
	 * @param docCndtra the docCndtra to set
	 */
	public void setDocCndtra(TipoDocumento docCndtra) {
		DocCndtra = docCndtra;
	}
	
	public TipoDocumento getDocCrf() {
		return DocCrf;
	}

	/**
	 * @param docCrf the docCrf to set
	 */
	public void setDocCrf(TipoDocumento docCrf) {
		DocCrf = docCrf;
	}

	public TipoDocumento getDocProces() {
		return DocProces;
	}

	public void setDocProces(TipoDocumento docProces) {
		DocProces = docProces;
	}

	public TipoDocumento getDocInfrend() {
		return DocInfrend;
	}

	public void setDocInfrend(TipoDocumento docInfrend) {
		DocInfrend = docInfrend;
	}

	public TipoDocumento getDocRais() {
		return DocRais;
	}

	public void setDocRais(TipoDocumento docRais) {
		DocRais = docRais;
	}

	public TipoDocumento getDocPis() {
		return DocPis;
	}

	public void setDocPis(TipoDocumento docPis) {
		DocPis = docPis;
	}

	public TipoDocumento getDocPatron() {
		return DocPatron;
	}

	public void setDocPatron(TipoDocumento docPatron) {
		DocPatron = docPatron;
	}

	public TipoDocumento getDocProlab() {
		return DocProlab;
	}

	public void setDocProlab(TipoDocumento docProlab) {
		DocProlab = docProlab;
	}

	public TipoDocumento getDocConfed() {
		return DocConfed;
	}

	public void setDocConfed(TipoDocumento docConfed) {
		DocConfed = docConfed;
	}

	public TipoDocumento getDocAssist() {
		return DocAssist;
	}

	public void setDocAssist(TipoDocumento docAssist) {
		DocAssist = docAssist;
	}

	public TipoDocumento getDocGrcsu() {
		return DocGrcsu;
	}

	public void setDocGrcsu(TipoDocumento docGrcsu) {
		DocGrcsu = docGrcsu;
	}

	public TipoDocumento getDocPonto() {
		return DocPonto;
	}

	public void setDocPonto(TipoDocumento docPonto) {
		DocPonto = docPonto;
	}

	public TipoDocumento getDocCompvt() {
		return DocCompvt;
	}

	public void setDocCompvt(TipoDocumento docCompvt) {
		DocCompvt = docCompvt;
	}

	public TipoDocumento getDocCaged() {
		return DocCaged;
	}

	public void setDocCaged(TipoDocumento docCaged) {
		DocCaged = docCaged;
	}

/**
	 * @return the docGps
	 */
	public TipoDocumento getDocGps() {
		return DocGps;
	}

	/**
	 * @param docGps the docGps to set
	 */
	public void setDocGps(TipoDocumento docGps) {
		DocGps = docGps;
	}

/**
	 * @return the docDarf
	 */
	public TipoDocumento getDocDarf() {
		return DocDarf;
	}

	/**
	 * @param docDarf the docDarf to set
	 */
	public void setDocDarf(TipoDocumento docDarf) {
		DocDarf = docDarf;
	}

/**
	 * @return the docGfip
	 */
	public TipoDocumento getDocGfip() {
		return DocGfip;
	}

	/**
	 * @param docGfip the docGfip to set
	 */
	public void setDocGfip(TipoDocumento docGfip) {
		DocGfip = docGfip;
	}

/**
	 * @return the docFolhas
	 */
	public TipoDocumento getDocFolhas() {
		return DocFolhas;
	}

	/**
	 * @param docFolhas the docFolhas to set
	 */
	public void setDocFolhas(TipoDocumento docFolhas) {
		DocFolhas = docFolhas;
	}

/**
	 * @return the docQuitac
	 */
	public TipoDocumento getDocQuitac() {
		return DocQuitac;
	}

	/**
	 * @param docQuitac the docQuitac to set
	 */
	public void setDocQuitac(TipoDocumento docQuitac) {
		DocQuitac = docQuitac;
	}

/**
	 * @return the docAdmiss
	 */
	public TipoDocumento getDocAdmiss() {
		return DocAdmiss;
	}

	/**
	 * @param docAdmiss the docAdmiss to set
	 */
	public void setDocAdmiss(TipoDocumento docAdmiss) {
		DocAdmiss = docAdmiss;
	}

public TipoDocumento getDocRecibo() {
		return DocRecibo;
	}
	public void setDocRecibo(TipoDocumento docRecibo) {
		DocRecibo = docRecibo;
	}
	//-----------------------------------------------------------------------------------------------
	/**
	 * @return the dvrs
	 */
	public Organizacao getDvrs() {
		return dvrs;
	}

	/**
	 * @param dvrs the dvrs to set
	 */
	public void setDvrs(Organizacao dvrs) {
		this.dvrs = dvrs;
	}

	/*public Organizacao getRot() {
		return rot;
	}

	
	public void setRot(Organizacao rot) {
		this.rot = rot;
	}
*/
	public Organizacao getRais() {
		return rais;
	}
	public void setRais(Organizacao rais) {
		this.rais = rais;
	}
	public TipoDocumento getDocFerias() {
		return DocFerias;
	}

	public void setDocFerias(TipoDocumento docFerias) {
		DocFerias = docFerias;
	}
	public TipoDocumento getDocParcel() {
		return DocParcel;
	}
	public void setDocParcel(TipoDocumento docParcel) {
		DocParcel = docParcel;
	}
	public ArrayList<Organizacao> getOrganizacoes() {
		return organizacoes;
	}
	public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
		this.organizacoes = organizacoes;
	}
	public Unidade getDp() {
		return dp;
	}
	public void setDp(Unidade dp) {
		this.dp = dp;
	}
}
