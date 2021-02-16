package br.edu.unifei.ecot12.profissao.editor;

import java.util.ArrayList;
import java.util.List;

public class EdicaoAudio extends Software {
	private List<Mixagem> mixagem = new ArrayList<Mixagem>();
	private int volume;
	
	public List<Mixagem> getMixagem() {
		return mixagem;
	}
	public void setMixagem(List<Mixagem> mixagem) {
		this.mixagem = mixagem;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
