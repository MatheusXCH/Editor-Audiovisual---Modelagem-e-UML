package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nome;
	private double dinheiro;
	private Nacionalidade nacionalidade;
	private List<Solicitacao> solicitacao = new ArrayList<Solicitacao>();
	
	public Cliente (Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double convReal() {
		return nacionalidade.cambio(dinheiro);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Solicitacao> getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(List<Solicitacao> solicitacao) {
		this.solicitacao = solicitacao;
	}
}
