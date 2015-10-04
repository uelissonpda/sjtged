package co.fcode.sjtged.sistema;

import java.io.File;
import java.io.InputStream;

import javax.swing.ImageIcon;

public class FuncoesExtras{
	/* Buscar Ícones dentro do Projeto */
	public static ImageIcon buscarIcone(String caminho){
		return new ImageIcon(FuncoesExtras.class.getClassLoader().getResource(caminho));
	}
	
	public static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
	
	public static InputStream buscarFonte(String caminho){
		InputStream is = FuncoesExtras.class.getClassLoader().getResourceAsStream(caminho);
		return is;
	}
}
