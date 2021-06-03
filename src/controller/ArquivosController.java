package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {
	
	public ArquivosController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void readDir(String path) throws IOException {
		File dir = new File(path);
		if (dir.exists()&& dir.isDirectory()) {
			System.out.println("Diretório valido");
		}else {
			throw new IOException("Diretório inválido");
		}
	}


	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if (arq.exists()&& arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				if (linha.contains("fruit")) {
					System.out.println("\t"+ linha.replace(";", " - "));
					linha = buffer.readLine();	
				}
				else
				linha = buffer.readLine();	
				}

			buffer.close();
			leitor.close();
			fluxo.close();
			
			}
			else {
			throw new IOException("Arquivo Inválido");
			
		}
		
	}
	
	
	
}
