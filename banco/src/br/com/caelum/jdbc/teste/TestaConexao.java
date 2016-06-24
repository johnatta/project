package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		
		Connection  connection = new ConnectionFactory().getConnection();
		System.out.println("Conectado com sucesso");
		try {
			connection.close();
		} catch (SQLException e) {
		System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
