package co.fcode.ged18.graficos.paginas;

import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

import co.fcode.ged18.Unidade;
import co.fcode.ged18.estrutura.Admapo;
import co.fcode.ged18.estrutura.Comunicacao;
import co.fcode.ged18.estrutura.Contabil;
import co.fcode.ged18.estrutura.DepartamentoPessoal;
import co.fcode.ged18.estrutura.Fiscal;
import co.fcode.ged18.estrutura.Societario;
import co.fcode.sjtged.sistema.Database;
import co.fcode.sjtged.sistema.FileDrop;
import co.fcode.sjtged.sistema.FuncoesExtras;

@SuppressWarnings("serial")
public class TratarArquivo extends JDesktopPane{
	Connection conn;
	Statement stmt;
	
	String query = "select NmEmpresa,CdEmpresa from wphd.Empresa";
	StringBuffer caminho = new StringBuffer("Y:/CLIENTES/PJ - PESSOA JURÍDICA/"); // @production
	//StringBuffer caminho = new StringBuffer("C:/CLIENTES/PJ - PESSOA JURÍDICA/"); // @debug
	
	JComboBox<String> comboUnidade = new JComboBox<String>();
	JComboBox<String> comboOrganizacao = new JComboBox<String>();
	JComboBox<String> comboDocumento = new JComboBox<String>();
	
	JButton btnPesquisar = new JButton("Pesquisar");
	JButton btnRenomear = new JButton("Renomear");
	
	JLabel lblNumeroE = new JLabel("Nº da Empresa:");
	JTextField numEmpresa = new JTextField();
	JLabel lblNumeroA = new JLabel("Total de Arquivos:");
		
	JTextField nomeEmpresa = new JTextField();
	JLabel lblPF = new JLabel("Pessoa Física");
	JCheckBox pessoaFis = new JCheckBox();

	JLabel lblUnidade = new JLabel("Setor");
	JLabel lblOrgUnidade = new JLabel("Assunto");
	JLabel lblTipoDoc = new JLabel("Tipo");
	JLabel lblCompetencia = new JLabel("Competência");
	JLabel lblNfe = new JLabel("NFe");
		
	JTextArea text = new JTextArea();
	JScrollPane text2 = new JScrollPane(text);
	ArrayList<File> arquivos = new ArrayList<File>();
	
	Admapo ad = new Admapo();
	Comunicacao cm = new Comunicacao();
	Contabil ct = new Contabil();
	DepartamentoPessoal dp = new DepartamentoPessoal();
	Fiscal fs = new Fiscal();
	Societario sc = new Societario();
	
	ArrayList<Unidade> unidades = new ArrayList<Unidade>();
	
	JFormattedTextField competencia;
	JFormattedTextField nfe;
	
