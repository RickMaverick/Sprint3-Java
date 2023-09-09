package br.com.fiap.beans;

public class Acionamento {

	private double idAcionamento;
	private Segurado idSegurado;
	private String localizacao;
	private String inclinacao;
	private Prestadora prestadora;
	private Guincho idGuincho;
	/*private String data;
	private String horario;*/
	
	public Acionamento(double idAcionamento, Segurado idSegurado, String localizacao, String inclinacao,
			Prestadora prestadora, Guincho idGuincho) {
		super();
		this.idAcionamento = idAcionamento;
		this.idSegurado = idSegurado;
		this.localizacao = localizacao;
		this.inclinacao = inclinacao;
		this.prestadora = prestadora;
		this.idGuincho = idGuincho;
	}
	
	public Acionamento() {
		super();
	}

	public double getIdAcionamento() {
		return idAcionamento;
	}
	
	public void setIdAcionamento(double idAcionamento) {
		this.idAcionamento = Math.random()*10;
	}
	public Segurado getIdSegurado() {
		return idSegurado;
	}
	public void setIdSegurado(Segurado idSegurado) {
		this.idSegurado = idSegurado;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getInclinacao() {
		return inclinacao;
	}
	public void setInclinacao(String inclinacao) {
		this.inclinacao = inclinacao;
	}
	public Prestadora getPrestadora() {
		return prestadora;
	}
	public void setPrestadora(Prestadora prestadora) {
		this.prestadora = prestadora;
	}
	public Guincho getIdGuincho() {
		return idGuincho;
	}
	public void setIdGuincho(Guincho idGuincho) {
		this.idGuincho = idGuincho;
	}
	
	
	
}
