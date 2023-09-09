package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.SeguradoPf;
import br.com.fiap.conexoes.ConexaoFactory;

public class AcionamentoDAO {

public Connection minhaConexao;
	
	public AcionamentoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Inserir/Ajustar 

	public String inserirSeguradoPf (SeguradoPf segurado) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_SEGURADO_PF values (?,?,?,?)");
		stmt.setInt(1, segurado.getId());
		stmt.setString(2, segurado.getNome());
		stmt.setString(3, segurado.getEmail());
		stmt.setString(4, segurado.getCpf());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}
	
	
	
}
