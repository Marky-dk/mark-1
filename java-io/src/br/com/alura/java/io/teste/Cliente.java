package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
* Classe usada para adicionar informções do titular no ByteBank.
*
* @author Marky Santana.
* @version 0.1
*/

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
