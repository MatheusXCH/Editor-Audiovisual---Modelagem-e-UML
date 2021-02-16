package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class Produtora {
	private String nome;
	private int cnpj;
	
	private List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();
	private List<Estudio> estudios = new ArrayList<Estudio>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}
	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}
	public List<Estudio> getEstudios() {
		return estudios;
	}
	public void setEstudios(List<Estudio> estudios) {
		this.estudios = estudios;
	}
	
	
}
