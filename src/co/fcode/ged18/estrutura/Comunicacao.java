package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;

public class Comunicacao {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
			private Organizacao cext; // COMUNICADOS EXTERNOS
			private Organizacao emen; // E-MAILS ENVIADOS
			private Organizacao emre; // E-MAIL RECEBIDOS
			private Organizacao inti; // INTIMAÇÕES/NOTIFICAÇÕES
			private Organizacao mmot; // MEMORANDOS/ORIENTAÇÕES TÉCNICAS
			private Organizacao mr;   // MEMÓRIA DE REUNIÃO

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
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
			public Comunicacao(){
				setDocAdm(new TipoDocumento(1, "Admapo", "ADM"));
				setDocCont(new TipoDocumento(2, "Contabil", "CONT"));
				setDocDp(new TipoDocumento(3, "Departamento Pessoal", "DP"));
				setDocDir(new TipoDocumento(4, "Direcao", "DIR"));
				setDocFisc(new TipoDocumento(5, "Fiscal", "FISC"));
				setDocSoc(new TipoDocumento(6, "Societario", "SOC"));
				
				setTiposCext(new ArrayList<TipoDocumento>());
				setTiposEmen(new ArrayList<TipoDocumento>());
				setTiposEmre(new ArrayList<TipoDocumento>());
				setTiposInti(new ArrayList<TipoDocumento>());
				setTiposMmot(new ArrayList<TipoDocumento>());
				setTiposMr(new ArrayList<TipoDocumento>());
				
				TiposCext.add(DocAdm);
				TiposCext.add(DocCont);
				TiposCext.add(DocDp);
				TiposCext.add(DocDir);
				TiposCext.add(DocFisc);
				TiposCext.add(DocSoc);
				
				TiposEmen.add(DocAdm);
				TiposEmen.add(DocCont);
				TiposEmen.add(DocDp);
				TiposEmen.add(DocDir);
				TiposEmen.add(DocFisc);
				TiposEmen.add(DocSoc);
				
				TiposEmre.add(DocAdm);
				TiposEmre.add(DocCont);
				TiposEmre.add(DocDp);
				TiposEmre.add(DocDir);
				TiposEmre.add(DocFisc);
				TiposEmre.add(DocSoc);
				
				TiposInti.add(DocAdm);
				TiposInti.add(DocCont);
				TiposInti.add(DocDp);
				TiposInti.add(DocDir);
				TiposInti.add(DocFisc);
				TiposInti.add(DocSoc);
				
				TiposMmot.add(DocAdm);
				TiposMmot.add(DocCont);
				TiposMmot.add(DocDp);
				TiposMmot.add(DocDir);
				TiposMmot.add(DocFisc);
				
				TiposMr.add(DocAdm);
				TiposMr.add(DocCont);
				TiposMr.add(DocDp);
				TiposMr.add(DocDir);
				TiposMr.add(DocFisc);
				TiposMr.add(DocSoc);
				
				setCext(new Organizacao(1, "Comunicados Externos","CEXT",TiposCext));
				setEmen(new Organizacao(2,"Emails Enviados","EMEN",TiposEmen));
				setEmre(new Organizacao(3,"Emails Recebidos","EMRE",TiposEmre));
				setInti(new Organizacao(4,"Intimicoes/Notificacoes","INTI",TiposInti));
				setMmot(new Organizacao(5,"Memorandos/Orientacoes Tecnincas","MMOT",TiposMmot));
				setMr(new Organizacao(6,"Memoria de Reuniao","MR",TiposMr));
			}
//-------------------------------------------------------------------------------------------
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
}
