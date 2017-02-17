package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;
import java.util.Collections;

import co.fcode.ged18.*;

public class Comunicacao {
//-------------------VARI�VEIS TIPOS DE ORGANIZA��O-------------------//
	
	private Organizacao cext; // COMUNICADOS EXTERNOS
	private Organizacao emen; // E-MAILS ENVIADOS
	private Organizacao emre; // E-MAIL RECEBIDOS
	private Organizacao inti; // INTIMA��ES/NOTIFICA��ES
	private Organizacao mmot; // MEMORANDOS/ORIENTA��ES T�CNICAS
	private Organizacao mr;   // MEM�RIA DE REUNI�O
	private Organizacao proten; // PROTOCOLOS ENTREGUES
	private Organizacao Emnc; // E-MAILS N�O CONFORMES
			
//-----------------------FIM DA DECLARA��O----------------------------//

//-------------------VARI�VEIS TIPOS DE DOCUMENTOS-------------------//
			
	private TipoDocumento DocAdm; // ADMAPO
	private TipoDocumento DocCont;// CONTABIL
	private TipoDocumento DocDp;  // DEPARTAMENTO PESSOAL
	private TipoDocumento DocDir; // DIRE��O
	private TipoDocumento DocFisc;// FISCAL
	private TipoDocumento DocSoc; // SOCIET�RIO
	private TipoDocumento DocTes; // TESOURARIA
	private TipoDocumento DocFin; // FINANCEIRO
			
			
//-----------------------FIM DA DECLARA��O----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
	private ArrayList<TipoDocumento> TiposCext; // COMUNICADOS EXTERNOS
	private ArrayList<TipoDocumento> TiposEmen; // E-MAILS ENVIADOS
	private ArrayList<TipoDocumento> TiposEmre; // E-MAIL RECEBIDOS
	private ArrayList<TipoDocumento> TiposInti; // TIPOS INTIMA��ES/NOTIFICA��ES
	private ArrayList<TipoDocumento> TiposMmot; // TIPOS MEMORANDOS/ORIENTA��ES T�CNICAS
	private ArrayList<TipoDocumento> TiposMr;   // TIPOS MEM�RIA DE REUNI�O				
	private ArrayList<TipoDocumento> TiposProten; // TIPOS PROTOCOLOS DE ENTREGA
	private ArrayList<TipoDocumento> TiposEmnc; // TIPOS E-MAILS N�O CONFORMES
			
//-----------------------FIM DA DECLARA��O----------------------------//
			
	private ArrayList<Organizacao> organizacoes;
	private Unidade comunicacao;
			
