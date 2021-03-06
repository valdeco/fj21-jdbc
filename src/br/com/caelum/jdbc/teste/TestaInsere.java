package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj87");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexao
		ContatoDao dao = new ContatoDao();

		// m�todo elegante
		dao.adiciona(contato);

		System.out.println("Gravado!");

	}

}
