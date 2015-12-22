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

//-----------------------FIM DA DECLARAÇÃO----------------------------//

//-------------------VARIÁVEIS TIPOS DE DOCUMENTOS-------------------//
			
		private TipoDocumento DocConsoc; // CONTRATO SOCIAL 
		private TipoDocumento DocAltcon; // ALTERAÇÃO CONTRATUAL
		private TipoDocumento DocDist;   // DISTRATO
		private TipoDocumento DocAta;    // ATA DE REUNIÃO/ASSEMBLÉIA
		private TipoDocumento DocReqemp; // REQUERIMENTO DE EMPRESÁRIO
		private TipoDocumento DocEnq;    // ENQUADRAMENTO
		private TipoDocumento DocDesenq; // DESENQUADRAMENTO 
		private TipoDocumento DocReenq;  // REENQUADRAMENTO
		private TipoDocumento DocBalreg; // BALANÇO REGISTRADO
		private TipoDocumento DocProinc; // PROTOCOLO E JUSTIFICAÇÃO 
		private TipoDocumento DocParal;  // PARALISAÇÃO
		private TipoDocumento DocLavpal; // LAUDO DE AVALIAÇÃO DO PATRIMÔNIO LÍQUIDO
		private TipoDocumento DocEstat;  // ESTATUTO 
		private TipoDocumento DocCnpj;   // CNPJ
		private TipoDocumento DocCertbx; // CERTIDÃO DE BAIXA
		private TipoDocumento DocInsest; // INSCRIÇÃO ESTADUAL
		private TipoDocumento DocLdexcb; // CERTIDÃO DE BAIXA DA INSCRIÇÃO ESTADUAL
		private TipoDocumento DocCertcb; // CERTIF DE APROVAÇÃO DO CORPO DE BOMBEIROS
		private TipoDocumento DocAlvara; // ALVARÁ
		private TipoDocumento DocFincad; // FICHA DE INFORMAÇÕES CADASTRAIS
		private TipoDocumento DocBxiss;  // MEMORANDO DE BAIXA ISS
		private TipoDocumento DocBxalv;  // BAIXA DO ALVARÁ
		private TipoDocumento DocSanipj; // TERMO DE LICENÇA DE FUNCIONAMENTO SANITÁRIO
		private TipoDocumento DocCis;    // CERTIFICADO DE INSPEÇÃO SANITÁRIA
		private TipoDocumento DocSanipf; // TERMO DE ASSENTIMENTO SANITÁRIO
		private TipoDocumento DocSmtr;   // CERTIDÃO DE ASSESSIBILIDADE 
		private TipoDocumento DocSmo;    // DECLARAÇÃO DE REBAIXAMENTO DE MEIO FIO
		private TipoDocumento DocCinstc; // CERTIDÃO DE INSTALAÇÃO COMERCIAL
		private TipoDocumento DocHabite; // HABITE-SE 
		private TipoDocumento DocCtrans; // CERTIDÃO DE TRANSFORMAÇÃO DE USO
		private TipoDocumento DocSmac;   // REQUERIMENTO DE MEIO AMBIENTE 
		private TipoDocumento DocPlpubl; // PLANTA DE AUTORIZAÇÃO DE PUBLICIDADE 
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
		private TipoDocumento DocEnquad; // ENQUADRAMENTO
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
		private ArrayList<TipoDocumento> TiposAtos; // TIPOS ATOS
		private ArrayList<TipoDocumento> TiposFed; // TIPOS FEDERAL
		private ArrayList<TipoDocumento> TiposEst; // TIPOS ESTADUAL
		private ArrayList<TipoDocumento> TiposMun; // TIPOS MUNICIPAL
		private ArrayList<TipoDocumento> TiposDvrs; // TIPOS DIVERSOS
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
		private ArrayList<Organizacao> organizacoes;
		private Unidade soc;
			
		public Societario(){
			setDocConsoc(new TipoDocumento(1,"Contrato Social",""));
			setDocAltcon(new TipoDocumento(2,"Alteração Contratual",""));
			setDocDist(new TipoDocumento(3,"Distrato",""));
			setDocAta(new TipoDocumento(4,"Ata de Reunião-Assembleia",""));
			setDocReqemp(new TipoDocumento(5,"Requerimento de Empresário",""));
			setDocEnq(new TipoDocumento(6,"Enquadramento",""));
			setDocDesenq(new TipoDocumento(7,"Desenquadramento",""));
			setDocReenq(new TipoDocumento(8,"Reequadramento",""));
			setDocBalreg(new TipoDocumento(9,"Balanço Registrado",""));
			setDocProinc(new TipoDocumento(10,"Protocolo e Justificação",""));
			setDocParal(new TipoDocumento(11,"Paralisação",""));
			setDocLavpal(new TipoDocumento(12,"Laudo de Avaliação do Patrimônio Líquido",""));
			setDocEstat(new TipoDocumento(13,"Estatuto",""));
			setDocCnpj(new TipoDocumento(14,"CNPJ","CNPJ"));
			setDocCertbx(new TipoDocumento(15, "Certidão de Baixa", "CERTBX"));
			setDocInsest(new TipoDocumento(16, "Inscrição Estadual", "INSEST"));
			setDocLdexcb(new TipoDocumento(17, "Certidão de Baixa de Inscrição Estadual", "LDEXCB"));
			setDocCertcb(new TipoDocumento(18, "Certificado de Aprovação do Corpo de Bombeiros", "CERTCB"));
			setDocAlvara(new TipoDocumento(19, "Alvará", "ALVARA"));
			setDocFincad(new TipoDocumento(20, "Ficha de Informações Cadastrais", "FINCAD"));
			setDocBxiss(new TipoDocumento(21, "Memorando de Baixa Iss", "BXISS"));
			setDocBxalv(new TipoDocumento(22, "Baixa do Alvará", "BXALV"));
			setDocSanipj(new TipoDocumento(23, "Termo de Licensa de Funcionamento Sanitário", "SANIPJ"));
			setDocCis(new TipoDocumento(24, "Certificado de Inspeção Sanitária", "CIS"));
			setDocSanipf(new TipoDocumento(25, "Termo de Assentimento Sanitário", "SANIPF"));
			setDocSmtr(new TipoDocumento(26, "Certidão de Acessibilidade", "SMTR"));
			setDocSmo(new TipoDocumento(27, "Declaração de Rebaixamento de Meio Fio", "SMO"));
			setDocCinstc(new TipoDocumento(28, "Certidão de Instalação Comercial", "CINSCT"));
			setDocHabite(new TipoDocumento(29, "Habite-se", "HABITE"));
			setDocCtrans(new TipoDocumento(30, "Certidão de Transformação de Uso", "CTRANS"));
			setDocSmac(new TipoDocumento(31, "Requerimento de Meio Ambiente", "SMAC"));
			setDocPlpubl(new TipoDocumento(32, "Planta de Autorização de Publicidade", "PLPUBL"));
			setDocTxmeca(new TipoDocumento(33, "Taxa de Mesas e Cadeiras", "TXMECA"));
			setDocTxpubl(new TipoDocumento(34, "Taxa de Publicidade", "TXPUBL"));
			setDocIptu(new TipoDocumento(35, "Iptu", "IPTU"));
			setDocConloc(new TipoDocumento(36, "Contrato de Locação", "CONLOC"));
			setDocCpf(new TipoDocumento(37, "Cpf dos Sócios", "CPF"));
			setDocRg(new TipoDocumento(38, "Rg dos Sócios", "RG"));
			setDocCompre(new TipoDocumento(39, "Comprovante de Residência dos Sócios", "COMPRE"));
			setDocRegpro(new TipoDocumento(40, "Registro Profissional", "REGPRO"));
			setDocPcv(new TipoDocumento(41, "Promessa de Compra e Venda", "PCV"));
			setDocNit(new TipoDocumento(42, "Número de Inscrição do Trabalhador-Sócio", ""));
			setDocEnquad(new TipoDocumento(43, "Enquadramento", "ENQUAD"));
			
			setTiposAtos(new ArrayList<TipoDocumento>());
			setTiposFed(new ArrayList<TipoDocumento>());
			setTiposEst(new ArrayList<TipoDocumento>());
			setTiposMun(new ArrayList<TipoDocumento>());
			setTiposDvrs(new ArrayList<TipoDocumento>());
			
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
			
			TiposFed.add(getDocCnpj());
			TiposFed.add(getDocCertbx());
			
			TiposEst.add(getDocInsest());
			TiposEst.add(getDocParal());
			TiposEst.add(getDocCertbx());
			TiposEst.add(getDocLdexcb());
			TiposEst.add(getDocCertcb());
			
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
			TiposMun.add(getDocTxmeca());
			TiposMun.add(getDocTxpubl());
			TiposMun.add(getDocIptu());
			
			TiposDvrs.add(getDocConloc());
			TiposDvrs.add(getDocCpf());
			TiposDvrs.add(getDocRg());
			TiposDvrs.add(getDocCompre());
			TiposDvrs.add(getDocRegpro());
			TiposDvrs.add(getDocPcv());
			TiposDvrs.add(getDocNit());
			
			setAtos(new Organizacao(1,"Atos","ATOS",TiposAtos));
			setFed(new Organizacao(2,"Federal","FED",TiposFed));
			setEst(new Organizacao(3,"Estadual","EST",TiposEst));
			setMun(new Organizacao(4,"Municipal","MUN",TiposMun));
			setDvrs(new Organizacao(5,"Diversos","DVRS",TiposDvrs));
			
			setOrganizacoes(new ArrayList<Organizacao>());
			getOrganizacoes().add(getAtos());
			getOrganizacoes().add(getFed());
			getOrganizacoes().add(getEst());
			getOrganizacoes().add(getMun());
			getOrganizacoes().add(getDvrs());
			
			setSoc(new Unidade(5,"Societário","SC",getOrganizacoes()));
			
			/* Organização dos Arrays em Ordem Crescente! - Fellipe Pimentel */
			Collections.sort(getTiposAtos(), new ComparadorTipoDocumento());
			Collections.sort(getTiposDvrs(), new ComparadorTipoDocumento());
			Collections.sort(getTiposEst(), new ComparadorTipoDocumento());
			Collections.sort(getTiposFed(), new ComparadorTipoDocumento());
			Collections.sort(getTiposMun(), new ComparadorTipoDocumento());
			
			Collections.sort(getOrganizacoes(), new ComparadorOrganizacao());
		}
