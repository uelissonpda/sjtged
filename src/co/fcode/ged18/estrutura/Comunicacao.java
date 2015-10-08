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
