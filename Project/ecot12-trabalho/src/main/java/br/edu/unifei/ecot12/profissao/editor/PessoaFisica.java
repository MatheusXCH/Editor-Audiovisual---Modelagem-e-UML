package br.edu.unifei.ecot12.profissao.editor;

public class PessoaFisica extends Cliente {
	private int cpf;
	
	public PessoaFisica (Nacionalidade nacionalidade) {
		super(nacionalidade);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	

}
