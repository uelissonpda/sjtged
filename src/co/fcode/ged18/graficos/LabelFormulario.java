package co.fcode.ged18.graficos;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JLabel;

import co.fcode.sjtged.sistema.FuncoesExtras;

@SuppressWarnings("serial")
public class LabelFormulario extends JLabel{

	public LabelFormulario(String s){
		this.setText(s);
		Font f = null;
		try {
			f = Font.createFont(Font.TRUETYPE_FONT, FuncoesExtras.buscarFonte("res/Ubuntu-Regular.ttf"));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		this.setFont(f.deriveFont(12f).deriveFont(Font.PLAIN));
	}
}
