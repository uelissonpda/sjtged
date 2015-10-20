package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;

public class Contabil {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
			private Organizacao blnç; // BALANÇOS
			private Organizacao dre;  // DEMONSTRAÇÃO DO RESULTADO DO EXERCÍCIO
			private Organizacao blct; // TIPOS BALANCETES
			private Organizacao dcon; // TIPOS DEMONSTRATIVOS CONTÁBEIS
			private Organizacao ecd;  // ESCRITURAÇÃO CONTÁBIL DIGITAL

//-----------------------FIM DA DECLARAÇÃO----------------------------//

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
			
			private TipoDocumento DocBp;     // BALANÇO PATRIMONIAL
			private TipoDocumento DocTbp;    // TERMO BALANÇO PATRIMONIAL
			private TipoDocumento DocDre; // DEMONSTRAÇÃO DO RESULTADO DO EXERCÍCIO
			private TipoDocumento DocTdre;   // TERMO DEMONSTRAÇÃO DO RESULTADO DO EXERCÍCIO
			private TipoDocumento DocBm;     // BALANCETE MENSAL
			private TipoDocumento DocBt;     // BALANCETES TRIMESTRAIS
			private TipoDocumento DocBa;     // BALANCETES ANUAL
			private TipoDocumento DocDlpa;   // DEMONSTRAÇÃO DE LUCROS OU PREJUÍZOS ACUMULADOS
			private TipoDocumento DocDmpl;   // DEMONSTRAÇÃO DA MUTAÇÃO DO PATRIMÔNIO LÍQUIDO
			private TipoDocumento DocDfc;    // DEMONSTRAÇÃO DOS FLUXOS DE CAIXA
			private TipoDocumento DocNe;     // NOTAS EXPLICATIVAS
			private TipoDocumento DocIndliq; // ÍNDICES DE LIQUIDEZ
			private TipoDocumento DocRcentr; // RECIBO DE ENTREGA
			private TipoDocumento DocReqnto; // REQUERIMENTO
			private TipoDocumento DocTermos; // TERMOS DE ABERTURA E ENCERRAMENTO
			private TipoDocumento DocCopseg; // COPIA SEG ARQ TRASMITIDO
			private TipoDocumento DocTxpaga; // TAXA PAGA
			private TipoDocumento DocAutent; // TERMO AUTENTICAÇÃO
			private TipoDocumento DocDiario; // DIARIO
			
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
			private ArrayList<TipoDocumento> TiposBlnç; // TIPOS BALANÇOS
			private ArrayList<TipoDocumento> TiposDre;  // TIPOS DEMONSTRAÇÃO DO RESULTADO DO EXERCÍCIO
			private ArrayList<TipoDocumento> TiposBlct; // TIPOS BALANCETES
			private ArrayList<TipoDocumento> TiposDcon; // TIPOS DEMONSTRATIVOS CONTÁBEIS
			private ArrayList<TipoDocumento> TiposEcd;  // TIPOS ESCRITURAÇÃO CONTÁBIL DIGITAL
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
			public Contabil(){
				setDocTbp(new TipoDocumento(1, "Termo Balanço Patrimonial","TBP"));
				setDocDre(new TipoDocumento(2, "Demonstração do Resultado do Exercício", "DRE"));
				setDocTdre(new TipoDocumento(3, "Termo Demonstração do Resultado do Exercício", "TDRE"));
				setDocBm(new TipoDocumento(4, "Balancete Mensal", "BM"));
				setDocBt(new TipoDocumento(5, "Balancetes Trimestrais", "Balancetes Anual"));
				setDocDlpa(new TipoDocumento(6, "Demonstração de Lucros ou Prejuízos Acumulados", "Dlpa"));
				setDocDmpl(new TipoDocumento(7, "Demonstração da Mutação do Pratimônio Líquido", "Dmpl"));
				setDocDfc(new TipoDocumento(8, "Demonstração dos Fluxos de Caixa", "Dfc"));
				setDocNe(new TipoDocumento(9, "Notas Explicativas", "NE"));
				setDocIndliq(new TipoDocumento(10, "Índices de Liquidez", "INDLIQ"));
				setDocRcentr(new TipoDocumento(11, "Recibo de Entrega", "RCENTR"));
				setDocReqnto(new TipoDocumento(12, "Requerimento", "Reqnto"));
				setDocTermos(new TipoDocumento(13, "Termos de Abertura e Encerramento", "TERMOS"));
				setDocCopseg(new TipoDocumento(14, "Cópia SEG Arquivo Transmitido", "COPSEG"));
				setDocTxpaga(new TipoDocumento(15, "Taxa Paga", "TXPAGA"));
				setDocAutent(new TipoDocumento(16, "Termo Autenticação", "AUTENT"));
				setDocDiario(new TipoDocumento(17, "Diário", "DIARIO"));
				
				setTiposBlnc(new ArrayList<TipoDocumento>());
				setTiposDre(new ArrayList<TipoDocumento>());
				setTiposBlct(new ArrayList<TipoDocumento>());
				setTiposDcon(new ArrayList<TipoDocumento>());
				setTiposEcd(new ArrayList<TipoDocumento>());
				
				TiposBlnc.add(DocBp);
				TiposBlnc.add(DocTbp);
				TiposDre.add(DocDre);
				TiposDre.add(DocTdre);
				TiposBlct.add(DocBm);
				TiposBlct.add(DocBt);
				TiposBlct.add(DocBa);
				TiposDcon.add(DocDlpa);
				TiposDcon.add(DocDmpl);
				TiposDcon.add(DocDfc);
				TiposDcon.add(DocNe);
				TiposDcon.add(DocIndliq);
				TiposEcd.add(DocRcentr);
				TiposEcd.add(DocReqnto);
				TiposEcd.add(DocTermos);
				TiposEcd.add(DocCopseg);
				TiposEcd.add(DocTxpaga);
				TiposEcd.add(DocAutent);
				TiposEcd.add(DocDiario);
				TiposEcd.add(DocDlpa);
				TiposEcd.add(DocDmpl);
				TiposEcd.add(DocNe);
				TiposEcd.add(DocNe);
				TiposEcd.add(DocBp);
				TiposEcd.add(DocDre);
				
				setBlnc(new Organizacao(1,"Balanços","BLNC",TiposBlnc));
				setDre(new Organizacao(2,"Demonstração Resultado de Exercício","DRE",TiposDre));
				setBlct(new Organizacao(3, "Balancetes", "BLCT", TiposBlct));
				setDcon(new Organizacao(4,"Demonstrativos Contábeis", "DCON", TiposDcon));
				setEcd(new Organizacao(5,"Escrituração Contábil Fiscal","ECD",TiposEcd));
			}
//------------------------------------------------------------------------------------------------
			/**
			 * @return the tiposEcd
			 */
			public ArrayList<TipoDocumento> getTiposEcd() {
				return TiposEcd;
			}
			/**
			 * @param tiposEcd the tiposEcd to set
			 */
			public void setTiposEcd(ArrayList<TipoDocumento> tiposEcd) {
				TiposEcd = tiposEcd;
			}
/**
			 * @return the tiposDcon
			 */
			public ArrayList<TipoDocumento> getTiposDcon() {
				return TiposDcon;
			}
			/**
			 * @param tiposDcon the tiposDcon to set
			 */
			public void setTiposDcon(ArrayList<TipoDocumento> tiposDcon) {
				TiposDcon = tiposDcon;
			}
/**
			 * @return the tiposBlct
			 */
			public ArrayList<TipoDocumento> getTiposBlct() {
				return TiposBlct;
			}
			/**
			 * @param tiposBlct the tiposBlct to set
			 */
			public void setTiposBlct(ArrayList<TipoDocumento> tiposBlct) {
				TiposBlct = tiposBlct;
			}
/**
			 * @return the tiposDre
			 */
			public ArrayList<TipoDocumento> getTiposDre() {
				return TiposDre;
			}
			/**
			 * @param tiposDre the tiposDre to set
			 */
			public void setTiposDre(ArrayList<TipoDocumento> tiposDre) {
				TiposDre = tiposDre;
			}
/**
			 * @return the tiposBlnç
			 */
			public ArrayList<TipoDocumento> getTiposBlnç() {
				return TiposBlnç;
			}
			/**
			 * @param tiposBlnç the tiposBlnç to set
			 */
			public void setTiposBlnç(ArrayList<TipoDocumento> tiposBlnç) {
				TiposBlnç = tiposBlnç;
			}
//-------------------------------------------------------------------------------------------------
			public TipoDocumento getDocDiario() {
				return DocDiario;
			}
			public void setDocDiario(TipoDocumento docDiario) {
				DocDiario = docDiario;
			}
			public TipoDocumento getDocAutent() {
				return DocAutent;
			}
			public void setDocAutent(TipoDocumento docAutent) {
				DocAutent = docAutent;
			}
			public TipoDocumento getDocTxpaga() {
				return DocTxpaga;
			}
			public void setDocTxpaga(TipoDocumento docTxpaga) {
				DocTxpaga = docTxpaga;
			}
			public TipoDocumento getDocCopseg() {
				return DocCopseg;
			}
			public void setDocCopseg(TipoDocumento docCopseg) {
				DocCopseg = docCopseg;
			}
			public TipoDocumento getDocTermos() {
				return DocTermos;
			}
			public void setDocTermos(TipoDocumento docTermos) {
				DocTermos = docTermos;
			}
			public TipoDocumento getDocReqnto() {
				return DocReqnto;
			}
			public void setDocReqnto(TipoDocumento docReqnto) {
				DocReqnto = docReqnto;
			}
			public TipoDocumento getDocRcentr() {
				return DocRcentr;
			}
			public void setDocRcentr(TipoDocumento docRcentr) {
				DocRcentr = docRcentr;
			}
			public TipoDocumento getDocIndliq() {
				return DocIndliq;
			}
			public void setDocIndliq(TipoDocumento docIndliq) {
				DocIndliq = docIndliq;
			}
			public TipoDocumento getDocNe() {
				return DocNe;
			}
			public void setDocNe(TipoDocumento docNe) {
				DocNe = docNe;
			}
			public TipoDocumento getDocDfc() {
				return DocDfc;
			}
			public void setDocDfc(TipoDocumento docDfc) {
				DocDfc = docDfc;
			}
			public TipoDocumento getDocDmpl() {
				return DocDmpl;
			}
			public void setDocDmpl(TipoDocumento docDmpl) {
				DocDmpl = docDmpl;
			}
			public TipoDocumento getDocDlpa() {
				return DocDlpa;
			}
			public void setDocDlpa(TipoDocumento docDlpa) {
				DocDlpa = docDlpa;
			}
			public TipoDocumento getDocBa() {
				return DocBa;
			}
			public void setDocBa(TipoDocumento docBa) {
				DocBa = docBa;
			}
			public TipoDocumento getDocBt() {
				return DocBt;
			}
			public void setDocBt(TipoDocumento docBt) {
				DocBt = docBt;
			}
			public TipoDocumento getDocBm() {
				return DocBm;
			}
			public void setDocBm(TipoDocumento docBm) {
				DocBm = docBm;
			}
			public TipoDocumento getDocTdre() {
				return DocTdre;
			}
			public void setDocTdre(TipoDocumento docTdre) {
				DocTdre = docTdre;
			}
			public TipoDocumento getDocDre() {
				return DocDre;
			}
			public void setDocDre(TipoDocumento docDre) {
				DocDre = docDre;
			}
			public TipoDocumento getDocTbp() {
				return DocTbp;
			}
			public void setDocTbp(TipoDocumento docTbp) {
				DocTbp = docTbp;
			}
			public TipoDocumento getDocBp() {
				return DocBp;
			}
			public void setDocBp(TipoDocumento docBp) {
				DocBp = docBp;
			}
//-------------------------------------------------------------------------------------------------
			public Organizacao getEcd() {
				return ecd;
			}

			public void setEcd(Organizacao ecd) {
				this.ecd = ecd;
			}

			public Organizacao getDcon() {
				return dcon;
			}

			public void setDcon(Organizacao dcon) {
				this.dcon = dcon;
			}

			public Organizacao getBlct() {
				return blct;
			}

			public void setBlct(Organizacao blct) {
				this.blct = blct;
			}

			public Organizacao getDre() {
				return dre;
			}

			public void setDre(Organizacao dre) {
				this.dre = dre;
			}

			public Organizacao getBlnç() {
				return blnç;
			}

			public void setBlnç(Organizacao blnç) {
				this.blnç = blnç;
			}	
	}
