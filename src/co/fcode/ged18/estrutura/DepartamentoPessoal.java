package co.fcode.ged18.estrutura;

import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;
import co.fcode.ged18.Unidade;
/***************
*@author UANJOS*
***************/
public class DepartamentoPessoal {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
	private Organizacao rot;  // ROTINAS
	private Organizacao obac; // OBRIGAÇÕES ACESSÓRIAS
	private Organizacao dvrs; // DIVERSOS

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
	private TipoDocumento DocDirf;   // DIRF
	private TipoDocumento DocRais;   // RAIS
	private TipoDocumento DocInfrend;// INFORMES DE RENDIMENTOS
	private TipoDocumento DocProces; // PROCESSOS
	private TipoDocumento DocAudito; // AUDITORIAS
	private TipoDocumento DocReproc; // CONTROLE DE REPROCESSOS
	private TipoDocumento DocCnd;    // CND
	private TipoDocumento DocCrf;    // CRF
	private TipoDocumento DocCndtra;// CND TRABALHISTA
	private TipoDocumento DocDeclar; // DECLARAÇÕES
	private TipoDocumento DocDataba; // DISSIDIO COM DATA BASE
	private TipoDocumento DocPrepos; // CARTA DE PREPOSTO
	private TipoDocumento DocComext; // COMUNICADO EXTERNO
	private TipoDocumento DocPartic; // PARTICULARIDARES EMPRESAS
	private TipoDocumento DocRecalc; // RECALCULOS
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//
	
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
	
	private ArrayList<TipoDocumento> TiposRot;  // TIPOS ROTINA
	private ArrayList<TipoDocumento> TiposObac; // TIPOS OBRIGAÇÕES ACESSÓRIAS
	private ArrayList<TipoDocumento> TiposDvrs; // TIPOS DOCUMENTOS DIVERSOS
	
//-----------------------FIM DA DECLARAÇÃO----------------------------//
	
	private ArrayList<Organizacao> organizacoes;
	private Unidade dp;
	
