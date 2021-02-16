package br.edu.unifei.ecot12.profissao.editor;

public class Nacional implements Nacionalidade{
	private String estado;
	
	public double cambio(double dinheiro) {
		return dinheiro*1;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
