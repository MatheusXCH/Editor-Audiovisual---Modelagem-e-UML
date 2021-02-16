package br.edu.unifei.ecot12.profissao.editor;

public class Solicitacao {
	private int contrato;
	private double valor;
	private String nomeVideo;
	private String dataInicio;
	private String prazoFinal;
	
	private Cliente cliente;
	private Produtora produtora;
	
	public int getContrato() {
		return contrato;
	}
	public void setContrato(int contrato) {
		this.contrato = contrato;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNomeVideo() {
		return nomeVideo;
	}
	public void setNomeVideo(String nomeVideo) {
		this.nomeVideo = nomeVideo;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getPrazoFinal() {
		return prazoFinal;
	}
	public void setPrazoFinal(String prazoFinal) {
		this.prazoFinal = prazoFinal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produtora getProdutora() {
		return produtora;
	}
	public void setProdutora(Produtora produtora) {
		this.produtora = produtora;
	}
	
	
}
