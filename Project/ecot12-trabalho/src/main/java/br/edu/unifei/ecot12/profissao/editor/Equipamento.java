package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class Equipamento {
	private String tipoEquipamento;
	private String marca;
	
	private List<Software> softwares = new ArrayList<Software>();

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Software> getSoftwares() {
		return softwares;
	}

	public void setSoftwares(List<Software> softwares) {
		this.softwares = softwares;
	}
}
