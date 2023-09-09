package br.com.fiap.beans;

public class SeguradoPj extends Segurado{

	private String cnpj;
	
	//COnstrutores
	public SeguradoPj() {
		super();
	}

	public SeguradoPj(int id, String nome, String email, Veiculo veiculo, String cnpj) {
		super(id, nome, email, veiculo);
		this.cnpj = cnpj;
	}
	
	public SeguradoPj(int id, String nome, String email, String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	//Getters e Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	@Override
	public String identificador() {

		return "Pessoa Jurídica";
	}
	
	
	
}
