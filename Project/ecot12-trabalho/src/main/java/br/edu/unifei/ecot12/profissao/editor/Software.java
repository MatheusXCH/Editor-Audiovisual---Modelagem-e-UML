package br.edu.unifei.ecot12.profissao.editor;

public abstract class Software {
	private String nome;
	private String desenvolvedora;
	private boolean isPago;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	public boolean isPago() {
		return isPago;
	}
	public void setPago(boolean isPago) {
		this.isPago = isPago;
	}
	
	
}
