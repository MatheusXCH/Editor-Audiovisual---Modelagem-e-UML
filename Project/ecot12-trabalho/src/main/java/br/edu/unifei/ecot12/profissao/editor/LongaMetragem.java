package br.edu.unifei.ecot12.profissao.editor;

public class LongaMetragem extends Cinematografico {
	private static final int duracaoMin = 61;

	public int getDuracaoMin() {
		return duracaoMin;
	}
	@Override
	public void setDuracao(int duracao) {
		if(duracao >= duracaoMin) {
			this.duracao = duracao;
		}
	}
}
