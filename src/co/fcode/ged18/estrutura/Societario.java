package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;
import java.util.Collections;
import co.fcode.ged18.*;

public class Societario {
//-------------------VARI�VEIS TIPOS DE ORGANIZA��O-------------------//
	
		private Organizacao Atos; // ATOS
		private Organizacao Fed;  // FEDERAL
		private Organizacao Est;  // ESTADUAL
		private Organizacao Mun;  // MUNICIPAL
		private Organizacao Dvrs; // DIVERSOS
		private Organizacao Certd;// CERTID�ES
		private Organizacao DocJu;// DOCUMENTOS JUDICIAIS

//-----------------------FIM DA DECLARA��O----------------------------//

//-------------------VARI�VEIS TIPOS DE DOCUMENTOS-------------------//
			
		private TipoDocumento DocConsoc; // CONTRATO SOCIAL 
		private TipoDocumento DocAltcon; // ALTERA��O CONTRATUAL
		private TipoDocumento DocDist;   // DISTRATO
		private TipoDocumento DocAta;    // ATA DE REUNI�O/ASSEMBL�IA
		private TipoDocumento DocReqemp; // REQUERIMENTO DE EMPRES�RIO
		private TipoDocumento DocEnquad; // ENQUADRAMENTO
		private TipoDocumento DocDesenq; // DESENQUADRAMENTO 
		private TipoDocumento DocReenq;  // REENQUADRAMENTO
		private TipoDocumento DocBalreg; // BALAN�O REGISTRADO
		private TipoDocumento DocProinc; // PROTOCOLO E JUSTIFICA��O 
		private TipoDocumento DocParal;  // PARALISA��O
		private TipoDocumento DocLavpal; // LAUDO DE AVALIA��O DO PATRIM�NIO L�QUIDO
		private TipoDocumento DocEstat;  // ESTATUTO 
		private TipoDocumento DocCnpj;   // CNPJ
		private TipoDocumento DocCertbx; // CERTID�O DE BAIXA
		private TipoDocumento DocInsest; // INSCRI��O ESTADUAL
		private TipoDocumento DocLdexcb; // CERTID�O DE BAIXA DA INSCRI��O ESTADUAL
		private TipoDocumento DocCertcb; // CERTIF DE APROVA��O DO CORPO DE BOMBEIROS
		private TipoDocumento DocAlvara; // ALVAR�
		private TipoDocumento DocFincad; // FICHA DE INFORMA��ES CADASTRAIS
		private TipoDocumento DocBxiss;  // MEMORANDO DE BAIXA ISS
		private TipoDocumento DocBxalv;  // ALVAR� BAIXADO
		private TipoDocumento DocSanipj; // TERMO DE LICEN�A DE FUNCIONAMENTO SANIT�RIO
		private TipoDocumento DocCis;    // CERTIFICADO DE INSPE��O SANIT�RIA
		private TipoDocumento DocSanipf; // TERMO DE ASSENTIMENTO SANIT�RIO
		private TipoDocumento DocSmtr;   // CERTID�O DE ASSESSIBILIDADE 
		private TipoDocumento DocSmo;    // DECLARA��O DE REBAIXAMENTO DE MEIO FIO
		private TipoDocumento DocCinstc; // CERTID�O DE INSTALA��O COMERCIAL
		private TipoDocumento DocHabite; // HABITE-SE 
		private TipoDocumento DocCtrans; // CERTID�O DE TRANSFORMA��O DE USO
		private TipoDocumento DocSmac;   // REQUERIMENTO DE MEIO AMBIENTE 
		private TipoDocumento DocPlpubl; // PLANTA DE AUTORIZA��O DE PUBLICIDADE: Baixada
		private TipoDocumento DocPlpuba; // PLANTA DE AUTORIZA��O DE PUBLICIDADE: Autorizada
		private TipoDocumento DocTxmeca; // TAXA DE MESAS E CADEIRAS 
		private TipoDocumento DocTxpubl; // TAXA DE PUBLICIDADE 
		private TipoDocumento DocIptu;   // IPTU 
		private TipoDocumento DocConloc; // CONTRATO DE LOCA��O 
		private TipoDocumento DocCpf;    // CPF DOS S�CIOS
		private TipoDocumento DocRg;     // RG DOS S�CIOS
		private TipoDocumento DocCompre; // COMPROVANTE DE RESID�NCIA DOS S�CIOS
		private TipoDocumento DocRegpro; // REGISTRO PROFISSIONAL 
		private TipoDocumento DocPcv;    // PROMESSA DE COMPRA E VENDA
		private TipoDocumento DocNit;    // NIT - NUMERO DE INSCRI��O DO TRABALHADOR/S�CIO
		private TipoDocumento DocProtoc; // PROTOCOLO
		private TipoDocumento DocQdrsoc; // QUADRO SOCIET�RIO
		private TipoDocumento DocLbomb;  // LAUDO DE EXIG�NCIAS DO CORPO DE BOMBEIROS
		private TipoDocumento DocProarq; // PROJETO ARQUITET�NICO APROVADO
		private TipoDocumento DocCartrn; // CARTA DE REN�NCIA
		private TipoDocumento Doctermpo; // TERMO DE POSSE
		private TipoDocumento DocCtint;  // CERTID�O INTEIRO TEOR - JUCERJA
		private TipoDocumento DocSimp; // CERTID�O SIMPLIFICADA - JUCERJA
		private TipoDocumento DocNegiss; // CERTID�O NEGATIVA ISS
		private TipoDocumento DocNdae; // CERTID�O NEG. DIVIDA ATIVA DO ESTADO
		private TipoDocumento DocNdam; // CERTID�O NEG. DIVIDA ATIVA DO MUNIC�PIO
		private TipoDocumento DocCftc; // CERTID�O DE FEITOS TRABALHISTAS - CND
		private TipoDocumento DocNicmsc; // CERTID�O NEG. ICMS - CONTRIBUINTE
		private TipoDocumento DocNicmsn; // CERTID�O NEG. ICMS - N�O CONTRIBUINTE
		private TipoDocumento DocNcduin; // CERTID�O NEGATIVA CONJUNTA DE TRIBUTOS FEDERAIS|DIVIDA ATIVA DA UNI�O|INSS
		private TipoDocumento DocInecf; // INFORMA��ES ECF
		private TipoDocumento DocRCC; //  RCC
		private TipoDocumento DocIntima; // INTIMA��O
		private TipoDocumento DocNotif; // NOTIFICA��O
		private TipoDocumento DocCitac; // CITA��O
		private TipoDocumento DocPenho; // PENHORA
		private TipoDocumento DocOficio; // OF�CIO
		private TipoDocumento DocManda; // MANDADO
		private TipoDocumento DocPdbxie; // PEDIDO DE BAIXA DE INSCRI��O ESTADUAL
		private TipoDocumento DocJucerj; // PROCURA��O JUCERJA
				
			
//-----------------------FIM DA DECLARA��O----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
		private ArrayList<TipoDocumento> TiposAtos; // TIPOS ATOS
		private ArrayList<TipoDocumento> TiposFed; // TIPOS FEDERAL
		private ArrayList<TipoDocumento> TiposEst; // TIPOS ESTADUAL
		private ArrayList<TipoDocumento> TiposMun; // TIPOS MUNICIPAL
		private ArrayList<TipoDocumento> TiposDvrs; // TIPOS DIVERSOS
		private ArrayList<TipoDocumento> TiposCertd; // TIPOS CERTID�ES
		private ArrayList<TipoDocumento> TiposDocJu; // TIPOS DOCUMENTOS JUDICIAIS
			
//-----------------------FIM DA DECLARA��O----------------------------//
		