	public DepartamentoPessoal(){
		setDocAdmiss(new TipoDocumento(1,"Admissao","ADMISS"));
		setDocQuitac(new TipoDocumento(1,"Quitação", ""));  // TODO: Com Erro
		setDocFolhas(new TipoDocumento(2,"Folhas","FOLHAS"));
		setDocGfip(new TipoDocumento(3,"Gfip","GFIP"));
		setDocDarf(new TipoDocumento(4,"Darf","DARF"));
		setDocGps(new TipoDocumento(5,"Gps","GPS"));
		setDocCaged(new TipoDocumento(6,"Caged","CAGED"));
		setDocCompvt(new TipoDocumento(7,"Compra de VT","COMPVT"));
		setDocPonto(new TipoDocumento(8, "Ponto","PONTO"));
		setDocFerias(new TipoDocumento(9,"Ferias","FERIAS"));
		setDocGrcsu(new TipoDocumento(10,"Guias Sindicais","GRCSU"));
		setDocAssist(new TipoDocumento(11,"Guias Assistenciais","ASSIST"));
		setDocConfed(new TipoDocumento(12,"Guias Confederativas","CONFED"));
		setDocProlab(new TipoDocumento(13,"Prolabore","PROLAB"));
		setDocPatron(new TipoDocumento(14,"Patronal","PATRON"));
		setDocPis(new TipoDocumento(15,"PIS sobre folha","PIS"));
		setDocDirf(new TipoDocumento(16,"Dirf","DIRF"));
		setDocRais(new TipoDocumento(17,"Rais","RAIS"));
		setDocInfrend(new TipoDocumento(18,"Informes de Rendimentos","INFREND"));
		setDocProces(new TipoDocumento(19,"Processsos","PROCES"));
		setDocAudito(new TipoDocumento(20,"Auditoriais","AUDITO"));
		setDocReproc(new TipoDocumento(21,"Controle de Reprocessos","REPROC"));
		setDocCnd(new TipoDocumento(22,"CND","CND"));
		setDocCrf(new TipoDocumento(23,"CRF","CRF"));
		setDocCndtra(new TipoDocumento(24,"CND Trabalhista","CNDTRA"));
		setDocDeclar(new TipoDocumento(25,"Declaracoes","DECLAR"));
		setDocDataba(new TipoDocumento(26,"Dissidio com Data Base","DATABA"));
		setDocPrepos(new TipoDocumento(27,"Carta de Preposto","PREPOS"));
		setDocComext(new TipoDocumento(28,"Comunicado Externo","COMEXT"));
		setDocPartic(new TipoDocumento(29,"Particularidades Empresas","PARTIC"));
		setDocRecalc(new TipoDocumento(30,"Recalculos","RECALC"));
		
		setTiposRot(new ArrayList<TipoDocumento>());
		setTiposObac(new ArrayList<TipoDocumento>());
		setTiposDvrs(new ArrayList<TipoDocumento>());
		
		TiposRot.add(getDocAdmiss());
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
		TiposRot.add(getDocPis());
		
		TiposObac.add(getDocDirf());
		TiposObac.add(getDocRais());
		TiposObac.add(getDocInfrend());
		
		TiposDvrs.add(getDocProces());
		TiposDvrs.add(getDocAudito());
		TiposDvrs.add(getDocReproc());
		TiposDvrs.add(getDocCnd());
		TiposDvrs.add(getDocCrf());
		TiposDvrs.add(getDocCrf());
		TiposDvrs.add(getDocCndtra());
		TiposDvrs.add(getDocDeclar());
		TiposDvrs.add(getDocDataba());
		TiposDvrs.add(getDocPrepos());
		TiposDvrs.add(getDocComext());
		TiposDvrs.add(getDocPartic());
		TiposDvrs.add(getDocRecalc());
		
		setRot(new Organizacao(1, "Rotinas", "ROT", TiposRot));
		setObac(new Organizacao(2, "Obrigacoes Acessorias", "OBAC", TiposObac));
		setDvrs(new Organizacao(3,"Diversos", "DVRS",TiposDvrs));
		
		setOrganizacoes(new ArrayList<Organizacao>());
		getOrganizacoes().add(getRot());
		getOrganizacoes().add(getObac());
		getOrganizacoes().add(getDvrs());
		
		setDp(new Unidade(3,"Depto. Pessoal","DP",getOrganizacoes()));
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

/**
	 * @return the docRecalc
	 */
	public TipoDocumento getDocRecalc() {
		return DocRecalc;
	}

/**
 * @return the tiposObac
 */
public ArrayList<TipoDocumento> getTiposObac() {
	return TiposObac;
}

/**
 * @param tiposObac the tiposObac to set
 */
public void setTiposObac(ArrayList<TipoDocumento> tiposObac) {
	TiposObac = tiposObac;
}

//--------------------------------------------------------------------------------------------------
	/**
	 * @param docRecalc the docRecalc to set
	 */
	public void setDocRecalc(TipoDocumento docRecalc) {
		DocRecalc = docRecalc;
	}

/**
	 * @return the docPartic
	 */
	public TipoDocumento getDocPartic() {
		return DocPartic;
	}

	/**
	 * @param docPartic the docPartic to set
	 */
	public void setDocPartic(TipoDocumento docPartic) {
		DocPartic = docPartic;
	}

/**
	 * @return the docComext
	 */
	public TipoDocumento getDocComext() {
		return DocComext;
	}

	/**
	 * @param docComext the docComext to set
	 */
	public void setDocComext(TipoDocumento docComext) {
		DocComext = docComext;
	}

/**
	 * @return the docPrepos
	 */
	public TipoDocumento getDocPrepos() {
		return DocPrepos;
	}

	/**
	 * @param docPrepos the docPrepos to set
	 */
	public void setDocPrepos(TipoDocumento docPrepos) {
		DocPrepos = docPrepos;
	}

/**
	 * @return the docDataba
	 */
	public TipoDocumento getDocDataba() {
		return DocDataba;
	}

	/**
	 * @param docDataba the docDataba to set
	 */
	public void setDocDataba(TipoDocumento docDataba) {
		DocDataba = docDataba;
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

/**
	 * @return the docCnd
	 */
	public TipoDocumento getDocCnd() {
		return DocCnd;
	}

	/**
	 * @param docCnd the docCnd to set
	 */
	public void setDocCnd(TipoDocumento docCnd) {
		DocCnd = docCnd;
	}

/**
	 * @return the docCrf
	 */
	public TipoDocumento getDocCrf() {
		return DocCrf;
	}

	/**
	 * @param docCrf the docCrf to set
	 */
	public void setDocCrf(TipoDocumento docCrf) {
		DocCrf = docCrf;
	}

	public TipoDocumento getDocReproc() {
		return DocReproc;
	}

	public void setDocReproc(TipoDocumento docReproc) {
		DocReproc = docReproc;
	}

	public TipoDocumento getDocAudito() {
		return DocAudito;
	}

	public void setDocAudito(TipoDocumento docAudito) {
		DocAudito = docAudito;
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

	public TipoDocumento getDocDirf() {
		return DocDirf;
	}

	public void setDocDirf(TipoDocumento docDirf) {
		DocDirf = docDirf;
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

	/**
	 * @return the obac
	 */
	public Organizacao getObac() {
		return obac;
	}

	/**
	 * @param obac the obac to set
	 */
	public void setObac(Organizacao obac) {
		this.obac = obac;
	}

	/**
	 * @return the rot
	 */
	public Organizacao getRot() {
		return rot;
	}

	/**
	 * @param rot the rot to set
	 */
	public void setRot(Organizacao rot) {
		this.rot = rot;
	}

	public TipoDocumento getDocFerias() {
		return DocFerias;
	}

	public void setDocFerias(TipoDocumento docFerias) {
		DocFerias = docFerias;
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
