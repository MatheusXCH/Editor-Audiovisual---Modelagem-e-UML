package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class Editor {
	private String nome;
	private int idade;
	private String portfolio;
	
	private Estudio estudio;
	private List<Editor> equipe = new ArrayList<Editor>();
	private List<Equipamento> equipUtilizados = new ArrayList<Equipamento>();
	private List<Video> produzVideo = new ArrayList<Video>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public Estudio getEstudio() {
		return estudio;
	}
	public void setEstudio(Estudio estudio) {
		this.estudio = estudio;
	}
	public List<Editor> getEquipe() {
		return equipe;
	}
	public void setEquipe(List<Editor> equipe) {
		this.equipe = equipe;
	}
	public List<Equipamento> getEquipUtilizados() {
		return equipUtilizados;
	}
	public void setEquipUtilizados(List<Equipamento> equipUtilizados) {
		this.equipUtilizados = equipUtilizados;
	}
	public List<Video> getProduzVideo() {
		return produzVideo;
	}
	public void setProduzVideo(List<Video> produzVideo) {
		this.produzVideo = produzVideo;
	}
	
	
}
