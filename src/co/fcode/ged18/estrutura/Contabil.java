package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;
import java.util.Collections;

import co.fcode.ged18.*;

public class Contabil {
//-------------------VARI�VEIS TIPOS DE ORGANIZA��O-------------------//
	
			private Organizacao blnc; // BALAN�OS
			private Organizacao dre;  // DEMONSTRA��O DO RESULTADO DO EXERC�CIO
			private Organizacao blct; // TIPOS BALANCETES
			private Organizacao dcon; // TIPOS DEMONSTRATIVOS CONT�BEIS
			private Organizacao ecd;  // ESCRITURA��O CONT�BIL DIGITAL
			private Organizacao dctf;  // APOIO CONT�BIL
			private Organizacao dmed;  // APOIO CONT�BIL
			private Organizacao dmob;  // APOIO CONT�BIL
			private Organizacao dirf;  // APOIO CONT�BIL
			private Organizacao dasn;  // APOIO CONT�BIL
			private Organizacao dfis;  // APOIO CONT�BIL
			private Organizacao ibge;  // APOIO CONT�BIL
			private Organizacao ecfs;  // APOIO CONT�BIL
			private Organizacao efdr;  // APOIO CONT�BIL
			private Organizacao dipj;  // APOIO CONT�BIL
			private Organizacao intv;  // APOIO CONT�BIL
			private Organizacao lvdi;  // APOIO CONT�BIL
			private Organizacao lvrz;  // APOIO CONT�BIL
			private Organizacao lvcx;  // APOIO CONT�BIL
			

//-----------------------FIM DA DECLARA��O----------------------------//

//-------------------VARI�VEIS TIPOS DE DOCUMENTOS-------------------//
			
			private TipoDocumento DocBp;     // BALAN�O PATRIMONIAL
			private TipoDocumento DocTbp;    // TERMO BALAN�O PATRIMONIAL
			private TipoDocumento DocDre; 	 // DEMONSTRA��O DO RESULTADO DO EXERC�CIO
			private TipoDocumento DocTdre;   // TERMO DEMONSTRA��O DO RESULTADO DO EXERC�CIO
			private TipoDocumento DocBm;     // BALANCETE MENSAL
			private TipoDocumento DocBt;     // BALANCETES TRIMESTRAIS
			private TipoDocumento DocBa;     // BALANCETES ANUAL
			private TipoDocumento DocDlpa;   // DEMONSTRA��O DE LUCROS OU PREJU�ZOS ACUMULADOS
			private TipoDocumento DocDmpl;   // DEMONSTRA��O DA MUTA��O DO PATRIM�NIO L�QUIDO
			private TipoDocumento DocDfc;    // DEMONSTRA��O DOS FLUXOS DE CAIXA
			private TipoDocumento DocNe;     // NOTAS EXPLICATIVAS
			private TipoDocumento DocIndliq; // �NDICES DE LIQUIDEZ
			private TipoDocumento DocRcentr; // RECIBO DE ENTREGA
			private TipoDocumento DocReqnto; // REQUERIMENTO
			private TipoDocumento DocTermos; // TERMOS DE ABERTURA E ENCERRAMENTO
			private TipoDocumento DocCopseg; // COPIA SEG ARQ TRASMITIDO
			private TipoDocumento DocTxpaga; // TAXA PAGA
			private TipoDocumento DocAutent; // TERMO AUTENTICA��O
			private TipoDocumento DocDiario; // DIARIO
			private TipoDocumento DocSfecac; // SITUA��O FISCAL
			private TipoDocumento DocRedctf; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdctf; // DECLARA��O
			private TipoDocumento DocRedmed; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdmed; // DECLARA��O
			private TipoDocumento DocRedmob; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdmob; // DECLARA��O
			private TipoDocumento DocRedirf; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdirf; // DECLARA��O
			private TipoDocumento DocRedasn; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdasn; // DECLARA��O
			private TipoDocumento DocRedfis; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdfis; // DECLARA��O
			private TipoDocumento DocReibge; // RECIBO DE ENTREGA
			private TipoDocumento DocDcibge; // DECLARA��O
			private TipoDocumento DocReecfs; // RECIBO DE ENTREGA
			private TipoDocumento DocDcecfs; // DECLARA��O
			private TipoDocumento DocReefdr; // RECIBO DE ENTREGA
			private TipoDocumento DocDcefdr; // DECLARA��O
			private TipoDocumento DocRedipj; // RECIBO DE ENTREGA
			private TipoDocumento DocDcdipj; // DECLARA��O
			private TipoDocumento DocDcintv; // DECLARA��O
			private TipoDocumento DocPlcnts; // PLANO DE CONTAS
			private TipoDocumento DocBlnclv; // BALAN�O
			private TipoDocumento DocTmblnc; // TERMO DO BALAN�O
			private TipoDocumento DocTemdre; // TERMO DA DRE
			private TipoDocumento DocCdrprj; // CERTID�O DE REGULARIDADE PROFISSIONAL
			private TipoDocumento DocTalvdi; // TERMO DE ABERTURA
			private TipoDocumento DocTelvdi; // TERMO DE ENCERRAMENTO
			private TipoDocumento DocLvrzge; // RAZ�O GERAL
			private TipoDocumento DocTalvrz; // TERMOS DE ABERTURA
			private TipoDocumento DocTelvrz; // TERMOS DE ENCERRAMENTO
			private TipoDocumento DocLcaixa; // CAIXA
			private TipoDocumento DocTalvcx; // TERMOS DE ABERTURA
			private TipoDocumento DocTelvcx; // TERMOS DE ENCERRAMENTO
			 
						
//-----------------------FIM DA DECLARA��O----------------------------//
			
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
			private ArrayList<TipoDocumento> TiposBlnc; // TIPOS BALAN�OS
			private ArrayList<TipoDocumento> TiposDre;  // TIPOS DEMONSTRA��O DO RESULTADO DO EXERC�CIO
			private ArrayList<TipoDocumento> TiposBlct; // TIPOS BALANCETES
			private ArrayList<TipoDocumento> TiposDcon; // TIPOS DEMONSTRATIVOS CONT�BEIS
			private ArrayList<TipoDocumento> TiposEcd;  // TIPOS ESCRITURA��O CONT�BIL DIGITAL
			private ArrayList<TipoDocumento> TiposDctf;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposDmed;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposDmob;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposDirf;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposDasn;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposDfis;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposIbge;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposEcfs;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposEfdr;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposDipj;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposIntv;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposLvdi;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposLvrz;  // APOIO CONT�BIL
			private ArrayList<TipoDocumento> TiposLvcx;  // APOIO CONT�BIL
			
			
//-----------------------FIM DA DECLARA��O----------------------------//
			
