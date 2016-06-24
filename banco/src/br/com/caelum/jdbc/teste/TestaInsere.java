package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contato contato = new Contato();
		contato.setNome("Johnatta");
		contato.setEmail("johnatta@teste.com.br");
		contato.setEndereco("Rua. vergueiro 3185");
	    contato.setDataNascimento(Calendar.getInstance());
		
		//GRAVE NESSA CONEXAO
		ContatoDao dao = new ContatoDao();
	   dao.adiciona(contato);
	//	dao.remove(contato);
		
		System.out.println("deletando");

	}

}
