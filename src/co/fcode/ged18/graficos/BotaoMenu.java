package co.fcode.ged18.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import co.fcode.sjtged.sistema.FuncoesExtras;

@SuppressWarnings("serial")
public class BotaoMenu extends JButton{
	
	public BotaoMenu(String titulo, ImageIcon img, Color corOriginal, Color corHover, Color corClick){
		Font myFont = null;
		try {
			myFont = Font.createFont(Font.TRUETYPE_FONT, FuncoesExtras.buscarFonte("res/Ubuntu-Regular.ttf"));
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		myFont = myFont.deriveFont(Font.PLAIN,12);
		this.setRolloverEnabled(true);
		this.setText(titulo);
		this.setFont(myFont);
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.BOTTOM);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setContentAreaFilled(false);
		this.setIcon(img);
		this.setOpaque(true);
		this.setBackground(corOriginal);
		this.setBorder(new EmptyBorder(20,20,20,20));
		this.setForeground(corClick);
		
		this.getModel().addChangeListener(event ->{
			ButtonModel m = (ButtonModel) event.getSource();
			if(m.isRollover()){
				this.setBackground(corHover);
				this.setForeground(corOriginal);
			} else {
				this.setBackground(corOriginal);
				this.setForeground(corClick);
			}
			if(m.isPressed())
				this.setBackground(corClick);
		});
	}
}
