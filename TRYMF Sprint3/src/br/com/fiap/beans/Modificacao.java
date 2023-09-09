package br.com.fiap.beans;

public class Modificacao {

	private int idModificacao;
	private String tipoModificacao;
	
	public Modificacao(int idModificacao, String tipoModificacao) {
		super();
		this.idModificacao = idModificacao;
		this.tipoModificacao = tipoModificacao;
	}
	
	public Modificacao() {
		super();
	}
	
	public int getIdModificacao() {
		return idModificacao;
	}
	public void setIdModificacao(int idModificacao) {
		this.idModificacao = idModificacao;
	}
	public String getTipoModificacao() {
		return tipoModificacao;
	}
	public void setTipoModificacao(String tipoModificacao) {
		this.tipoModificacao = tipoModificacao;
	}
	
	public String verificaModificacao() {
		if (idModificacao == 0) {
			return "NÃO MODIFICADO";
		} else {
			return tipoModificacao;
		}
	}
	
}
