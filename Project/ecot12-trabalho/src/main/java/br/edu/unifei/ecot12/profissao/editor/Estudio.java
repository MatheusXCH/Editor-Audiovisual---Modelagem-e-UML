package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class Estudio {
	private String nome;
	private String localizacao;
	
	private List<Editor> editores = new ArrayList<Editor>();
	private List<Equipamento> equipamentos = new ArrayList<Equipamento>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public List<Editor> getEditores() {
		return editores;
	}
	public void setEditores(List<Editor> editores) {
		this.editores = editores;
	}
	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(List<Equipamento> equqipamentos) {
		this.equipamentos = equqipamentos;
	}
	
	
}