//------------------------------------------------------------------------------------------------
/**
		 * @return the tiposDvrs
		 */
		public ArrayList<TipoDocumento> getTiposDvrs() {
			return TiposDvrs;
		}
		/**
		 * @param tiposDvrs the tiposDvrs to set
		 */
		public void setTiposDvrs(ArrayList<TipoDocumento> tiposDvrs) {
			TiposDvrs = tiposDvrs;
		}
/**
		 * @return the tiposMun
		 */
		public ArrayList<TipoDocumento> getTiposMun() {
			return TiposMun;
		}
		/**
		 * @param tiposMun the tiposMun to set
		 */
		public void setTiposMun(ArrayList<TipoDocumento> tiposMun) {
			TiposMun = tiposMun;
		}
/**
		 * @return the tiposEst
		 */
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
/**
		 * @return the docNit
		 */
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
		 * @return the docEnq
		 */
		public TipoDocumento getDocEnq() {
			return DocEnq;
		}
		/**
		 * @param docEnq the docEnq to set
		 */
		public void setDocEnq(TipoDocumento docEnq) {
			DocEnq = docEnq;
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
		/**
		 * @return the dvrs
		 */
		public Organizacao getDvrs() {
			return Dvrs;
		}

		/**
		 * @param dvrs the dvrs to set
		 */
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
