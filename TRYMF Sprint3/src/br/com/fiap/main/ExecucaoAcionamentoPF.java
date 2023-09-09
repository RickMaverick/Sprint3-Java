package br.com.fiap.main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acionamento;
import br.com.fiap.beans.Carga;
import br.com.fiap.beans.Guincho;
import br.com.fiap.beans.Modificacao;
import br.com.fiap.beans.Prestadora;
import br.com.fiap.beans.SeguradoPf;
import br.com.fiap.beans.Veiculo;

public class ExecucaoAcionamentoPF {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args){

		//Instanciar
		//int id, String nome, Veiculo veiculo, String cpf
		SeguradoPf objPf = new SeguradoPf();
		objPf.setId(inteiro("Digite o Id do Segurado: "));
		objPf.setNome(texto("Digite o nome do Segurado: ").toUpperCase());
		objPf.setCpf(texto("Digite seu email: ").toUpperCase());
		objPf.setCpf(texto("Digite seu CPF: ").toUpperCase());
		
		//String marca, String modelo, String placa, int ano
		Veiculo objVeiculo = new Veiculo();
		objPf.setVeiculo(objVeiculo);
		objVeiculo.setIdVeiculo(inteiro("ID do Veículo: "));
		objVeiculo.setMarca(texto("Marca: ").toUpperCase());
		objVeiculo.setModelo(texto("Modelo: ").toUpperCase());
		objVeiculo.setPlaca(texto("Placa: ").toUpperCase());
		objVeiculo.setAno(inteiro("Ano do veículo: "));
		
		//
		Carga objCarga = new Carga();
		objVeiculo.setCarga(objCarga);
		objCarga.setIdCarga(inteiro("ID da Carga: (Se o veiculo estiver descarregado ID = 0)"));
		if(objCarga.getIdCarga() != 0) {
			objCarga.setTipo(texto("Tipo da Carga: (ex: Carga viva, Inflamavel, Madeira, Granel, NDA)").toUpperCase());
			objCarga.setPesoTotal(real("Digite o peso total da Carga em KG: (ex: 2.500)"));
		}
		
		//
		Modificacao objModif = new Modificacao();
		objVeiculo.setModificacao(objModif);
		objModif.setIdModificacao(inteiro("ID da Modificacao: (Se não houver modificacoes, ID = 0)"));
		if (objModif.getIdModificacao() != 0) {
			objModif.setTipoModificacao(texto("Digite o tipo de modificacao: (ex: Pintura, Baú, Chassi, Eixos, Plataforma, NDA)").toUpperCase());
		}
		
		//
		Acionamento acionamento = new Acionamento();
		acionamento.setIdAcionamento(2);
		acionamento.setIdSegurado(objPf);
		acionamento.setLocalizacao(texto("Digite a LOCALIZACAO do veículo: (ex:Rua XXXXX Numero YY/)").toUpperCase());
		acionamento.setInclinacao(texto("Digite a INCLINACAO do local: (ex: Plano, Aclive ou Declive)").toUpperCase());
		
		//
		Prestadora prest = new Prestadora();
		acionamento.setPrestadora(prest);
		prest.setIdPrestadora(inteiro("ID da Prestadora: "));
		prest.setNomePrestador(texto("Nome do Prestador de serviço: ").toUpperCase());
		prest.setEmpresa(texto("Nome da Empresa Prestadora de Serviços: ").toUpperCase());
		prest.setLocalizacaoPrest(texto("Localizacao da prestadora: ").toUpperCase());
		prest.setAceiteChamado(texto("Chamado aceito: (ex: Sim, Não)").toUpperCase());
		
		//
		Guincho guincho = new Guincho();
		acionamento.setIdGuincho(guincho);
		guincho.setIdGuincho(inteiro("ID do Guincho: "));
		guincho.setModeloGuincho(texto("Digite o Modelo do Guincho: ").toUpperCase());
		guincho.setPlacaGuincho(texto("Digite a Placa do Guincho: ").toUpperCase());
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("---------------TICKET DO ACIONAMENTO "+acionamento.getIdAcionamento()+"---------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("");
		
		System.out.println("SEGURADO ID: " + objPf.getId() + 
				"\nNOME: "+ objPf.getNome() +
				"\nTIPO: " + objPf.identificador() +
				"\n" +
				"\nVEICULO ID: "+ objVeiculo.getIdVeiculoa() +
				"\nMODELO: " +
				"\nPLACA: "+ objVeiculo.getPlaca() +
				"\n" +
				"CARGA: " + objCarga.verificaCarga() +
				"\n" +
				"\nMODIFICACOES: " + objModif.verificaModificacao() +
				"\n" +
				"\nLOCAL: " + acionamento.getLocalizacao() +   
				"\nINCLINACAO: " + acionamento.getInclinacao() +
				"\n" +
				"\nPRESTADORA: " + prest.getEmpresa() +
				"\nGUINCHO ESCOLHIDO: " + guincho.getIdGuincho() +
				"\n" +
				"\nDATA: " + LocalDate.now() +
				"\nHORÁRIO: " + LocalDateTime.now());

	}

}
