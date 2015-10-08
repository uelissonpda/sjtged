package co.fcode.ged18.estrutura;

/***************
*@author UANJOS*
***************/

import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;

public class Admapo {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
		private Organizacao com;  // COMUNICADOS
		private Organizacao doc;  // DOCUMENTOS
		private Organizacao extr; // EXTRATOS
		private Organizacao nfr; // NOTAS COM RETENÇÃO

//-----------------------FIM DA DECLARAÇÃO----------------------------//

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
		
		private TipoDocumento DocMens; // MENSAL
		private TipoDocumento DocTrim; // TRIMESTRAL
		private TipoDocumento DocOutr; // OUTROS
		private TipoDocumento DocFisc; // FISCAIS
		private TipoDocumento DocAlug; // ALUGUEL
		private TipoDocumento DocCont; // CONTABILIDADE
		private TipoDocumento DocDp;   // DEPARTAMENTO PESSOAL
		private TipoDocumento DocBanc; // BANCÁRIOS
		private TipoDocumento DocInvt; // INVESTIMENTOS
		private TipoDocumento DocCcre; // CARTÃO DE CRÉDITO
		private TipoDocumento DocNfrj; // NOTA FISCAL RJ
		private TipoDocumento DocNfsp; // NOTA FISCAL SÃO PAULO
		private TipoDocumento DocNfoe; // NOTA FISCAL OUTROS ESTADOS
		
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
		
		private ArrayList<TipoDocumento> TiposCom; // TIPOS COMUNICADOS
		private ArrayList<TipoDocumento> TiposDoc; // TIPOS DOCUMENTOS
		private ArrayList<TipoDocumento> TiposExtr;// TIPOS EXTRATOS
		private ArrayList<TipoDocumento> TiposNfr; // TIPOS NOTAS COM RETENÇÃO
		
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
		public Admapo(){
			
		}
//----------------------------------------------------------------------------------------------
		public ArrayList<TipoDocumento> getTiposNfr() {
			return TiposNfr;
		}

		public void setTiposNfr(ArrayList<TipoDocumento> tiposNfr) {
			TiposNfr = tiposNfr;
		}

		public ArrayList<TipoDocumento> getTiposExtr() {
			return TiposExtr;
		}

		public void setTiposExtr(ArrayList<TipoDocumento> tiposExtr) {
			TiposExtr = tiposExtr;
		}

		public ArrayList<TipoDocumento> getTiposDoc() {
			return TiposDoc;
		}

		public void setTiposDoc(ArrayList<TipoDocumento> tiposDoc) {
			TiposDoc = tiposDoc;
		}

		public ArrayList<TipoDocumento> getTiposCom() {
			return TiposCom;
		}

		public void setTiposCom(ArrayList<TipoDocumento> tiposCom) {
			TiposCom = tiposCom;
		}
//-------------------------------------------------------------------------------------------------
		public TipoDocumento getDocNfoe() {
			return DocNfoe;
		}

		public void setDocNfoe(TipoDocumento docNfoe) {
			DocNfoe = docNfoe;
		}

		public TipoDocumento getDocNfsp() {
			return DocNfsp;
		}

		public void setDocNfsp(TipoDocumento docNfsp) {
			DocNfsp = docNfsp;
		}

		public TipoDocumento getDocNfrj() {
			return DocNfrj;
		}

		public void setDocNfrj(TipoDocumento docNfrj) {
			DocNfrj = docNfrj;
		}

		public TipoDocumento getDocCcre() {
			return DocCcre;
		}

		public void setDocCcre(TipoDocumento docCcre) {
			DocCcre = docCcre;
		}

		public TipoDocumento getDocInvt() {
			return DocInvt;
		}

		public void setDocInvt(TipoDocumento docInvt) {
			DocInvt = docInvt;
		}

		public TipoDocumento getDocBanc() {
			return DocBanc;
		}

		public void setDocBanc(TipoDocumento docBanc) {
			DocBanc = docBanc;
		}

		public TipoDocumento getDocDp() {
			return DocDp;
		}

		public void setDocDp(TipoDocumento docDp) {
			DocDp = docDp;
		}

		public TipoDocumento getDocCont() {
			return DocCont;
		}

		public void setDocCont(TipoDocumento docCont) {
			DocCont = docCont;
		}

		public TipoDocumento getDocAlug() {
			return DocAlug;
		}

		public void setDocAlug(TipoDocumento docAlug) {
			DocAlug = docAlug;
		}

		public TipoDocumento getDocOutr() {
			return DocOutr;
		}

		public void setDocOutr(TipoDocumento docOutr) {
			DocOutr = docOutr;
		}

		public TipoDocumento getDocFisc() {
			return DocFisc;
		}

		public void setDocFisc(TipoDocumento docFisc) {
			DocFisc = docFisc;
		}

		public TipoDocumento getDocTrim() {
			return DocTrim;
		}

		public void setDocTrim(TipoDocumento docTrim) {
			DocTrim = docTrim;
		}

		public TipoDocumento getDocMens() {
			return DocMens;
		}

		public void setDocMens(TipoDocumento docMens) {
			DocMens = docMens;
		}
//---------------------------------------------------------------------------------------------------
		public Organizacao getCom() {
			return com;
		}

		public void setCom(Organizacao com) {
			this.com = com;
		}

		public Organizacao getDoc() {
			return doc;
		}

		public void setDoc(Organizacao doc) {
			this.doc = doc;
		}

		public Organizacao getExtr() {
			return extr;
		}

		public void setExtr(Organizacao extr) {
			this.extr = extr;
		}

		public Organizacao getNfr() {
			return nfr;
		}

		public void setNfr(Organizacao nfr) {
			this.nfr = nfr;
		}	
}
