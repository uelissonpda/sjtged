package co.fcode.ged18.graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;

import co.fcode.ged18.graficos.paginas.Pesquisa;
import co.fcode.ged18.graficos.paginas.TratarArquivo;
import co.fcode.sjtged.sistema.FuncoesExtras;

@SuppressWarnings("serial")
public class MenuPrincipal extends JMenuBar{
	
	private Color bgColor;

    public void setColor(Color color){
        bgColor=color;
    }

	public MenuPrincipal(JTabbedPane jtp, Color c){
		this.setBackground(new Color(66, 66, 66));
		this.setBorderPainted(false);
		this.setColor(c);
		
		// Janela Add's
		this.add(Box.createHorizontalGlue());
		
		BotaoMenu b1 = new BotaoMenu("Tratar Documento",FuncoesExtras.buscarIcone("img/accepted_document.png"),new Color(66, 66, 66),new Color(224, 224, 224),new Color(189, 189, 189));
		b1.addActionListener(e -> {
			if(!jtp.isVisible())
				jtp.setVisible(true);
			
			jtp.removeAll();
			Janela.tp.setText(b1.getText());
			
			jtp.addTab("Informações", new TratarArquivo());
			jtp.setIconAt(0, FuncoesExtras.buscarIcone("img/document.png"));
			
		});
		this.add(b1);
		
		BotaoMenu b2 = new BotaoMenu("Pesquisa",FuncoesExtras.buscarIcone("img/find_in_document.png"),new Color(66, 66, 66),new Color(224, 224, 224),new Color(189, 189, 189));
		b2.addActionListener(e -> {
			if(!jtp.isVisible())
				jtp.setVisible(true);
			
			jtp.removeAll();
			Janela.tp.setText(b2.getText());
			
			jtp.addTab("Pesquisa de Documentos", new Pesquisa());
			jtp.setIconAt(0, FuncoesExtras.buscarIcone("img/zoom.png"));
		});
		this.add(b2);
		
		this.add(Box.createHorizontalGlue());
	}
	
	@Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.bgColor);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);

    }
}
