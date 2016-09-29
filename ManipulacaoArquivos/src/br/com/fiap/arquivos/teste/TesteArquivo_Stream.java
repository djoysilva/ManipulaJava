package br.com.fiap.arquivos.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import br.com.fiap.arquivos.modelo.Produto;

public class TesteArquivo_Stream {
	static String gravarArq(Produto p) throws Exception{
		FileOutputStream file = new FileOutputStream("c:\\temp\\computador.arq");
		ObjectOutputStream stream = new ObjectOutputStream(file);
		stream.writeObject(p);
		stream.flush();
		stream.close();
		
		return "Objeto Armazenado";
	}
	
	static Produto lerArq() throws Exception{
		FileInputStream file = new FileInputStream("c:\\temp\\computador.arq");
		ObjectInputStream stream = new ObjectInputStream(file);
		Produto objeto = (Produto) stream.readObject();
		stream.close();
		return objeto;
	}
	
	public static void main(String[] args) throws Exception{
		Produto obj = new Produto("Positivo", "1 GB", "Cssas", "2 ghz");
		System.out.println(gravarArq(obj));
		Produto resultado = lerArq();
		System.out.println(resultado.getNome() + resultado.getVelocidade());
	}
	
	
}