		private ArrayList<Organizacao> organizacoes;
		private Unidade soc;
			
		public Societario(){
			setDocConsoc(new TipoDocumento(1,"Contrato Social","CONSOC"));
			setDocAltcon(new TipoDocumento(2,"Altera��o Contratual","ALTCON"));
			setDocDist(new TipoDocumento(3,"Distrato","DIST"));
			setDocAta(new TipoDocumento(4,"Ata de Reuni�o-Assembleia","ATA"));
			setDocReqemp(new TipoDocumento(5,"Requerimento de Empres�rio","REQEMP"));
			setDocEnquad(new TipoDocumento(6, "Enquadramento", "ENQUAD"));
			setDocDesenq(new TipoDocumento(7,"Desenquadramento","DESENQ"));
			setDocReenq(new TipoDocumento(8,"Reequadramento","REENQ"));
			setDocBalreg(new TipoDocumento(9,"Balan�o Registrado","BALREG"));
			setDocProinc(new TipoDocumento(10,"Protocolo e Justifica��o","PROINC"));
			setDocParal(new TipoDocumento(11,"Paralisa��o","PARAL"));
			setDocLavpal(new TipoDocumento(12,"Laudo de Avalia��o do Patrim�nio L�quido","LAVPAL"));
			setDocEstat(new TipoDocumento(13,"Estatuto","ESTAT"));
			setDocCnpj(new TipoDocumento(14,"CNPJ","CNPJ"));
			setDocCertbx(new TipoDocumento(15, "Certid�o de Baixa", "CERTBX"));
			setDocInsest(new TipoDocumento(16, "Inscri��o Estadual", "INSEST"));
			setDocLdexcb(new TipoDocumento(17, "Certid�o de Baixa de Inscri��o Estadual", "LDEXCB"));
			setDocCertcb(new TipoDocumento(18, "Certificado de Aprova��o do Corpo de Bombeiros", "CERTCB"));
			setDocAlvara(new TipoDocumento(19, "Alvar�", "ALVARA"));
			setDocFincad(new TipoDocumento(20, "Ficha de Informa��es Cadastrais", "FINCAD"));
			setDocBxiss(new TipoDocumento(21, "Memorando de Baixa Iss", "BXISS"));
			setDocBxalv(new TipoDocumento(22, "Alvar� Baixado", "BXALV"));
			setDocSanipj(new TipoDocumento(23, "Termo de Licensa de Funcionamento Sanit�rio", "SANIPJ"));
			setDocCis(new TipoDocumento(24, "Certificado de Inspe��o Sanit�ria", "CIS"));
			setDocSanipf(new TipoDocumento(25, "Termo de Assentimento Sanit�rio", "SANIPF"));
			setDocSmtr(new TipoDocumento(26, "Certid�o de Acessibilidade", "SMTR"));
			setDocSmo(new TipoDocumento(27, "Declara��o de Rebaixamento de Meio Fio", "SMO"));
			setDocCinstc(new TipoDocumento(28, "Certid�o de Instala��o Comercial", "CINSCT"));
			setDocHabite(new TipoDocumento(29, "Habite-se", "HABITE"));
			setDocCtrans(new TipoDocumento(30, "Certid�o de Transforma��o de Uso", "CTRANS"));
			setDocSmac(new TipoDocumento(31, "Requerimento de Meio Ambiente", "SMAC"));
			setDocPlpubl(new TipoDocumento(32, "Publicidade Baixada", "PLPUBL"));
			setDocTxmeca(new TipoDocumento(33, "Taxa de Mesas e Cadeiras", "TXMECA"));
			setDocTxpubl(new TipoDocumento(34, "Taxa de Publicidade", "TXPUBL"));
			setDocIptu(new TipoDocumento(35, "Iptu", "IPTU"));
			setDocConloc(new TipoDocumento(36, "Contrato de Loca��o", "CONLOC"));
			setDocCpf(new TipoDocumento(37, "Cpf dos S�cios", "CPF"));
			setDocRg(new TipoDocumento(38, "Rg dos S�cios", "RG"));
			setDocCompre(new TipoDocumento(39, "Comprovante de Resid�ncia dos S�cios", "COMPRE"));
			setDocRegpro(new TipoDocumento(40, "Registro Profissional", "REGPRO"));
			setDocPcv(new TipoDocumento(41, "Promessa de Compra e Venda", "PCV"));
			setDocNit(new TipoDocumento(42, "N�mero de Inscri��o do Trabalhador-S�cio", "NIT"));
			setDocProtoc(new TipoDocumento(43, "Protocolo", "PROTOC"));
			setDocQdrsoc(new TipoDocumento(44, "Quadro Societ�rio", "QDRSOC"));
			setDocPlpuba(new TipoDocumento(45, "Publicidade Aprovada", "PLPUBL"));
			setDocLbomb(new TipoDocumento(46, "Laudo de Exig�ncias do Corpo de Bombeiros","LBOMB"));
			setDocProarq(new TipoDocumento(47,"Projeto Arquitet�nico Aprovado","PROARQ"));
			setDocCartrn(new TipoDocumento(48, "Carta de Ren�ncia","CARTRN"));
			setDoctermpo(new TipoDocumento(49, "Termo de Posse","TERMPO"));
			setDocCtint(new TipoDocumento(50, "Certid�o Inteiro Teor - JUCERJA","CTINT"));
			setDocSimp(new TipoDocumento(51, "Certid�o Simplificada - JUCERJA","SIMP"));
			setDocNegiss(new TipoDocumento(52, "Certid�o Negativa ISS","NEGISS"));
			setDocNdae(new TipoDocumento(53, "Certid�o Neg. Divida Ativa do Estado","NDAE"));
			setDocNdam(new TipoDocumento(54, "Certid�o Neg. Divida Ativa do Munic�pio","NDAM"));
			setDocCftc(new TipoDocumento(55, "Certid�o de Feitos Trabalhistas - CND","CFTC"));
			setDocNicmsc(new TipoDocumento(56, "Certid�o Neg. ICMS - Contribuinte","NICMSC"));
			setDocNicmsn(new TipoDocumento(57, "Certid�o Neg. ICMS - N�o contribuinte","NICMSN"));
			setDocNcduin(new TipoDocumento(58, "Certid�o Negativa Conjunta de Tributos Federais-Divida Ativa da Uni�o-INSS","NCDUIN"));
			setDocInecf(new TipoDocumento(59, "Informa��es ECF", "INECF"));
			setDocRCC(new TipoDocumento(60, "RCC", "RCC"));
			setDocNotif(new TipoDocumento(61, "Notifica��es", "NOTIF"));
			setDocCitac(new TipoDocumento(62, "Cita��o", "CITAC"));
			setDocPenho(new TipoDocumento(63, "Penhora", "PENHO"));
			setDocOficio(new TipoDocumento(64, "Of�cio", "OFICIO"));
			setDocManda(new TipoDocumento(65, "Mandado", "MANDA"));
			setDocPdbxie(new TipoDocumento(66, "Pedido de Baixa de Inscri��o Estadual", "PDBXIE"));
			setDocJucerj(new TipoDocumento(67, "Procura��o Jucerja", "JUCERJ"));
			
			
			setTiposAtos(new ArrayList<TipoDocumento>());
			setTiposFed(new ArrayList<TipoDocumento>());
			setTiposEst(new ArrayList<TipoDocumento>());
			setTiposMun(new ArrayList<TipoDocumento>());
			setTiposDvrs(new ArrayList<TipoDocumento>());
			setTiposCertd(new ArrayList<TipoDocumento>());
			setTiposDocJu(new ArrayList<TipoDocumento>());
			
			TiposAtos.add(getDocConsoc());
			TiposAtos.add(getDocAltcon());
			TiposAtos.add(getDocDist());
			TiposAtos.add(getDocAta());
			TiposAtos.add(getDocReqemp());
			TiposAtos.add(getDocBalreg());
			TiposAtos.add(getDocProinc());
			TiposAtos.add(getDocParal());
			TiposAtos.add(getDocLavpal());
			TiposAtos.add(getDocEstat());
			TiposAtos.add(getDocEnquad());
			TiposAtos.add(getDocCartrn());
			TiposAtos.add(getDoctermpo());
			TiposAtos.add(getDocJucerj());
			
			TiposFed.add(getDocCnpj());
			TiposFed.add(getDocCertbx());
			TiposFed.add(getDocProtoc());
			TiposFed.add(getDocQdrsoc());
			
			TiposEst.add(getDocInsest());
			TiposEst.add(getDocParal());
			TiposEst.add(getDocCertbx());
			TiposEst.add(getDocLdexcb());
			TiposEst.add(getDocCertcb());
			TiposEst.add(getDocProtoc());
			TiposEst.add(getDocLbomb());
			TiposEst.add(getDocProarq());
			TiposEst.add(getDocInecf());
			TiposEst.add(getDocPdbxie());
			
			TiposMun.add(getDocAlvara());
			TiposMun.add(getDocFincad());
			TiposMun.add(getDocParal());
			TiposMun.add(getDocBxiss());
			TiposMun.add(getDocBxalv());
			TiposMun.add(getDocSanipj());
			TiposMun.add(getDocCis());
			TiposMun.add(getDocSanipf());
			TiposMun.add(getDocSmtr());
			TiposMun.add(getDocSmo());
			TiposMun.add(getDocCinstc());
			TiposMun.add(getDocHabite());
			TiposMun.add(getDocCtrans());
			TiposMun.add(getDocSmac());
			TiposMun.add(getDocPlpubl());
			TiposMun.add(getDocPlpuba());
			TiposMun.add(getDocTxmeca());
			TiposMun.add(getDocTxpubl());
			TiposMun.add(getDocIptu());
			TiposMun.add(getDocProtoc());
						
			TiposDvrs.add(getDocConloc());
			TiposDvrs.add(getDocCpf());
			TiposDvrs.add(getDocRg());
			TiposDvrs.add(getDocCompre());
			TiposDvrs.add(getDocRegpro());
			TiposDvrs.add(getDocPcv());
			TiposDvrs.add(getDocNit());
			TiposDvrs.add(getDocRCC());
			
			TiposCertd.add(getDocCtint());
			TiposCertd.add(getDocSimp());
			TiposCertd.add(getDocNegiss());
			TiposCertd.add(getDocNdae());
			TiposCertd.add(getDocNdam());
			TiposCertd.add(getDocCftc());
			TiposCertd.add(getDocNicmsc());
			TiposCertd.add(getDocNicmsn());
			TiposCertd.add(getDocNcduin());
			
			TiposDocJu.add(getDocAlvara());
			TiposDocJu.add(getDocCitac());
			TiposDocJu.add(getDocPenho());
			TiposDocJu.add(getDocOficio());
			TiposDocJu.add(getDocManda());
					
			
			setAtos(new Organizacao(1,"Atos","ATOS",TiposAtos));
			setFed(new Organizacao(2,"Federal","FED",TiposFed));
			setEst(new Organizacao(3,"Estadual","EST",TiposEst));
			setMun(new Organizacao(4,"Municipal","MUN",TiposMun));
			setDvrs(new Organizacao(5,"Diversos","DVRS",TiposDvrs));
			setCertd(new Organizacao(6, "Certid�es","CERTD", TiposCertd));
			setDocJu(new Organizacao(7,"Documentos Judiciais","DOCJU", TiposDocJu));
			
			setOrganizacoes(new ArrayList<Organizacao>());
			getOrganizacoes().add(getAtos());
			getOrganizacoes().add(getFed());
			getOrganizacoes().add(getEst());
			getOrganizacoes().add(getMun());
			getOrganizacoes().add(getDvrs());
			getOrganizacoes().add(getCertd());
			getOrganizacoes().add(getDocJu());
			
			setSoc(new Unidade(5,"Societ�rio","SC",getOrganizacoes()));
			
			/* Organiza��o dos Arrays em Ordem Crescente! - Fellipe Pimentel */
			Collections.sort(getTiposAtos(), new ComparadorTipoDocumento());
			Collections.sort(getTiposDvrs(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEst(), new ComparadorTipoDocumento());
			Collections.sort(getTiposFed(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMun(), new ComparadorTipoDocumento());
			Collections.sort(getTiposDvrs(), new ComparadorTipoDocumento());
			Collections.sort(getTiposCertd(), new ComparadorTipoDocumento());
			Collections.sort(getTiposDocJu(), new ComparadorTipoDocumento());
			
			Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
		}
//------------------------------------------------------------------------------------------------
		
		public ArrayList<TipoDocumento> getTiposDvrs() {
			return TiposDvrs;
		}
		
		public void setTiposDvrs(ArrayList<TipoDocumento> tiposDvrs) {
			TiposDvrs = tiposDvrs;
		}
		
		public ArrayList<TipoDocumento> getTiposCertd() {
			return TiposCertd;
		}
		public void setTiposCertd(ArrayList<TipoDocumento> tiposCertd) {
			TiposCertd = tiposCertd;
		}
		
		
		public ArrayList<TipoDocumento> getTiposMun() {
			return TiposMun;
		}
		
		public void setTiposMun(ArrayList<TipoDocumento> tiposMun) {
			TiposMun = tiposMun;
		}

		public ArrayList<TipoDocumento> getTiposEst() {
			return TiposEst;
		}
		/**
		 * @param tiposEst the tiposEst to set
		 */
		public void setTiposEst(ArrayList<TipoDocumento> tiposEst) {
			TiposEst = tiposEst;
		}
/**
		 * @return the tiposFed
		 */
		public ArrayList<TipoDocumento> getTiposFed() {
			return TiposFed;
		}
		/**
		 * @param tiposFed the tiposFed to set
		 */
		public void setTiposFed(ArrayList<TipoDocumento> tiposFed) {
			TiposFed = tiposFed;
		}
/**
		 * @return the tiposAtos
		 */
		public ArrayList<TipoDocumento> getTiposAtos() {
			return TiposAtos;
		}
		/**
		 * @param tiposAtos the tiposAtos to set
		 */
		public void setTiposAtos(ArrayList<TipoDocumento> tiposAtos) {
			TiposAtos = tiposAtos;
		}
		
	
//------------------------------------------------------------------------------------------------
		
		public TipoDocumento getDocJucerj() {
			return DocJucerj;
		}

		public void setDocJucerj(TipoDocumento docJucerj) {
			DocJucerj = docJucerj;
		}

		public TipoDocumento getDocPdbxie() {
			return DocPdbxie;
		}

		public void setDocPdbxie(TipoDocumento docPdbxie) {
			DocPdbxie = docPdbxie;
		}

		public TipoDocumento getDocManda() {
			return DocManda;
		}

		public void setDocManda(TipoDocumento docManda) {
			DocManda = docManda;
		}

		public TipoDocumento getDocOficio() {
			return DocOficio;
		}

		public void setDocOficio(TipoDocumento docOficio) {
			DocOficio = docOficio;
		}

		public TipoDocumento getDocPenho() {
			return DocPenho;
		}

		public void setDocPenho(TipoDocumento docPenho) {
			DocPenho = docPenho;
		}

		public TipoDocumento getDocCitac() {
			return DocCitac;
		}

		public void setDocCitac(TipoDocumento docCitac) {
			DocCitac = docCitac;
		}

		public TipoDocumento getDocNotif() {
			return DocNotif;
		}

		public void setDocNotif(TipoDocumento docNotif) {
			DocNotif = docNotif;
		}

		public TipoDocumento getDocIntima() {
			return DocIntima;
		}

		public void setDocIntima(TipoDocumento docIntima) {
			DocIntima = docIntima;
		}

		public TipoDocumento getDocRCC() {
			return DocRCC;
		}

		public void setDocRCC(TipoDocumento docRCC) {
			DocRCC = docRCC;
		}

		public TipoDocumento getDocNcduin() {
			return DocNcduin;
		}
		
			public TipoDocumento getDocInecf() {
			return DocInecf;
		}

		public void setDocInecf(TipoDocumento docInecf) {
			DocInecf = docInecf;
		}

			public void setDocNcduin(TipoDocumento docNcduin) {
				DocNcduin = docNcduin;
		}
		public TipoDocumento getDocNicmsn() {
			return DocNicmsn;
		}
		public void setDocNicmsn(TipoDocumento docNicmsn) {
			DocNicmsn = docNicmsn;
		}
		public TipoDocumento getDocNicmsc() {
			return DocNicmsc;
		}
		public void setDocNicmsc(TipoDocumento docNicmsc) {
			DocNicmsc = docNicmsc;
		}
		public TipoDocumento getDocCftc() {
			return DocCftc;
		}
		public void setDocCftc(TipoDocumento docCftc) {
			DocCftc = docCftc;
		}
		public TipoDocumento getDocNdam() {
			return DocNdam;
		}
		public void setDocNdam(TipoDocumento docNdam) {
			DocNdam = docNdam;
		}
		public TipoDocumento getDocNdae() {
			return DocNdae;
		}
		public void setDocNdae(TipoDocumento docNdae) {
			DocNdae = docNdae;
		}
		public TipoDocumento getDocNegiss() {
			return DocNegiss;
		}
		public void setDocNegiss(TipoDocumento docNegiss) {
			DocNegiss = docNegiss;
		}
		public TipoDocumento getDocSimp() {
			return DocSimp;
		}
		public void setDocSimp(TipoDocumento docSimp) {
			DocSimp = docSimp;
		}
		public TipoDocumento getDocCtint() {
			return DocCtint;
		}
		public void setDocCtint(TipoDocumento docCtint) {
			DocCtint = docCtint;
		}
		public TipoDocumento getDoctermpo() {
			return Doctermpo;
		}
		public void setDoctermpo(TipoDocumento doctermpo) {
			Doctermpo = doctermpo;
		}
		public TipoDocumento getDocCartrn() {
			return DocCartrn;
		}
		public void setDocCartrn(TipoDocumento docCartrn) {
			DocCartrn = docCartrn;
		}
		
		public TipoDocumento getDocProarq() {
			return DocProarq;
		}
		public void setDocProarq(TipoDocumento docProarq) {
			DocProarq = docProarq;
		}
		public TipoDocumento getDocLbomb() {
			return DocLbomb;
		}
		public void setDocLbomb(TipoDocumento docLbomb) {
			DocLbomb = docLbomb;
		}
		public TipoDocumento getDocPlpuba() {
			return DocPlpuba;
		}
		public void setDocPlpuba(TipoDocumento docPlpuba) {
			DocPlpuba = docPlpuba;
		}
		public TipoDocumento getDocQdrsoc() {
			return DocQdrsoc;
		}
		public void setDocQdrsoc(TipoDocumento docQdrsoc) {
			DocQdrsoc = docQdrsoc;
		}
		public TipoDocumento getDocProtoc() {
			return DocProtoc;
		}
		public void setDocProtoc(TipoDocumento docProtoc) {
			DocProtoc = docProtoc;
		}
		
		public TipoDocumento getDocNit() {
			return DocNit;
		}
		/**
		 * @param docNit the docNit to set
		 */
		public void setDocNit(TipoDocumento docNit) {
			DocNit = docNit;
		}
		public TipoDocumento getDocEnquad() {
			return DocEnquad;
		}
		public void setDocEnquad(TipoDocumento docEnquad) {
			DocEnquad = docEnquad;
		}
/**
		 * @return the docPcv
		 */
		public TipoDocumento getDocPcv() {
			return DocPcv;
		}
		/**
		 * @param docPcv the docPcv to set
		 */
		public void setDocPcv(TipoDocumento docPcv) {
			DocPcv = docPcv;
		}
/**
		 * @return the docRegpro
		 */
		public TipoDocumento getDocRegpro() {
			return DocRegpro;
		}
		/**
		 * @param docRegpro the docRegpro to set
		 */
		public void setDocRegpro(TipoDocumento docRegpro) {
			DocRegpro = docRegpro;
		}
/**
		 * @return the docCompre
		 */
		public TipoDocumento getDocCompre() {
			return DocCompre;
		}
		/**
		 * @param docCompre the docCompre to set
		 */
		public void setDocCompre(TipoDocumento docCompre) {
			DocCompre = docCompre;
		}
/**
		 * @return the docRg
		 */
		public TipoDocumento getDocRg() {
			return DocRg;
		}
		/**
		 * @param docRg the docRg to set
		 */
		public void setDocRg(TipoDocumento docRg) {
			DocRg = docRg;
		}
/**
		 * @return the docCpf
		 */
		public TipoDocumento getDocCpf() {
			return DocCpf;
		}
		/**
		 * @param docCpf the docCpf to set
		 */
		public void setDocCpf(TipoDocumento docCpf) {
			DocCpf = docCpf;
		}
/**
		 * @return the docConloc
		 */
		public TipoDocumento getDocConloc() {
			return DocConloc;
		}
		/**
		 * @param docConloc the docConloc to set
		 */
		public void setDocConloc(TipoDocumento docConloc) {
			DocConloc = docConloc;
		}
/**
		 * @return the docIptu
		 */
		public TipoDocumento getDocIptu() {
			return DocIptu;
		}
		/**
		 * @param docIptu the docIptu to set
		 */
		public void setDocIptu(TipoDocumento docIptu) {
			DocIptu = docIptu;
		}
/**
		 * @return the docTxpubl
		 */
		public TipoDocumento getDocTxpubl() {
			return DocTxpubl;
		}
		/**
		 * @param docTxpubl the docTxpubl to set
		 */
		public void setDocTxpubl(TipoDocumento docTxpubl) {
			DocTxpubl = docTxpubl;
		}
/**
		 * @return the docTxmeca
		 */
		public TipoDocumento getDocTxmeca() {
			return DocTxmeca;
		}
		/**
		 * @param docTxmeca the docTxmeca to set
		 */
		public void setDocTxmeca(TipoDocumento docTxmeca) {
			DocTxmeca = docTxmeca;
		}
/**
		 * @return the docPlpubl
		 */
		public TipoDocumento getDocPlpubl() {
			return DocPlpubl;
		}
		/**
		 * @param docPlpubl the docPlpubl to set
		 */
		public void setDocPlpubl(TipoDocumento docPlpubl) {
			DocPlpubl = docPlpubl;
		}
/**
		 * @return the docSmac
		 */
		public TipoDocumento getDocSmac() {
			return DocSmac;
		}
		/**
		 * @param docSmac the docSmac to set
		 */
		public void setDocSmac(TipoDocumento docSmac) {
			DocSmac = docSmac;
		}
/**
		 * @return the docCtrans
		 */
		public TipoDocumento getDocCtrans() {
			return DocCtrans;
		}
		/**
		 * @param docCtrans the docCtrans to set
		 */
		public void setDocCtrans(TipoDocumento docCtrans) {
			DocCtrans = docCtrans;
		}
/**
		 * @return the docHabite
		 */
		public TipoDocumento getDocHabite() {
			return DocHabite;
		}
		/**
		 * @param docHabite the docHabite to set
		 */
		public void setDocHabite(TipoDocumento docHabite) {
			DocHabite = docHabite;
		}
/**
		 * @return the docCinstc
		 */
		public TipoDocumento getDocCinstc() {
			return DocCinstc;
		}
		/**
		 * @param docCinstc the docCinstc to set
		 */
		public void setDocCinstc(TipoDocumento docCinstc) {
			DocCinstc = docCinstc;
		}
/**
		 * @return the docSmo
		 */
		public TipoDocumento getDocSmo() {
			return DocSmo;
		}
		/**
		 * @param docSmo the docSmo to set
		 */
		public void setDocSmo(TipoDocumento docSmo) {
			DocSmo = docSmo;
		}
/**
		 * @return the docSmtr
		 */
		public TipoDocumento getDocSmtr() {
			return DocSmtr;
		}
		/**
		 * @param docSmtr the docSmtr to set
		 */
		public void setDocSmtr(TipoDocumento docSmtr) {
			DocSmtr = docSmtr;
		}
		public TipoDocumento getDocSanipf() {
			return DocSanipf;
		}
		public void setDocSanipf(TipoDocumento docSanipf) {
			DocSanipf = docSanipf;
		}
		public TipoDocumento getDocCis() {
			return DocCis;
		}
		public void setDocCis(TipoDocumento docCis) {
			DocCis = docCis;
		}
		public TipoDocumento getDocBxalv() {
			return DocBxalv;
		}
		public void setDocBxalv(TipoDocumento docBxalv) {
			DocBxalv = docBxalv;
		}
		public TipoDocumento getDocSanipj() {
			return DocSanipj;
		}
		public void setDocSanipj(TipoDocumento docSanipj) {
			DocSanipj = docSanipj;
		}
		public TipoDocumento getDocBxiss() {
			return DocBxiss;
		}
		public void setDocBxiss(TipoDocumento docBxiss) {
			DocBxiss = docBxiss;
		}
		public TipoDocumento getDocFincad() {
			return DocFincad;
		}
		public void setDocFincad(TipoDocumento docFincad) {
			DocFincad = docFincad;
		}
		public TipoDocumento getDocAlvara() {
			return DocAlvara;
		}
		public void setDocAlvara(TipoDocumento docAlvara) {
			DocAlvara = docAlvara;
		}
/**
		 * @return the docCertcb
		 */
		public TipoDocumento getDocCertcb() {
			return DocCertcb;
		}
		/**
		 * @param docCertcb the docCertcb to set
		 */
		public void setDocCertcb(TipoDocumento docCertcb) {
			DocCertcb = docCertcb;
		}
/**
		 * @return the docLdexcb
		 */
		public TipoDocumento getDocLdexcb() {
			return DocLdexcb;
		}
		/**
		 * @param docLdexcb the docLdexcb to set
		 */
		public void setDocLdexcb(TipoDocumento docLdexcb) {
			DocLdexcb = docLdexcb;
		}
/**
		 * @return the docInsest
		 */
		public TipoDocumento getDocInsest() {
			return DocInsest;
		}
		/**
		 * @param docInsest the docInsest to set
		 */
		public void setDocInsest(TipoDocumento docInsest) {
			DocInsest = docInsest;
		}
/**
		 * @return the docCertbx
		 */
		public TipoDocumento getDocCertbx() {
			return DocCertbx;
		}
		/**
		 * @param docCertbx the docCertbx to set
		 */
		public void setDocCertbx(TipoDocumento docCertbx) {
			DocCertbx = docCertbx;
		}
/**
		 * @return the docCnpj
		 */
		public TipoDocumento getDocCnpj() {
			return DocCnpj;
		}
		/**
		 * @param docCnpj the docCnpj to set
		 */
		public void setDocCnpj(TipoDocumento docCnpj) {
			DocCnpj = docCnpj;
		}
/**
		 * @return the docEstat
		 */
		public TipoDocumento getDocEstat() {
			return DocEstat;
		}
		/**
		 * @param docEstat the docEstat to set
		 */
		public void setDocEstat(TipoDocumento docEstat) {
			DocEstat = docEstat;
		}
/**
		 * @return the docParal
		 */
		public TipoDocumento getDocParal() {
			return DocParal;
		}
		/**
		 * @param docParal the docParal to set
		 */
		public void setDocParal(TipoDocumento docParal) {
			DocParal = docParal;
		}
/**
		 * @return the docLavpal
		 */
		public TipoDocumento getDocLavpal() {
			return DocLavpal;
		}
		/**
		 * @param docLavpal the docLavpal to set
		 */
		public void setDocLavpal(TipoDocumento docLavpal) {
			DocLavpal = docLavpal;
		}
/**
		 * @return the docProinc
		 */
		public TipoDocumento getDocProinc() {
			return DocProinc;
		}
		/**
		 * @param docProinc the docProinc to set
		 */
		public void setDocProinc(TipoDocumento docProinc) {
			DocProinc = docProinc;
		}
/**
		 * @return the docBalreg
		 */
		public TipoDocumento getDocBalreg() {
			return DocBalreg;
		}
		/**
		 * @param docBalreg the docBalreg to set
		 */
		public void setDocBalreg(TipoDocumento docBalreg) {
			DocBalreg = docBalreg;
		}
/**
		 * @return the docReenq
		 */
		public TipoDocumento getDocReenq() {
			return DocReenq;
		}
		/**
		 * @param docReenq the docReenq to set
		 */
		public void setDocReenq(TipoDocumento docReenq) {
			DocReenq = docReenq;
		}
/**
		 * @return the docDesenq
		 */
		public TipoDocumento getDocDesenq() {
			return DocDesenq;
		}
		/**
		 * @param docDesenq the docDesenq to set
		 */
		public void setDocDesenq(TipoDocumento docDesenq) {
			DocDesenq = docDesenq;
		}

/**
		 * @return the docReqemp
		 */
		public TipoDocumento getDocReqemp() {
			return DocReqemp;
		}
		/**
		 * @param docReqemp the docReqemp to set
		 */
		public void setDocReqemp(TipoDocumento docReqemp) {
			DocReqemp = docReqemp;
		}
/**
		 * @return the docAta
		 */
		public TipoDocumento getDocAta() {
			return DocAta;
		}
		/**
		 * @param docAta the docAta to set
		 */
		public void setDocAta(TipoDocumento docAta) {
			DocAta = docAta;
		}
/**
		 * @return the docDist
		 */
		public TipoDocumento getDocDist() {
			return DocDist;
		}
		/**
		 * @param docDist the docDist to set
		 */
		public void setDocDist(TipoDocumento docDist) {
			DocDist = docDist;
		}
/**
		 * @return the docAltcon
		 */
		public TipoDocumento getDocAltcon() {
			return DocAltcon;
		}
		/**
		 * @param docAltcon the docAltcon to set
		 */
		public void setDocAltcon(TipoDocumento docAltcon) {
			DocAltcon = docAltcon;
		}
/**
		 * @return the docConsoc
		 */
		public TipoDocumento getDocConsoc() {
			return DocConsoc;
		}
		/**
		 * @param docConsoc the docConsoc to set
		 */
		public void setDocConsoc(TipoDocumento docConsoc) {
			DocConsoc = docConsoc;
		}
//-------------------------------------------------------------------------------------------------

		public ArrayList<TipoDocumento> getTiposDocJu() {
			return TiposDocJu;
		}

		public void setTiposDocJu(ArrayList<TipoDocumento> tiposDocJu) {
			TiposDocJu = tiposDocJu;
		}
		
		public Organizacao getCertd() {
			return Certd;
		}
		
		public void setCertd(Organizacao certd) {
			Certd = certd;
		}
		
		public Organizacao getDocJu() {
			return DocJu;
		}

		public void setDocJu(Organizacao docJu) {
			DocJu = docJu;
		}
		
		
		public Organizacao getDvrs() {
			return Dvrs;
		}

		public void setDvrs(Organizacao dvrs) {
			Dvrs = dvrs;
		}

		/**
		 * @return the mun
		 */
		public Organizacao getMun() {
			return Mun;
		}

		/**
		 * @param mun the mun to set
		 */
		public void setMun(Organizacao mun) {
			Mun = mun;
		}

		/**
		 * @return the est
		 */
		public Organizacao getEst() {
			return Est;
		}

		/**
		 * @param est the est to set
		 */
		public void setEst(Organizacao est) {
			Est = est;
		}

		/**
		 * @return the fed
		 */
		public Organizacao getFed() {
			return Fed;
		}

		/**
		 * @param fed the fed to set
		 */
		public void setFed(Organizacao fed) {
			Fed = fed;
		}

		/**
		 * @return the atos
		 */
		public Organizacao getAtos() {
			return Atos;
		}

		/**
		 * @param atos the atos to set
		 */
		public void setAtos(Organizacao atos) {
			Atos = atos;
		}
		public ArrayList<Organizacao> getOrganizacoes() {
			return organizacoes;
		}
		public void setOrganizacoes(ArrayList<Organizacao> organizacoes) {
			this.organizacoes = organizacoes;
		}
		public Unidade getSoc() {
			return soc;
		}
		public void setSoc(Unidade soc) {
			this.soc = soc;
		}	
}
