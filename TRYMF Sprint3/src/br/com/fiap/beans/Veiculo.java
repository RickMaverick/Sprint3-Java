package br.com.fiap.beans;

public class Veiculo {
	
	private int idVeiculo;
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private Carga carga;
	private Modificacao modificacao;
	
	//Construtor vazio 
	public Veiculo() {
		super();
	}
	
	//Construtor cheio
	public Veiculo(int idVeiculo, String marca, String modelo, String placa, int ano, Carga carga, Modificacao modificacao) {
		super();
		this.idVeiculo = idVeiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.carga = carga;
		this.modificacao = modificacao;
	}

	//construtor cheio sem referenças
	public Veiculo(int idVeiculo, String marca, String modelo, String placa, int ano) {
		super();
		this.idVeiculo = idVeiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		}
	
	//Getters e Setters
	public int getIdVeiculoa() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Carga getCarga() {
		return carga;
	}
	public void setCarga(Carga carga) {
		this.carga = carga;
	}
	
	public Modificacao getModificacao(Modificacao modificacao) {
		return modificacao;
	}
	
	public void setModificacao (Modificacao modificacao) {
		this.modificacao = modificacao;
	}
	
}
