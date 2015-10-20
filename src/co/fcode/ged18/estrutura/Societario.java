package co.fcode.ged18.estrutura;
/***************
*@author UANJOS*
***************/
import java.util.ArrayList;

import co.fcode.ged18.Organizacao;
import co.fcode.ged18.TipoDocumento;

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
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
		
//-------------------LISTA DE TIPOS DE DOCUMENTOS---------------------//
			
		private ArrayList<TipoDocumento> TiposAtos; // TIPOS ATOS
		private ArrayList<TipoDocumento> TiposFed; // TIPOS FEDERAL
		private ArrayList<TipoDocumento> TiposEst; // TIPOS ESTADUAL
		private ArrayList<TipoDocumento> TiposMun; // TIPOS MUNICIPAL
		private ArrayList<TipoDocumento> TiposDvrs; // TIPOS DIVERSOS
			
//-----------------------FIM DA DECLARAÇÃO----------------------------//
			
		public Societario(){
			setDocCnpj(new TipoDocumento(1,"Cnpj","CNPJ"));
			setDocCertbx(new TipoDocumento(2, "Certidão de Baixa", "CERTBX"));
			setDocInsest(new TipoDocumento(3, "Inscrição Estadual", "INSEST"));
			setDocLdexcb(new TipoDocumento(4, "Certidão de Baixa de Inscrição Estadual", "LDEXCB"));
			setDocCertcb(new TipoDocumento(5, "Certificado de Aprovação do Corpo de Bombeiros", "CERTCB"));
			setDocAlvara(new TipoDocumento(6, "Alvará", "ALVARA"));
			setDocFincad(new TipoDocumento(7, "Ficha de Informações Cadastrais", "FINCAD"));
			setDocBxiss(new TipoDocumento(8, "Memorando de Baixa Iss", "BXISS"));
			setDocBxalv(new TipoDocumento(9, "Baixa do Alvará", "BXALV"));
			setDocSanipj(new TipoDocumento(10, "Termo de Licensa de Funcionamento Sanitário", "SANIPJ"));
			setDocCis(new TipoDocumento(11, "Certificado de Inspeção Sanitária", "CIS"));
			setDocSanipf(new TipoDocumento(12, "Termo de Assentimento Sanitário", "SANIPF"));
			setDocSmtr(new TipoDocumento(13, "Certidão de Acessibilidade", "SMTR"));
			setDocSmo(new TipoDocumento(14, "Declaração de Rebaixamento de Meio Fio", "SMO"));
			setDocCinstc(new TipoDocumento(15, "Certidão de Instalação Comercial", "CINSCT"));
			setDocHabite(new TipoDocumento(16, "Habite-se", "HABITE"));
			setDocCtrans(new TipoDocumento(17, "Certidão de Transformação de Uso", "CTRANS"));
			setDocSmac(new TipoDocumento(18, "Requerimento de Meio Ambiente", "SMAC"));
			setDocPlpubl(new TipoDocumento(19, "Planta de Autorização de Publicidade", "PLPUBL"));
			setDocTxmeca(new TipoDocumento(20, "Taxa de Mesas e Cadeiras", "TXMECA"));
			setDocTxpubl(new TipoDocumento(21, "Taxa de Publicidade", "TXPUBL"));
			setDocIptu(new TipoDocumento(22, "Iptu", "IPTU"));
			setDocConloc(new TipoDocumento(23, "Contrato de Locação", "CONLOC"));
			setDocCpf(new TipoDocumento(24, "Cpf dos Sócios", "CPF"));
			setDocRg(new TipoDocumento(25, "Rg dos Sócios", "RG"));
			setDocCompre(new TipoDocumento(26, "Comprovante de Residência dos Sócios", "COMPRE"));
			setDocRegpro(new TipoDocumento(27, "Registro Profissional", "REGPRO"));
			setDocPcv(new TipoDocumento(28, "Promessa de Compra e Venda", "PCV"));
			setDocNit(new TipoDocumento(29, "Número de Inscrição do Trabalhador/Sócio", ""));
			
			setTiposAtos(new ArrayList<TipoDocumento>());
			setTiposFed(new ArrayList<TipoDocumento>());
			setTiposEst(new ArrayList<TipoDocumento>());
			setTiposMun(new ArrayList<TipoDocumento>());
			setTiposDvrs(new ArrayList<TipoDocumento>());
			
			TiposAtos.add(DocConsoc);
			TiposAtos.add(DocAltcon);
			TiposAtos.add(DocDist);
			TiposAtos.add(DocAta);
			TiposAtos.add(DocReqemp);
			TiposAtos.add(DocEnq);
			TiposAtos.add(DocReenq);
			TiposAtos.add(DocBalreg);
			TiposAtos.add(DocProinc);
			TiposAtos.add(DocParal);
			TiposAtos.add(DocLavpal);
			TiposAtos.add(DocEstat);
			
			TiposFed.add(DocCnpj);
			TiposFed.add(DocCertbx);
			
			TiposEst.add(DocInsest);
			TiposEst.add(DocParal);
			TiposEst.add(DocCertbx);
			TiposEst.add(DocLdexcb);
			TiposEst.add(DocCertcb);
			
			TiposMun.add(DocAlvara);
			TiposMun.add(DocFincad);
			TiposMun.add(DocParal);
			TiposMun.add(DocBxiss);
			TiposMun.add(DocBxalv);
			TiposMun.add(DocSanipj);
			TiposMun.add(DocCis);
			TiposMun.add(DocSanipf);
			TiposMun.add(DocSmtr);
			TiposMun.add(DocSmo);
			TiposMun.add(DocCinstc);
			TiposMun.add(DocHabite);
			TiposMun.add(DocCtrans);
			TiposMun.add(DocSmac);
			TiposMun.add(DocPlpubl);
			TiposMun.add(DocTxmeca);
			TiposMun.add(DocTxpubl);
			TiposMun.add(DocIptu);
			
			TiposDvrs.add(DocConloc);
			TiposDvrs.add(DocCpf);
			TiposDvrs.add(DocRg);
			TiposDvrs.add(DocCompre);
			TiposDvrs.add(DocRegpro);
			TiposDvrs.add(DocPcv);
			TiposDvrs.add(DocNit);
			
			setAtos(new Organizacao(1,"Atos","ATOS",TiposAtos));
			setFed(new Organizacao(2,"Federal","FED",TiposFed));
			setEst(new Organizacao(3,"Estadual","EST",TiposEst));
			setMun(new Organizacao(4,"Municipal","MUN",TiposMun));
			setDvrs(new Organizacao(5,"Diversos","DVRS",TiposDvrs));
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
}
