package br.edu.unifei.ecot12.profissao.editor;

public abstract class Video {
	private String nome;
	private int codigo;
	private String formato;
	protected int duracao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public int getDuracao() {
		return duracao;
	}
	public abstract void setDuracao(int duracao);
}
