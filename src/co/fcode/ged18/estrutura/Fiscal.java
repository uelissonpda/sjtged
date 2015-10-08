package co.fcode.ged18.estrutura;

import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;
/***************
*@author UANJOS*
***************/
public class Fiscal {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
		private Organizacao tdm;  // 
		private Organizacao sepd; // 
		private Organizacao xml;  // 
		private Organizacao spdc; // SPED CONTRIBUIÇÕES
		private Organizacao spdf; // SPED FISCAL
		private Organizacao dcla; // DECLAN
		private Organizacao dub;  // 
		private Organizacao sn;   // SIMPLES NACIONAL
		private Organizacao gia;  // 
		private Organizacao mcal; // MEMÓRIA DE CÁLCULO
		private Organizacao trib; // IMPOSTOS/CONTRIBUIÇÕES
		

//-----------------------FIM DA DECLARAÇÃO----------------------------//

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
			
		private TipoDocumento DocTdm;    // 
		private TipoDocumento DocAutliv; //
		private TipoDocumento DocXmle;   // XML Entrada
		private TipoDocumento DocXmls;   // XML Saída
		private TipoDocumento DocXmliss; // 
		private TipoDocumento DocDecl;   // DECLARAÇÃO
		private TipoDocumento DocArqtxt; // Arquivo TXT
		private TipoDocumento DocRecent; // RECIBO DE ENTREGA
		private TipoDocumento DocMemapu; // APURAÇÃO
		private TipoDocumento DocExtrat; // EXTRATO
		private TipoDocumento DocEsplho; // ESPELHO
		private TipoDocumento DocPiscof; // Pis e Cofins
		private TipoDocumento DocCnefes; // 
		private TipoDocumento DocTomret; // Tomadores/retenções
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
		
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
		
		private ArrayList<TipoDocumento> TiposTdm;  // TIPOS 
		private ArrayList<TipoDocumento> TiposSepd; // TIPOS 
		private ArrayList<TipoDocumento> TiposXml;  // TIPOS 
		private ArrayList<TipoDocumento> TiposSpdc; // TIPOS SPED CONTÁBIL
		private ArrayList<TipoDocumento> TiposSpdf; // TIPOS SPED FISCAL
		private ArrayList<TipoDocumento> TiposDcla; // TIPOS DECLAN
		private ArrayList<TipoDocumento> TiposDub;  // TIPOS 
		private ArrayList<TipoDocumento> TiposSn;   // TIPOS SIMPLES NACIONAL
		private ArrayList<TipoDocumento> TiposGia;  // TIPOS 
		private ArrayList<TipoDocumento> TiposMcal; // TIPOS MEMÓRIA DE CÁLCULO
		private ArrayList<TipoDocumento> TiposTrib; // TIPOS IMPOSTOS/CONTRIBUIÇÕES
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
		public Fiscal(){
				
	}
//-----------------------------------------------------------------------------------------------
		
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


//-----------------------------------------------------------------------------------------------		
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
}