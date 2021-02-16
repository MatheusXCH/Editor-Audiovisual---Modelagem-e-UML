package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class EdicaoVideo extends Software {
	private List<Efeito> efeito = new ArrayList<Efeito>();
	private List<PosProcessamento> posProcessamento =  new ArrayList<PosProcessamento>();
	
	private List<Software> plugins = new ArrayList<Software>();

	public List<Efeito> getEfeito() {
		return efeito;
	}

	public void setEfeito(List<Efeito> efeito) {
		this.efeito = efeito;
	}

	public List<PosProcessamento> getPosProcessamento() {
		return posProcessamento;
	}

	public void setPosProcessamento(List<PosProcessamento> posProcessamento) {
		this.posProcessamento = posProcessamento;
	}

	public List<Software> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<Software> plugins) {
		this.plugins = plugins;
	}
	
	
}
