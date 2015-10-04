package co.fcode.ged18.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JLabel;

import co.fcode.sjtged.sistema.FuncoesExtras;

@SuppressWarnings("serial")
public class TituloPagina extends JLabel{

	public TituloPagina(String titulo,Color corInicial){
		Font f = null;
		try {
			f = Font.createFont(Font.TRUETYPE_FONT, FuncoesExtras.buscarFonte("res/Ubuntu-Regular.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		this.setText(titulo);
		this.setForeground(corInicial);
		this.setFont(f.deriveFont(22f).deriveFont(Font.PLAIN));
	}
}
