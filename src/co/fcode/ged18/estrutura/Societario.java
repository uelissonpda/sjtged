package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;
import java.util.Collections;
import co.fcode.ged18.*;

public class Societario {
//-------------------VARIÁVEIS TIPOS DE ORGANIZAÇÃO-------------------//
	
		private Organizacao Atos; // ATOS
		private Organizacao Fed;  // FEDERAL
		private Organizacao Est;  // ESTADUAL
		private Organizacao Mun;  // MUNICIPAL
		private Organizacao Dvrs; // DIVERSOS
		private Organizacao Certd;// CERTIDÕES
		private Organizacao DocJu;// DOCUMENTOS JUDICIAIS

//-----------------------FIM DA DECLARAÇÃO----------------------------//

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
			
		private TipoDocumento DocConsoc; // CONTRATO SOCIAL 
		private TipoDocumento DocAltcon; // ALTERAÇÃO CONTRATUAL
		private TipoDocumento DocDist;   // DISTRATO
		private TipoDocumento DocAta;    // ATA DE REUNIÃO/ASSEMBLÉIA
		private TipoDocumento DocReqemp; // REQUERIMENTO DE EMPRESÁRIO
		private TipoDocumento DocEnquad; // ENQUADRAMENTO
		private TipoDocumento DocDesenq; // DESENQUADRAMENTO 
		private TipoDocumento DocReenq;  // REENQUADRAMENTO
		private TipoDocumento DocBalreg; // BALANÇO REGISTRADO
		private TipoDocumento DocProinc; // PROTOCOLO E JUSTIFICAÇÃO 
		private TipoDocumento DocParal;  // PARALISAÇÃO
		private TipoDocumento DocLavpal; // LAUDO DE AVALIAÇÃO DO PATRIMÔNIO LÍQUIDO
		private TipoDocumento DocEstat;  // ESTATUTO 
		private TipoDocumento DocCnpj;   // CNPJ
		private TipoDocumento DocCertbx;   // CNPJ
		private TipoDocumento DocSinale; // SINALEIRA
		private TipoDocumento DocInsest; // INSCRIÇÃO ESTADUAL
		private TipoDocumento DocLdexcb; // CERTIDÃO DE BAIXA DA INSCRIÇÃO ESTADUAL
		private TipoDocumento DocCertcb; // CERTIF DE APROVAÇÃO DO CORPO DE BOMBEIROS
		private TipoDocumento DocAlvara; // ALVARÁ
		private TipoDocumento DocFincad; // FICHA DE INFORMAÇÕES CADASTRAIS
		private TipoDocumento DocBxiss;  // MEMORANDO DE BAIXA ISS
		private TipoDocumento DocBxalv;  // ALVARÁ BAIXADO
		private TipoDocumento DocSanipj; // TERMO DE LICENÇA DE FUNCIONAMENTO SANITÁRIO
		private TipoDocumento DocCis;    // CERTIFICADO DE INSPEÇÃO SANITÁRIA
		private TipoDocumento DocSanipf; // TERMO DE ASSENTIMENTO SANITÁRIO
		private TipoDocumento DocSmtr;   // CERTIDÃO DE ASSESSIBILIDADE 
		private TipoDocumento DocSmo;    // DECLARAÇÃO DE REBAIXAMENTO DE MEIO FIO
		private TipoDocumento DocCinstc; // CERTIDÃO DE INSTALAÇÃO COMERCIAL
		private TipoDocumento DocHabite; // HABITE-SE 
		private TipoDocumento DocCtrans; // CERTIDÃO DE TRANSFORMAÇÃO DE USO
		private TipoDocumento DocSmac;   // REQUERIMENTO DE MEIO AMBIENTE 
		private TipoDocumento DocPlpubl; // PLANTA DE AUTORIZAÇÃO DE PUBLICIDADE: Baixada
		private TipoDocumento DocPlpuba; // PLANTA DE AUTORIZAÇÃO DE PUBLICIDADE: Autorizada
		private TipoDocumento DocTxmeca; // TAXA DE MESAS E CADEIRAS 
		private TipoDocumento DocTxpubl; // TAXA DE PUBLICIDADE 
		private TipoDocumento DocIptu;   // IPTU 
		private TipoDocumento DocConloc; // CONTRATO DE LOCAÇÃO 
		private TipoDocumento DocCpf;    // CPF DOS SÓCIOS
		private TipoDocumento DocRg;     // RG DOS SÓCIOS
		private TipoDocumento DocCompre; // COMPROVANTE DE RESIDÊNCIA DOS SÓCIOS
		private TipoDocumento DocRegpro; // REGISTRO PROFISSIONAL 
		private TipoDocumento DocPcv;    // PROMESSA DE COMPRA E VENDA
		private TipoDocumento DocNit;    // NIT - NUMERO DE INSCRIÇÃO DO TRABALHADOR/SÓCIO
		private TipoDocumento DocProtoc; // PROTOCOLO
		private TipoDocumento DocQdrsoc; // QUADRO SOCIETÁRIO
		private TipoDocumento DocLbomb;  // LAUDO DE EXIGÊNCIAS DO CORPO DE BOMBEIROS
		private TipoDocumento DocProarq; // PROJETO ARQUITETÔNICO APROVADO
		private TipoDocumento DocCartrn; // CARTA DE RENÚNCIA
		private TipoDocumento Doctermpo; // TERMO DE POSSE
		private TipoDocumento DocCtint;  // CERTIDÃO INTEIRO TEOR - JUCERJA
		private TipoDocumento DocSimp; // CERTIDÃO SIMPLIFICADA - JUCERJA
		private TipoDocumento DocNegiss; // CERTIDÃO NEGATIVA ISS
		private TipoDocumento DocNdae; // CERTIDÃO NEG. DIVIDA ATIVA DO ESTADO
		private TipoDocumento DocNdam; // CERTIDÃO NEG. DIVIDA ATIVA DO MUNICÍPIO
		private TipoDocumento DocNicmsc; // CERTIDÃO NEG. ICMS - CONTRIBUINTE
		private TipoDocumento DocNicmsn; // CERTIDÃO NEG. ICMS - NÃO CONTRIBUINTE
		private TipoDocumento DocNcduin; // CERTIDÃO NEGATIVA CONJUNTA DE TRIBUTOS FEDERAIS|DIVIDA ATIVA DA UNIÃO|INSS
		private TipoDocumento DocInecf; // INFORMAÇÕES ECF
		private TipoDocumento DocRCC; //  RCC
		private TipoDocumento DocIntima; // INTIMAÇÃO
		private TipoDocumento DocNotif; // NOTIFICAÇÃO
		private TipoDocumento DocCitac; // CITAÇÃO
		private TipoDocumento DocPenho; // PENHORA
		private TipoDocumento DocOficio; // OFÍCIO
		private TipoDocumento DocManda; // MANDADO
		private TipoDocumento DocPdbxie; // PEDIDO DE BAIXA DE INSCRIÇÃO ESTADUAL
		private TipoDocumento DocJucerj; // PROCURAÇÃO JUCERJA
		private TipoDocumento DocCnhsoc; // CNH OS SÓCIOS
		private TipoDocumento DocCecaso; // CERTIDÃO DE CASAMENTO DOS SÓCIOS
		private TipoDocumento DocCoprse; // CONTRATO DE PRESTAÇÃO DE SERVIÇO
		private TipoDocumento DocAutome; // AUTORIZAÇÃO DE MESAS E CADEIRAS
		private TipoDocumento DocPlmeca; // PLANTA DE MESAS E CADEIRAS
		private TipoDocumento DocDivers; // DIVERSOS
		private TipoDocumento DocCei; 	 // CEI
		private TipoDocumento DocTis;	 // TAXA DE INSPEÇÃO SANITÁRIA
		private TipoDocumento DocLdd;	 // LIVRO DIÁRIO DIGITAL
		private TipoDocumento DocSepd;   // DEFERIMENTO SEPD
		private TipoDocumento DocReatv;  // REATIVAÇÃO DA SOCIEDADE
		private TipoDocumento DocProco;  // PROCON
		private TipoDocumento DocCertbi; // PROCON
		private TipoDocumento DocFicha;	 // FICHA DE INFORMAÇÕES
		private TipoDocumento DocCertD;	 // CERTIFICADO DE DESPACHO
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
		private ArrayList<TipoDocumento> TiposAtos; // TIPOS ATOS
		private ArrayList<TipoDocumento> TiposFed; // TIPOS FEDERAL
		private ArrayList<TipoDocumento> TiposEst; // TIPOS ESTADUAL
		private ArrayList<TipoDocumento> TiposMun; // TIPOS MUNICIPAL
		private ArrayList<TipoDocumento> TiposDvrs; // TIPOS DIVERSOS
		private ArrayList<TipoDocumento> TiposCertd; // TIPOS CERTIDÕES
		private ArrayList<TipoDocumento> TiposDocJu; // TIPOS DOCUMENTOS JUDICIAIS
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
		private ArrayList<Organizacao> organizacoes;
		private Unidade soc;
			