	public TratarArquivo(){
		try{
			setBackground(Color.white);
			// Conexão com SQL
			conn = DriverManager.getConnection(Database.urlAlterdata,Database.userDBAlterdata,Database.passDBAlterdata);
			stmt = conn.createStatement();
			
			// ----- Nï¿½mero da Empresa
			lblNumeroE.setBounds(30, 90, 110, 14);
			add(lblNumeroE);
			
			numEmpresa.setColumns(10);
			numEmpresa.setBounds(30, lblNumeroE.getY()+20, 90, 25);
			numEmpresa.getDocument().addDocumentListener(new DocumentListener(){
				@Override
				public void insertUpdate(DocumentEvent e) { buscar(); }
				@Override
				public void removeUpdate(DocumentEvent e) { buscar(); }
				@Override
				public void changedUpdate(DocumentEvent e) { buscar(); }
				public void buscar() { BuscarEmpresa(numEmpresa.getText()); }
			});
			add(numEmpresa);
			
			// ----- NOME da Empresa
			nomeEmpresa.setColumns(10);
			nomeEmpresa.setBounds(30, numEmpresa.getY()+30, 300, 25);
			nomeEmpresa.setEnabled(false);
			add(nomeEmpresa);
			
			// Pessoa Física
			lblPF.setBounds(365, nomeEmpresa.getY(), 190, 20);
			add(lblPF);
			
			pessoaFis.setBounds(340, nomeEmpresa.getY(), 20, 20);
			add(pessoaFis);
			
			// Selecionar Unidade
			lblUnidade.setBounds(30, nomeEmpresa.getY()+35, 90, 25);
			lblUnidade.setIcon(FuncoesExtras.buscarIcone("img/box.png"));
			add(lblUnidade);
				
			/* Lista de Unidades */
			unidades.add(ad.getAdmapo());
			unidades.add(cm.getComunicacao());
			unidades.add(ct.getContabil());
			unidades.add(dp.getDp());
			unidades.add(fs.getFiscal());
			unidades.add(sc.getSoc());
			
			/* Adição das Unidades na ComboBox */
			unidades.forEach(u -> comboUnidade.addItem(u.getNomeCompleto()));
			comboUnidade.setBounds(30, lblUnidade.getY()+30, 190, 25);
			comboUnidade.setToolTipText("Selecione a Unidade");
			comboUnidade.addActionListener (e -> OrganizarUnidade(comboUnidade.getSelectedIndex()));
			add(comboUnidade);
			
			// Selecionar Organização de Unidade
			lblOrgUnidade.setBounds(30, comboUnidade.getY()+30, 190, 25);
			lblOrgUnidade.setIcon(FuncoesExtras.buscarIcone("img/inbox.png"));
			add(lblOrgUnidade);
			
			comboOrganizacao.setBounds(30, lblOrgUnidade.getY()+30, 190, 25);
			comboOrganizacao.setToolTipText("Selecione a Organização da Unidade");
			comboOrganizacao.setEnabled(false);
			comboOrganizacao.addActionListener(e -> OrganizarDocumentos(comboUnidade.getSelectedIndex(),comboOrganizacao.getSelectedIndex()));
			add(comboOrganizacao);
			
			// Tipo de Documento
			lblTipoDoc.setBounds(lblUnidade.getX()+190+40, lblUnidade.getY(), 190, 25);
			lblTipoDoc.setIcon(FuncoesExtras.buscarIcone("img/page_white_text.png"));
			add(lblTipoDoc);
						
			comboDocumento.setBounds(lblTipoDoc.getX(), lblTipoDoc.getY()+30, 320, 25);
			comboDocumento.setToolTipText("Selecione o Tipo de Documento");
			comboDocumento.addActionListener(event -> btnRenomear.setEnabled(true));
			comboDocumento.setEnabled(false);
			add(comboDocumento);
			
			// ----- Competencia
			lblCompetencia.setBounds(lblTipoDoc.getX(), comboDocumento.getY()+30, 100, 25);
			add(lblCompetencia);
			MaskFormatter dateMask = new MaskFormatter("######");
			competencia = new JFormattedTextField(dateMask);
			competencia.setBounds(lblCompetencia.getX(), lblCompetencia.getY()+30, 100, 25);
			add(competencia);
			
			// ----- NFE
			lblNfe.setBounds(lblCompetencia.getX()+lblCompetencia.getWidth()+20, lblCompetencia.getY(), 100, 25);
			add(lblNfe);
			MaskFormatter nfeMask = new MaskFormatter("HHHHHHHHH");
			nfe = new JFormattedTextField(nfeMask);
			nfe.setBounds(competencia.getX()+competencia.getWidth()+20, competencia.getY(), 100, 25);
			add(nfe);
			
			// ----- Renomear Arquivo
			btnRenomear.setBounds(580, 90, 180, 50);
			btnRenomear.setIcon(FuncoesExtras.buscarIcone("img/doc_convert.png"));
			btnRenomear.setEnabled(false);
			add(btnRenomear);
			
			pessoaFis.addActionListener(event ->{
				if(pessoaFis.isSelected()){
					caminho = new StringBuffer("Y:/CLIENTES/PF - PESSOA FÍSICA/");
					numEmpresa.setText("000");
				} else {
					caminho = new StringBuffer("Y:/CLIENTES/PJ - PESSOA JURÍDICA/");
					numEmpresa.setText("");
				}
				if(pessoaFis.isSelected()){
					btnPesquisar.setEnabled(false);
					numEmpresa.setEnabled(false);
					nomeEmpresa.setEnabled(true);
				} else {
					btnPesquisar.setEnabled(true);
					numEmpresa.setEnabled(true);
					nomeEmpresa.setEnabled(false);
				}
			});
			
			/* Campo para Adicionar Arquivos */
			 text2.setBounds(0,0,765, 80);
			 text.setText("Jogue os arquivos aqui!\n");
			 text.setEnabled(false);
		     add(text2);

		     new FileDrop(text, new FileDrop.Listener(){
		       public void filesDropped(File[] files){
		    	   arquivos.clear();
		    	   for(File arquivoLido : files){
		    		   try{
		    			   text.append(":: "+arquivoLido.getName()+" | Caminho: "+arquivoLido.getCanonicalPath()+ "\n");
		    			   arquivos.add(new File(arquivoLido.getCanonicalPath()));
		    		   }
		    		   catch( java.io.IOException e ) {}
		    	   }
		       }
		     });
		     
		     btnRenomear.addActionListener(event -> RenomearArquivos());
		}
		catch(Exception e1){ System.err.println(e1.getMessage()); }
		invalidate();
		validate();
	}
	
