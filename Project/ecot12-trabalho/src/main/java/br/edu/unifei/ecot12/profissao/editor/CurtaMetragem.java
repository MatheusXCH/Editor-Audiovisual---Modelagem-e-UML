package br.edu.unifei.ecot12.profissao.editor;

public class CurtaMetragem extends Cinematografico {
	private static final int duracaoMax = 60;
	private String intencao;
	private String meioDistribuicao;
	
	public int getDuracaoMax() {
		return duracaoMax;
	}
	public String getIntencao() {
		return intencao;
	}
	public void setIntencao(String intencao) {
		this.intencao = intencao;
	}
	public String getMeioDistribuicao() {
		return meioDistribuicao;
	}
	public void setMeioDistribuicao(String meioDistribuicao) {
		this.meioDistribuicao = meioDistribuicao;
	}
	@Override
	public void setDuracao(int duracao) {
		if(duracao <= duracaoMax) {
			this.duracao = duracao;
		}
	}
}
