package br.com.fiap.beans;

public class Guincho {

	private int idGuincho;
	private String modeloGuincho;
	private String placaGuincho;
	
	public Guincho() {
		super();
	}

	public Guincho(int idGuincho, String modeloGuincho, String placaGuincho) {
		super();
		this.idGuincho = idGuincho;
		this.modeloGuincho = modeloGuincho;
		this.placaGuincho = placaGuincho;
	}
	
	public int getIdGuincho() {
		return idGuincho;
	}
	public void setIdGuincho(int idGuincho) {
		this.idGuincho = idGuincho;
	}
	public String getModeloGuincho() {
		return modeloGuincho;
	}
	public void setModeloGuincho(String modeloGuincho) {
		this.modeloGuincho = modeloGuincho;
	}
	public String getPlacaGuincho() {
		return placaGuincho;
	}
	public void setPlacaGuincho(String placaGuincho) {
		this.placaGuincho = placaGuincho;
	}
	
	
	
}
