package br.com.fiap.beans;

public class Carga {
	
	private int idCarga;
	private String tipo;
	private double pesoTotal;
	
	
	public Carga() {
		super();
	}
	public Carga(int idCarga, String tipo, double pesoTotal) {
		super();
		this.idCarga = idCarga;
		this.tipo = tipo;
		this.pesoTotal = pesoTotal;
	}
	public int getIdCarga() {
		return idCarga;
	}
	public void setIdCarga(int idCarga) {
		this.idCarga = idCarga;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public String verificaCarga() {
		if (idCarga == 0) {
			return "DESCARREGADO";
		} else {
			return comboCarga(tipo, pesoTotal);
		}
	}
	private String comboCarga(String tipo, double pesoTotal) {
		Double.toString(pesoTotal);
		return tipo+" "+pesoTotal+"KG";
	}
	
}
