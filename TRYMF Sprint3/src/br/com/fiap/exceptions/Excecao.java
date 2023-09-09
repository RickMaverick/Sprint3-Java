package br.com.fiap.exceptions;

public class Excecao extends Exception{

	// Construtor vazio 
		public Excecao() {
			super();		
		}
		
		public Excecao(Exception e) {
			super();
			if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
				System.out.println("Digitou uma letra em vez de número");
			}else {
				System.out.println("Falha Desconhecida");
				e.printStackTrace();
		}
	}
}
	

