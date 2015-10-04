package co.fcode.ged18.graficos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela extends JFrame{
	
	public static TituloPagina tp = new TituloPagina("Titulo",new Color(66, 66, 66));
	
	public Janela(String nome, Dimension tamanho){
		this.setTitle(nome);
		this.setSize(tamanho);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
}
