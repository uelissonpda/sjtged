package co.fcode.ged18.estrutura;

import java.util.ArrayList;
import java.util.Collections;

import co.fcode.ged18.*;
/***************
*@author UANJOS*
***************/
public class Fiscal {
//-------------------VARI�VEIS TIPOS DE ORGANIZA��O-------------------//
	
		private Organizacao tdm;  // 
		private Organizacao sepd; // 
		private Organizacao xml;  // 
		private Organizacao spdc; // SPED CONTRIBUI��ES
		private Organizacao spdf; // SPED FISCAL
		private Organizacao dcla; // DECLAN
		private Organizacao dub;  // 
		private Organizacao sn;   // SIMPLES NACIONAL
		private Organizacao gia;  // 
		private Organizacao mcal; // MEM�RIA DE C�LCULO
		private Organizacao trib; // IMPOSTOS/CONTRIBUI��ES
		private Organizacao parc; // PARCELAMENTO
		private Organizacao mun; // PARCELAMENTO
		
		

//-----------------------FIM DA DECLARA��O----------------------------//

//-------------------VARI�VEIS TIPOS DE DOCUMENTOS-------------------//
			
		private TipoDocumento DocTdm;    // 
		private TipoDocumento DocAutliv; //
		private TipoDocumento DocXmle;   // XML Entrada
		private TipoDocumento DocXmls;   // XML Sa�da
		private TipoDocumento DocXmliss; // 
		private TipoDocumento DocDecl;   // DECLARA��O
		private TipoDocumento DocArqtxt; // Arquivo TXT
		private TipoDocumento DocRecent; // RECIBO DE ENTREGA
		private TipoDocumento DocMemapu; // APURA��O
		private TipoDocumento DocExtrat; // EXTRATO
		private TipoDocumento DocEsplho; // ESPELHO
		private TipoDocumento DocPiscof; // Pis e Cofins
		private TipoDocumento DocCnefes; // 
		private TipoDocumento DocTomret; // Tomadores/reten��es
		private TipoDocumento DocSn;     // Simples Nacional
		private TipoDocumento DocIrcsll; // IRPJ /CSLL 
		private TipoDocumento DocIr1708; // 
		private TipoDocumento DocIr3280; // 
		private TipoDocumento DocIr3208; //  
		private TipoDocumento DocPc5952; // PIS/COFINS/CSLL 5952
		private TipoDocumento DocPis;    // 
		private TipoDocumento DocCofins; // 
		private TipoDocumento DocIrpj;   // 
		private TipoDocumento DocCsll;   // 
		private TipoDocumento DocDas;    // 
		private TipoDocumento DocIcms;   // 
		private TipoDocumento DocIcmsst; // 
		private TipoDocumento DocDifal;  // 
		private TipoDocumento DocIss;    // 
		private TipoDocumento DocFedera; //
		private TipoDocumento DocEstado; //
		private TipoDocumento DocMunici; //
		private TipoDocumento DocCodace; //
		private TipoDocumento DocCepom; // INSCRI��O CEPOM
		
			
//-----------------------FIM DA DECLARA��O----------------------------//
			
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
		
		private ArrayList<TipoDocumento> TiposTdm;  // TIPOS 
		private ArrayList<TipoDocumento> TiposSepd; // TIPOS 
		private ArrayList<TipoDocumento> TiposXml;  // TIPOS 
		private ArrayList<TipoDocumento> TiposSpdc; // TIPOS SPED CONT�BIL
		private ArrayList<TipoDocumento> TiposSpdf; // TIPOS SPED FISCAL
		private ArrayList<TipoDocumento> TiposDcla; // TIPOS DECLAN
		private ArrayList<TipoDocumento> TiposDub;  // TIPOS 
		private ArrayList<TipoDocumento> TiposSn;   // TIPOS SIMPLES NACIONAL
		private ArrayList<TipoDocumento> TiposGia;  // TIPOS 
		private ArrayList<TipoDocumento> TiposMcal; // TIPOS MEM�RIA DE C�LCULO
		private ArrayList<TipoDocumento> TiposTrib; // TIPOS IMPOSTOS/CONTRIBUI��ES
		private ArrayList<TipoDocumento> TiposParc; // TIPOS PARCELAMENTOS
		private ArrayList<TipoDocumento> TiposMun; // TIPOS CEPOM
			
//-----------------------FIM DA DECLARA��O----------------------------//
		
