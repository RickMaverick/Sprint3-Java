package br.com.fiap.beans;

public class Prestadora {

	private int idPrestadora;
	private String nomePrestador;
	private String empresa;
	private String localizacaoPrest;
	private String aceiteChamado;
	
	public Prestadora() {
		super();
	}
	
	public Prestadora(int idPrestadora, String nomePrestador, String empresa, String localizacaoPrest,
			String aceiteChamado) {
		super();
		this.idPrestadora = idPrestadora;
		this.nomePrestador = nomePrestador;
		this.empresa = empresa;
		this.localizacaoPrest = localizacaoPrest;
		this.aceiteChamado = aceiteChamado;
	}

	public int getIdPrestadora() {
		return idPrestadora;
	}
	public void setIdPrestadora(int idPrestadora) {
		this.idPrestadora = idPrestadora;
	}
	public String getNomePrestador() {
		return nomePrestador;
	}
	public void setNomePrestador(String nomePrestador) {
		this.nomePrestador = nomePrestador;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getLocalizacaoPrest() {
		return localizacaoPrest;
	}
	public void setLocalizacaoPrest(String localizacaoPrest) {
		this.localizacaoPrest = localizacaoPrest;
	}
	public String getAceiteChamado() {
		return aceiteChamado;
	}
	public void setAceiteChamado(String aceiteChamado) {
		this.aceiteChamado = aceiteChamado;
	}
	
}
