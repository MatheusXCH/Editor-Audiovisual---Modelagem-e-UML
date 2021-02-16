package br.edu.unifei.ecot12.profissao.editor;

public class Estrangeiro implements Nacionalidade {
	private String idioma;
	private Moeda moeda;

	
	public double cambio(double dinheiro) {
		if (moeda == Moeda.DOLAR_US) {
			return dinheiro*5;
		}
		else if (moeda == Moeda.EURO) {
			return dinheiro*6;
		}
		else if (moeda == Moeda.YEN) {
			return dinheiro*0.05;
		}
		else if (moeda == Moeda.PESO_AR) {
			return dinheiro*0.07;
		}else {
			return dinheiro*0; //entrada inválida
		}
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Moeda getMoeda() {
		return moeda;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	
}
