package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;
import java.util.Collections;

import co.fcode.ged18.ComparadorOrganizacao;
import co.fcode.ged18.ComparadorTipoDocumento;
import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;
import co.fcode.ged18.Unidade;

public class Comunicacao {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
	private Organizacao cext; // COMUNICADOS EXTERNOS
	private Organizacao emen; // E-MAILS ENVIADOS
	private Organizacao emre; // E-MAIL RECEBIDOS
	private Organizacao inti; // INTIMAÇÕES/NOTIFICAÇÕES
	private Organizacao mmot; // MEMORANDOS/ORIENTAÇÕES TÉCNICAS
	private Organizacao mr;   // MEMÓRIA DE REUNIÃO
	private Organizacao proten; // PROTOCOLOS ENTREGUES
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
			
	private TipoDocumento DocAdm; // ADMAPO
	private TipoDocumento DocCont;// CONTABIL
	private TipoDocumento DocDp;  // DEPARTAMENTO PESSOAL
	private TipoDocumento DocDir; // DIREÇÃO
	private TipoDocumento DocFisc;// FISCAL
	private TipoDocumento DocSoc; // SOCIETÁRIO
			
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
	private ArrayList<TipoDocumento> TiposCext; // COMUNICADOS EXTERNOS
	private ArrayList<TipoDocumento> TiposEmen; // E-MAILS ENVIADOS
	private ArrayList<TipoDocumento> TiposEmre; // E-MAIL RECEBIDOS
	private ArrayList<TipoDocumento> TiposInti; // TIPOS INTIMAÇÕES/NOTIFICAÇÕES
	private ArrayList<TipoDocumento> TiposMmot; // TIPOS MEMORANDOS/ORIENTAÇÕES TÉCNICAS
	private ArrayList<TipoDocumento> TiposMr;   // TIPOS MEMÓRIA DE REUNIÃO				
	private ArrayList<TipoDocumento> TiposProten; // TIPOS PROTOCOLOS DE ENTREGA
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
	private ArrayList<Organizacao> organizacoes;
	private Unidade comunicacao;
			
	public Comunicacao(){
			setDocAdm(new TipoDocumento(1, "Admapo", "ADM"));
			setDocCont(new TipoDocumento(2, "Contábil", "CONT"));
			setDocDp(new TipoDocumento(3, "Departamento Pessoal", "DP"));
			setDocDir(new TipoDocumento(4, "Direção", "DIR"));
			setDocFisc(new TipoDocumento(5, "Fiscal", "FISC"));
			setDocSoc(new TipoDocumento(6, "Societário", "SOC"));
						
			setTiposCext(new ArrayList<TipoDocumento>());
			setTiposEmen(new ArrayList<TipoDocumento>());
			setTiposEmre(new ArrayList<TipoDocumento>());
			setTiposInti(new ArrayList<TipoDocumento>());
			setTiposMmot(new ArrayList<TipoDocumento>());
			setTiposMr(new ArrayList<TipoDocumento>());
			setTiposProten(new ArrayList<TipoDocumento>());
			
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
			
			TiposEmre.add(getDocAdm());
			TiposEmre.add(getDocCont());
			TiposEmre.add(getDocDp());
			TiposEmre.add(getDocDir());
			TiposEmre.add(getDocFisc());
			TiposEmre.add(getDocSoc());
			
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
			TiposMmot.add(getDocFisc());
			
			TiposMr.add(getDocAdm());
			TiposMr.add(getDocCont());
			TiposMr.add(getDocDp());
			TiposMr.add(getDocDir());
			TiposMr.add(getDocFisc());
			TiposMr.add(getDocSoc());
			
			TiposProten.add(getDocAdm());
			TiposProten.add(getDocCont());
			TiposProten.add(getDocDp());
			TiposProten.add(getDocDir());
			TiposProten.add(getDocFisc());
			
			setCext(new Organizacao(1, "Comunicados Externos","CEXT",TiposCext));
			setEmen(new Organizacao(2,"Emails Enviados","EMEN",TiposEmen));
			setEmre(new Organizacao(3,"Emails Recebidos","EMRE",TiposEmre));
			setInti(new Organizacao(4,"Intimações-Notificações","INTI",TiposInti));
			setMmot(new Organizacao(5,"Memorandos-Orientações Técnicas","MMOT",TiposMmot));
			setMr(new Organizacao(6,"Memória de Reunião","MR",TiposMr));
			setProten(new Organizacao(7, "Protocolo de Entrega","PROTEN",TiposProten));
							
			setOrganizacoes(new ArrayList<Organizacao>());
			getOrganizacoes().add(getCext());
			getOrganizacoes().add(getEmen());
			getOrganizacoes().add(getEmre());
			getOrganizacoes().add(getInti());
			getOrganizacoes().add(getMmot());
			getOrganizacoes().add(getMr());
			getOrganizacoes().add(getProten());
			
			setComunicacao(new Unidade(1,"Comunicação","CM",getOrganizacoes()));
			
			
			/* Organização dos Arrays em Ordem Crescente! - Fellipe Pimentel */
			Collections.sort(getTiposCext(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEmen(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEmre(), new ComparadorTipoDocumento());
			Collections.sort(getTiposInti(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMmot(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMr(), new ComparadorTipoDocumento());
			Collections.sort(getTiposProten(), new ComparadorTipoDocumento());
			
			Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
	}
//-------------------------------------------------------------------------------------------
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