	public void OrganizarUnidade(int codUnidade){
		comboOrganizacao.setEnabled(true);
		comboOrganizacao.removeAllItems();
		unidades.get(codUnidade).getOrganizacao().forEach(o -> {
			comboOrganizacao.addItem(o.getNomeCompleto());
		});
	}
	
	public void OrganizarDocumentos(int codUnidade, int codOrg){
		comboDocumento.setEnabled(true);
		comboDocumento.removeAllItems();
		if(codOrg >= 0){
			unidades.get(codUnidade).getOrganizacao().get(codOrg).getDocumentos().forEach(d -> {
				comboDocumento.addItem(d.getNomeCompleto());
			});
		}
	}

	public void RenomearArquivos(){
		for(File arqVelho : arquivos){
			String codEmpresa = new String();
			ResultSet rs;
			try {
				rs = stmt.executeQuery(query+" WHERE CdEmpresa='"+numEmpresa.getText()+"'");
				if(rs.next()){ codEmpresa = rs.getString("CdEmpresa"); }
			}
			catch (SQLException e1) { e1.printStackTrace(); }
		
			String unidadeTxt = comboUnidade.getSelectedItem().toString();
			String orgUnidadeTxt = comboOrganizacao.getSelectedItem().toString();
			String tipoDocTxt = comboDocumento.getSelectedItem().toString();
			
			if(pessoaFis.isSelected()) codEmpresa = "PF";
			if(nomeEmpresa.getText().equals("")){
				JOptionPane.showMessageDialog(null, "A empresa não existe!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			else if(numEmpresa.getText().equals("")){
				JOptionPane.showMessageDialog(null, "O número da empresa não pode estar em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			else if(competencia.getText().equals("      ")){
				JOptionPane.showMessageDialog(null, "A competência não pode estar em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
			}
			else {
				/* Criação de Diretório, caso não existam*/
				// Y:/EMPRESAS/NumeroDaEmpresa
				File empresaDiretorio = new File(caminho+codEmpresa+" - "+nomeEmpresa.getText());
				if(!empresaDiretorio.exists()){
					try { empresaDiretorio.mkdir(); }
					catch(SecurityException se){}
				}
				// Y:/EMPRESAS/NumeroDaEmpresa/Unidade
				File unidadeDiretorio = new File(caminho+codEmpresa+" - "+nomeEmpresa.getText()+"/"+unidadeTxt);
				if(!unidadeDiretorio.exists()){
					try { unidadeDiretorio.mkdir();}
					catch(SecurityException se){}
				}
				// Y:/EMPRESAS/NumeroDaEmpresa/Unidade/comboOrganizacao
				File orgUnidadeDiretorio = new File(caminho+codEmpresa+" - "+nomeEmpresa.getText()+"/"+unidadeTxt+"/"+orgUnidadeTxt);
				if(!orgUnidadeDiretorio.exists()){
					try { orgUnidadeDiretorio.mkdir();}
					catch(SecurityException se){}
				}
				// Y:/EMPRESAS/NumeroDaEmpresa/Unidade/comboOrganizacao/comboDocumento
				File tipoDocDiretorio = new File(caminho+codEmpresa+" - "+nomeEmpresa.getText()+"/"+unidadeTxt+"/"+orgUnidadeTxt+"/"+tipoDocTxt);
				if(!tipoDocDiretorio.exists()){
					try { tipoDocDiretorio.mkdir();}
					catch(SecurityException se){}
				}
				
				StringBuffer nomeArquivo = new StringBuffer("");
				nomeArquivo.append(codEmpresa);
				nomeArquivo.append("_");
				nomeArquivo.append(unidades.get(comboUnidade.getSelectedIndex()).getSigla());
				nomeArquivo.append("_");
				nomeArquivo.append(unidades.get(comboUnidade.getSelectedIndex()).getOrganizacao().
						get(comboOrganizacao.getSelectedIndex()).getSigla());
				nomeArquivo.append("_");
				nomeArquivo.append(unidades.get(comboUnidade.getSelectedIndex()).getOrganizacao().
						get(comboOrganizacao.getSelectedIndex()).getDocumentos().get(comboDocumento.getSelectedIndex()).getSigla());
				nomeArquivo.append("_");
				if(!nfe.getText().equals("         ")){
					nomeArquivo.append(nfe.getText());
					nomeArquivo.append("_");
				}
				nomeArquivo.append(competencia.getText());
				nomeArquivo.append(".");
				nomeArquivo.append(FuncoesExtras.getFileExtension(arqVelho));
				
				File arqNovo = null;
		
					if(orgUnidadeTxt.equals("")){
						arqNovo = new File(
							caminho+codEmpresa+" - "+
							nomeEmpresa.getText()+"/"+
							unidadeTxt+"/"+
							nomeArquivo);
					}
					else {
						arqNovo = new File(
							caminho+codEmpresa+" - "+
							nomeEmpresa.getText()+"/"+
							unidadeTxt+"/"+
							orgUnidadeTxt+"/"+
							tipoDocTxt+"/"+
							nomeArquivo);
					}
					//System.out.println(arqNovo.getAbsolutePath());
		 				
					if(!arqNovo.exists()){
						arqVelho.renameTo(arqNovo);
						JOptionPane.showMessageDialog(null, "Arquivo Renomeado!");
					} else {
						int opcao = JOptionPane.showConfirmDialog(null,
							"<html>O <b>"+tipoDocTxt+"</b> da Empresa "+nomeEmpresa.getText()+" já existe!<br>"
									+ "<i>Você deseja sobrescrever o arquivo?","Erro",JOptionPane.YES_NO_OPTION);
						if(opcao == JOptionPane.YES_OPTION){
							arqNovo.delete();
							arqVelho.renameTo(arqNovo);
							JOptionPane.showMessageDialog(null, "Arquivo sobrescrito!");
						}
					}
			}
			text.setText("Jogue os arquivos aqui!\n");
			btnRenomear.setEnabled(false);
		}
	}

	public void BuscarEmpresa(String numeroEmpresa){
		try{
			ResultSet rs = stmt.executeQuery(query+" WHERE CdEmpresa='"+numeroEmpresa+"'");
		    if(rs.next()){
		    	btnRenomear.setEnabled(true);
		    	nomeEmpresa.setText(rs.getString("NmEmpresa").replaceAll("/", ""));
		    } else {
		    	nomeEmpresa.setText("");
		    	btnRenomear.setEnabled(false);
		    	JOptionPane.showMessageDialog(null, "A empresa não existe", "Erro", JOptionPane.ERROR_MESSAGE);
		    }
		}
		catch (Exception e1){ JOptionPane.showMessageDialog(null, "A empresa não existe", "Erro", JOptionPane.ERROR_MESSAGE); }
	}
}
