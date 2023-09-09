package br.com.fiap.beans;

public class SeguradoPf extends Segurado{

	private String cpf;

	//Construtor cheio
	public SeguradoPf(int id, String nome, String email, Veiculo veiculo, String cpf) {
		super(id, nome, email, veiculo);
		this.cpf = cpf;
	}
	
	//Construtor cheio sem herança
		public SeguradoPf(int id, String nome, String email, String cpf) {
			super();
			this.cpf = cpf;
		}
	
	//Construtor vazio
	public SeguradoPf () {
		super();
	}
	
	//Getters e Setters

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	@Override
	public String identificador() {
		return "Pessoa Física";
	}
	
}
