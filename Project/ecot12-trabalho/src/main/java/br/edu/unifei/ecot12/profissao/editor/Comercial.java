package br.edu.unifei.ecot12.profissao.editor;

public class Comercial extends Video {
	private String canal;
	private String plataforma;
	
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	@Override
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
