package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.SeguradoPf;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.dao.AcionamentoDAO;

public class TesteCadastrar {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Instanciar 
				AcionamentoDAO dao = new AcionamentoDAO();
				
//				
				SeguradoPf objSeguradoPf = new SeguradoPf();
//				Veiculo objVeiculo = new Veiculo();
//				objSeguradoPf.setVeiculo(objVeiculo);
				
				objSeguradoPf.setId(inteiro("Digite o Id do Segurado: "));
				objSeguradoPf.setNome(texto("Digite o nome do Segurado: "));
				objSeguradoPf.setEmail(texto("Digite seu Email: "));
				objSeguradoPf.setCpf(texto("Digite seu CPF: "));
//				objSeguradoPf.getVeiculo().setIdVeiculo(inteiro("Digite o ID do veículo: "));
				
				System.out.println(dao.inserirSeguradoPf(objSeguradoPf));
			}
	}