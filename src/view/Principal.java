package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;
public class Principal {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String path = "C:\\WINDOWS\\TEMP\\";
		String nome = "generic_food.csv";
		try {
			arqCont.readDir(path);
			arqCont.readFile(path,nome);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