			private ArrayList<Organizacao> organizacoes;
			private Unidade contabil;
			
			public Contabil(){
				setDocBp(new TipoDocumento(1,"Balan�o Patrimonial","BP"));
				setDocTbp(new TipoDocumento(2, "Termo Balan�o Patrimonial","TBP"));
				setDocDre(new TipoDocumento(3, "Demonstra��o do Resultado do Exerc�cio", "DRE"));
				setDocTdre(new TipoDocumento(4, "Termo Demonstra��o do Resultado do Exerc�cio", "TDRE"));
				setDocBm(new TipoDocumento(5, "Balancete Mensal", "BM"));
				setDocBt(new TipoDocumento(6, "Balancetes Trimestrais", "BT"));
				setDocBa(new TipoDocumento(7,"Balancetes Anuais","BA"));
				setDocDlpa(new TipoDocumento(8, "Demonstra��o de Lucros ou Preju�zos Acumulados", "Dlpa"));
				setDocDmpl(new TipoDocumento(9, "Demonstra��o da Mutacao do Pratimonio L�quido", "Dmpl"));
				setDocDfc(new TipoDocumento(10, "Demonstra��o dos Fluxos de Caixa", "Dfc"));
				setDocDlpa(new TipoDocumento(11, "Demonstra��o de Lucros ou Preju�zos Acumulados", "Dlpa"));
				setDocDmpl(new TipoDocumento(12, "Demonstra��o da Muta��o do Pratim�nio L�quido", "Dmpl"));
				setDocDfc(new TipoDocumento(13, "Demonstra��o dos Fluxos de Caixa", "Dfc"));
				setDocNe(new TipoDocumento(14, "Notas Explicativas", "NE"));
				setDocIndliq(new TipoDocumento(15, "�ndices de Liquidez", "INDLIQ"));
				setDocRcentr(new TipoDocumento(16, "Recibo de Entrega", "RCENTR"));
				setDocReqnto(new TipoDocumento(17, "Requerimento", "Reqnto"));
				setDocTermos(new TipoDocumento(18, "Termos de Abertura e Encerramento", "TERMOS"));
				setDocCopseg(new TipoDocumento(19, "C�pia SEG Arquivo Transmitido", "COPSEG"));
				setDocTxpaga(new TipoDocumento(20, "Taxa Paga", "TXPAGA"));
				setDocAutent(new TipoDocumento(21, "Termo Autentica��o", "AUTENT"));
				setDocDiario(new TipoDocumento(22, "Di�rio", "DIARIO"));
				
				setDocDcefdr(new TipoDocumento(23,"Declara��o","DCEFDR"));
				setDocRedipj(new TipoDocumento(24,"Recibo de Entrega","REDIPJ"));
				setDocDcdipj(new TipoDocumento(25,"Declara��o","DCDIPJ"));
				setDocDcintv(new TipoDocumento(26,"Declara��o","DCINTV"));
				setDocPlcnts(new TipoDocumento(27,"Plano de Contas","PLCNTS"));
				setDocBlnclv(new TipoDocumento(28,"Balan�o","BLNCLV"));
				setDocTmblnc(new TipoDocumento(29,"Termo do Balan�o","TMBLNC"));
				setDocTemdre(new TipoDocumento(30,"Termo da DRE","TEMDRE"));
				setDocCdrprj(new TipoDocumento(31,"Certid�o de Regularidade Profissional","CDRPRJ"));
				setDocTalvdi(new TipoDocumento(32,"Termo de Abertura","TALVDI"));
				setDocTelvdi(new TipoDocumento(33,"Termo de Encerramento","TELVDI"));
				setDocLvrzge(new TipoDocumento(34,"Raz�o Geral","LVRZGE"));
				setDocTalvrz(new TipoDocumento(35,"Termos de Abertura","TALVRZ"));
				setDocTelvrz(new TipoDocumento(36,"Termos de Encerramento","TELVRZ"));				
				setDocLcaixa(new TipoDocumento(37,"Caixa","LCAIXA"));
				setDocTalvcx(new TipoDocumento(38,"Termos de Abertura","TALVCX"));
				setDocTelvcx(new TipoDocumento(39,"Termos de Encerramento","TELVCX"));
				setDocSfecac(new TipoDocumento(40,"Situa��o Fiscal","SFECAC"));
				setDocRedctf(new TipoDocumento(41,"Recibo de Entrega","REDCTF"));
				setDocDcdctf(new TipoDocumento(42,"Declara��o","DCDCTF"));
				setDocRedmed(new TipoDocumento(43,"Recibo de Entrega","REDMED"));
				setDocDcdmed(new TipoDocumento(44,"Declara��o","DCDMED"));
				setDocRedmob(new TipoDocumento(45,"Recibo de Entrega","REDMOB"));
				setDocDcdmob(new TipoDocumento(46,"Declara��o","DCDMOB"));
				setDocRedirf(new TipoDocumento(47,"Recibo de Entrega","REDIRF"));
				setDocDcdirf(new TipoDocumento(48,"Declara��o","DCDIRF"));
				setDocRedasn(new TipoDocumento(49,"Recibo de Entrega","REDASN"));
				setDocDcdasn(new TipoDocumento(50,"Declara��o","DCDASN"));
				setDocRedfis(new TipoDocumento(51,"Recibo de Entrega","REDFIS"));
				setDocDcdfis(new TipoDocumento(52,"Declara��o","DCDFIS"));
				setDocReibge(new TipoDocumento(53,"Recibo de Entrega","REIBGE"));
				setDocDcibge(new TipoDocumento(54,"Declara��o","DCIBGE"));
				setDocReecfs(new TipoDocumento(55,"Recibo de Entrega","REECFS"));
				setDocDcecfs(new TipoDocumento(56,"Declara��o","DCECFS"));
				setDocReefdr(new TipoDocumento(57,"Recibo de Entrega","REEFDR"));
			
				
				setTiposBlnc(new ArrayList<TipoDocumento>());
				setTiposDre(new ArrayList<TipoDocumento>());
				setTiposBlct(new ArrayList<TipoDocumento>());
				setTiposDcon(new ArrayList<TipoDocumento>());
				setTiposEcd(new ArrayList<TipoDocumento>());
				
				setTiposDctf(new ArrayList<TipoDocumento>());
				setTiposDmed(new ArrayList<TipoDocumento>());
				setTiposDmob(new ArrayList<TipoDocumento>());
				setTiposDirf(new ArrayList<TipoDocumento>());
				setTiposDasn(new ArrayList<TipoDocumento>());
				setTiposDfis(new ArrayList<TipoDocumento>());
				setTiposIbge(new ArrayList<TipoDocumento>());
				setTiposEcfs(new ArrayList<TipoDocumento>());
				setTiposEfdr(new ArrayList<TipoDocumento>());
				setTiposDipj(new ArrayList<TipoDocumento>());
				setTiposIntv(new ArrayList<TipoDocumento>());
				setTiposLvdi(new ArrayList<TipoDocumento>());
				setTiposLvrz(new ArrayList<TipoDocumento>());
				setTiposLvcx(new ArrayList<TipoDocumento>());
				
				
				
				TiposBlnc.add(getDocBp());
				TiposBlnc.add(getDocTbp());
				TiposDre.add(getDocDre());
				TiposDre.add(getDocTdre());
				TiposBlct.add(getDocBm());
				TiposBlct.add(getDocBt());
				TiposBlct.add(getDocBa());
				TiposDcon.add(getDocDlpa());
				TiposDcon.add(getDocDmpl());
				TiposDcon.add(getDocDfc());
				TiposDcon.add(getDocNe());
				TiposDcon.add(getDocIndliq());
				TiposEcd.add(getDocRcentr());
				TiposEcd.add(getDocReqnto());
				TiposEcd.add(getDocTermos());
				TiposEcd.add(getDocCopseg());
				TiposEcd.add(getDocTxpaga());
				TiposEcd.add(getDocAutent());
				TiposEcd.add(getDocDiario());
				TiposEcd.add(getDocDlpa());
				TiposEcd.add(getDocDmpl());
				TiposEcd.add(getDocNe());
				TiposEcd.add(getDocBp());
				TiposEcd.add(getDocDre());
				
				TiposDctf.add(getDocSfecac());
				TiposDctf.add(getDocRedctf());
				TiposDctf.add(getDocDcdctf());
				TiposDmed.add(getDocRedmed());
				TiposDmed.add(getDocDcdmed());
				TiposDmob.add(getDocRedmob());
				TiposDmob.add(getDocDcdmob());
				TiposDirf.add(getDocRedirf());
				TiposDirf.add(getDocDcdirf());
				TiposDasn.add(getDocRedasn());
				TiposDasn.add(getDocDcdasn());
				TiposDfis.add(getDocRedfis());
				TiposDfis.add(getDocDcdfis());
				TiposIbge.add(getDocReibge());
				TiposIbge.add(getDocDcibge());
				TiposEcfs.add(getDocReecfs());
				TiposEcfs.add(getDocDcecfs());
				TiposEfdr.add(getDocReefdr());
				TiposEfdr.add(getDocDcefdr());
				TiposDipj.add(getDocRedipj());
				TiposDipj.add(getDocDcdipj());
				TiposIntv.add(getDocDcintv());
				TiposLvdi.add(getDocDiario());
				TiposLvdi.add(getDocPlcnts());
				TiposLvdi.add(getDocBlnclv());
				TiposLvdi.add(getDocTmblnc());
				TiposLvdi.add(getDocDre());
				TiposLvdi.add(getDocTemdre());
				TiposLvdi.add(getDocCdrprj());
				TiposLvdi.add(getDocTalvdi());
				TiposLvdi.add(getDocTelvdi());
				TiposLvrz.add(getDocLvrzge());
				TiposLvrz.add(getDocTalvrz());
				TiposLvrz.add(getDocTelvrz());
				TiposLvcx.add(getDocLcaixa());
				TiposLvcx.add(getDocTalvcx());
				TiposLvcx.add(getDocTelvcx());
				
				setBlnc(new Organizacao(1,"Balan�os","BLNC",TiposBlnc));
				setDre(new Organizacao(2,"DRE","DRE",TiposDre));
				setBlct(new Organizacao(3,"Balancetes", "BLCT", TiposBlct));
				setDcon(new Organizacao(4,"DCON", "DCON", TiposDcon));
				setEcd(new Organizacao(5,"ECD","ECD",TiposEcd));
				setDctf(new Organizacao(6,"DCTF","DCTF",TiposDctf));
				setDmed(new Organizacao(7,"DMED","DMED",TiposDmed));
				setDmob(new Organizacao(8,"DMOB","DMOB",TiposDmob));
				setDirf(new Organizacao(9,"DIRF","DIRF",TiposDirf));
				setDasn(new Organizacao(10,"DASN","DASN",TiposDasn));
				setDfis(new Organizacao(11,"DFIS ","DFIS",TiposDfis));
				setIbge(new Organizacao(12,"IBGE","IBGE",TiposIbge));
				setEcfs(new Organizacao(13,"ECFS","ECFS",TiposEcfs));
				setEfdr(new Organizacao(14,"EFDR","EFDR",TiposEfdr));
				setDipj(new Organizacao(15,"DIPJ","DIPJ",TiposDipj));
				setIntv(new Organizacao(16,"INTV","INTV",TiposIntv));
				setLvdi(new Organizacao(17,"LVDI ","LVDI",TiposLvdi));
				setLvrz(new Organizacao(18,"Livro Raz�o","LVRZ",TiposLvrz));
				setLvcx(new Organizacao(19,"Livro Caixa","LVCX",TiposLvcx));
				
				
				setOrganizacoes(new ArrayList<Organizacao>());
				getOrganizacoes().add(getBlnc());
				getOrganizacoes().add(getDre());
				getOrganizacoes().add(getBlct());
				getOrganizacoes().add(getDcon());
				getOrganizacoes().add(getEcd());
				getOrganizacoes().add(getDctf());
				getOrganizacoes().add(getDmed());
				getOrganizacoes().add(getDmob());
				getOrganizacoes().add(getDirf());
				getOrganizacoes().add(getDasn());
				getOrganizacoes().add(getDfis());
				getOrganizacoes().add(getIbge());
				getOrganizacoes().add(getEcfs());
				getOrganizacoes().add(getEfdr());
				getOrganizacoes().add(getDipj());
				getOrganizacoes().add(getIntv());
				getOrganizacoes().add(getLvdi());
				getOrganizacoes().add(getLvrz());
				getOrganizacoes().add(getLvcx());
				
				setContabil(new Unidade(2,"Cont�bil","CT",getOrganizacoes()));
				
				/* Organiza��o dos Arrays em Ordem Crescente! - Fellipe Pimentel */
				Collections.sort(getTiposBlct(), new ComparadorTipoDocumento());
				Collections.sort(getTiposBlnc(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDasn(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDcon(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDctf(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDfis(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDipj(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDirf(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDmed(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDmob(), new ComparadorTipoDocumento());
				Collections.sort(getTiposDre(), new ComparadorTipoDocumento());
				Collections.sort(getTiposEcd(), new ComparadorTipoDocumento());
				Collections.sort(getTiposEcfs(), new ComparadorTipoDocumento());
				Collections.sort(getTiposEfdr(), new ComparadorTipoDocumento());
				Collections.sort(getTiposIbge(), new ComparadorTipoDocumento());
				Collections.sort(getTiposIntv(), new ComparadorTipoDocumento());
				Collections.sort(getTiposLvcx(), new ComparadorTipoDocumento());
				Collections.sort(getTiposLvdi(), new ComparadorTipoDocumento());
				Collections.sort(getTiposLvrz(), new ComparadorTipoDocumento());
				
				Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
			}
//------------------------------------------------------------------------------------------------
			public ArrayList<TipoDocumento> getTiposEcd() {
				return TiposEcd;
			}
			
			public void setTiposEcd(ArrayList<TipoDocumento> tiposEcd) {
				TiposEcd = tiposEcd;
			}
			
			public ArrayList<TipoDocumento> getTiposDcon() {
				return TiposDcon;
			}
			
			public void setTiposDcon(ArrayList<TipoDocumento> tiposDcon) {
				TiposDcon = tiposDcon;
			}

			public ArrayList<TipoDocumento> getTiposBlct() {
				return TiposBlct;
			}
			
			public void setTiposBlct(ArrayList<TipoDocumento> tiposBlct) {
				TiposBlct = tiposBlct;
			}

			public ArrayList<TipoDocumento> getTiposDre() {
				return TiposDre;
			}
			
			public void setTiposDre(ArrayList<TipoDocumento> tiposDre) {
				TiposDre = tiposDre;
			}

			public ArrayList<TipoDocumento> getTiposBlnc() {
				return TiposBlnc;
			}
			
			public void setTiposBlnc(ArrayList<TipoDocumento> tiposBlnc) {
				TiposBlnc = tiposBlnc;
			}
//---------------------ARRAYLIST APOIO CONT�BIL--------------------------------------------------
			public ArrayList<TipoDocumento> getTiposDctf() {
				return TiposDctf;
			}
			public void setTiposDctf(ArrayList<TipoDocumento> tiposDctf) {
				TiposDctf = tiposDctf;
			}
			
			public ArrayList<TipoDocumento> getTiposDmed() {
				return TiposDmed;
			}
			public void setTiposDmed(ArrayList<TipoDocumento> tiposDmed) {
				TiposDmed = tiposDmed;
			}
			public ArrayList<TipoDocumento> getTiposDmob() {
				return TiposDmob;
			}
			public void setTiposDmob(ArrayList<TipoDocumento> tiposDmob) {
				TiposDmob = tiposDmob;
			}
			public ArrayList<TipoDocumento> getTiposDirf() {
				return TiposDirf;
			}
			public void setTiposDirf(ArrayList<TipoDocumento> tiposDirf) {
				TiposDirf = tiposDirf;
			}
			public ArrayList<TipoDocumento> getTiposDasn() {
				return TiposDasn;
			}
			public void setTiposDasn(ArrayList<TipoDocumento> tiposDasn) {
				TiposDasn = tiposDasn;
			}
			public ArrayList<TipoDocumento> getTiposDfis() {
				return TiposDfis;
			}
			public void setTiposDfis(ArrayList<TipoDocumento> tiposDfis) {
				TiposDfis = tiposDfis;
			}
			public ArrayList<TipoDocumento> getTiposIbge() {
				return TiposIbge;
			}
			public void setTiposIbge(ArrayList<TipoDocumento> tiposIbge) {
				TiposIbge = tiposIbge;
			}
			public ArrayList<TipoDocumento> getTiposEcfs() {
				return TiposEcfs;
			}
			public void setTiposEcfs(ArrayList<TipoDocumento> tiposEcfs) {
				TiposEcfs = tiposEcfs;
			}
			public ArrayList<TipoDocumento> getTiposEfdr() {
				return TiposEfdr;
			}
			public void setTiposEfdr(ArrayList<TipoDocumento> tiposEfdr) {
				TiposEfdr = tiposEfdr;
			}
			public ArrayList<TipoDocumento> getTiposDipj() {
				return TiposDipj;
			}
			public void setTiposDipj(ArrayList<TipoDocumento> tiposDipj) {
				TiposDipj = tiposDipj;
			}
			public ArrayList<TipoDocumento> getTiposIntv() {
				return TiposIntv;
			}
			public void setTiposIntv(ArrayList<TipoDocumento> tiposIntv) {
				TiposIntv = tiposIntv;
			}
			public ArrayList<TipoDocumento> getTiposLvdi() {
				return TiposLvdi;
			}
			public void setTiposLvdi(ArrayList<TipoDocumento> tiposLvdi) {
				TiposLvdi = tiposLvdi;
			}
			public ArrayList<TipoDocumento> getTiposLvrz() {
				return TiposLvrz;
			}
			public void setTiposLvrz(ArrayList<TipoDocumento> tiposLvrz) {
				TiposLvrz = tiposLvrz;
			}
			public ArrayList<TipoDocumento> getTiposLvcx() {
				return TiposLvcx;
			}
			public void setTiposLvcx(ArrayList<TipoDocumento> tiposLvcx) {
				TiposLvcx = tiposLvcx;
			}
			
//---------------------TIPOS DE DOC. APOIO CONT�BIL----------------------------------------------
			public TipoDocumento getDocSfecac() {
				return DocSfecac;
			}
			public void setDocSfecac(TipoDocumento docSfecac) {
				DocSfecac = docSfecac;
			}
			public TipoDocumento getDocRedctf() {
				return DocRedctf;
			}
			public void setDocRedctf(TipoDocumento docRedctf) {
				DocRedctf = docRedctf;
			}
			public TipoDocumento getDocDcdctf() {
				return DocDcdctf;
			}
			public void setDocDcdctf(TipoDocumento docDcdctf) {
				DocDcdctf = docDcdctf;
			}
			public TipoDocumento getDocRedmed() {
				return DocRedmed;
			}
			public void setDocRedmed(TipoDocumento docRedmed) {
				DocRedmed = docRedmed;
			}
			public TipoDocumento getDocDcdmed() {
				return DocDcdmed;
			}
			public void setDocDcdmed(TipoDocumento docDcdmed) {
				DocDcdmed = docDcdmed;
			}
			public TipoDocumento getDocRedmob() {
				return DocRedmob;
			}
			public void setDocRedmob(TipoDocumento docRedmob) {
				DocRedmob = docRedmob;
			}
			public TipoDocumento getDocDcdmob() {
				return DocDcdmob;
			}
			public void setDocDcdmob(TipoDocumento docDcdmob) {
				DocDcdmob = docDcdmob;
			}
			public TipoDocumento getDocRedirf() {
				return DocRedirf;
			}
			public void setDocRedirf(TipoDocumento docRedirf) {
				DocRedirf = docRedirf;
			}
			public TipoDocumento getDocDcdirf() {
				return DocDcdirf;
			}
			public void setDocDcdirf(TipoDocumento docDcdirf) {
				DocDcdirf = docDcdirf;
			}
			public TipoDocumento getDocRedasn() {
				return DocRedasn;
			}
			public void setDocRedasn(TipoDocumento docRedasn) {
				DocRedasn = docRedasn;
			}
			public TipoDocumento getDocDcdasn() {
				return DocDcdasn;
			}
			public void setDocDcdasn(TipoDocumento docDcdasn) {
				DocDcdasn = docDcdasn;
			}
			public TipoDocumento getDocRedfis() {
				return DocRedfis;
			}
			public void setDocRedfis(TipoDocumento docRedfis) {
				DocRedfis = docRedfis;
			}
			public TipoDocumento getDocDcdfis() {
				return DocDcdfis;
			}
			public void setDocDcdfis(TipoDocumento docDcdfis) {
				DocDcdfis = docDcdfis;
			}
			public TipoDocumento getDocReibge() {
				return DocReibge;
			}
			public void setDocReibge(TipoDocumento docReibge) {
				DocReibge = docReibge;
			}
			public TipoDocumento getDocDcibge() {
				return DocDcibge;
			}
			public void setDocDcibge(TipoDocumento docDcibge) {
				DocDcibge = docDcibge;
			}
			public TipoDocumento getDocReecfs() {
				return DocReecfs;
			}
			public void setDocReecfs(TipoDocumento docReecfs) {
				DocReecfs = docReecfs;
			}
			public TipoDocumento getDocDcecfs() {
				return DocDcecfs;
			}
			public void setDocDcecfs(TipoDocumento docDcecfs) {
				DocDcecfs = docDcecfs;
			}
			public TipoDocumento getDocReefdr() {
				return DocReefdr;
			}
			public void setDocReefdr(TipoDocumento docReefdr) {
				DocReefdr = docReefdr;
			}
			public TipoDocumento getDocDcefdr() {
				return DocDcefdr;
			}
			public void setDocDcefdr(TipoDocumento docDcefdr) {
				DocDcefdr = docDcefdr;
			}
			public TipoDocumento getDocRedipj() {
				return DocRedipj;
			}
			public void setDocRedipj(TipoDocumento docRedipj) {
				DocRedipj = docRedipj;
			}
			public TipoDocumento getDocDcdipj() {
				return DocDcdipj;
			}
			public void setDocDcdipj(TipoDocumento docDcdipj) {
				DocDcdipj = docDcdipj;
			}
			public TipoDocumento getDocDcintv() {
				return DocDcintv;
			}
			public void setDocDcintv(TipoDocumento docDcintv) {
				DocDcintv = docDcintv;
			}
			public TipoDocumento getDocPlcnts() {
				return DocPlcnts;
			}
			public void setDocPlcnts(TipoDocumento docPlcnts) {
				DocPlcnts = docPlcnts;
			}
			public TipoDocumento getDocBlnclv() {
				return DocBlnclv;
			}
			public void setDocBlnclv(TipoDocumento docBlnclv) {
				DocBlnclv = docBlnclv;
			}
			public TipoDocumento getDocTmblnc() {
				return DocTmblnc;
			}
			public void setDocTmblnc(TipoDocumento docTmblnc) {
				DocTmblnc = docTmblnc;
			}
			public TipoDocumento getDocTemdre() {
				return DocTemdre;
			}
			public void setDocTemdre(TipoDocumento docTemdre) {
				DocTemdre = docTemdre;
			}
			public TipoDocumento getDocCdrprj() {
				return DocCdrprj;
			}
			public void setDocCdrprj(TipoDocumento docCdrprj) {
				DocCdrprj = docCdrprj;
			}
			public TipoDocumento getDocTalvdi() {
				return DocTalvdi;
			}
			public void setDocTalvdi(TipoDocumento docTalvdi) {
				DocTalvdi = docTalvdi;
			}
			public TipoDocumento getDocTelvdi() {
				return DocTelvdi;
			}
			public void setDocTelvdi(TipoDocumento docTelvdi) {
				DocTelvdi = docTelvdi;
			}
			public TipoDocumento getDocLvrzge() {
				return DocLvrzge;
			}
			public void setDocLvrzge(TipoDocumento docLvrzge) {
				DocLvrzge = docLvrzge;
			}
			public TipoDocumento getDocTalvrz() {
				return DocTalvrz;
			}
			public void setDocTalvrz(TipoDocumento docTalvrz) {
				DocTalvrz = docTalvrz;
			}
			public TipoDocumento getDocTelvrz() {
				return DocTelvrz;
			}
			public void setDocTelvrz(TipoDocumento docTelvrz) {
				DocTelvrz = docTelvrz;
			}
			public TipoDocumento getDocLcaixa() {
				return DocLcaixa;
			}
			public void setDocLcaixa(TipoDocumento docLcaixa) {
				DocLcaixa = docLcaixa;
			}
			public TipoDocumento getDocTalvcx() {
				return DocTalvcx;
			}
			public void setDocTalvcx(TipoDocumento docTalvcx) {
				DocTalvcx = docTalvcx;
			}
			public TipoDocumento getDocTelvcx() {
				return DocTelvcx;
			}
			public void setDocTelvcx(TipoDocumento docTelvcx) {
				DocTelvcx = docTelvcx;
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
//-----------------------------ORGANIZA��O APOIO CONT�BIL------------------------------------------
			
			public Organizacao getDctf() {
				return dctf;
			}
			
			public void setDctf(Organizacao dctf) {
				this.dctf = dctf;
			}
			
			public Organizacao getDmed() {
				return dmed;
			}
			
			public void setDmed(Organizacao dmed) {
				this.dmed = dmed;
			}
			
			public Organizacao getDmob() {
				return dmob;
			}
			
			public void setDmob(Organizacao dmob) {
				this.dmob = dmob;
			}
			
			public Organizacao getDirf() {
				return dirf;
			}
			
			public void setDirf(Organizacao dirf) {
				this.dirf = dirf;
			}
			
			public Organizacao getDasn() {
				return dasn;
			}
			
			public void setDasn(Organizacao dasn) {
				this.dasn = dasn;
			}

			public Organizacao getDfis() {
				return dfis;
			}
			
			public void setDfis(Organizacao dfis) {
				this.dfis = dfis;
			}
			
			public Organizacao getIbge() {
				return ibge;
			}
			
			public void setIbge(Organizacao ibge) {
				this.ibge = ibge;
			}
			
			public Organizacao getEcfs() {
				return ecfs;
			}
			
			public void setEcfs(Organizacao ecfs) {
				this.ecfs = ecfs;
			}
			
			public Organizacao getEfdr() {
				return efdr;
			}
			
			public void setEfdr(Organizacao efdr) {
				this.efdr = efdr;
			}
			
			public Organizacao getDipj() {
				return dipj;
			}
			
			public void setDipj(Organizacao dipj) {
				this.dipj = dipj;
			}
			
			public Organizacao getIntv() {
				return intv;
			}
		
			public void setIntv(Organizacao intv) {
				this.intv = intv;
			}
			public Organizacao getLvdi() {
				return lvdi;
			}
			public void setLvdi(Organizacao lvdi) {
				this.lvdi = lvdi;
			}
			public Organizacao getLvrz() {
				return lvrz;
			}
			public void setLvrz(Organizacao lvrz) {
				this.lvrz = lvrz;
			}
			public Organizacao getLvcx() {
				return lvcx;
			}
			public void setLvcx(Organizacao lvcx) {
				this.lvcx = lvcx;
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

			public Organizacao getBlnc() {
				return blnc;
			}
			
			public void setBlnc(Organizacao blnc) {
				this.blnc = blnc;
			}
			public ArrayList<Organizacao> getOrganizacoes() {
				return organizacoes;
			}
			public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
				this.organizacoes = organizacoes;
			}
			public Unidade getContabil() {
				return contabil;
			}
			public void setContabil(Unidade contabil) {
				this.contabil = contabil;
			}
	}
