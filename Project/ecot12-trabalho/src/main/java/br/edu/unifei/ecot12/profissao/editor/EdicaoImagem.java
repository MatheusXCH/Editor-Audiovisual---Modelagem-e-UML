package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class EdicaoImagem extends Software {
	private List<Corte> tipoCorte = new ArrayList<Corte>();
	private int brilho;
	private int contraste;
	
	
	public List<Corte> getTipoCorte() {
		return tipoCorte;
	}
	public void setTipoCorte(List<Corte> tipoCorte) {
		this.tipoCorte = tipoCorte;
	}
	
	public int getBrilho() {
		return brilho;
	}
	public void setBrilho(int brilho) {
		this.brilho = brilho;
	}
	public int getContraste() {
		return contraste;
	}
	public void setContraste(int contraste) {
		this.contraste = contraste;
	}
	
	
}
