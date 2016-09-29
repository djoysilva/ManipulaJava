package br.com.fiap.arquivos.modelo;

import java.io.Serializable;

public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private String velocidade;
	private String memoria;
	private String revendedor;
	
	public Produto() {
		super();
	}
	
	public Produto(String nome, String velocidade, String memoria, String revendedor) {
		super();
		this.nome = nome;
		this.velocidade = velocidade;
		this.memoria = memoria;
		this.revendedor = revendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getRevendedor() {
		return revendedor;
	}

	public void setRevendedor(String revendedor) {
		this.revendedor = revendedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
