package br.com.fiap.beans;

abstract class Segurado {

	protected int id;
	protected String nome;
	private String email;
	private Veiculo veiculo;
	
	public Segurado() {
		super();
	}
	
	public Segurado(int id, String nome, String email,Veiculo veiculo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.veiculo = veiculo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public String identificador() {
		return null;
	}
	
}
