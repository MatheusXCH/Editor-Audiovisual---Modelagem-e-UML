package br.edu.unifei.ecot12.profissao.editor;

public abstract class Cinematografico extends Video {
	private String diretor;
	private String roteirista;
	
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getRoteirista() {
		return roteirista;
	}
	public void setRoteirista(String roteirista) {
		this.roteirista = roteirista;
	}
}