		private ArrayList<Organizacao> organizacoes;
		private Unidade fiscal;
			
		public Fiscal(){
			setDocTdm(new TipoDocumento(1, "Tdm", "TDM"));
			setDocAutliv(new TipoDocumento(2, "Sepd","SEPD"));
			setDocXmle(new TipoDocumento(3,"XML Entrada","XMLE"));
			setDocXmls(new TipoDocumento(4,"XML Sa�da","XMLS"));
			setDocXmliss(new TipoDocumento(5,"XML Iss","XMLISS"));
			setDocDecl(new TipoDocumento(6,"Declara��o","DECL"));
			setDocArqtxt(new TipoDocumento(7,"Arquivo TXT","ARQTXT"));
			setDocRecent(new TipoDocumento(8,"Recibo de Entrega","RECENT"));
			setDocMemapu(new TipoDocumento(9,"Apura��o","MEMAPU"));
			setDocExtrat(new TipoDocumento(10,"Extrato","EXTRAT"));
			setDocEsplho(new TipoDocumento(11,"Espelho","ESPLHO"));
			setDocPiscof(new TipoDocumento(12,"PIS e COFINS","PISCOF"));
			setDocCnefes(new TipoDocumento(13,"Cnefes","CNEFES"));
			setDocTomret(new TipoDocumento(14,"Tomadores-Reten��es",""));
			setDocSn(new TipoDocumento(15,"Simples Nacional","SN"));

			setDocIrcsll(new TipoDocumento(16,"IRPJ-CSLL","IRCSLL"));
			setDocIr1708(new TipoDocumento(17,"IRRF 1708","Ir1708"));
			setDocIr3280(new TipoDocumento(18,"IRRF 3280","Ir3280"));
			setDocIr3208(new TipoDocumento(19,"IRRF 3208","Ir3208"));
			setDocPc5952(new TipoDocumento(20,"PIS-COFINS-CSLL 5952","PC5952"));
			setDocPis(new TipoDocumento(21,"PIS","PIS"));
			setDocCofins(new TipoDocumento(22,"COFINS","COFINS"));
			setDocIrpj(new TipoDocumento(23,"IRPJ","IRPJ"));
			setDocCsll(new TipoDocumento(24,"CSLL","CSLL"));
			setDocDas(new TipoDocumento(25,"DAS","DAS"));
			setDocIcms(new TipoDocumento(26,"ICMS","ICMS"));
			setDocIcmsst(new TipoDocumento(27,"ICMS-ST","ICMSST"));
			setDocDifal(new TipoDocumento(28,"DIFAL","DIFAL"));
			setDocIss(new TipoDocumento(29,"ISS","ISS"));
			setDocFedera(new TipoDocumento(30,"Federal","FEDERA"));
			setDocEstado(new TipoDocumento(31,"Estadual","ESTADO"));
			setDocMunici(new TipoDocumento(32,"Municipal","MUNICI"));
			setDocCodace(new TipoDocumento(33,"C�digo de Acesso","CODACE"));
			setDocCepom(new TipoDocumento(34, "Inscri��o CEPOM", "CEPOM"));
			
			
			setTiposTdm(new ArrayList<TipoDocumento>());
			setTiposDcla(new ArrayList<TipoDocumento>());
			setTiposDub(new ArrayList<TipoDocumento>());
			setTiposGia(new ArrayList<TipoDocumento>());
			setTiposMcal(new ArrayList<TipoDocumento>());
			setTiposSepd(new ArrayList<TipoDocumento>());
			setTiposSn(new ArrayList<TipoDocumento>());
			setTiposSpdc(new ArrayList<TipoDocumento>());
			setTiposTrib(new ArrayList<TipoDocumento>());
			setTiposSpdf(new ArrayList<TipoDocumento>());
			setTiposXml(new ArrayList<TipoDocumento>());
			setTiposParc(new ArrayList<TipoDocumento>());
			setTiposMun(new ArrayList<TipoDocumento>());
			
			TiposTdm.add(getDocTdm());
			
			TiposSepd.add(getDocAutliv());
			
			TiposXml.add(getDocXmle());
			TiposXml.add(getDocXmls());
			TiposXml.add(getDocXmliss());
			
			TiposSpdc.add(getDocDecl());
			TiposSpdc.add(getDocArqtxt());
			TiposSpdc.add(getDocRecent());
			
			TiposSpdf.add(getDocDecl());
			TiposSpdf.add(getDocArqtxt());
			TiposSpdf.add(getDocRecent());
			
			TiposDcla.add(getDocDecl());
			
			TiposDub.add(getDocDecl());
			
			TiposSn.add(getDocMemapu());
			TiposSn.add(getDocExtrat());
			TiposSn.add(getDocRecent());
			TiposSn.add(getDocCodace());
			
			TiposGia.add(getDocRecent());
			TiposGia.add(getDocEsplho());
			
			TiposMcal.add(getDocPiscof());
			TiposMcal.add(getDocCnefes());
			TiposMcal.add(getDocTomret());
			TiposMcal.add(getDocSn());
			TiposMcal.add(getDocIrcsll());
			
			TiposTrib.add(getDocIr1708());
			TiposTrib.add(getDocIr3280());
			TiposTrib.add(getDocIr3208());
			TiposTrib.add(getDocPc5952());
			TiposTrib.add(getDocPis());
			TiposTrib.add(getDocCofins());
			TiposTrib.add(getDocCsll());
			TiposTrib.add(getDocDas());
			TiposTrib.add(getDocIcms());
			TiposTrib.add(getDocIcmsst());
			TiposTrib.add(getDocDifal());
			TiposTrib.add(getDocIss());
			
			TiposParc.add(getDocFedera());
			TiposParc.add(getDocEstado());
			TiposParc.add(getDocMunici());
			
			TiposMun.add(getDocCepom());
			
			setTdm(new Organizacao(1,"Tdm","TDM",TiposTdm));
			setSepd(new Organizacao(2,"Sepd","SEPD",TiposSepd));
			setXml(new Organizacao(3,"Xml","XMLA",TiposXml));
			setSpdc(new Organizacao(4,"Sped Contribui��es","SPDC",TiposSpdc));
			setSpdf(new Organizacao(5,"Sped Fiscal","SPDF",TiposSpdf));
			setDcla(new Organizacao(6,"Declan","DCLA",TiposDcla));
			setDub(new Organizacao(7,"Dub","DUB",TiposDub));
			setSn(new Organizacao(8,"Simples Nacional","SN",TiposSn));
			setGia(new Organizacao(9,"GIA","GIA",TiposGia));
			setMcal(new Organizacao(10,"Mem�ria de C�lculo","MCAL",TiposMcal));
			setTrib(new Organizacao(11,"Impostos-Contribui��es","TRIB",TiposTrib));
			setParc(new Organizacao(12,"Parcelamento","PARC",TiposParc));
			setMun(new Organizacao(13,"Municipal","MUN",TiposMun));
			
			setOrganizacoes(new ArrayList<Organizacao>());
			getOrganizacoes().add(getTdm());
			getOrganizacoes().add(getSepd());
			getOrganizacoes().add(getXml());
			getOrganizacoes().add(getSpdc());
			getOrganizacoes().add(getSpdf());
			getOrganizacoes().add(getDcla());
			getOrganizacoes().add(getDub());
			getOrganizacoes().add(getSn());
			getOrganizacoes().add(getGia());
			getOrganizacoes().add(getMcal());
			getOrganizacoes().add(getTrib());
			getOrganizacoes().add(getParc());
			getOrganizacoes().add(getMun());
			
			setFiscal(new Unidade(4,"Fiscal","FS",getOrganizacoes()));
			
			/* Organiza��o dos Arrays em Ordem Crescente! - Fellipe Pimentel */
			Collections.sort(getTiposDcla(), new ComparadorTipoDocumento());
			Collections.sort(getTiposDub(), new ComparadorTipoDocumento());
			Collections.sort(getTiposGia(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMcal(), new ComparadorTipoDocumento());
			Collections.sort(getTiposSepd(), new ComparadorTipoDocumento());
			Collections.sort(getTiposSn(), new ComparadorTipoDocumento());
			Collections.sort(getTiposSpdc(), new ComparadorTipoDocumento());
			Collections.sort(getTiposSpdf(), new ComparadorTipoDocumento());
			Collections.sort(getTiposTdm(), new ComparadorTipoDocumento());
			Collections.sort(getTiposTrib(), new ComparadorTipoDocumento());
			Collections.sort(getTiposXml(), new ComparadorTipoDocumento());
			Collections.sort(getTiposParc(), new ComparadorTipoDocumento());
			
			Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
	}
//-----------------------------------------------------------------------------------------------
		
		public ArrayList<TipoDocumento> getTiposMun() {
			return TiposMun;
		}

		public void setTiposMun(ArrayList<TipoDocumento> tiposMun) {
			TiposMun = tiposMun;
		}

/**
		 * @return the tiposTrib
		 */
		public ArrayList<TipoDocumento> getTiposTrib() {
			return TiposTrib;
		}


		/**
		 * @param tiposTrib the tiposTrib to set
		 */
		public void setTiposTrib(ArrayList<TipoDocumento> tiposTrib) {
			TiposTrib = tiposTrib;
		}


/**
		 * @return the tiposMcal
		 */
		public ArrayList<TipoDocumento> getTiposMcal() {
			return TiposMcal;
		}


		/**
		 * @param tiposMcal the tiposMcal to set
		 */
		public void setTiposMcal(ArrayList<TipoDocumento> tiposMcal) {
			TiposMcal = tiposMcal;
		}


/**
		 * @return the tiposGia
		 */
		public ArrayList<TipoDocumento> getTiposGia() {
			return TiposGia;
		}


		/**
		 * @param tiposGia the tiposGia to set
		 */
		public void setTiposGia(ArrayList<TipoDocumento> tiposGia) {
			TiposGia = tiposGia;
		}


/**
		 * @return the tiposSn
		 */
		public ArrayList<TipoDocumento> getTiposSn() {
			return TiposSn;
		}


		/**
		 * @param tiposSn the tiposSn to set
		 */
		public void setTiposSn(ArrayList<TipoDocumento> tiposSn) {
			TiposSn = tiposSn;
		}


/**
		 * @return the tiposDub
		 */
		public ArrayList<TipoDocumento> getTiposDub() {
			return TiposDub;
		}


		/**
		 * @param tiposDub the tiposDub to set
		 */
		public void setTiposDub(ArrayList<TipoDocumento> tiposDub) {
			TiposDub = tiposDub;
		}


/**
		 * @return the tiposDcla
		 */
		public ArrayList<TipoDocumento> getTiposDcla() {
			return TiposDcla;
		}


		/**
		 * @param tiposDcla the tiposDcla to set
		 */
		public void setTiposDcla(ArrayList<TipoDocumento> tiposDcla) {
			TiposDcla = tiposDcla;
		}


/**
		 * @return the tiposSpdf
		 */
		public ArrayList<TipoDocumento> getTiposSpdf() {
			return TiposSpdf;
		}


		/**
		 * @param tiposSpdf the tiposSpdf to set
		 */
		public void setTiposSpdf(ArrayList<TipoDocumento> tiposSpdf) {
			TiposSpdf = tiposSpdf;
		}


/**
		 * @return the tiposSpdc
		 */
		public ArrayList<TipoDocumento> getTiposSpdc() {
			return TiposSpdc;
		}


		/**
		 * @param tiposSpdc the tiposSpdc to set
		 */
		public void setTiposSpdc(ArrayList<TipoDocumento> tiposSpdc) {
			TiposSpdc = tiposSpdc;
		}


/**
		 * @return the tiposXml
		 */
		public ArrayList<TipoDocumento> getTiposXml() {
			return TiposXml;
		}


		/**
		 * @param tiposXml the tiposXml to set
		 */
		public void setTiposXml(ArrayList<TipoDocumento> tiposXml) {
			TiposXml = tiposXml;
		}


/**
		 * @return the tiposSepd
		 */
		public ArrayList<TipoDocumento> getTiposSepd() {
			return TiposSepd;
		}


		/**
		 * @param tiposSepd the tiposSepd to set
		 */
		public void setTiposSepd(ArrayList<TipoDocumento> tiposSepd) {
			TiposSepd = tiposSepd;
		}
		
		/*
		 * @return the tiposTdm
		 */
		public ArrayList<TipoDocumento> getTiposTdm() {
			return TiposTdm;
		}


		/**
		 * @param tiposTdm the tiposTdm to set
		 */
		public void setTiposTdm(ArrayList<TipoDocumento> tiposTdm) {
			TiposTdm = tiposTdm;
		}
		
		public ArrayList<TipoDocumento> getTiposParc() {
			return TiposParc;
		}

		public void setTiposParc(ArrayList<TipoDocumento> tiposParc) {
			TiposParc = tiposParc;
		}

//-----------------------------------------------------------------------------------------------		
		

		public TipoDocumento getDocCepom() {
			return DocCepom;
		}

		public void setDocCepom(TipoDocumento docCepom) {
			DocCepom = docCepom;
		}
		
		public TipoDocumento getDocCodace() {
			return DocCodace;
		}

		public void setDocCodace(TipoDocumento docCodace) {
			DocCodace = docCodace;
		}

		public TipoDocumento getDocMunici() {
			return DocMunici;
		}

		public void setDocMunici(TipoDocumento docMunici) {
			DocMunici = docMunici;
		}

		public TipoDocumento getDocEstado() {
			return DocEstado;
		}

		public void setDocEstado(TipoDocumento docEstado) {
			DocEstado = docEstado;
		}

		public TipoDocumento getDocFedera() {
			return DocFedera;
		}

		public void setDocFedera(TipoDocumento docFedera) {
			DocFedera = docFedera;
		}

		/**
		 * @return the docIss
		 */
		public TipoDocumento getDocIss() {
			return DocIss;
		}


		/**
		 * @param docIss the docIss to set
		 */
		public void setDocIss(TipoDocumento docIss) {
			DocIss = docIss;
		}


		/**
		 * @return the docDifal
		 */
		public TipoDocumento getDocDifal() {
			return DocDifal;
		}


		/**
		 * @param docDifal the docDifal to set
		 */
		public void setDocDifal(TipoDocumento docDifal) {
			DocDifal = docDifal;
		}


/**
		 * @return the docIcms
		 */
		public TipoDocumento getDocIcms() {
			return DocIcms;
		}


		/**
		 * @param docIcms the docIcms to set
		 */
		public void setDocIcms(TipoDocumento docIcms) {
			DocIcms = docIcms;
		}


/**
		 * @return the docIcmsst
		 */
		public TipoDocumento getDocIcmsst() {
			return DocIcmsst;
		}


		/**
		 * @param docIcmsst the docIcmsst to set
		 */
		public void setDocIcmsst(TipoDocumento docIcmsst) {
			DocIcmsst = docIcmsst;
		}


/**
		 * @return the docDas
		 */
		public TipoDocumento getDocDas() {
			return DocDas;
		}


		/**
		 * @param docDas the docDas to set
		 */
		public void setDocDas(TipoDocumento docDas) {
			DocDas = docDas;
		}


/**
		 * @return the docCsll
		 */
		public TipoDocumento getDocCsll() {
			return DocCsll;
		}


		/**
		 * @param docCsll the docCsll to set
		 */
		public void setDocCsll(TipoDocumento docCsll) {
			DocCsll = docCsll;
		}


/**
		 * @return the docIrpj
		 */
		public TipoDocumento getDocIrpj() {
			return DocIrpj;
		}


		/**
		 * @param docIrpj the docIrpj to set
		 */
		public void setDocIrpj(TipoDocumento docIrpj) {
			DocIrpj = docIrpj;
		}


/**
		 * @return the docCofins
		 */
		public TipoDocumento getDocCofins() {
			return DocCofins;
		}


		/**
		 * @param docCofins the docCofins to set
		 */
		public void setDocCofins(TipoDocumento docCofins) {
			DocCofins = docCofins;
		}


/**
		 * @return the docPis
		 */
		public TipoDocumento getDocPis() {
			return DocPis;
		}


		/**
		 * @param docPis the docPis to set
		 */
		public void setDocPis(TipoDocumento docPis) {
			DocPis = docPis;
		}


/**
		 * @return the docPc5952
		 */
		public TipoDocumento getDocPc5952() {
			return DocPc5952;
		}


		/**
		 * @param docPc5952 the docPc5952 to set
		 */
		public void setDocPc5952(TipoDocumento docPc5952) {
			DocPc5952 = docPc5952;
		}


/**
		 * @return the docIr3208
		 */
		public TipoDocumento getDocIr3208() {
			return DocIr3208;
		}


		/**
		 * @param docIr3208 the docIr3208 to set
		 */
		public void setDocIr3208(TipoDocumento docIr3208) {
			DocIr3208 = docIr3208;
		}


/**
		 * @return the docIr3280
		 */
		public TipoDocumento getDocIr3280() {
			return DocIr3280;
		}


		/**
		 * @param docIr3280 the docIr3280 to set
		 */
		public void setDocIr3280(TipoDocumento docIr3280) {
			DocIr3280 = docIr3280;
		}


/**
		 * @return the docIr1708
		 */
		public TipoDocumento getDocIr1708() {
			return DocIr1708;
		}


		/**
		 * @param docIr1708 the docIr1708 to set
		 */
		public void setDocIr1708(TipoDocumento docIr1708) {
			DocIr1708 = docIr1708;
		}


/**
		 * @return the docIrcsll
		 */
		public TipoDocumento getDocIrcsll() {
			return DocIrcsll;
		}


		/**
		 * @param docIrcsll the docIrcsll to set
		 */
		public void setDocIrcsll(TipoDocumento docIrcsll) {
			DocIrcsll = docIrcsll;
		}


/**
		 * @return the docSn
		 */
		public TipoDocumento getDocSn() {
			return DocSn;
		}


		/**
		 * @param docSn the docSn to set
		 */
		public void setDocSn(TipoDocumento docSn) {
			DocSn = docSn;
		}


/**
		 * @return the docTomret
		 */
		public TipoDocumento getDocTomret() {
			return DocTomret;
		}


		/**
		 * @param docTomret the docTomret to set
		 */
		public void setDocTomret(TipoDocumento docTomret) {
			DocTomret = docTomret;
		}


/**
		 * @return the docPiscof
		 */
		public TipoDocumento getDocPiscof() {
			return DocPiscof;
		}


		/**
		 * @param docPiscof the docPiscof to set
		 */
		public void setDocPiscof(TipoDocumento docPiscof) {
			DocPiscof = docPiscof;
		}


/**
		 * @return the docCnefes
		 */
		public TipoDocumento getDocCnefes() {
			return DocCnefes;
		}


		/**
		 * @param docCnefes the docCnefes to set
		 */
		public void setDocCnefes(TipoDocumento docCnefes) {
			DocCnefes = docCnefes;
		}


/**
		 * @return the docEsplho
		 */
		public TipoDocumento getDocEsplho() {
			return DocEsplho;
		}


		/**
		 * @param docEsplho the docEsplho to set
		 */
		public void setDocEsplho(TipoDocumento docEsplho) {
			DocEsplho = docEsplho;
		}


/**
		 * @return the docExtrat
		 */
		public TipoDocumento getDocExtrat() {
			return DocExtrat;
		}


		/**
		 * @param docExtrat the docExtrat to set
		 */
		public void setDocExtrat(TipoDocumento docExtrat) {
			DocExtrat = docExtrat;
		}


/**
		 * @return the docMemapu
		 */
		public TipoDocumento getDocMemapu() {
			return DocMemapu;
		}


		/**
		 * @param docMemapu the docMemapu to set
		 */
		public void setDocMemapu(TipoDocumento docMemapu) {
			DocMemapu = docMemapu;
		}


/**
		 * @return the docRecent
		 */
		public TipoDocumento getDocRecent() {
			return DocRecent;
		}


		/**
		 * @param docRecent the docRecent to set
		 */
		public void setDocRecent(TipoDocumento docRecent) {
			DocRecent = docRecent;
		}


/**
		 * @return the docArqtxt
		 */
		public TipoDocumento getDocArqtxt() {
			return DocArqtxt;
		}


		/**
		 * @param docArqtxt the docArqtxt to set
		 */
		public void setDocArqtxt(TipoDocumento docArqtxt) {
			DocArqtxt = docArqtxt;
		}


/**
		 * @return the docDecl
		 */
		public TipoDocumento getDocDecl() {
			return DocDecl;
		}


		/**
		 * @param docDecl the docDecl to set
		 */
		public void setDocDecl(TipoDocumento docDecl) {
			DocDecl = docDecl;
		}


/**
		 * @return the docXmliss
		 */
		public TipoDocumento getDocXmliss() {
			return DocXmliss;
		}


		/**
		 * @param docXmliss the docXmliss to set
		 */
		public void setDocXmliss(TipoDocumento docXmliss) {
			DocXmliss = docXmliss;
		}


/**
		 * @return the docXmls
		 */
		public TipoDocumento getDocXmls() {
			return DocXmls;
		}


		/**
		 * @param docXmls the docXmls to set
		 */
		public void setDocXmls(TipoDocumento docXmls) {
			DocXmls = docXmls;
		}


/**
		 * @return the docXmle
		 */
		public TipoDocumento getDocXmle() {
			return DocXmle;
		}


		/**
		 * @param docXmle the docXmle to set
		 */
		public void setDocXmle(TipoDocumento docXmle) {
			DocXmle = docXmle;
		}


/**
		 * @return the docAutliv
		 */
		public TipoDocumento getDocAutliv() {
			return DocAutliv;
		}


		/**
		 * @param docAutliv the docAutliv to set
		 */
		public void setDocAutliv(TipoDocumento docAutliv) {
			DocAutliv = docAutliv;
		}


/**
		 * @return the docTdm
		 */
		public TipoDocumento getDocTdm() {
			return DocTdm;
		}


		/**
		 * @param docTdm the docTdm to set
		 */
		public void setDocTdm(TipoDocumento docTdm) {
			DocTdm = docTdm;
		}




		//-----------------------------------------------------------------------------------------------
		
		public Organizacao getMun() {
			return mun;
		}

		public void setMun(Organizacao mun) {
			this.mun = mun;
		}

		public Organizacao getParc() {
			return parc;
		}

		public void setParc(Organizacao parc) {
			this.parc = parc;
		}
		
		/**
		 * @return the trib
		 */
		public Organizacao getTrib() {
			return trib;
		}

		/**
		 * @param trib the trib to set
		 */
		public void setTrib(Organizacao trib) {
			this.trib = trib;
		}

		/**
		 * @return the mcal
		 */
		public Organizacao getMcal() {
			return mcal;
		}

		/**
		 * @param mcal the mcal to set
		 */
		public void setMcal(Organizacao mcal) {
			this.mcal = mcal;
		}

		/**
		 * @return the gia
		 */
		public Organizacao getGia() {
			return gia;
		}

		/**
		 * @param gia the gia to set
		 */
		public void setGia(Organizacao gia) {
			this.gia = gia;
		}

		/**
		 * @return the sn
		 */
		public Organizacao getSn() {
			return sn;
		}

		/**
		 * @param sn the sn to set
		 */
		public void setSn(Organizacao sn) {
			this.sn = sn;
		}

		/**
		 * @return the dcla
		 */
		public Organizacao getDcla() {
			return dcla;
		}

		/**
		 * @param dcla the dcla to set
		 */
		public void setDcla(Organizacao dcla) {
			this.dcla = dcla;
		}

		/**
		 * @return the spdf
		 */
		public Organizacao getSpdf() {
			return spdf;
		}

		/**
		 * @param spdf the spdf to set
		 */
		public void setSpdf(Organizacao spdf) {
			this.spdf = spdf;
		}

		/**
		 * @return the spdc
		 */
		public Organizacao getSpdc() {
			return spdc;
		}

		/**
		 * @param spdc the spdc to set
		 */
		public void setSpdc(Organizacao spdc) {
			this.spdc = spdc;
		}

		/**
		 * @return the xml
		 */
		public Organizacao getXml() {
			return xml;
		}

		/**
		 * @param xml the xml to set
		 */
		public void setXml(Organizacao xml) {
			this.xml = xml;
		}

		/**
		 * @return the sepd
		 */
		public Organizacao getSepd() {
			return sepd;
		}

		/**
		 * @param sepd the sepd to set
		 */
		public void setSepd(Organizacao sepd) {
			this.sepd = sepd;
		}

		/**
		 * @return the tdm
		 */
		public Organizacao getTdm() {
			return tdm;
		}

		/**
		 * @param tdm the tdm to set
		 */
		public void setTdm(Organizacao tdm) {
			this.tdm = tdm;
		}

		/**
		 * @return the dub
		 */
		public Organizacao getDub() {
			return dub;
		}

		/**
		 * @param dub the dub to set
		 */
		public void setDub(Organizacao dub) {
			this.dub = dub;
		}

		public ArrayList<Organizacao> getOrganizacoes() {
			return organizacoes;
		}

		public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
			this.organizacoes = organizacoes;
		}

		public Unidade getFiscal() {
			return fiscal;
		}

		public void setFiscal(Unidade fiscal) {
			this.fiscal = fiscal;
		}	
}
