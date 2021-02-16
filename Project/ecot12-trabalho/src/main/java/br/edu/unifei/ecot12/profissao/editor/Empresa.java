package br.edu.unifei.ecot12.profissao.editor;

public class Empresa extends Cliente {
	private int cnpj;
	
	public Empresa (Nacionalidade nacionalidade) {
		super(nacionalidade);
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