		public Societario(){
			setDocConsoc(new TipoDocumento(1,"Contrato Social","CONSOC"));
			setDocAltcon(new TipoDocumento(2,"Alteração Contratual","ALTCON"));
			setDocDist(new TipoDocumento(3,"Distrato","DIST"));
			setDocAta(new TipoDocumento(4,"Ata de Reunião-Assembleia","ATA"));
			setDocReqemp(new TipoDocumento(5,"Requerimento de Empresário","REQEMP"));
			setDocEnquad(new TipoDocumento(6, "Enquadramento", "ENQUAD"));
			setDocDesenq(new TipoDocumento(7,"Desenquadramento","DESENQ"));
			setDocReenq(new TipoDocumento(8,"Reequadramento","REENQ"));
			setDocBalreg(new TipoDocumento(9,"Balanço Registrado","BALREG"));
			setDocProinc(new TipoDocumento(10,"Protocolo e Justificação","PROINC"));
			setDocParal(new TipoDocumento(11,"Paralisação","PARAL"));
			setDocLavpal(new TipoDocumento(12,"Laudo de Avaliação do Patrimônio Líquido","LAVPAL"));
			setDocEstat(new TipoDocumento(13,"Estatuto","ESTAT"));
			setDocCnpj(new TipoDocumento(14,"CNPJ","CNPJ"));
			setDocCertbx(new TipoDocumento(15, "Certidão de Baixa", "CERTBX"));
			setDocInsest(new TipoDocumento(16, "Inscrição Estadual", "INSEST"));
			setDocLdexcb(new TipoDocumento(17, "Certidão de Baixa de Inscrição Estadual", "LDEXCB"));
			setDocCertcb(new TipoDocumento(18, "Certificado de Aprovação do Corpo de Bombeiros", "CERTCB"));
			setDocAlvara(new TipoDocumento(19, "Alvará", "ALVARA"));
			setDocFincad(new TipoDocumento(20, "Ficha de Informações Cadastrais", "FINCAD"));
			setDocBxiss(new TipoDocumento(21, "Memorando de Baixa Iss", "BXISS"));
			setDocBxalv(new TipoDocumento(22, "Alvará Baixado", "BXALV"));
			setDocSanipj(new TipoDocumento(23, "Termo de Licença de Funcionamento Sanitário", "SANIPJ"));
			setDocCis(new TipoDocumento(24, "Certificado de Inspeção Sanitária", "CIS"));
			setDocSanipf(new TipoDocumento(25, "Termo de Assentimento Sanitário", "SANIPF"));
			setDocSmtr(new TipoDocumento(26, "Certidão de Acessibilidade", "SMTR"));
			setDocSmo(new TipoDocumento(27, "Declaração de Rebaixamento de Meio Fio", "SMO"));
			setDocCinstc(new TipoDocumento(28, "Certidão de Instalação Comercial", "CINSCT"));
			setDocHabite(new TipoDocumento(29, "Habite-se", "HABITE"));
			setDocCtrans(new TipoDocumento(30, "Certidão de Transformação de Uso", "CTRANS"));
			setDocSmac(new TipoDocumento(31, "Requerimento de Meio Ambiente", "SMAC"));
			setDocPlpubl(new TipoDocumento(32, "Publicidade Baixada", "PLPUBL"));
			setDocTxmeca(new TipoDocumento(33, "Taxa de Mesas e Cadeiras", "TXMECA"));
			setDocTxpubl(new TipoDocumento(34, "Taxa de Publicidade", "TXPUBL"));
			setDocIptu(new TipoDocumento(35, "Iptu", "IPTU"));
			setDocConloc(new TipoDocumento(36, "Contrato de Locação", "CONLOC"));
			setDocCpf(new TipoDocumento(37, "Cpf dos Sócios", "CPF"));
			setDocRg(new TipoDocumento(38, "Rg dos Sócios", "RG"));
			setDocCompre(new TipoDocumento(39, "Comprovante de Residência dos Sócios", "COMPRE"));
			setDocRegpro(new TipoDocumento(40, "Registro Profissional", "REGPRO"));
			setDocPcv(new TipoDocumento(41, "Promessa de Compra e Venda", "PCV"));
			setDocNit(new TipoDocumento(42, "Número de Inscrição do Trabalhador-Sócio", "NIT"));
			setDocProtoc(new TipoDocumento(43, "Protocolo", "PROTOC"));
			setDocQdrsoc(new TipoDocumento(44, "Quadro Societário", "QDRSOC"));
			setDocPlpuba(new TipoDocumento(45, "Publicidade Aprovada", "PLPUBL"));
			setDocLbomb(new TipoDocumento(46, "Laudo de Exigências do Corpo de Bombeiros","LBOMB"));
			setDocProarq(new TipoDocumento(47,"Projeto Arquitetônico Aprovado","PROARQ"));
			setDocCartrn(new TipoDocumento(48, "Carta de Renúncia","CARTRN"));
			setDoctermpo(new TipoDocumento(49, "Termo de Posse","TERMPO"));
			setDocCtint(new TipoDocumento(50, "Certidão Inteiro Teor - JUCERJA","CTINT"));
			setDocSimp(new TipoDocumento(51, "Certidão Simplificada - JUCERJA","SIMP"));
			setDocNegiss(new TipoDocumento(52, "Certidão Negativa ISS","NEGISS"));
			setDocNdae(new TipoDocumento(53, "Certidão Neg. Divida Ativa do Estado","NDAE"));
			setDocNdam(new TipoDocumento(54, "Certidão Neg. Divida Ativa do Município","NDAM"));
			setDocSinale(new TipoDocumento(55, "Sinaleira", "SINALE"));			
			setDocNicmsc(new TipoDocumento(56, "Certidão Neg. ICMS - Contribuinte","NICMSC"));
			setDocNicmsn(new TipoDocumento(57, "Certidão Neg. ICMS - Não contribuinte","NICMSN"));
			setDocNcduin(new TipoDocumento(58, "Certidão Negativa Conjunta de Tributos Federais-Divida Ativa da União-INSS","NCDUIN"));
			setDocInecf(new TipoDocumento(59, "Informações ECF", "INECF"));
			setDocRCC(new TipoDocumento(60, "RCC", "RCC"));
			setDocNotif(new TipoDocumento(61, "Notificações", "NOTIF"));
			setDocCitac(new TipoDocumento(62, "Citação", "CITAC"));
			setDocPenho(new TipoDocumento(63, "Penhora", "PENHO"));
			setDocOficio(new TipoDocumento(64, "Ofício", "OFICIO"));
			setDocManda(new TipoDocumento(65, "Mandado", "MANDA"));
			setDocPdbxie(new TipoDocumento(66, "Pedido de Baixa de Inscrição Estadual", "PDBXIE"));
			setDocJucerj(new TipoDocumento(67, "Procuração Jucerja", "JUCERJ"));
			setDocCnhsoc(new TipoDocumento(68, "CNH dos Sócios","CNHSOC"));
			setDocCecaso(new TipoDocumento(69, "Certidão de Casamento dos Sócios", "CECASO"));
			setDocCoprse(new TipoDocumento(70, "Certificado de Prestação de Serviço", "COPRSE"));
			setDocAutome(new TipoDocumento(71, "Autorização de Mesas e Cadeiras", "AUTOME"));
			setDocPlmeca(new TipoDocumento(72, "Planta de Mesas e Cadeiras", "PLMECA"));
			setDocDivers(new TipoDocumento(73, "Diversos", "DIVERS"));
			setDocCei(new TipoDocumento(74, "CEI", "CEI"));
			setDocTis(new TipoDocumento(75, "Taxa de Inspeção Sanitária", "TIS"));
			setDocLdd(new TipoDocumento(76, "Livro Diário Digital", "LDD"));
			setDocSepd(new TipoDocumento(77, "Deferimento SEPD", "SEPD"));
			setDocReatv(new TipoDocumento(78, "Reativação da Sociedade", "REATV)"));
			setDocProco(new TipoDocumento(78, "PROCON", "PROCO"));
			setDocCertbi(new TipoDocumento(79, "Certidão de Baixa da Inscrição Municipal","CERTBI"));
			setDocFicha(new TipoDocumento(80, "Ficha de Informações", "FICHA"));
			setDocCertD(new TipoDocumento(81, "Certificado de Despacho", "CERTD"));
		
			
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
			TiposAtos.add(getDocLdd());
			TiposAtos.add(getDocReatv());
			
			TiposFed.add(getDocCnpj());
			TiposFed.add(getDocCertbx());
			TiposFed.add(getDocProtoc());
			TiposFed.add(getDocQdrsoc());
			TiposFed.add(getDocDivers());
			TiposFed.add(getDocCei());
			TiposFed.add(getDocNit());
			
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
			TiposEst.add(getDocSepd());
			TiposEst.add(getDocProco());
			TiposEst.add(getDocFicha());
			TiposEst.add(getDocCertD());
			
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
			TiposMun.add(getDocAutome());
			TiposMun.add(getDocPlmeca());
			TiposMun.add(getDocSinale());
			TiposMun.add(getDocTis());
			TiposMun.add(getDocCertbi());
						
			TiposDvrs.add(getDocConloc());
			TiposDvrs.add(getDocCpf());
			TiposDvrs.add(getDocRg());
			TiposDvrs.add(getDocCompre());
			TiposDvrs.add(getDocRegpro());
			TiposDvrs.add(getDocPcv());
			TiposDvrs.add(getDocNit());
			TiposDvrs.add(getDocRCC());
			TiposDvrs.add(getDocCnhsoc());
			TiposDvrs.add(getDocCecaso());
			
			TiposCertd.add(getDocCtint());
			TiposCertd.add(getDocSimp());
			TiposCertd.add(getDocNegiss());
			TiposCertd.add(getDocNdae());
			TiposCertd.add(getDocNdam());
			TiposCertd.add(getDocNicmsc());
			TiposCertd.add(getDocNicmsn());
			TiposCertd.add(getDocNcduin());
			
			TiposDocJu.add(getDocAlvara());
			TiposDocJu.add(getDocCitac());
			TiposDocJu.add(getDocPenho());
			TiposDocJu.add(getDocOficio());
			TiposDocJu.add(getDocManda());
			TiposDocJu.add(getDocCoprse());
					
			
			setAtos(new Organizacao(1,"Atos","ATOS",TiposAtos));
			setFed(new Organizacao(2,"Federal","FED",TiposFed));
			setEst(new Organizacao(3,"Estadual","EST",TiposEst));
			setMun(new Organizacao(4,"Municipal","MUN",TiposMun));
			setDvrs(new Organizacao(5,"Diversos","DVRS",TiposDvrs));
			setCertd(new Organizacao(6, "Certidões","CERTD", TiposCertd));
			setDocJu(new Organizacao(7,"Documentos Judiciais","DOCJU", TiposDocJu));
			
			setOrganizacoes(new ArrayList<Organizacao>());
			getOrganizacoes().add(getAtos());
			getOrganizacoes().add(getFed());
			getOrganizacoes().add(getEst());
			getOrganizacoes().add(getMun());
			getOrganizacoes().add(getDvrs());
			getOrganizacoes().add(getCertd());
			getOrganizacoes().add(getDocJu());
			
			setSoc(new Unidade(5,"Societário","SC",getOrganizacoes()));
			
			/* Organização dos Arrays em Ordem Crescente! - Fellipe Pimentel */
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
		
		public TipoDocumento getDocCertD() {
			return DocCertD;
		}

		public void setDocCertD(TipoDocumento docCertD) {
			DocCertD = docCertD;
		}

		public TipoDocumento getDocFicha() {
			return DocFicha;
		}

		public void setDocFicha(TipoDocumento docFicha) {
			DocFicha = docFicha;
		}

		public TipoDocumento getDocCertbi() {
			return DocCertbi;
		}

		public void setDocCertbi(TipoDocumento docCertbi) {
			DocCertbi = docCertbi;
		}

		public TipoDocumento getDocLdd() {
			return DocLdd;
		}

		public TipoDocumento getDocSepd() {
			return DocSepd;
		}

		public TipoDocumento getDocReatv() {
			return DocReatv;
		}

		public TipoDocumento getDocProco() {
			return DocProco;
		}

		public void setDocProco(TipoDocumento docProco) {
			DocProco = docProco;
		}

		public void setDocReatv(TipoDocumento docReatv) {
			DocReatv = docReatv;
		}

		public void setDocSepd(TipoDocumento docSepd) {
			DocSepd = docSepd;
		}

		public void setDocLdd(TipoDocumento docLdd) {
			DocLdd = docLdd;
		}

		public TipoDocumento getDocTis() {
			return DocTis;
		}

		public void setDocTis(TipoDocumento docTis) {
			DocTis = docTis;
		}

		public TipoDocumento getDocCei() {
			return DocCei;
		}

		public void setDocCei(TipoDocumento docCei) {
			DocCei = docCei;
		}

		public TipoDocumento getDocDivers() {
			return DocDivers;
		}

		public void setDocDivers(TipoDocumento docDivers) {
			DocDivers = docDivers;
		}

		public TipoDocumento getDocCoprse() {
			return DocCoprse;
		}

		public void setDocCoprse(TipoDocumento docCoprse) {
			DocCoprse = docCoprse;
		}

		public TipoDocumento getDocCecaso() {
			return DocCecaso;
		}

		public void setDocCecaso(TipoDocumento docCecaso) {
			DocCecaso = docCecaso;
		}

		public TipoDocumento getDocCnhsoc() {
			return DocCnhsoc;
		}

		public void setDocCnhsoc(TipoDocumento docCnhsoc) {
			DocCnhsoc = docCnhsoc;
		}

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
		public TipoDocumento getDocSinale() {
			return DocSinale;
		}
		/**
		 * @param docCertbx the docCertbx to set
		 */
		public void setDocSinale(TipoDocumento docSinale) {
			DocSinale = docSinale;
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
		
		public TipoDocumento getDocAutome() {
			return DocAutome;
		}

		public void setDocAutome(TipoDocumento docAutome) {
			DocAutome = docAutome;
		}

		public TipoDocumento getDocPlmeca() {
			return DocPlmeca;
		}

		public void setDocPlmeca(TipoDocumento docPlmeca) {
			DocPlmeca = docPlmeca;
		}

		public TipoDocumento getDocCertbx() {
			return DocCertbx;
		}

		public void setDocCertbx(TipoDocumento docCertbx) {
			DocCertbx = docCertbx;
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