	public Comunicacao(){
			setDocAdm(new TipoDocumento(1, "Admapo", "ADM"));
			setDocCont(new TipoDocumento(2, "Cont�bil", "CONT"));
			setDocDp(new TipoDocumento(3, "Departamento Pessoal", "DP"));
			setDocDir(new TipoDocumento(4, "Dire��o", "DIR"));
			setDocFisc(new TipoDocumento(5, "Fiscal", "FISC"));
			setDocSoc(new TipoDocumento(6, "Societ�rio", "SOC"));
			setDocTes(new TipoDocumento(7, "Tesouraria", "TES"));
			setDocFin(new TipoDocumento(8, "Financeiro", "FIN"));
			
			setTiposCext(new ArrayList<TipoDocumento>());
			setTiposEmen(new ArrayList<TipoDocumento>());
			setTiposEmre(new ArrayList<TipoDocumento>());
			setTiposInti(new ArrayList<TipoDocumento>());
			setTiposMmot(new ArrayList<TipoDocumento>());
			setTiposMr(new ArrayList<TipoDocumento>());
			setTiposProten(new ArrayList<TipoDocumento>());
			setTiposEmnc(new ArrayList<TipoDocumento>());
			
			TiposCext.add(getDocAdm());
			TiposCext.add(getDocCont());
			TiposCext.add(getDocDp());
			TiposCext.add(getDocDir());
			TiposCext.add(getDocFisc());
			TiposCext.add(getDocSoc());
			
			TiposEmen.add(getDocAdm());
			TiposEmen.add(getDocCont());
			TiposEmen.add(getDocDp());
			TiposEmen.add(getDocDir());
			TiposEmen.add(getDocFisc());
			TiposEmen.add(getDocSoc());
			TiposEmen.add(getDocFin());
			
			TiposEmre.add(getDocAdm());
			TiposEmre.add(getDocCont());
			TiposEmre.add(getDocDp());
			TiposEmre.add(getDocDir());
			TiposEmre.add(getDocFisc());
			TiposEmre.add(getDocSoc());
			TiposEmre.add(getDocFin());
			
			TiposInti.add(getDocAdm());
			TiposInti.add(getDocCont());
			TiposInti.add(getDocDp());
			TiposInti.add(getDocDir());
			TiposInti.add(getDocFisc());
			TiposInti.add(getDocSoc());
				
			TiposMmot.add(getDocAdm());
			TiposMmot.add(getDocCont());
			TiposMmot.add(getDocDp());
			TiposMmot.add(getDocDir());
			TiposMmot.add(getDocSoc());
			TiposMmot.add(getDocFisc());
			
			TiposMr.add(getDocAdm());
			TiposMr.add(getDocCont());
			TiposMr.add(getDocDp());
			TiposMr.add(getDocDir());
			TiposMr.add(getDocFisc());
			TiposMr.add(getDocSoc());
			TiposMr.add(getDocFin());
			
			TiposProten.add(getDocAdm());
			TiposProten.add(getDocCont());
			TiposProten.add(getDocDp());
			TiposProten.add(getDocDir());
			TiposProten.add(getDocFisc());
			TiposProten.add(getDocSoc());
			TiposProten.add(getDocTes());
			
			TiposEmnc.add(getDocFin());
			
			setCext(new Organizacao(1, "Comunicados Externos","CEXT",TiposCext));
			setEmen(new Organizacao(2,"Emails Enviados","EMEN",TiposEmen));
			setEmre(new Organizacao(3,"Emails Recebidos","EMRE",TiposEmre));
			setInti(new Organizacao(4,"Intima��es-Notifica��es","INTI",TiposInti));
			setMmot(new Organizacao(5,"Memorandos-Orienta��es T�cnicas","MMOT",TiposMmot));
			setMr(new Organizacao(6,"Mem�ria de Reuni�o","MR",TiposMr));
			setProten(new Organizacao(7, "Protocolo de Entrega","PROTEN",TiposProten));
			setEmnc(new Organizacao(8, "E-mail N�o Conforme","EMNC", TiposEmnc));
							
			setOrganizacoes(new ArrayList<Organizacao>());
			getOrganizacoes().add(getCext());
			getOrganizacoes().add(getEmen());
			getOrganizacoes().add(getEmre());
			getOrganizacoes().add(getInti());
			getOrganizacoes().add(getMmot());
			getOrganizacoes().add(getMr());
			getOrganizacoes().add(getProten());
			getOrganizacoes().add(getEmnc());
			
			setComunicacao(new Unidade(1,"Comunica��o","CM",getOrganizacoes()));
			
			
			/* Organiza��o dos Arrays em Ordem Crescente! - Fellipe Pimentel */
			Collections.sort(getTiposCext(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEmen(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEmre(), new ComparadorTipoDocumento());
			Collections.sort(getTiposInti(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMmot(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMr(), new ComparadorTipoDocumento());
			Collections.sort(getTiposProten(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEmnc(), new ComparadorTipoDocumento());
			
			Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
	}
//-------------------------------------------------------------------------------------------
		
		public ArrayList<TipoDocumento> getTiposEmnc() {
						return TiposEmnc;
		}
		public void setTiposEmnc(ArrayList<TipoDocumento> tiposEmnc) {
						TiposEmnc = tiposEmnc;
		}
		public ArrayList<TipoDocumento> getTiposProten() {
						return TiposProten;
		}
		public void setTiposProten(ArrayList<TipoDocumento> tiposProten) {
						TiposProten = tiposProten;
					}
		public ArrayList<TipoDocumento> getTiposMr() {
						return TiposMr;
					}
					public void setTiposMr(ArrayList<TipoDocumento> tiposMr) {
						TiposMr = tiposMr;
					}
		public ArrayList<TipoDocumento> getTiposMmot() {
						return TiposMmot;
					}
					public void setTiposMmot(ArrayList<TipoDocumento> tiposMmot) {
						TiposMmot = tiposMmot;
					}
		public ArrayList<TipoDocumento> getTiposInti() {
						return TiposInti;
					}
					public void setTiposInti(ArrayList<TipoDocumento> tiposInti) {
						TiposInti = tiposInti;
					}
		public ArrayList<TipoDocumento> getTiposEmre() {
						return TiposEmre;
					}
					public void setTiposEmre(ArrayList<TipoDocumento> tiposEmre) {
						TiposEmre = tiposEmre;
					}
		public ArrayList<TipoDocumento> getTiposEmen() {
						return TiposEmen;
					}
					public void setTiposEmen(ArrayList<TipoDocumento> tiposEmen) {
						TiposEmen = tiposEmen;
					}
		public ArrayList<TipoDocumento> getTiposCext() {
						return TiposCext;
					}
			public void setTiposCext(ArrayList<TipoDocumento> tiposCext) {
				TiposCext = tiposCext;
			}
//-----------------------------------------------------------------------------------------------
			
			public TipoDocumento getDocFin() {
				return DocFin;
			}

			public void setDocFin(TipoDocumento docFin) {
				DocFin = docFin;
			}

			
			public TipoDocumento getDocTes() {
				return DocTes;
			}

			public void setDocTes(TipoDocumento docTes) {
				DocTes = docTes;
			}
			public TipoDocumento getDocSoc() {
				return DocSoc;
			}

			public void setDocSoc(TipoDocumento docSoc) {
				DocSoc = docSoc;
			}

			public TipoDocumento getDocFisc() {
				return DocFisc;
			}

			public void setDocFisc(TipoDocumento docFisc) {
				DocFisc = docFisc;
			}

			/**
			 * @return the docDir
			 */
			public TipoDocumento getDocDir() {
				return DocDir;
			}

			/**
			 * @param docDir the docDir to set
			 */
			public void setDocDir(TipoDocumento docDir) {
				DocDir = docDir;
			}

			/**
			 * @return the docDp
			 */
			public TipoDocumento getDocDp() {
				return DocDp;
			}

			/**
			 * @param docDp the docDp to set
			 */
			public void setDocDp(TipoDocumento docDp) {
				DocDp = docDp;
			}

			/**
			 * @return the docCont
			 */
			public TipoDocumento getDocCont() {
				return DocCont;
			}

			/**
			 * @param docCont the docCont to set
			 */
			public void setDocCont(TipoDocumento docCont) {
				DocCont = docCont;
			}

			/**
			 * @return the docAdm
			 */
			public TipoDocumento getDocAdm() {
				return DocAdm;
			}

			/**
			 * @param docAdm the docAdm to set
			 */
			public void setDocAdm(TipoDocumento docAdm) {
				DocAdm = docAdm;
			}


			//-----------------------------------------------------------------------------------------------
			public Organizacao getEmnc() {
				return Emnc;
			}

			public void setEmnc(Organizacao emnc) {
				Emnc = emnc;
			}
			
			public Organizacao getProten() {
				return proten;
			}

			public void setProten(Organizacao proten) {
				this.proten = proten;
			}
			public Organizacao getMr() {
				return mr;
			}

			public void setMr(Organizacao mr) {
				this.mr = mr;
			}

			public Organizacao getMmot() {
				return mmot;
			}

			public void setMmot(Organizacao mmot) {
				this.mmot = mmot;
			}

			public Organizacao getInti() {
				return inti;
			}

			public void setInti(Organizacao inti) {
				this.inti = inti;
			}

			public Organizacao getEmre() {
				return emre;
			}

			public void setEmre(Organizacao emre) {
				this.emre = emre;
			}

			public Organizacao getEmen() {
				return emen;
			}

			public void setEmen(Organizacao emen) {
				this.emen = emen;
			}

			public Organizacao getCext() {
				return cext;
			}

			public void setCext(Organizacao cext) {
				this.cext = cext;
			}
			public ArrayList<Organizacao> getOrganizacoes() {
				return organizacoes;
			}
			public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
				this.organizacoes = organizacoes;
			}
			public Unidade getComunicacao() {
				return comunicacao;
			}
			public void setComunicacao(Unidade comunicacao) {
				this.comunicacao = comunicacao;
			}
}
