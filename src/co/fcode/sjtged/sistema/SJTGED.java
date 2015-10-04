package co.fcode.sjtged.sistema;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import co.fcode.ged18.graficos.Copyright;
import co.fcode.ged18.graficos.Janela;
import co.fcode.ged18.graficos.MenuPrincipal;

@SuppressWarnings("serial")
public class SJTGED extends JFrame{
	
	String nomePrograma = "SJTGED";
	String versao = "v0.1.8";
	
	public static void main(String args[]){
		try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } 
	    catch (UnsupportedLookAndFeelException e) {}
	    catch (ClassNotFoundException e) {}
	    catch (InstantiationException e) {}
	    catch (IllegalAccessException e) {}
		new SJTGED();
	}

	public SJTGED(){
		Janela j = new Janela(nomePrograma+" - "+versao, new Dimension(770,500));
		JDesktopPane jdp = new JDesktopPane();
		jdp.setLayout(new BorderLayout());
		
		j.setIconImage(FuncoesExtras.buscarIcone("img/sort_ascending.png").getImage());
	
		JTabbedPane jtp = new JTabbedPane();
		jdp.add(jtp);
		
		Janela.tp.setText(nomePrograma+" - "+versao);
		Janela.tp.setBorder(new EmptyBorder(20,20,20,20));
		jdp.add(Janela.tp, BorderLayout.NORTH);
		
		jdp.setBackground(Color.WHITE);
		j.add(jdp);
		
		j.add(new MenuPrincipal(jtp,new Color(66, 66, 66)),BorderLayout.NORTH);
		j.add(new Copyright(), BorderLayout.SOUTH);
		j.invalidate();
		j.validate();
	}
}
