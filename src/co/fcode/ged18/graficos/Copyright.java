package co.fcode.ged18.graficos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Copyright extends JLabel{

	public Copyright(){
		this.setText(
				"<html>"
					+ "<div style='padding:3px; margin-right: 10px; font-size:7px;'>"
						+ "<i><b>::</b></i> Desenvolvido por Fellipe Pimentel © 2015<br>"
						+ "<div style='margin-left:95px;'><i>www.fcode.co</i></div>"
						+ "</div>" +
			   "</html>"
				);
		this.setForeground(Color.WHITE);
		this.setHorizontalAlignment(JButton.RIGHT);
		this.setOpaque(true);
		this.setBackground(new Color(66, 66, 66));
	}
}
